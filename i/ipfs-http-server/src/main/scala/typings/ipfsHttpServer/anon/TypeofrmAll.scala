package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofrmAll extends StObject {
  
  def handler_2(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_8: Typeofoptions8
}
object TypeofrmAll {
  
  inline def apply(handler_2: (js.Any, js.Any) => js.Promise[js.Any], options_8: Typeofoptions8): TypeofrmAll = {
    val __obj = js.Dynamic.literal(handler_2 = js.Any.fromFunction2(handler_2), options_8 = options_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofrmAll]
  }
  
  extension [Self <: TypeofrmAll](x: Self) {
    
    inline def setHandler_2(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler_2", js.Any.fromFunction2(value))
    
    inline def setOptions_8(value: Typeofoptions8): Self = StObject.set(x, "options_8", value.asInstanceOf[js.Any])
  }
}
