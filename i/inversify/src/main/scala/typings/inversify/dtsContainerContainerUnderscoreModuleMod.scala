package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ContainerModuleCallBack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/container/container_module", JSImport.Namespace)
@js.native
object dtsContainerContainerUnderscoreModuleMod extends js.Object {
  @js.native
  class AsyncContainerModule protected ()
    extends typings.inversify.dtsInterfacesInterfacesMod.interfaces.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @js.native
  class ContainerModule protected ()
    extends typings.inversify.dtsInterfacesInterfacesMod.interfaces.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
  
}

