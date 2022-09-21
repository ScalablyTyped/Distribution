package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerSnapshot extends StObject {
  
  var activations: Lookup[BindingActivation[Any]]
  
  var bindings: Lookup[Binding[Any]]
  
  var deactivations: Lookup[BindingDeactivation[Any]]
  
  var middleware: Next | Null
  
  var moduleActivationStore: ModuleActivationStore
}
object ContainerSnapshot {
  
  inline def apply(
    activations: Lookup[BindingActivation[Any]],
    bindings: Lookup[Binding[Any]],
    deactivations: Lookup[BindingDeactivation[Any]],
    moduleActivationStore: ModuleActivationStore
  ): ContainerSnapshot = {
    val __obj = js.Dynamic.literal(activations = activations.asInstanceOf[js.Any], bindings = bindings.asInstanceOf[js.Any], deactivations = deactivations.asInstanceOf[js.Any], moduleActivationStore = moduleActivationStore.asInstanceOf[js.Any], middleware = null)
    __obj.asInstanceOf[ContainerSnapshot]
  }
  
  extension [Self <: ContainerSnapshot](x: Self) {
    
    inline def setActivations(value: Lookup[BindingActivation[Any]]): Self = StObject.set(x, "activations", value.asInstanceOf[js.Any])
    
    inline def setBindings(value: Lookup[Binding[Any]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setDeactivations(value: Lookup[BindingDeactivation[Any]]): Self = StObject.set(x, "deactivations", value.asInstanceOf[js.Any])
    
    inline def setMiddleware(value: /* args */ NextArgs[Any] => Any | js.Array[Any]): Self = StObject.set(x, "middleware", js.Any.fromFunction1(value))
    
    inline def setMiddlewareNull: Self = StObject.set(x, "middleware", null)
    
    inline def setModuleActivationStore(value: ModuleActivationStore): Self = StObject.set(x, "moduleActivationStore", value.asInstanceOf[js.Any])
  }
}
