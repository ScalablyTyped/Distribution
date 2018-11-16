package typings
package inversifyDashBindingDashDecoratorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators", JSImport.Namespace)
@js.native
object inversifyDashBindingDashDecoratorsMod extends js.Object {
  def autoProvide(container: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.Container, modules: js.Any*): scala.Unit = js.native
  def buildProviderModule(): inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ContainerModule = js.native
  def fluentProvide(serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[_]): inversifyDashBindingDashDecoratorsLib.dtsInterfacesInterfacesMod.interfacesNs.ProvideInWhenOnSyntax[_] = js.native
  def provide(serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[_]): js.Function1[/* target */ js.Any, _] = js.native
  def provide(
    serviceIdentifier: inversifyLib.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier[_],
    force: scala.Boolean
  ): js.Function1[/* target */ js.Any, _] = js.native
}

