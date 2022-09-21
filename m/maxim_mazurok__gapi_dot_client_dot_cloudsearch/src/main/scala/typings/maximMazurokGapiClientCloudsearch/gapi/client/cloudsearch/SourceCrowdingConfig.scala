package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCrowdingConfig extends StObject {
  
  /**
    * Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value
    * is used if this value is equal to 0. To disable crowding, set the value greater than 100.
    */
  var numResults: js.UndefOr[Double] = js.undefined
  
  /** Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0. */
  var numSuggestions: js.UndefOr[Double] = js.undefined
}
object SourceCrowdingConfig {
  
  inline def apply(): SourceCrowdingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCrowdingConfig]
  }
  
  extension [Self <: SourceCrowdingConfig](x: Self) {
    
    inline def setNumResults(value: Double): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    inline def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
    
    inline def setNumSuggestions(value: Double): Self = StObject.set(x, "numSuggestions", value.asInstanceOf[js.Any])
    
    inline def setNumSuggestionsUndefined: Self = StObject.set(x, "numSuggestions", js.undefined)
  }
}
