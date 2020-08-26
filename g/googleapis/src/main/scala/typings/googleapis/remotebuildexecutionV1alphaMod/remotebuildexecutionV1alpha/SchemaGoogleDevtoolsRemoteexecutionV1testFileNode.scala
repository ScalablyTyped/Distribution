package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `FileNode` represents a single file and associated metadata.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testFileNode extends js.Object {
  /**
    * The digest of the file&#39;s content.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.native
  /**
    * True if file is executable, false otherwise.
    */
  var isExecutable: js.UndefOr[Boolean] = js.native
  /**
    * The name of the file.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testFileNode {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testFileNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testFileNode]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testFileNodeOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testFileNode] (val x: Self) extends AnyVal {
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
    def setIsExecutable(value: Boolean): Self = this.set("isExecutable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsExecutable: Self = this.set("isExecutable", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

