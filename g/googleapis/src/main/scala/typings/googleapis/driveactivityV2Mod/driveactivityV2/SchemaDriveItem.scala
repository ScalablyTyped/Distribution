package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Drive item, such as a file or folder.
  */
@js.native
trait SchemaDriveItem extends StObject {
  
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
  def apply(): SchemaDriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveItem]
  }
  
  @scala.inline
  implicit class SchemaDriveItemMutableBuilder[Self <: SchemaDriveItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: SchemaFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    @scala.inline
    def setFolder(value: SchemaFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOwner(value: SchemaOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
