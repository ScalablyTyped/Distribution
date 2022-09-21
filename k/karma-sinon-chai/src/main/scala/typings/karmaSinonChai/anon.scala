package typings.karmaSinonChai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<chai.Chai.Config> */
  trait PartialConfig extends StObject {
    
    var includeStack: js.UndefOr[Boolean] = js.undefined
    
    var proxyExcludedKeys: js.UndefOr[js.Array[String]] = js.undefined
    
    var showDiff: js.UndefOr[Boolean] = js.undefined
    
    var truncateThreshold: js.UndefOr[Double] = js.undefined
    
    var useProxy: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    extension [Self <: PartialConfig](x: Self) {
      
      inline def setIncludeStack(value: Boolean): Self = StObject.set(x, "includeStack", value.asInstanceOf[js.Any])
      
      inline def setIncludeStackUndefined: Self = StObject.set(x, "includeStack", js.undefined)
      
      inline def setProxyExcludedKeys(value: js.Array[String]): Self = StObject.set(x, "proxyExcludedKeys", value.asInstanceOf[js.Any])
      
      inline def setProxyExcludedKeysUndefined: Self = StObject.set(x, "proxyExcludedKeys", js.undefined)
      
      inline def setProxyExcludedKeysVarargs(value: String*): Self = StObject.set(x, "proxyExcludedKeys", js.Array(value*))
      
      inline def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
      
      inline def setShowDiffUndefined: Self = StObject.set(x, "showDiff", js.undefined)
      
      inline def setTruncateThreshold(value: Double): Self = StObject.set(x, "truncateThreshold", value.asInstanceOf[js.Any])
      
      inline def setTruncateThresholdUndefined: Self = StObject.set(x, "truncateThreshold", js.undefined)
      
      inline def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
      
      inline def setUseProxyUndefined: Self = StObject.set(x, "useProxy", js.undefined)
    }
  }
}
