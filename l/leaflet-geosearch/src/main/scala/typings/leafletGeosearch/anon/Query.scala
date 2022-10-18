package typings.leafletGeosearch.anon

import typings.leafletGeosearch.distProvidersProviderMod.SearchResult
import typings.leafletGeosearch.distSearchControlMod.Selection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Query[T] extends StObject {
  
  var query: Selection
  
  var result: SearchResult[T]
}
object Query {
  
  inline def apply[T](query: Selection, result: SearchResult[T]): Query[T] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[T]]
  }
  
  extension [Self <: Query[?], T](x: Self & Query[T]) {
    
    inline def setQuery(value: Selection): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult(value: SearchResult[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
