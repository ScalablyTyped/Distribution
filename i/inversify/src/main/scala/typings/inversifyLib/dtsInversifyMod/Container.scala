package typings
package inversifyLib.dtsInversifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/inversify", "Container")
@js.native
class Container ()
  extends inversifyLib.dtsContainerContainerMod.Container {
  def this(containerOptions: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ContainerOptions) = this()
}

@JSImport("inversify/dts/inversify", "Container")
@js.native
object Container extends js.Object {
  def merge(
    container1: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container,
    container2: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container
  ): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container = js.native
}

