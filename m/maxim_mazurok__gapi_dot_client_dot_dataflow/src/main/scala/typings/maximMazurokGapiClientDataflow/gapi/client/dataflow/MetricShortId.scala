package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetricShortId extends js.Object {
  
  /** The index of the corresponding metric in the ReportWorkItemStatusRequest. Required. */
  var metricIndex: js.UndefOr[Double] = js.native
  
  /** The service-generated short identifier for the metric. */
  var shortId: js.UndefOr[String] = js.native
}
object MetricShortId {
  
  @scala.inline
  def apply(): MetricShortId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricShortId]
  }
  
  @scala.inline
  implicit class MetricShortIdOps[Self <: MetricShortId] (val x: Self) extends AnyVal {
    
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
    def setMetricIndex(value: Double): Self = this.set("metricIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricIndex: Self = this.set("metricIndex", js.undefined)
    
    @scala.inline
    def setShortId(value: String): Self = this.set("shortId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortId: Self = this.set("shortId", js.undefined)
  }
}
