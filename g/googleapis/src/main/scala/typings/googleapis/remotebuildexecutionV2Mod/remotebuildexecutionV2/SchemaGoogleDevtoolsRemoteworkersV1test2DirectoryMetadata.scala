package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a directory. Similar to the equivalent message in the
  * Remote Execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata extends js.Object {
  /**
    * A pointer to the contents of the directory, in the form of a marshalled
    * Directory message.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  /**
    * The path of the directory, as in FileMetadata.path.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadataOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata] (val x: Self) extends AnyVal {
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
    def setDigest(value: SchemaGoogleDevtoolsRemoteworkersV1test2Digest): Self = this.set("digest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigest: Self = this.set("digest", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

