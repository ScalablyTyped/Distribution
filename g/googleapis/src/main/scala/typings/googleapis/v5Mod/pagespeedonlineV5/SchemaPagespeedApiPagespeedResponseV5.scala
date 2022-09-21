package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPagespeedApiPagespeedResponseV5 extends StObject {
  
  /**
    * The UTC timestamp of this analysis.
    */
  var analysisUTCTimestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Canonicalized and final URL for the document, after following page redirects (if any).
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Lighthouse response for the audit url as an object.
    */
  var lighthouseResult: js.UndefOr[SchemaLighthouseResultV5] = js.undefined
  
  /**
    * Metrics of end users' page loading experience.
    */
  var loadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.undefined
  
  /**
    * Metrics of the aggregated page loading experience of the origin
    */
  var originLoadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.undefined
  
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[SchemaPagespeedVersion] = js.undefined
}
object SchemaPagespeedApiPagespeedResponseV5 {
  
  inline def apply(): SchemaPagespeedApiPagespeedResponseV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV5]
  }
  
  extension [Self <: SchemaPagespeedApiPagespeedResponseV5](x: Self) {
    
    inline def setAnalysisUTCTimestamp(value: String): Self = StObject.set(x, "analysisUTCTimestamp", value.asInstanceOf[js.Any])
    
    inline def setAnalysisUTCTimestampNull: Self = StObject.set(x, "analysisUTCTimestamp", null)
    
    inline def setAnalysisUTCTimestampUndefined: Self = StObject.set(x, "analysisUTCTimestamp", js.undefined)
    
    inline def setCaptchaResult(value: String): Self = StObject.set(x, "captchaResult", value.asInstanceOf[js.Any])
    
    inline def setCaptchaResultNull: Self = StObject.set(x, "captchaResult", null)
    
    inline def setCaptchaResultUndefined: Self = StObject.set(x, "captchaResult", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLighthouseResult(value: SchemaLighthouseResultV5): Self = StObject.set(x, "lighthouseResult", value.asInstanceOf[js.Any])
    
    inline def setLighthouseResultUndefined: Self = StObject.set(x, "lighthouseResult", js.undefined)
    
    inline def setLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = StObject.set(x, "loadingExperience", value.asInstanceOf[js.Any])
    
    inline def setLoadingExperienceUndefined: Self = StObject.set(x, "loadingExperience", js.undefined)
    
    inline def setOriginLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = StObject.set(x, "originLoadingExperience", value.asInstanceOf[js.Any])
    
    inline def setOriginLoadingExperienceUndefined: Self = StObject.set(x, "originLoadingExperience", js.undefined)
    
    inline def setVersion(value: SchemaPagespeedVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
