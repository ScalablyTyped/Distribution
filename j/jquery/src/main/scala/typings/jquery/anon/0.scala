package typings.jquery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[TElement] extends StObject {
  
  def get(elem: TElement): Any
}
object `0` {
  
  inline def apply[TElement](get: TElement => Any): `0`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`0`[TElement]]
  }
  
  extension [Self <: `0`[?], TElement](x: Self & `0`[TElement]) {
    
    inline def setGet(value: TElement => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
