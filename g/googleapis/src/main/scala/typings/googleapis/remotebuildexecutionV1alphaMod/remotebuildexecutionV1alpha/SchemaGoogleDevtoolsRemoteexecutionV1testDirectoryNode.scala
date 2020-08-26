package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DirectoryNode` represents a child of a Directory which is itself a
  * `Directory` and its associated metadata.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode extends js.Object {
  /**
    * The digest of the Directory object represented. See Digest for
    * information about how to take the digest of a proto message.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  /**
    * The name of the directory.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNodeOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode] (val x: Self) extends AnyVal {
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
    def setDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

