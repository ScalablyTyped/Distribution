package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountTaxTaxRule extends js.Object {
  
  /** Country code in which tax is applicable. */
  var country: js.UndefOr[String] = js.native
  
  /** Required. State (or province) is which the tax is applicable, described by its location ID (also called criteria ID). */
  var locationId: js.UndefOr[String] = js.native
  
  /** Explicit tax rate in percent, represented as a floating point number without the percentage character. Must not be negative. */
  var ratePercent: js.UndefOr[String] = js.native
  
  /** If true, shipping charges are also taxed. */
  var shippingTaxed: js.UndefOr[Boolean] = js.native
  
  /** Whether the tax rate is taken from a global tax table or specified explicitly. */
  var useGlobalRate: js.UndefOr[Boolean] = js.native
}
object AccountTaxTaxRule {
  
  @scala.inline
  def apply(): AccountTaxTaxRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountTaxTaxRule]
  }
  
  @scala.inline
  implicit class AccountTaxTaxRuleOps[Self <: AccountTaxTaxRule] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationId: Self = this.set("locationId", js.undefined)
    
    @scala.inline
    def setRatePercent(value: String): Self = this.set("ratePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRatePercent: Self = this.set("ratePercent", js.undefined)
    
    @scala.inline
    def setShippingTaxed(value: Boolean): Self = this.set("shippingTaxed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingTaxed: Self = this.set("shippingTaxed", js.undefined)
    
    @scala.inline
    def setUseGlobalRate(value: Boolean): Self = this.set("useGlobalRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseGlobalRate: Self = this.set("useGlobalRate", js.undefined)
  }
}
