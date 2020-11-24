package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrequencyCap extends js.Object {
  
  /** The maximum number of impressions that can be served to a user within the specified time period. */
  var maxImpressions: js.UndefOr[Double] = js.native
  
  /** The amount of time, in the units specified by time_unit_type. Defines the amount of time over which impressions per user are counted and capped. */
  var numTimeUnits: js.UndefOr[Double] = js.native
  
  /** The time unit. Along with num_time_units defines the amount of time over which impressions per user are counted and capped. */
  var timeUnitType: js.UndefOr[String] = js.native
}
object FrequencyCap {
  
  @scala.inline
  def apply(): FrequencyCap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrequencyCap]
  }
  
  @scala.inline
  implicit class FrequencyCapOps[Self <: FrequencyCap] (val x: Self) extends AnyVal {
    
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
    def setMaxImpressions(value: Double): Self = this.set("maxImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxImpressions: Self = this.set("maxImpressions", js.undefined)
    
    @scala.inline
    def setNumTimeUnits(value: Double): Self = this.set("numTimeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumTimeUnits: Self = this.set("numTimeUnits", js.undefined)
    
    @scala.inline
    def setTimeUnitType(value: String): Self = this.set("timeUnitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeUnitType: Self = this.set("timeUnitType", js.undefined)
  }
}
