package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpeersHandler extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_6: Typeofoptions6 = js.native
}
object TypeofpeersHandler {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options_6: Typeofoptions6): TypeofpeersHandler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_6 = options_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpeersHandler]
  }
  
  @scala.inline
  implicit class TypeofpeersHandlerMutableBuilder[Self <: TypeofpeersHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_6(value: Typeofoptions6): Self = StObject.set(x, "options_6", value.asInstanceOf[js.Any])
  }
}
