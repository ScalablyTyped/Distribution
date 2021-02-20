package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliverySchedule extends StObject {
  
  /** Limit on the number of times an individual user can be served the ad within a specified period of time. */
  var frequencyCap: js.UndefOr[FrequencyCap] = js.native
  
  /**
    * Whether or not hard cutoff is enabled. If true, the ad will not serve after the end date and time. Otherwise the ad will continue to be served until it has reached its delivery
    * goals.
    */
  var hardCutoff: js.UndefOr[Boolean] = js.native
  
  /**
    * Impression ratio for this ad. This ratio determines how often each ad is served relative to the others. For example, if ad A has an impression ratio of 1 and ad B has an impression
    * ratio of 3, then Campaign Manager will serve ad B three times as often as ad A. Acceptable values are 1 to 10, inclusive.
    */
  var impressionRatio: js.UndefOr[String] = js.native
  
  /** Serving priority of an ad, with respect to other ads. The lower the priority number, the greater the priority with which it is served. */
  var priority: js.UndefOr[String] = js.native
}
object DeliverySchedule {
  
  @scala.inline
  def apply(): DeliverySchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliverySchedule]
  }
  
  @scala.inline
  implicit class DeliveryScheduleMutableBuilder[Self <: DeliverySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequencyCap(value: FrequencyCap): Self = StObject.set(x, "frequencyCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyCapUndefined: Self = StObject.set(x, "frequencyCap", js.undefined)
    
    @scala.inline
    def setHardCutoff(value: Boolean): Self = StObject.set(x, "hardCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardCutoffUndefined: Self = StObject.set(x, "hardCutoff", js.undefined)
    
    @scala.inline
    def setImpressionRatio(value: String): Self = StObject.set(x, "impressionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpressionRatioUndefined: Self = StObject.set(x, "impressionRatio", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
