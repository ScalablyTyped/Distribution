package typings.inversify

import typings.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.BindingActivation
import typings.inversify.interfacesMod.interfaces.BindingDeactivation
import typings.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.IsBound
import typings.inversify.interfacesMod.interfaces.Rebind
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.Unbind
import typings.inversify.interfacesMod.interfaces.UnbindAsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerModuleMod {
  
  @JSImport("inversify/lib/container/container_module", "AsyncContainerModule")
  @js.native
  open class AsyncContainerModule protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.AsyncContainerModule {
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
       with typings.inversify.interfacesMod.interfaces.ContainerModule {
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
