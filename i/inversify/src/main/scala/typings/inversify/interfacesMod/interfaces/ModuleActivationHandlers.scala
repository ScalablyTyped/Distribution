package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModuleActivationHandlers extends StObject {
  
  var onActivations: Lookup[BindingActivation[Any]]
  
  var onDeactivations: Lookup[BindingDeactivation[Any]]
}
object ModuleActivationHandlers {
  
  inline def apply(onActivations: Lookup[BindingActivation[Any]], onDeactivations: Lookup[BindingDeactivation[Any]]): ModuleActivationHandlers = {
    val __obj = js.Dynamic.literal(onActivations = onActivations.asInstanceOf[js.Any], onDeactivations = onDeactivations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleActivationHandlers]
  }
  
  extension [Self <: ModuleActivationHandlers](x: Self) {
    
    inline def setOnActivations(value: Lookup[BindingActivation[Any]]): Self = StObject.set(x, "onActivations", value.asInstanceOf[js.Any])
    
    inline def setOnDeactivations(value: Lookup[BindingDeactivation[Any]]): Self = StObject.set(x, "onDeactivations", value.asInstanceOf[js.Any])
  }
}
