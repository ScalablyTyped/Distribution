package typings.inversify

import typings.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/container/container_module", JSImport.Namespace)
@js.native
object containerModuleMod extends js.Object {
  @js.native
  class AsyncContainerModule protected ()
    extends typings.inversify.interfacesMod.interfaces.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @js.native
  class ContainerModule protected ()
    extends typings.inversify.interfacesMod.interfaces.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
}

