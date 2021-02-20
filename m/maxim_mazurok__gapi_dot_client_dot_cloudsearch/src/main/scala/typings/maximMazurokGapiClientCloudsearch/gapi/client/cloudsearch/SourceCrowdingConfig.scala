package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceCrowdingConfig extends StObject {
  
  /** Maximum number of results allowed from a source. No limits will be set on results if this value is less than or equal to 0. */
  var numResults: js.UndefOr[Double] = js.native
  
  /** Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0. */
  var numSuggestions: js.UndefOr[Double] = js.native
}
object SourceCrowdingConfig {
  
  @scala.inline
  def apply(): SourceCrowdingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCrowdingConfig]
  }
  
  @scala.inline
  implicit class SourceCrowdingConfigMutableBuilder[Self <: SourceCrowdingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNumResults(value: Double): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
    
    @scala.inline
    def setNumSuggestions(value: Double): Self = StObject.set(x, "numSuggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumSuggestionsUndefined: Self = StObject.set(x, "numSuggestions", js.undefined)
  }
}
