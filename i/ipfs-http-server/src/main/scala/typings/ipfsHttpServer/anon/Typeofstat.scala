package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofstat extends StObject {
  
  def handler_1(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_4: Typeofoptions4
}
object Typeofstat {
  
  inline def apply(handler_1: (js.Any, js.Any) => js.Promise[js.Any], options_4: Typeofoptions4): Typeofstat = {
    val __obj = js.Dynamic.literal(handler_1 = js.Any.fromFunction2(handler_1), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofstat]
  }
  
  extension [Self <: Typeofstat](x: Self) {
    
    inline def setHandler_1(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler_1", js.Any.fromFunction2(value))
    
    inline def setOptions_4(value: Typeofoptions4): Self = StObject.set(x, "options_4", value.asInstanceOf[js.Any])
  }
}
