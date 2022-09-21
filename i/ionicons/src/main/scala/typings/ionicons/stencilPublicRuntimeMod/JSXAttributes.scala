package typings.ionicons.stencilPublicRuntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXAttributes[T] extends StObject {
  
  var key: js.UndefOr[String | Double] = js.undefined
  
  var ref: js.UndefOr[js.Function1[/* elm */ js.UndefOr[T], Unit]] = js.undefined
}
object JSXAttributes {
  
  inline def apply[T](): JSXAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSXAttributes[T]]
  }
  
  extension [Self <: JSXAttributes[?], T](x: Self & JSXAttributes[T]) {
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setRef(value: /* elm */ js.UndefOr[T] => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
  }
}
