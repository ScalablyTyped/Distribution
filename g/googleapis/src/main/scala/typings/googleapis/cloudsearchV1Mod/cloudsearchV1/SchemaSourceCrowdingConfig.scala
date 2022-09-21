package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceCrowdingConfig extends StObject {
  
  /**
    * Maximum number of results allowed from a datasource in a result page as long as results from other sources are not exhausted. Value specified must not be negative. A default value is used if this value is equal to 0. To disable crowding, set the value greater than 100.
    */
  var numResults: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Maximum number of suggestions allowed from a source. No limits will be set on results if this value is less than or equal to 0.
    */
  var numSuggestions: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSourceCrowdingConfig {
  
  inline def apply(): SchemaSourceCrowdingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceCrowdingConfig]
  }
  
  extension [Self <: SchemaSourceCrowdingConfig](x: Self) {
    
    inline def setNumResults(value: Double): Self = StObject.set(x, "numResults", value.asInstanceOf[js.Any])
    
    inline def setNumResultsNull: Self = StObject.set(x, "numResults", null)
    
    inline def setNumResultsUndefined: Self = StObject.set(x, "numResults", js.undefined)
    
    inline def setNumSuggestions(value: Double): Self = StObject.set(x, "numSuggestions", value.asInstanceOf[js.Any])
    
    inline def setNumSuggestionsNull: Self = StObject.set(x, "numSuggestions", null)
    
    inline def setNumSuggestionsUndefined: Self = StObject.set(x, "numSuggestions", js.undefined)
  }
}
