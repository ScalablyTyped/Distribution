package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A lightweight reference to a Drive item, such as a file or folder.
  */
@js.native
trait SchemaDriveItemReference extends js.Object {
  /**
    * The Drive item is a file.
    */
  var file: js.UndefOr[SchemaFile] = js.native
  /**
    * The Drive item is a folder.
    */
  var folder: js.UndefOr[SchemaFolder] = js.native
  /**
    * The target Drive item. The format is &quot;items/ITEM_ID&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The title of the Drive item.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaDriveItemReference {
  @scala.inline
  def apply(): SchemaDriveItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveItemReference]
  }
  @scala.inline
  implicit class SchemaDriveItemReferenceOps[Self <: SchemaDriveItemReference] (val x: Self) extends AnyVal {
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
    def setFile(value: SchemaFile): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
    @scala.inline
    def setFolder(value: SchemaFolder): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

