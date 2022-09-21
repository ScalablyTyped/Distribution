package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepricingrulesList
  extends StObject
     with StandardParameters {
  
  /**
    * [CLDR country code](http://www.unicode.org/repos/cldr/tags/latest/common/main/en.xml) (e.g. "US"), used as a filter on repricing rules.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  
  /**
    * The two-letter ISO 639-1 language code associated with the repricing rule, used as a filter.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the merchant who owns the repricing rule.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of repricing rules to return. The service may return fewer than this value. If unspecified, at most 50 rules will be returned. The maximum value is 1000; values above 1000 will be coerced to 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous `ListRepricingRules` call. Provide this to retrieve the subsequent page. When paginating, all other parameters provided to `ListRepricingRules` must match the call that provided the page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceRepricingrulesList {
  
  inline def apply(): ParamsResourceRepricingrulesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepricingrulesList]
  }
  
  extension [Self <: ParamsResourceRepricingrulesList](x: Self) {
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
