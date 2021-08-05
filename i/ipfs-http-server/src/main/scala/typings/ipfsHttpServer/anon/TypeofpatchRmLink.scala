package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofpatchRmLink extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options_18: Typeofoptions18
}
object TypeofpatchRmLink {
  
  inline def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options_18: Typeofoptions18): TypeofpatchRmLink = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options_18 = options_18.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofpatchRmLink]
  }
  
  extension [Self <: TypeofpatchRmLink](x: Self) {
    
    inline def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setOptions_18(value: Typeofoptions18): Self = StObject.set(x, "options_18", value.asInstanceOf[js.Any])
  }
}
