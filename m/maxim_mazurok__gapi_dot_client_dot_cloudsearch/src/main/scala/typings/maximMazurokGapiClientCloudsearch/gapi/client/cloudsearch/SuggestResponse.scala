package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestResponse extends StObject {
  
  /** List of suggestions. */
  var suggestResults: js.UndefOr[js.Array[SuggestResult]] = js.undefined
}
object SuggestResponse {
  
  inline def apply(): SuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestResponse]
  }
  
  extension [Self <: SuggestResponse](x: Self) {
    
    inline def setSuggestResults(value: js.Array[SuggestResult]): Self = StObject.set(x, "suggestResults", value.asInstanceOf[js.Any])
    
    inline def setSuggestResultsUndefined: Self = StObject.set(x, "suggestResults", js.undefined)
    
    inline def setSuggestResultsVarargs(value: SuggestResult*): Self = StObject.set(x, "suggestResults", js.Array(value :_*))
  }
}
