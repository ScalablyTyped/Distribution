package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.libInterfacesInterfacesMod.interfaces.Bind
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingActivation
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingDeactivation
import typings.inversify.libInterfacesInterfacesMod.interfaces.ContainerModuleCallBack
import typings.inversify.libInterfacesInterfacesMod.interfaces.IsBound
import typings.inversify.libInterfacesInterfacesMod.interfaces.Rebind
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.libInterfacesInterfacesMod.interfaces.Unbind
import typings.inversify.libInterfacesInterfacesMod.interfaces.UnbindAsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libContainerContainerModuleMod {
  
  @JSImport("inversify/lib/container/container_module", "AsyncContainerModule")
  @js.native
  open class AsyncContainerModule protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var registry: AsyncContainerModuleCallBack = js.native
  }
  
  @JSImport("inversify/lib/container/container_module", "ContainerModule")
  @js.native
  open class ContainerModule protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    override def registry(
      bind: Bind,
      unbind: Unbind,
      isBound: IsBound,
      rebind: Rebind,
      unbindAsync: UnbindAsync,
      onActivation: js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onActivation */ BindingActivation[Any], 
          Unit
        ],
      onDeactivation: js.Function2[
          /* serviceIdentifier */ ServiceIdentifier[Any], 
          /* onDeactivation */ BindingDeactivation[Any], 
          Unit
        ]
    ): Unit = js.native
    /* CompleteClass */
    @JSName("registry")
    var registry_Original: ContainerModuleCallBack = js.native
  }
}
