package typings.googleapis.v35Mod.dfareportingV35

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLookbackConfiguration extends StObject {
  
  /**
    * Lookback window, in days, from the last time a given user clicked on one of your ads. If you enter 0, clicks will not be considered as triggering events for floodlight tracking. If you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90, inclusive.
    */
  var clickDuration: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Lookback window, in days, from the last time a given user viewed one of your ads. If you enter 0, impressions will not be considered as triggering events for floodlight tracking. If you leave this field blank, the default value for your account will be used. Acceptable values are 0 to 90, inclusive.
    */
  var postImpressionActivitiesDuration: js.UndefOr[Double | Null] = js.undefined
}
object SchemaLookbackConfiguration {
  
  inline def apply(): SchemaLookbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLookbackConfiguration]
  }
  
  extension [Self <: SchemaLookbackConfiguration](x: Self) {
    
    inline def setClickDuration(value: Double): Self = StObject.set(x, "clickDuration", value.asInstanceOf[js.Any])
    
    inline def setClickDurationNull: Self = StObject.set(x, "clickDuration", null)
    
    inline def setClickDurationUndefined: Self = StObject.set(x, "clickDuration", js.undefined)
    
    inline def setPostImpressionActivitiesDuration(value: Double): Self = StObject.set(x, "postImpressionActivitiesDuration", value.asInstanceOf[js.Any])
    
    inline def setPostImpressionActivitiesDurationNull: Self = StObject.set(x, "postImpressionActivitiesDuration", null)
    
    inline def setPostImpressionActivitiesDurationUndefined: Self = StObject.set(x, "postImpressionActivitiesDuration", js.undefined)
  }
}
