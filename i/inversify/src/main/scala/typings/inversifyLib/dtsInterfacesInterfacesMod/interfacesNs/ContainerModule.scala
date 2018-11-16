package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContainerModule extends js.Object {
  var id: scala.Double = js.native
  @JSName("registry")
  var registry_Original: ContainerModuleCallBack = js.native
  def registry(bind: Bind, unbind: Unbind, isBound: IsBound, rebind: Rebind): scala.Unit = js.native
}

