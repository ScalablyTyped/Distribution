package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputFile` is similar to a FileNode, but it is used as an output in an
  * `ActionResult`. It allows a full file path rather than only a name.
  * `OutputFile` is binary-compatible with `FileNode`.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2OutputFile extends js.Object {
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The full path of the file relative to the working directory, including
    * the filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2OutputFile {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2OutputFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputFile]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2OutputFileOps[Self <: SchemaBuildBazelRemoteExecutionV2OutputFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    @scala.inline
    def setIsExecutable(value: Boolean): Self = this.set("isExecutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExecutable: Self = this.set("isExecutable", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

