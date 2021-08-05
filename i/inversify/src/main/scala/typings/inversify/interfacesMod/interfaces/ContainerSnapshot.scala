package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSnapshot extends StObject {
  
  var bindings: Lookup[Binding[js.Any]]
  
  var middleware: Next | Null
}
object ContainerSnapshot {
  
  inline def apply(bindings: Lookup[Binding[js.Any]]): ContainerSnapshot = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], middleware = null)
    __obj.asInstanceOf[ContainerSnapshot]
  }
  
  extension [Self <: ContainerSnapshot](x: Self) {
    
    inline def setBindings(value: Lookup[Binding[js.Any]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setMiddleware(value: /* args */ NextArgs => js.Any | js.Array[js.Any]): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
    
    inline def setMiddlewareNull: Self = StObject.set(x, "middleware", null)
  }
}
