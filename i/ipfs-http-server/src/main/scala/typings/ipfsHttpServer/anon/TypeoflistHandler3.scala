package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoflistHandler3 extends StObject {
  
  def handler_3(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_10: Typeofoptions10
}
object TypeoflistHandler3 {
  
  inline def apply(handler_3: (js.Any, js.Any) => js.Promise[js.Any], options_10: Typeofoptions10): TypeoflistHandler3 = {
    val __obj = js.Dynamic.literal(handler_3 = js.Any.fromFunction2(handler_3), options_10 = options_10.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeoflistHandler3]
  }
  
  extension [Self <: TypeoflistHandler3](x: Self) {
    
    inline def setHandler_3(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler_3", js.Any.fromFunction2(value))
    
    inline def setOptions_10(value: Typeofoptions10): Self = StObject.set(x, "options_10", value.asInstanceOf[js.Any])
  }
}
