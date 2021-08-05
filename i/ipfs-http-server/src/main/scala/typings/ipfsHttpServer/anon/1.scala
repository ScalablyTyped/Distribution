package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def method(request: js.Any, h: js.Any): js.Any
}
object `1` {
  
  inline def apply(method: (js.Any, js.Any) => js.Any): `1` = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setMethod(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
