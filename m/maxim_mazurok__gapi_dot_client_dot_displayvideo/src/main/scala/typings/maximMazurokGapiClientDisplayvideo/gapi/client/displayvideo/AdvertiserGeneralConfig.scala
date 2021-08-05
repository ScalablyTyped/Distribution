package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiserGeneralConfig extends StObject {
  
  /**
    * Required. Immutable. Advertiser's currency in ISO 4217 format. Accepted codes and the currencies they represent are: Currency Code : Currency Name * `ARS` : Argentine Peso * `AUD` :
    * Australian Dollar * `BRL` : Brazilian Real * `CAD` : Canadian Dollar * `CHF` : Swiss Franc * `CLP` : Chilean Peso * `CNY` : Chinese Yuan * `COP` : Colombian Peso * `CZK` : Czech
    * Koruna * `DKK` : Danish Krone * `EGP` : Egyption Pound * `EUR` : Euro * `GBP` : British Pound * `HKD` : Hong Kong Dollar * `HUF` : Hungarian Forint * `IDR` : Indonesian Rupiah *
    * `ILS` : Israeli Shekel * `INR` : Indian Rupee * `JPY` : Japanese Yen * `KRW` : South Korean Won * `MXN` : Mexican Pesos * `MYR` : Malaysian Ringgit * `NGN` : Nigerian Naira * `NOK`
    * : Norwegian Krone * `NZD` : New Zealand Dollar * `PEN` : Peruvian Nuevo Sol * `PLN` : Polish Zloty * `RON` : New Romanian Leu * `RUB` : Russian Ruble * `SEK` : Swedish Krona * `TRY`
    * : Turkish Lira * `TWD` : New Taiwan Dollar * `USD` : US Dollar * `ZAR` : South African Rand
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The domain URL of the advertiser's primary website. The system will send this information to publishers that require website URL to associate a campaign with an
    * advertiser. Provide a URL with no path or query string, beginning with `http:` or `https:`. For example, http://www.example.com
    */
  var domainUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The standard TZ database name of the advertiser's time zone. For example, `America/New_York`. See more at: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
    * For CM360 hybrid advertisers, the time zone is the same as that of the associated CM360 account; for third-party only advertisers, the time zone is the same as that of the parent
    * partner.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object AdvertiserGeneralConfig {
  
  inline def apply(): AdvertiserGeneralConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiserGeneralConfig]
  }
  
  extension [Self <: AdvertiserGeneralConfig](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setDomainUrl(value: String): Self = StObject.set(x, "domainUrl", value.asInstanceOf[js.Any])
    
    inline def setDomainUrlUndefined: Self = StObject.set(x, "domainUrl", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
