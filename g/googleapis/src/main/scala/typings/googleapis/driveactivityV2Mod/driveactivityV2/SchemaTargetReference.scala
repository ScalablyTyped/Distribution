package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetReference extends StObject {
  
  /**
    * The target is a shared drive.
    */
  var drive: js.UndefOr[SchemaDriveReference] = js.undefined
  
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItemReference] = js.undefined
  
  /**
    * This field is deprecated; please use the `drive` field instead.
    */
  var teamDrive: js.UndefOr[SchemaTeamDriveReference] = js.undefined
}
object SchemaTargetReference {
  
  inline def apply(): SchemaTargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetReference]
  }
  
  extension [Self <: SchemaTargetReference](x: Self) {
    
    inline def setDrive(value: SchemaDriveReference): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveItem(value: SchemaDriveItemReference): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setTeamDrive(value: SchemaTeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
