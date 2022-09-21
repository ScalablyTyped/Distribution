package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTarget extends StObject {
  
  /**
    * The target is a shared drive.
    */
  var drive: js.UndefOr[SchemaDrive] = js.undefined
  
  /**
    * The target is a Drive item.
    */
  var driveItem: js.UndefOr[SchemaDriveItem] = js.undefined
  
  /**
    * The target is a comment on a Drive file.
    */
  var fileComment: js.UndefOr[SchemaFileComment] = js.undefined
  
  /**
    * This field is deprecated; please use the `drive` field instead.
    */
  var teamDrive: js.UndefOr[SchemaTeamDrive] = js.undefined
}
object SchemaTarget {
  
  inline def apply(): SchemaTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTarget]
  }
  
  extension [Self <: SchemaTarget](x: Self) {
    
    inline def setDrive(value: SchemaDrive): Self = StObject.set(x, "drive", value.asInstanceOf[js.Any])
    
    inline def setDriveItem(value: SchemaDriveItem): Self = StObject.set(x, "driveItem", value.asInstanceOf[js.Any])
    
    inline def setDriveItemUndefined: Self = StObject.set(x, "driveItem", js.undefined)
    
    inline def setDriveUndefined: Self = StObject.set(x, "drive", js.undefined)
    
    inline def setFileComment(value: SchemaFileComment): Self = StObject.set(x, "fileComment", value.asInstanceOf[js.Any])
    
    inline def setFileCommentUndefined: Self = StObject.set(x, "fileComment", js.undefined)
    
    inline def setTeamDrive(value: SchemaTeamDrive): Self = StObject.set(x, "teamDrive", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveUndefined: Self = StObject.set(x, "teamDrive", js.undefined)
  }
}
