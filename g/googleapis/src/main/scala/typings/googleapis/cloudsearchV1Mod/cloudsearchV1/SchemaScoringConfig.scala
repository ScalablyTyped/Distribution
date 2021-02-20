package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Scoring configurations for a source while processing a Search or Suggest
  * request.
  */
@js.native
trait SchemaScoringConfig extends StObject {
  
  /**
    * Whether to use freshness as a ranking signal. By default, freshness is
    * used as a ranking signal. Note that this setting is not available in the
    * Admin UI.
    */
  var disableFreshness: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to personalize the results. By default, personal signals will be
    * used to boost results.
    */
  var disablePersonalization: js.UndefOr[Boolean] = js.native
}
object SchemaScoringConfig {
  
  @scala.inline
  def apply(): SchemaScoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScoringConfig]
  }
  
  @scala.inline
  implicit class SchemaScoringConfigMutableBuilder[Self <: SchemaScoringConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableFreshness(value: Boolean): Self = StObject.set(x, "disableFreshness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFreshnessUndefined: Self = StObject.set(x, "disableFreshness", js.undefined)
    
    @scala.inline
    def setDisablePersonalization(value: Boolean): Self = StObject.set(x, "disablePersonalization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisablePersonalizationUndefined: Self = StObject.set(x, "disablePersonalization", js.undefined)
  }
}
