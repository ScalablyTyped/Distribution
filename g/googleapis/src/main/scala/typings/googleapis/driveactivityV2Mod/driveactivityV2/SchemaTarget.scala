package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the target of activity.
  */
@js.native
trait SchemaTarget extends StObject {
  
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItem] = js.native
  
  /**
    * The target is a comment on a Drive file.
    */
  var fileComment: js.UndefOr[SchemaFileComment] = js.native
  
  /**
    * The target is a Team Drive.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.native
}
object SchemaTarget {
  
  @scala.inline
  def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  
  @scala.inline
  implicit class SchemaTargetMutableBuilder[Self <: SchemaTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDriveItem(value: SchemaDriveItem): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    @scala.inline
    def setFileComment(value: SchemaFileComment): Self = StObject.set(x, "fileComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCommentUndefined: Self = StObject.set(x, "fileComment", js.undefined)
    
    @scala.inline
    def setTeamDrive(value: SchemaTeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
