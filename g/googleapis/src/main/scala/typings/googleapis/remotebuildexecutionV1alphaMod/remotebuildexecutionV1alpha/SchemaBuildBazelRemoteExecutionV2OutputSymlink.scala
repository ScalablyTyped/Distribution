package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `OutputSymlink` is similar to a Symlink, but it is used as an output in
  * an `ActionResult`.  `OutputSymlink` is binary-compatible with
  * `SymlinkNode`.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2OutputSymlink extends js.Object {
  /**
    * The full path of the symlink relative to the working directory, including
    * the filename. The path separator is a forward slash `/`. Since this is a
    * relative path, it MUST NOT begin with a leading forward slash.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * The target path of the symlink. The path separator is a forward slash
    * `/`. The target path can be relative to the parent directory of the
    * symlink or it can be an absolute path starting with `/`. Support for
    * absolute paths can be checked using the Capabilities API. The canonical
    * form forbids the substrings `/./` and `//` in the target path. `..`
    * components are allowed anywhere in the target path.
    */
  var target: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2OutputSymlink {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2OutputSymlink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2OutputSymlink]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2OutputSymlinkOps[Self <: SchemaBuildBazelRemoteExecutionV2OutputSymlink] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
  
}

