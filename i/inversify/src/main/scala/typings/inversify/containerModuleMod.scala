package typings.inversify

import typings.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.Bind
import typings.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.IsBound
import typings.inversify.interfacesMod.interfaces.Rebind
import typings.inversify.interfacesMod.interfaces.Unbind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerModuleMod {
  
  @JSImport("inversify/dts/container/container_module", "AsyncContainerModule")
  @js.native
  class AsyncContainerModule protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    override def registry(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): js.Promise[Unit] = js.native
    /* CompleteClass */
    @JSName("registry")
    var registry_Original: AsyncContainerModuleCallBack = js.native
  }
  
  @JSImport("inversify/dts/container/container_module", "ContainerModule")
  @js.native
  class ContainerModule protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    override def registry(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): Unit = js.native
    /* CompleteClass */
    @JSName("registry")
    var registry_Original: ContainerModuleCallBack = js.native
  }
}
