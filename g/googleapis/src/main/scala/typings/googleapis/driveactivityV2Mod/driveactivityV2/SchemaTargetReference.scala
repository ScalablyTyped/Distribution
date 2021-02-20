package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A lightweight reference to the target of activity.
  */
@js.native
trait SchemaTargetReference extends StObject {
  
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItemReference] = js.native
  
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[SchemaTeamDriveReference] = js.native
}
object SchemaTargetReference {
  
  @scala.inline
  def apply(): SchemaTargetReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetReference]
  }
  
  @scala.inline
  implicit class SchemaTargetReferenceMutableBuilder[Self <: SchemaTargetReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveItem(value: SchemaDriveItemReference): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: SchemaTeamDriveReference): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
