package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateResponse extends StObject {
  
  /**
    * The time at which operation processing completed.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the Trial should stop.
    */
  var shouldStop: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The time at which the operation was started.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateResponse {
  
  inline def apply(): SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateResponse]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1CheckTrialEarlyStoppingStateResponse](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setShouldStop(value: Boolean): Self = StObject.set(x, "shouldStop", value.asInstanceOf[js.Any])
    
    inline def setShouldStopNull: Self = StObject.set(x, "shouldStop", null)
    
    inline def setShouldStopUndefined: Self = StObject.set(x, "shouldStop", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
