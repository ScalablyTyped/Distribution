package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImuDataGapFailureDetails extends StObject {
  
  /**
    * The duration of the gap in IMU data that was found.
    */
  var gapDuration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Relative time (from the start of the video stream) when the gap started.
    */
  var gapStartTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaImuDataGapFailureDetails {
  
  inline def apply(): SchemaImuDataGapFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImuDataGapFailureDetails]
  }
  
  extension [Self <: SchemaImuDataGapFailureDetails](x: Self) {
    
    inline def setGapDuration(value: String): Self = StObject.set(x, "gapDuration", value.asInstanceOf[js.Any])
    
    inline def setGapDurationNull: Self = StObject.set(x, "gapDuration", null)
    
    inline def setGapDurationUndefined: Self = StObject.set(x, "gapDuration", js.undefined)
    
    inline def setGapStartTime(value: String): Self = StObject.set(x, "gapStartTime", value.asInstanceOf[js.Any])
    
    inline def setGapStartTimeNull: Self = StObject.set(x, "gapStartTime", null)
    
    inline def setGapStartTimeUndefined: Self = StObject.set(x, "gapStartTime", js.undefined)
  }
}
