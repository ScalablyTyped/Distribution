package typings.inversify.inversifyMod

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ContainerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify", "Container")
@js.native
class Container ()
  extends typings.inversify.dtsContainerContainerMod.Container {
  def this(containerOptions: ContainerOptions) = this()
}

/* static members */
@JSImport("inversify", "Container")
@js.native
object Container extends js.Object {
  def merge(
    container1: typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Container,
    container2: typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Container
  ): typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Container = js.native
}

