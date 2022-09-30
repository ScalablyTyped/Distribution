package typings.leafletGeosearch.anon

import typings.leafletGeosearch.providerMod.SearchResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultSearchResult extends StObject {
  
  var result: SearchResult[Any]
}
object ResultSearchResult {
  
  inline def apply(result: SearchResult[Any]): ResultSearchResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSearchResult]
  }
  
  extension [Self <: ResultSearchResult](x: Self) {
    
    inline def setResult(value: SearchResult[Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
