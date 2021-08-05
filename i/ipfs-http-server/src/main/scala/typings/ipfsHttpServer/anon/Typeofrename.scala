package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofrename extends StObject {
  
  def handler_2(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_4: Typeofoptions4
}
object Typeofrename {
  
  inline def apply(handler_2: (js.Any, js.Any) => js.Promise[js.Any], options_4: Typeofoptions4): Typeofrename = {
    val __obj = js.Dynamic.literal(handler_2 = js.Any.fromFunction2(handler_2), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofrename]
  }
  
  extension [Self <: Typeofrename](x: Self) {
    
    inline def setHandler_2(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler_2", js.Any.fromFunction2(value))
    
    inline def setOptions_4(value: Typeofoptions4): Self = StObject.set(x, "options_4", value.asInstanceOf[js.Any])
  }
}
