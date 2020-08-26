package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DirectoryNode` represents a child of a Directory which is itself a
  * `Directory` and its associated metadata.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2DirectoryNode extends js.Object {
  /**
    * The digest of the Directory object represented. See Digest for
    * information about how to take the digest of a proto message.
    */
  var digest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  /**
    * The name of the directory.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2DirectoryNode {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2DirectoryNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2DirectoryNode]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2DirectoryNodeOps[Self <: SchemaBuildBazelRemoteExecutionV2DirectoryNode] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

