package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeProviderInfo extends StObject {
  
  var addressFormats: StringMap
  
  var buyTickers: js.Array[String]
  
  // changenow
  var companyName: String
  
  // changenow-icon.jpg
  var isActive: Boolean
  
  var isDex: Boolean
  
  var isFixedRate: Boolean
  
  var isRefundRequired: js.UndefOr[Boolean] = js.undefined
  
  // https://support.changenow.io
  // TODO region of operation
  var kycPolicy: js.UndefOr[String] = js.undefined
  
  // https://changenow.io/exchange/txs/{{orderId}}
  var kycUrl: String
  
  // ChangeNow
  var logo: String
  
  var name: String
  
  var sellTickers: js.Array[String]
  
  // specification of formats required by selected exchange
  var statusUrl: String
  
  // https://changenow.io/faq#kyc
  var supportUrl: String
}
object ExchangeProviderInfo {
  
  inline def apply(
    addressFormats: StringMap,
    buyTickers: js.Array[String],
    companyName: String,
    isActive: Boolean,
    isDex: Boolean,
    isFixedRate: Boolean,
    kycUrl: String,
    logo: String,
    name: String,
    sellTickers: js.Array[String],
    statusUrl: String,
    supportUrl: String
  ): ExchangeProviderInfo = {
    val __obj = js.Dynamic.literal(addressFormats = addressFormats.asInstanceOf[js.Any], buyTickers = buyTickers.asInstanceOf[js.Any], companyName = companyName.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], isDex = isDex.asInstanceOf[js.Any], isFixedRate = isFixedRate.asInstanceOf[js.Any], kycUrl = kycUrl.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sellTickers = sellTickers.asInstanceOf[js.Any], statusUrl = statusUrl.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeProviderInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExchangeProviderInfo] (val x: Self) extends AnyVal {
    
    inline def setAddressFormats(value: StringMap): Self = StObject.set(x, "addressFormats", value.asInstanceOf[js.Any])
    
    inline def setBuyTickers(value: js.Array[String]): Self = StObject.set(x, "buyTickers", value.asInstanceOf[js.Any])
    
    inline def setBuyTickersVarargs(value: String*): Self = StObject.set(x, "buyTickers", js.Array(value*))
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsDex(value: Boolean): Self = StObject.set(x, "isDex", value.asInstanceOf[js.Any])
    
    inline def setIsFixedRate(value: Boolean): Self = StObject.set(x, "isFixedRate", value.asInstanceOf[js.Any])
    
    inline def setIsRefundRequired(value: Boolean): Self = StObject.set(x, "isRefundRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRefundRequiredUndefined: Self = StObject.set(x, "isRefundRequired", js.undefined)
    
    inline def setKycPolicy(value: String): Self = StObject.set(x, "kycPolicy", value.asInstanceOf[js.Any])
    
    inline def setKycPolicyUndefined: Self = StObject.set(x, "kycPolicy", js.undefined)
    
    inline def setKycUrl(value: String): Self = StObject.set(x, "kycUrl", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSellTickers(value: js.Array[String]): Self = StObject.set(x, "sellTickers", value.asInstanceOf[js.Any])
    
    inline def setSellTickersVarargs(value: String*): Self = StObject.set(x, "sellTickers", js.Array(value*))
    
    inline def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
  }
}
