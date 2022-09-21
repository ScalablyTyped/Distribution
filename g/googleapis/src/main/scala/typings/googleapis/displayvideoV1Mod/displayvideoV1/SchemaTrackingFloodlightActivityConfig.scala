package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrackingFloodlightActivityConfig extends StObject {
  
  /**
    * Required. The ID of the Floodlight activity.
    */
  var floodlightActivityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The number of days after an ad has been clicked in which a conversion may be counted. Must be between 0 and 90 inclusive.
    */
  var postClickLookbackWindowDays: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The number of days after an ad has been viewed in which a conversion may be counted. Must be between 0 and 90 inclusive.
    */
  var postViewLookbackWindowDays: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTrackingFloodlightActivityConfig {
  
  inline def apply(): SchemaTrackingFloodlightActivityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackingFloodlightActivityConfig]
  }
  
  extension [Self <: SchemaTrackingFloodlightActivityConfig](x: Self) {
    
    inline def setFloodlightActivityId(value: String): Self = StObject.set(x, "floodlightActivityId", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivityIdNull: Self = StObject.set(x, "floodlightActivityId", null)
    
    inline def setFloodlightActivityIdUndefined: Self = StObject.set(x, "floodlightActivityId", js.undefined)
    
    inline def setPostClickLookbackWindowDays(value: Double): Self = StObject.set(x, "postClickLookbackWindowDays", value.asInstanceOf[js.Any])
    
    inline def setPostClickLookbackWindowDaysNull: Self = StObject.set(x, "postClickLookbackWindowDays", null)
    
    inline def setPostClickLookbackWindowDaysUndefined: Self = StObject.set(x, "postClickLookbackWindowDays", js.undefined)
    
    inline def setPostViewLookbackWindowDays(value: Double): Self = StObject.set(x, "postViewLookbackWindowDays", value.asInstanceOf[js.Any])
    
    inline def setPostViewLookbackWindowDaysNull: Self = StObject.set(x, "postViewLookbackWindowDays", null)
    
    inline def setPostViewLookbackWindowDaysUndefined: Self = StObject.set(x, "postViewLookbackWindowDays", js.undefined)
  }
}
