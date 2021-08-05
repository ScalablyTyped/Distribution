package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofgetOrSet extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  val options: TypeofoptionsPayload
}
object TypeofgetOrSet {
  
  inline def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options: TypeofoptionsPayload): TypeofgetOrSet = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofgetOrSet]
  }
  
  extension [Self <: TypeofgetOrSet](x: Self) {
    
    inline def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    inline def setOptions(value: TypeofoptionsPayload): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
