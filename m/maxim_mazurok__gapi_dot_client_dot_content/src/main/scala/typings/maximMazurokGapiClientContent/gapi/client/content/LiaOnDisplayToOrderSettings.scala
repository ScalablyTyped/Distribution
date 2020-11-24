package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiaOnDisplayToOrderSettings extends js.Object {
  
  /** Shipping cost and policy URL. */
  var shippingCostPolicyUrl: js.UndefOr[String] = js.native
  
  /** The status of the ?On display to order? feature. Acceptable values are: - "`active`" - "`inactive`" - "`pending`" */
  var status: js.UndefOr[String] = js.native
}
object LiaOnDisplayToOrderSettings {
  
  @scala.inline
  def apply(): LiaOnDisplayToOrderSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiaOnDisplayToOrderSettings]
  }
  
  @scala.inline
  implicit class LiaOnDisplayToOrderSettingsOps[Self <: LiaOnDisplayToOrderSettings] (val x: Self) extends AnyVal {
    
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
    def setShippingCostPolicyUrl(value: String): Self = this.set("shippingCostPolicyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingCostPolicyUrl: Self = this.set("shippingCostPolicyUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
