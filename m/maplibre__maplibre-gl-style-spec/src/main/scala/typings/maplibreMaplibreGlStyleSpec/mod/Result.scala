package typings.maplibreMaplibreGlStyleSpec.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.maplibreMaplibreGlStyleSpec.anon.Result[T]
  - typings.maplibreMaplibreGlStyleSpec.anon.Value[E]
*/
trait Result[T, E] extends StObject
object Result {
  
  inline def Result[T](value: T): typings.maplibreMaplibreGlStyleSpec.anon.Result[T] = {
    val __obj = js.Dynamic.literal(result = "success", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Result[T]]
  }
  
  inline def Value[E](value: E): typings.maplibreMaplibreGlStyleSpec.anon.Value[E] = {
    val __obj = js.Dynamic.literal(result = "error", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.maplibreMaplibreGlStyleSpec.anon.Value[E]]
  }
}
