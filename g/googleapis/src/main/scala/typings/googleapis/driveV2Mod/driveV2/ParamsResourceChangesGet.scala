package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChangesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the change.
    */
  var changeId: js.UndefOr[String] = js.undefined
  
  /**
    * The shared drive from which the change is returned.
    */
  var driveId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the requesting application supports both My Drives and shared drives.
    */
  var supportsAllDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated use supportsAllDrives instead.
    */
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Deprecated use driveId instead.
    */
  var teamDriveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceChangesGet {
  
  inline def apply(): ParamsResourceChangesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChangesGet]
  }
  
  extension [Self <: ParamsResourceChangesGet](x: Self) {
    
    inline def setChangeId(value: String): Self = StObject.set(x, "changeId", value.asInstanceOf[js.Any])
    
    inline def setChangeIdUndefined: Self = StObject.set(x, "changeId", js.undefined)
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
    
    inline def setSupportsAllDrives(value: Boolean): Self = StObject.set(x, "supportsAllDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsAllDrivesUndefined: Self = StObject.set(x, "supportsAllDrives", js.undefined)
    
    inline def setSupportsTeamDrives(value: Boolean): Self = StObject.set(x, "supportsTeamDrives", value.asInstanceOf[js.Any])
    
    inline def setSupportsTeamDrivesUndefined: Self = StObject.set(x, "supportsTeamDrives", js.undefined)
    
    inline def setTeamDriveId(value: String): Self = StObject.set(x, "teamDriveId", value.asInstanceOf[js.Any])
    
    inline def setTeamDriveIdUndefined: Self = StObject.set(x, "teamDriveId", js.undefined)
  }
}
