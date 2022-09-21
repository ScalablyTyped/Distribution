package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDrivesUnhide
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the shared drive.
    */
  var driveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDrivesUnhide {
  
  inline def apply(): ParamsResourceDrivesUnhide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDrivesUnhide]
  }
  
  extension [Self <: ParamsResourceDrivesUnhide](x: Self) {
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
  }
}
