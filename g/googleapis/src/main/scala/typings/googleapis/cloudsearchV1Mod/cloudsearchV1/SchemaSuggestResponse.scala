package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSuggestResponse extends StObject {
  
  /**
    * List of suggestions.
    */
  var suggestResults: js.UndefOr[js.Array[SchemaSuggestResult]] = js.undefined
}
object SchemaSuggestResponse {
  
  inline def apply(): SchemaSuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSuggestResponse]
  }
  
  extension [Self <: SchemaSuggestResponse](x: Self) {
    
    inline def setSuggestResults(value: js.Array[SchemaSuggestResult]): Self = StObject.set(x, "suggestResults", value.asInstanceOf[js.Any])
    
    inline def setSuggestResultsUndefined: Self = StObject.set(x, "suggestResults", js.undefined)
    
    inline def setSuggestResultsVarargs(value: SchemaSuggestResult*): Self = StObject.set(x, "suggestResults", js.Array(value*))
  }
}
