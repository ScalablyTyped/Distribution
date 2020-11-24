package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeProviderInfo extends js.Object {
  
  var addressFormats: StringMap = js.native
  
  var buyTickers: js.Array[String] = js.native
  
   // changenow
  var companyName: String = js.native
  
   // changenow-icon.jpg
  var isActive: Boolean = js.native
  
  var isFixedRate: Boolean = js.native
  
  var isRefundRequired: js.UndefOr[Boolean] = js.native
  
   // https://support.changenow.io
  // TODO region of operation
  var kycPolicy: js.UndefOr[String] = js.native
  
   // https://changenow.io/exchange/txs/{{orderId}}
  var kycUrl: String = js.native
  
   // ChangeNow
  var logo: String = js.native
  
  var name: String = js.native
  
  var sellTickers: js.Array[String] = js.native
  
   // specification of formats required by selected exchange
  var statusUrl: String = js.native
  
   // https://changenow.io/faq#kyc
  var supportUrl: String = js.native
}
object ExchangeProviderInfo {
  
  @scala.inline
  def apply(
    addressFormats: StringMap,
    buyTickers: js.Array[String],
    companyName: String,
    isActive: Boolean,
    isFixedRate: Boolean,
    kycUrl: String,
    logo: String,
    name: String,
    sellTickers: js.Array[String],
    statusUrl: String,
    supportUrl: String
  ): ExchangeProviderInfo = {
    val __obj = js.Dynamic.literal(addressFormats = addressFormats.asInstanceOf[js.Any], buyTickers = buyTickers.asInstanceOf[js.Any], companyName = companyName.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isFixedRate = isFixedRate.asInstanceOf[js.Any], kycUrl = kycUrl.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sellTickers = sellTickers.asInstanceOf[js.Any], statusUrl = statusUrl.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeProviderInfo]
  }
  
  @scala.inline
  implicit class ExchangeProviderInfoOps[Self <: ExchangeProviderInfo] (val x: Self) extends AnyVal {
    
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
    def setAddressFormats(value: StringMap): Self = this.set("addressFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyTickersVarargs(value: String*): Self = this.set("buyTickers", js.Array(value :_*))
    
    @scala.inline
    def setBuyTickers(value: js.Array[String]): Self = this.set("buyTickers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFixedRate(value: Boolean): Self = this.set("isFixedRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKycUrl(value: String): Self = this.set("kycUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellTickersVarargs(value: String*): Self = this.set("sellTickers", js.Array(value :_*))
    
    @scala.inline
    def setSellTickers(value: js.Array[String]): Self = this.set("sellTickers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUrl(value: String): Self = this.set("statusUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrl(value: String): Self = this.set("supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRefundRequired(value: Boolean): Self = this.set("isRefundRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsRefundRequired: Self = this.set("isRefundRequired", js.undefined)
    
    @scala.inline
    def setKycPolicy(value: String): Self = this.set("kycPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKycPolicy: Self = this.set("kycPolicy", js.undefined)
  }
}
