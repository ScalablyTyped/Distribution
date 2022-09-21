package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDriveReference extends StObject {
  
  /**
    * The resource name of the shared drive. The format is `COLLECTION_ID/DRIVE_ID`. Clients should not assume a specific collection ID for this resource name.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The title of the shared drive.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaDriveReference {
  
  inline def apply(): SchemaDriveReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDriveReference]
  }
  
  extension [Self <: SchemaDriveReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
