package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofputOptions2 extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_2: Typeofoptions2Pre
}
object TypeofputOptions2 {
  
  inline def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_2: Typeofoptions2Pre): TypeofputOptions2 = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_2 = options_2.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofputOptions2]
  }
  
  extension [Self <: TypeofputOptions2](x: Self) {
    
    inline def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setOptions_2(value: Typeofoptions2Pre): Self = StObject.set(x, "options_2", value.asInstanceOf[js.Any])
  }
}
