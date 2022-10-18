package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingActivation
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingDeactivation
import typings.inversify.libInterfacesInterfacesMod.interfaces.ModuleActivationHandlers
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerModuleActivationStoreMod {
  
  @JSImport("inversify/lib/container/module_activation_store", "ModuleActivationStore")
  @js.native
  open class ModuleActivationStore ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.ModuleActivationStore {
    
    /* private */ var _getEmptyHandlersStore: Any = js.native
    
    /* private */ var _getModuleActivationHandlers: Any = js.native
    
    /* private */ var _map: Any = js.native
    
    /* CompleteClass */
    override def addActivation(moduleId: Double, serviceIdentifier: ServiceIdentifier[Any], onActivation: BindingActivation[Any]): Unit = js.native
    
    /* CompleteClass */
    override def addDeactivation(
      moduleId: Double,
      serviceIdentifier: ServiceIdentifier[Any],
      onDeactivation: BindingDeactivation[Any]
    ): Unit = js.native
    
    /* CompleteClass */
    override def remove(moduleId: Double): ModuleActivationHandlers = js.native
  }
}
