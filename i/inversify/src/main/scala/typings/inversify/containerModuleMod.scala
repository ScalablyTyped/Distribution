package typings.inversify

import typings.inversify.interfacesMod.interfaces.AsyncContainerModuleCallBack
import typings.inversify.interfacesMod.interfaces.ContainerModuleCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerModuleMod {
  
  @JSImport("inversify/dts/container/container_module", "AsyncContainerModule")
  @js.native
  class AsyncContainerModule protected ()
    extends typings.inversify.interfacesMod.interfaces.AsyncContainerModule {
    def this(registry: AsyncContainerModuleCallBack) = this()
  }
  
  @JSImport("inversify/dts/container/container_module", "ContainerModule")
  @js.native
  class ContainerModule protected ()
    extends typings.inversify.interfacesMod.interfaces.ContainerModule {
    def this(registry: ContainerModuleCallBack) = this()
  }
}
