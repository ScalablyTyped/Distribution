package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCategories extends StObject {
  
  /**
    * The accessibility category, containing all accessibility related audits.
    */
  var accessibility: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  /**
    * The best practices category, containing all best practices related audits.
    */
  var `best-practices`: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  /**
    * The performance category, containing all performance related audits.
    */
  var performance: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  /**
    * The Progressive-Web-App (PWA) category, containing all pwa related audits.
    */
  var pwa: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
  
  /**
    * The Search-Engine-Optimization (SEO) category, containing all seo related audits.
    */
  var seo: js.UndefOr[SchemaLighthouseCategoryV5] = js.undefined
}
object SchemaCategories {
  
  inline def apply(): SchemaCategories = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategories]
  }
  
  extension [Self <: SchemaCategories](x: Self) {
    
    inline def setAccessibility(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def `setBest-practices`(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "best-practices", value.asInstanceOf[js.Any])
    
    inline def `setBest-practicesUndefined`: Self = StObject.set(x, "best-practices", js.undefined)
    
    inline def setPerformance(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
    
    inline def setPerformanceUndefined: Self = StObject.set(x, "performance", js.undefined)
    
    inline def setPwa(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "pwa", value.asInstanceOf[js.Any])
    
    inline def setPwaUndefined: Self = StObject.set(x, "pwa", js.undefined)
    
    inline def setSeo(value: SchemaLighthouseCategoryV5): Self = StObject.set(x, "seo", value.asInstanceOf[js.Any])
    
    inline def setSeoUndefined: Self = StObject.set(x, "seo", js.undefined)
  }
}
