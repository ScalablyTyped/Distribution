package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofversion extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_2: Typeofoptions2
}
object Typeofversion {
  
  inline def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_2: Typeofoptions2): Typeofversion = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_2 = options_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofversion]
  }
  
  extension [Self <: Typeofversion](x: Self) {
    
    inline def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setOptions_2(value: Typeofoptions2): Self = StObject.set(x, "options_2", value.asInstanceOf[js.Any])
  }
}
