package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePagespeedapiRunpagespeed
  extends StObject
     with StandardParameters {
  
  /**
    * The captcha token passed when filling out a captcha.
    */
  var captchaToken: js.UndefOr[String] = js.undefined
  
  /**
    * A Lighthouse category to run; if none are given, only Performance category will be run
    */
  var category: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The locale used to localize formatted results
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The analysis strategy (desktop or mobile) to use, and desktop is the default
    */
  var strategy: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The URL to fetch and analyze
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Campaign name for analytics.
    */
  var utm_campaign: js.UndefOr[String] = js.undefined
  
  /**
    * Campaign source for analytics.
    */
  var utm_source: js.UndefOr[String] = js.undefined
}
object ParamsResourcePagespeedapiRunpagespeed {
  
  inline def apply(): ParamsResourcePagespeedapiRunpagespeed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePagespeedapiRunpagespeed]
  }
  
  extension [Self <: ParamsResourcePagespeedapiRunpagespeed](x: Self) {
    
    inline def setCaptchaToken(value: String): Self = StObject.set(x, "captchaToken", value.asInstanceOf[js.Any])
    
    inline def setCaptchaTokenUndefined: Self = StObject.set(x, "captchaToken", js.undefined)
    
    inline def setCategory(value: js.Array[String]): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setCategoryVarargs(value: String*): Self = StObject.set(x, "category", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setStrategy(value: String): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUtm_campaign(value: String): Self = StObject.set(x, "utm_campaign", value.asInstanceOf[js.Any])
    
    inline def setUtm_campaignUndefined: Self = StObject.set(x, "utm_campaign", js.undefined)
    
    inline def setUtm_source(value: String): Self = StObject.set(x, "utm_source", value.asInstanceOf[js.Any])
    
    inline def setUtm_sourceUndefined: Self = StObject.set(x, "utm_source", js.undefined)
  }
}
