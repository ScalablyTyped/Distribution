package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.ContainerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerContainerMod {
  
  @JSImport("inversify/lib/container/container", "Container")
  @js.native
  open class Container ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.Container {
    def this(containerOptions: ContainerOptions) = this()
    
    /* private */ var _activations: Any = js.native
    
    /* private */ var _bindingDeactivationAndPreDestroy: Any = js.native
    
    /* private */ var _bindingDeactivationAndPreDestroyAsync: Any = js.native
    
    /* private */ var _bindingDictionary: Any = js.native
    
    /* private */ var _deactivate: Any = js.native
    
    /* private */ var _deactivateContainer: Any = js.native
    
    /* private */ var _deactivateContainerAsync: Any = js.native
    
    /* private */ var _deactivateIfSingleton: Any = js.native
    
    /* private */ var _deactivateSingletons: Any = js.native
    
    /* private */ var _deactivateSingletonsAsync: Any = js.native
    
    /* private */ var _deactivations: Any = js.native
    
    /* private */ var _get: Any = js.native
    
    /* private */ var _getAll: Any = js.native
    
    /* private */ var _getAllArgs: Any = js.native
    
    /* private */ var _getButThrowIfAsync: Any = js.native
    
    /* private */ var _getContainerModuleHelpersFactory: Any = js.native
    
    /* private */ var _getNotAllArgs: Any = js.native
    
    /* private */ var _handleDeactivationError: Any = js.native
    
    /* private */ var _metadataReader: Any = js.native
    
    /* private */ var _middleware: Any = js.native
    
    /* private */ var _moduleActivationStore: Any = js.native
    
    /* private */ var _planAndResolve: Any = js.native
    
    /* private */ var _preDestroy: Any = js.native
    
    /* private */ var _propagateContainerDeactivationThenBindingAndPreDestroy: Any = js.native
    
    /* private */ var _propagateContainerDeactivationThenBindingAndPreDestroyAsync: Any = js.native
    
    /* private */ var _removeModuleBindings: Any = js.native
    
    /* private */ var _removeModuleHandlers: Any = js.native
    
    /* private */ var _removeServiceFromDictionary: Any = js.native
    
    /* private */ var _snapshots: Any = js.native
    
    def createChild(containerOptions: ContainerOptions): Container = js.native
  }
  object Container {
    
    @JSImport("inversify/lib/container/container", "Container")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def merge(
      container1: typings.inversify.libInterfacesInterfacesMod.interfaces.Container,
      container2: typings.inversify.libInterfacesInterfacesMod.interfaces.Container,
      containers: typings.inversify.libInterfacesInterfacesMod.interfaces.Container*
    ): typings.inversify.libInterfacesInterfacesMod.interfaces.Container = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")((scala.List(container1.asInstanceOf[js.Any], container2.asInstanceOf[js.Any])).`++`(containers.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.inversify.libInterfacesInterfacesMod.interfaces.Container]
  }
}
