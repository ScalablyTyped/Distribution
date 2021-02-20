package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofputHandler extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[_] = js.native
  
  val options_2: Typeofoptions2Payload1 = js.native
}
object TypeofputHandler {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[_], options_2: Typeofoptions2Payload1): TypeofputHandler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_2 = options_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofputHandler]
  }
  
  @scala.inline
  implicit class TypeofputHandlerMutableBuilder[Self <: TypeofputHandler] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[_]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions_2(value: Typeofoptions2Payload1): Self = StObject.set(x, "options_2", value.asInstanceOf[js.Any])
  }
}
