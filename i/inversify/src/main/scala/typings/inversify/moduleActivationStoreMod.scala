package typings.inversify

import typings.inversify.interfacesMod.interfaces.BindingActivation
import typings.inversify.interfacesMod.interfaces.BindingDeactivation
import typings.inversify.interfacesMod.interfaces.ModuleActivationHandlers
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleActivationStoreMod {
  
  @JSImport("inversify/lib/container/module_activation_store", "ModuleActivationStore")
  @js.native
  open class ModuleActivationStore ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.ModuleActivationStore {
    
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
