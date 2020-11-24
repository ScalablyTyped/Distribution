package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The metric short id is returned to the user alongside an offset into
  * ReportWorkItemStatusRequest
  */
@js.native
trait SchemaMetricShortId extends js.Object {
  
  /**
    * The index of the corresponding metric in the ReportWorkItemStatusRequest.
    * Required.
    */
  var metricIndex: js.UndefOr[Double] = js.native
  
  /**
    * The service-generated short identifier for the metric.
    */
  var shortId: js.UndefOr[String] = js.native
}
object SchemaMetricShortId {
  
  @scala.inline
  def apply(): SchemaMetricShortId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricShortId]
  }
  
  @scala.inline
  implicit class SchemaMetricShortIdOps[Self <: SchemaMetricShortId] (val x: Self) extends AnyVal {
    
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
