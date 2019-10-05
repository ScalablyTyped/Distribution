package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerModule extends js.Object {
  var id: Double = js.native
  @JSName("registry")
  var registry_Original: ContainerModuleCallBack = js.native
  def registry(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): Unit = js.native
}

