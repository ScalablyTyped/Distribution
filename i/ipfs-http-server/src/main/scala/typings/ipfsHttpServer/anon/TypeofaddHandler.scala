package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofaddHandler extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Any
  
  val options_4: Typeofoptions4Validate2
}
object TypeofaddHandler {
  
  inline def apply(handler: (js.Any, js.Any) => js.Any, options_4: Typeofoptions4Validate2): TypeofaddHandler = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_4 = options_4.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofaddHandler]
  }
  
  extension [Self <: TypeofaddHandler](x: Self) {
    
    inline def setHandler(value: (js.Any, js.Any) => js.Any): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setOptions_4(value: Typeofoptions4Validate2): Self = StObject.set(x, "options_4", value.asInstanceOf[js.Any])
  }
}
