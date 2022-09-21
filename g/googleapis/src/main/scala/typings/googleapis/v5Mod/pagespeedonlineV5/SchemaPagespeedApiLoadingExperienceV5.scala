package typings.googleapis.v5Mod.pagespeedonlineV5

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPagespeedApiLoadingExperienceV5 extends StObject {
  
  /**
    * The url, pattern or origin which the metrics are on.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The requested URL, which may differ from the resolved "id".
    */
  var initial_url: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The map of .
    */
  var metrics: js.UndefOr[StringDictionary[SchemaUserPageLoadMetricV5] | Null] = js.undefined
  
  /**
    * True if the result is an origin fallback from a page, false otherwise.
    */
  var origin_fallback: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The human readable speed "category" of the id.
    */
  var overall_category: js.UndefOr[String | Null] = js.undefined
}
object SchemaPagespeedApiLoadingExperienceV5 {
  
  inline def apply(): SchemaPagespeedApiLoadingExperienceV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiLoadingExperienceV5]
  }
  
  extension [Self <: SchemaPagespeedApiLoadingExperienceV5](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitial_url(value: String): Self = StObject.set(x, "initial_url", value.asInstanceOf[js.Any])
    
    inline def setInitial_urlNull: Self = StObject.set(x, "initial_url", null)
    
    inline def setInitial_urlUndefined: Self = StObject.set(x, "initial_url", js.undefined)
    
    inline def setMetrics(value: StringDictionary[SchemaUserPageLoadMetricV5]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsNull: Self = StObject.set(x, "metrics", null)
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setOrigin_fallback(value: Boolean): Self = StObject.set(x, "origin_fallback", value.asInstanceOf[js.Any])
    
    inline def setOrigin_fallbackNull: Self = StObject.set(x, "origin_fallback", null)
    
    inline def setOrigin_fallbackUndefined: Self = StObject.set(x, "origin_fallback", js.undefined)
    
    inline def setOverall_category(value: String): Self = StObject.set(x, "overall_category", value.asInstanceOf[js.Any])
    
    inline def setOverall_categoryNull: Self = StObject.set(x, "overall_category", null)
    
    inline def setOverall_categoryUndefined: Self = StObject.set(x, "overall_category", js.undefined)
  }
}
