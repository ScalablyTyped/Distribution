package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofreplace extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_6: Typeofoptions6Payload1
}
object Typeofreplace {
  
  inline def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_6: Typeofoptions6Payload1): Typeofreplace = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_6 = options_6.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofreplace]
  }
  
  extension [Self <: Typeofreplace](x: Self) {
    
    inline def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setOptions_6(value: Typeofoptions6Payload1): Self = StObject.set(x, "options_6", value.asInstanceOf[js.Any])
  }
}
