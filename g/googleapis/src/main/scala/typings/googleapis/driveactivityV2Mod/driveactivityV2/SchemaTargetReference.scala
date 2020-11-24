package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A lightweight reference to the target of activity.
  */
@js.native
trait SchemaTargetReference extends js.Object {
  
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
  implicit class SchemaTargetReferenceOps[Self <: SchemaTargetReference] (val x: Self) extends AnyVal {
    
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
    def setDriveItem(value: SchemaDriveItemReference): Self = this.set("driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriveItem: Self = this.set("driveItem", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: SchemaTeamDriveReference): Self = this.set("teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamDrive: Self = this.set("teamDrive", js.undefined)
  }
}
