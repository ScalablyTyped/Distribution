package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NumericValue extends js.Object {
  
  /** Double value */
  var doubleValue: js.UndefOr[Double] = js.native
  
  /** Integer value */
  var int64Value: js.UndefOr[String] = js.native
}
object NumericValue {
  
  @scala.inline
  def apply(): NumericValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericValue]
  }
  
  @scala.inline
  implicit class NumericValueOps[Self <: NumericValue] (val x: Self) extends AnyVal {
    
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
    def setInt64Value(value: String): Self = this.set("int64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInt64Value: Self = this.set("int64Value", js.undefined)
  }
}
