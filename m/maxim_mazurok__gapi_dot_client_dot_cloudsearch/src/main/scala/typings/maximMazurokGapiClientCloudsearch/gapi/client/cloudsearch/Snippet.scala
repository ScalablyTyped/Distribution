package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Snippet extends StObject {
  
  /** The matched ranges in the snippet. */
  var matchRanges: js.UndefOr[js.Array[MatchRange]] = js.undefined
  
  /** The snippet of the document. The snippet of the document. May contain escaped HTML character that should be unescaped prior to rendering. */
  var snippet: js.UndefOr[String] = js.undefined
}
object Snippet {
  
  inline def apply(): Snippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Snippet]
  }
  
  extension [Self <: Snippet](x: Self) {
    
    inline def setMatchRanges(value: js.Array[MatchRange]): Self = StObject.set(x, "matchRanges", value.asInstanceOf[js.Any])
    
    inline def setMatchRangesUndefined: Self = StObject.set(x, "matchRanges", js.undefined)
    
    inline def setMatchRangesVarargs(value: MatchRange*): Self = StObject.set(x, "matchRanges", js.Array(value*))
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
