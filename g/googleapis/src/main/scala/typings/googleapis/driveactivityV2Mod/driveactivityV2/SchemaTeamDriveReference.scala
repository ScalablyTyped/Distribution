package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTeamDriveReference extends StObject {
  
  /**
    * This field is deprecated; please see `DriveReference.name` instead.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This field is deprecated; please see `DriveReference.title` instead.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaTeamDriveReference {
  
  inline def apply(): SchemaTeamDriveReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDriveReference]
  }
  
  extension [Self <: SchemaTeamDriveReference](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
