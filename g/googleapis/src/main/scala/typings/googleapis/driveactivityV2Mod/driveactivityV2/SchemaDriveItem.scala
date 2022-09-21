package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveItem extends StObject {
  
  /**
    * The Drive item is a file.
    */
  var driveFile: js.UndefOr[SchemaDriveFile] = js.undefined
  
  /**
    * The Drive item is a folder. Includes information about the type of folder.
    */
  var driveFolder: js.UndefOr[SchemaDriveFolder] = js.undefined
  
  /**
    * This field is deprecated; please use the `driveFile` field instead.
    */
  var file: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * This field is deprecated; please use the `driveFolder` field instead.
    */
  var folder: js.UndefOr[SchemaFolder] = js.undefined
  
  /**
    * The MIME type of the Drive item. See https://developers.google.com/drive/v3/web/mime-types.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target Drive item. The format is `items/ITEM_ID`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about the owner of this Drive item.
    */
  var owner: js.UndefOr[SchemaOwner] = js.undefined
  
  /**
    * The title of the Drive item.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveItem {
  
  inline def apply(): SchemaDriveItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveItem]
  }
  
  extension [Self <: SchemaDriveItem](x: Self) {
    
    inline def setDriveFile(value: SchemaDriveFile): Self = StObject.set(x, "driveFile", value.asInstanceOf[js.Any])
    
    inline def setDriveFileUndefined: Self = StObject.set(x, "driveFile", js.undefined)
    
    inline def setDriveFolder(value: SchemaDriveFolder): Self = StObject.set(x, "driveFolder", value.asInstanceOf[js.Any])
    
    inline def setDriveFolderUndefined: Self = StObject.set(x, "driveFolder", js.undefined)
    
    inline def setFile(value: SchemaFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFolder(value: SchemaFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOwner(value: SchemaOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
