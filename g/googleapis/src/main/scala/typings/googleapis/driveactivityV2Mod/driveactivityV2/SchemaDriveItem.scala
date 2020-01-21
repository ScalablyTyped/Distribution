package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Drive item, such as a file or folder.
  */
@js.native
trait SchemaDriveItem extends js.Object {
  /**
    * The Drive item is a file.
    */
  var file: js.UndefOr[SchemaFile] = js.native
  /**
    * The Drive item is a folder.
    */
  var folder: js.UndefOr[SchemaFolder] = js.native
  /**
    * The MIME type of the Drive item.  See
    * https://developers.google.com/drive/v3/web/mime-types.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * The target Drive item. The format is &quot;items/ITEM_ID&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Information about the owner of this Drive item.
    */
  var owner: js.UndefOr[SchemaOwner] = js.native
  /**
    * The title of the Drive item.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaDriveItem {
  @scala.inline
  def apply(
    file: SchemaFile = null,
    folder: SchemaFolder = null,
    mimeType: String = null,
    name: String = null,
    owner: SchemaOwner = null,
    title: String = null
  ): SchemaDriveItem = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDriveItem]
  }
}

