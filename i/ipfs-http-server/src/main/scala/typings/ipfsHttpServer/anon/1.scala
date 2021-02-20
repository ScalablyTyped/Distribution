package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  def method(request: js.Any, h: js.Any): js.Any = js.native
}
object `1` {
  
  @scala.inline
  def apply(method: (js.Any, js.Any) => js.Any): `1` = {
    val __obj = js.Dynamic.literal(method = js.Any.fromFunction2(method))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "method", js.Any.fromFunction2(value))
  }
}
