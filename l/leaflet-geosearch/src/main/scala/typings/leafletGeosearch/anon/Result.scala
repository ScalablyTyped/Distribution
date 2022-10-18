package typings.leafletGeosearch.anon

import typings.leafletGeosearch.distProvidersProviderMod.SearchResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Result[T] extends StObject {
  
  var result: SearchResult[T]
}
object Result {
  
  inline def apply[T](result: SearchResult[T]): Result[T] = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result[T]]
  }
  
  extension [Self <: Result[?], T](x: Self & Result[T]) {
    
    inline def setResult(value: SearchResult[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
