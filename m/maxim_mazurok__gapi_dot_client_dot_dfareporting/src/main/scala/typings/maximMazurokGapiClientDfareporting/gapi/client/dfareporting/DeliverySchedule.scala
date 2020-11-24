package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeliverySchedule extends js.Object {
  
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
  implicit class DeliveryScheduleOps[Self <: DeliverySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFrequencyCap(value: FrequencyCap): Self = this.set("frequencyCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrequencyCap: Self = this.set("frequencyCap", js.undefined)
    
    @scala.inline
    def setHardCutoff(value: Boolean): Self = this.set("hardCutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHardCutoff: Self = this.set("hardCutoff", js.undefined)
    
    @scala.inline
    def setImpressionRatio(value: String): Self = this.set("impressionRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImpressionRatio: Self = this.set("impressionRatio", js.undefined)
    
    @scala.inline
    def setPriority(value: String): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
  }
}
