package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyListResponse extends js.Object {
  
  var country: String = js.native
  
   // optional field, fiat currency based on user's IP
  var providers: js.Array[BuyProviderInfo] = js.native
  
  var suggestedFiatCurrency: js.UndefOr[String] = js.native
}
object BuyListResponse {
  
  @scala.inline
  def apply(country: String, providers: js.Array[BuyProviderInfo]): BuyListResponse = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyListResponse]
  }
  
  @scala.inline
  implicit class BuyListResponseOps[Self <: BuyListResponse] (val x: Self) extends AnyVal {
    
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
    def setProvidersVarargs(value: BuyProviderInfo*): Self = this.set("providers", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[BuyProviderInfo]): Self = this.set("providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedFiatCurrency(value: String): Self = this.set("suggestedFiatCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedFiatCurrency: Self = this.set("suggestedFiatCurrency", js.undefined)
  }
}
