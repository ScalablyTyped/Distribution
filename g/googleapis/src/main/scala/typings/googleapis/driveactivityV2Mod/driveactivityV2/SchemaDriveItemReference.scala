package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A lightweight reference to a Drive item, such as a file or folder.
  */
trait SchemaDriveItemReference extends StObject {
  
  /**
    * The Drive item is a file.
    */
  var file: js.UndefOr[SchemaFile] = js.undefined
  
  /**
    * The Drive item is a folder.
    */
  var folder: js.UndefOr[SchemaFolder] = js.undefined
  
  /**
    * The target Drive item. The format is &quot;items/ITEM_ID&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The title of the Drive item.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaDriveItemReference {
  
  inline def apply(): SchemaDriveItemReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveItemReference]
  }
  
  extension [Self <: SchemaDriveItemReference](x: Self) {
    
    inline def setFile(value: SchemaFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setFolder(value: SchemaFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
    
    inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
