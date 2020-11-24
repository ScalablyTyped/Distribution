package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationInfo extends js.Object {
  
  /** The number of intervals to aggregate over. Example: If aggregation_level is "DAILY" and aggregation_count is 14, aggregation will be over 14 days. */
  var aggregationCount: js.UndefOr[Double] = js.native
  
  var aggregationInterval: js.UndefOr[String] = js.native
  
  var aggregationLevel: js.UndefOr[String] = js.native
}
object AggregationInfo {
  
  @scala.inline
  def apply(): AggregationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationInfo]
  }
  
  @scala.inline
  implicit class AggregationInfoOps[Self <: AggregationInfo] (val x: Self) extends AnyVal {
    
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
    def setAggregationCount(value: Double): Self = this.set("aggregationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationCount: Self = this.set("aggregationCount", js.undefined)
    
    @scala.inline
    def setAggregationInterval(value: String): Self = this.set("aggregationInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationInterval: Self = this.set("aggregationInterval", js.undefined)
    
    @scala.inline
    def setAggregationLevel(value: String): Self = this.set("aggregationLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationLevel: Self = this.set("aggregationLevel", js.undefined)
  }
}
