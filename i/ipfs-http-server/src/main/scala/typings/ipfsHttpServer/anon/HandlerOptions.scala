package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HandlerOptions extends StObject {
  
  def handler(request: js.Any, h: js.Any): js.Promise[js.Any]
  
  var options: Payload
}
object HandlerOptions {
  
  @scala.inline
  def apply(handler: (js.Any, js.Any) => js.Promise[js.Any], options: Payload): HandlerOptions = {
    val __obj = js.Dynamic.literal(handler = js.Any.fromFunction2(handler), options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerOptions]
  }
  
  @scala.inline
  implicit class HandlerOptionsMutableBuilder[Self <: HandlerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHandler(value: (js.Any, js.Any) => js.Promise[js.Any]): Self = StObject.set(x, "handler", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOptions(value: Payload): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
