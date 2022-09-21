package typings.maplibreGl.anon

import typings.maplibreGl.mod.Handler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allowed extends StObject {
  
  var allowed: Any
  
  var handler: Handler
  
  var handlerName: String
}
object Allowed {
  
  inline def apply(allowed: Any, handler: Handler, handlerName: String): Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], handlerName = handlerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
  
  extension [Self <: Allowed](x: Self) {
    
    inline def setAllowed(value: Any): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setHandler(value: Handler): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerName(value: String): Self = StObject.set(x, "handlerName", value.asInstanceOf[js.Any])
  }
}
