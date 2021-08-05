package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Snippet of the search result, which summarizes the content of the resulting
  * page.
  */
trait SchemaSnippet extends StObject {
  
  /**
    * The matched ranges in the snippet.
    */
  var matchRanges: js.UndefOr[js.Array[SchemaMatchRange]] = js.undefined
  
  /**
    * The snippet of the document. The snippet of the document. May contain
    * escaped HTML character that should be unescaped prior to rendering.
    */
  var snippet: js.UndefOr[String] = js.undefined
}
object SchemaSnippet {
  
  inline def apply(): SchemaSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSnippet]
  }
  
  extension [Self <: SchemaSnippet](x: Self) {
    
    inline def setMatchRanges(value: js.Array[SchemaMatchRange]): Self = StObject.set(x, "matchRanges", value.asInstanceOf[js.Any])
    
    inline def setMatchRangesUndefined: Self = StObject.set(x, "matchRanges", js.undefined)
    
    inline def setMatchRangesVarargs(value: SchemaMatchRange*): Self = StObject.set(x, "matchRanges", js.Array(value :_*))
    
    inline def setSnippet(value: String): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
