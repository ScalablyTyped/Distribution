package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestResponse extends StObject {
  
  /** List of suggestions. */
  var suggestResults: js.UndefOr[js.Array[SuggestResult]] = js.native
}
object SuggestResponse {
  
  @scala.inline
  def apply(): SuggestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestResponse]
  }
  
  @scala.inline
  implicit class SuggestResponseMutableBuilder[Self <: SuggestResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestResults(value: js.Array[SuggestResult]): Self = StObject.set(x, "suggestResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestResultsUndefined: Self = StObject.set(x, "suggestResults", js.undefined)
    
    @scala.inline
    def setSuggestResultsVarargs(value: SuggestResult*): Self = StObject.set(x, "suggestResults", js.Array(value :_*))
  }
}
