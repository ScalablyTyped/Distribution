package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliverySchedule extends StObject {
  
  /**
    * Limit on the number of times an individual user can be served the ad within a specified period of time.
    */
  var frequencyCap: js.UndefOr[SchemaFrequencyCap] = js.undefined
  
  /**
    * Whether or not hard cutoff is enabled. If true, the ad will not serve after the end date and time. Otherwise the ad will continue to be served until it has reached its delivery goals.
    */
  var hardCutoff: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Impression ratio for this ad. This ratio determines how often each ad is served relative to the others. For example, if ad A has an impression ratio of 1 and ad B has an impression ratio of 3, then Campaign Manager will serve ad B three times as often as ad A. Acceptable values are 1 to 10, inclusive.
    */
  var impressionRatio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Serving priority of an ad, with respect to other ads. The lower the priority number, the greater the priority with which it is served.
    */
  var priority: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliverySchedule {
  
  inline def apply(): SchemaDeliverySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliverySchedule]
  }
  
  extension [Self <: SchemaDeliverySchedule](x: Self) {
    
    inline def setFrequencyCap(value: SchemaFrequencyCap): Self = StObject.set(x, "frequencyCap", value.asInstanceOf[js.Any])
    
    inline def setFrequencyCapUndefined: Self = StObject.set(x, "frequencyCap", js.undefined)
    
    inline def setHardCutoff(value: Boolean): Self = StObject.set(x, "hardCutoff", value.asInstanceOf[js.Any])
    
    inline def setHardCutoffNull: Self = StObject.set(x, "hardCutoff", null)
    
    inline def setHardCutoffUndefined: Self = StObject.set(x, "hardCutoff", js.undefined)
    
    inline def setImpressionRatio(value: String): Self = StObject.set(x, "impressionRatio", value.asInstanceOf[js.Any])
    
    inline def setImpressionRatioNull: Self = StObject.set(x, "impressionRatio", null)
    
    inline def setImpressionRatioUndefined: Self = StObject.set(x, "impressionRatio", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
