package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScoringConfig extends StObject {
  
  /** Whether to use freshness as a ranking signal. By default, freshness is used as a ranking signal. Note that this setting is not available in the Admin UI. */
  var disableFreshness: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to personalize the results. By default, personal signals will be used to boost results. */
  var disablePersonalization: js.UndefOr[Boolean] = js.undefined
}
object ScoringConfig {
  
  inline def apply(): ScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScoringConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScoringConfig] (val x: Self) extends AnyVal {
    
    inline def setDisableFreshness(value: Boolean): Self = StObject.set(x, "disableFreshness", value.asInstanceOf[js.Any])
    
    inline def setDisableFreshnessUndefined: Self = StObject.set(x, "disableFreshness", js.undefined)
    
    inline def setDisablePersonalization(value: Boolean): Self = StObject.set(x, "disablePersonalization", value.asInstanceOf[js.Any])
    
    inline def setDisablePersonalizationUndefined: Self = StObject.set(x, "disablePersonalization", js.undefined)
  }
}
