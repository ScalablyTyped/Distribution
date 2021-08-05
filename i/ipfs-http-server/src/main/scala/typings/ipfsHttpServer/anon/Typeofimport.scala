package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofimport extends StObject {
  
  def handler_4(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_8: Typeofoptions8
}
object Typeofimport {
  
  inline def apply(handler_4: (js.Any, js.Any) => js.Promise[js.Any], options_8: Typeofoptions8): Typeofimport = {
    val __obj = js.Dynamic.literal(handler_4 = js.Any.fromFunction2(handler_4), options_8 = options_8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofimport]
  }
  
  extension [Self <: Typeofimport](x: Self) {
    
    inline def setHandler_4(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler_4", js.Any.fromFunction2(value))
    
    inline def setOptions_8(value: Typeofoptions8): Self = StObject.set(x, "options_8", value.asInstanceOf[js.Any])
  }
}
