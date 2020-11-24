package typings.maximMazurokGapiClientAdmob.gapi.client.admob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportRowMetricValue extends js.Object {
  
  /** Double precision (approximate) decimal values. Rates are from 0 to 1. */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /** Metric integer value. */
  var integerValue: js.UndefOr[String] = js.native
  
  /**
    * Amount in micros. One million is equivalent to one unit. Currency value is in the unit (USD, EUR or other) specified by the request. For example, $6.50 whould be represented as
    * 6500000 micros.
    */
  var microsValue: js.UndefOr[String] = js.native
}
object ReportRowMetricValue {
  
  @scala.inline
  def apply(): ReportRowMetricValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportRowMetricValue]
  }
  
  @scala.inline
  implicit class ReportRowMetricValueOps[Self <: ReportRowMetricValue] (val x: Self) extends AnyVal {
    
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
    def setDoubleValue(value: Double): Self = this.set("doubleValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDoubleValue: Self = this.set("doubleValue", js.undefined)
    
    @scala.inline
    def setIntegerValue(value: String): Self = this.set("integerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntegerValue: Self = this.set("integerValue", js.undefined)
    
    @scala.inline
    def setMicrosValue(value: String): Self = this.set("microsValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMicrosValue: Self = this.set("microsValue", js.undefined)
  }
}
