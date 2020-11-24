package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkReportSpecSortCondition extends js.Object {
  
  /** Sort by the specified dimension. */
  var dimension: js.UndefOr[String] = js.native
  
  /** Sort by the specified metric. */
  var metric: js.UndefOr[String] = js.native
  
  /** Sorting order of the dimension or metric. */
  var order: js.UndefOr[String] = js.native
}
object NetworkReportSpecSortCondition {
  
  @scala.inline
  def apply(): NetworkReportSpecSortCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkReportSpecSortCondition]
  }
  
  @scala.inline
  implicit class NetworkReportSpecSortConditionOps[Self <: NetworkReportSpecSortCondition] (val x: Self) extends AnyVal {
    
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
    def setDimension(value: String): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setMetric(value: String): Self = this.set("metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetric: Self = this.set("metric", js.undefined)
    
    @scala.inline
    def setOrder(value: String): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
  }
}
