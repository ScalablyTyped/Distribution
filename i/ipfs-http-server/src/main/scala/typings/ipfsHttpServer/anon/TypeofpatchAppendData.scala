package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpatchAppendData extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_12: Typeofoptions12
}
object TypeofpatchAppendData {
  
  inline def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_12: Typeofoptions12): TypeofpatchAppendData = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_12 = options_12.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpatchAppendData]
  }
  
  extension [Self <: TypeofpatchAppendData](x: Self) {
    
    inline def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setOptions_12(value: Typeofoptions12): Self = StObject.set(x, "options_12", value.asInstanceOf[js.Any])
  }
}
