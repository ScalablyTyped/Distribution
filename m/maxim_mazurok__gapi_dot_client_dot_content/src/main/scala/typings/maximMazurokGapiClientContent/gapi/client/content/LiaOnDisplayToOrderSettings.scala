package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiaOnDisplayToOrderSettings extends StObject {
  
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
  implicit class LiaOnDisplayToOrderSettingsMutableBuilder[Self <: LiaOnDisplayToOrderSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShippingCostPolicyUrl(value: String): Self = StObject.set(x, "shippingCostPolicyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingCostPolicyUrlUndefined: Self = StObject.set(x, "shippingCostPolicyUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
