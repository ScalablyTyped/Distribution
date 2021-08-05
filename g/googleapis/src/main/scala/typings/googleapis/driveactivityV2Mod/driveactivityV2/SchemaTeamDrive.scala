package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a Team Drive.
  */
trait SchemaTeamDrive extends StObject {
  
  /**
    * The resource name of the Team Drive. The format is
    * &quot;teamDrives/TEAM_DRIVE_ID&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The root of this Team Drive.
    */
  var root: js.UndefOr[SchemaDriveItem] = js.undefined
  
  /**
    * The title of the Team Drive.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaTeamDrive {
  
  inline def apply(): SchemaTeamDrive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTeamDrive]
  }
  
  extension [Self <: SchemaTeamDrive](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoot(value: SchemaDriveItem): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
