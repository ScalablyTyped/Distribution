package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofrmHandler1 extends StObject {
  
  def handler_1(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_2: Typeofoptions2
}
object TypeofrmHandler1 {
  
  inline def apply(handler_1: (js.Any, js.Any) => js.Promise[js.Any], options_2: Typeofoptions2): TypeofrmHandler1 = {
    val __obj = js.Dynamic.literal(handler_1 = js.Any.fromFunction2(handler_1), options_2 = options_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrmHandler1]
  }
  
  extension [Self <: TypeofrmHandler1](x: Self) {
    
    inline def setHandler_1(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler_1", js.Any.fromFunction2(value))
    
    inline def setOptions_2(value: Typeofoptions2): Self = StObject.set(x, "options_2", value.asInstanceOf[js.Any])
  }
}
