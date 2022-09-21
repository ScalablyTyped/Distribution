package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDrivesHide
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the shared drive.
    */
  var driveId: js.UndefOr[String] = js.undefined
}
object ParamsResourceDrivesHide {
  
  inline def apply(): ParamsResourceDrivesHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDrivesHide]
  }
  
  extension [Self <: ParamsResourceDrivesHide](x: Self) {
    
    inline def setDriveId(value: String): Self = StObject.set(x, "driveId", value.asInstanceOf[js.Any])
    
    inline def setDriveIdUndefined: Self = StObject.set(x, "driveId", js.undefined)
  }
}
