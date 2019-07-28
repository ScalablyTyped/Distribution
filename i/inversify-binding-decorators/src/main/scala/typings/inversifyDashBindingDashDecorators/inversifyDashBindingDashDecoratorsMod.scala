package typings.inversifyDashBindingDashDecorators

import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.Container
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ContainerModule
import typings.inversify.dtsInterfacesInterfacesMod.interfacesNs.ServiceIdentifier
import typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfacesNs.ProvideInWhenOnSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators", JSImport.Namespace)
@js.native
object inversifyDashBindingDashDecoratorsMod extends js.Object {
  def autoProvide(container: Container, modules: js.Any*): Unit = js.native
  def buildProviderModule(): ContainerModule = js.native
  def fluentProvide(serviceIdentifier: ServiceIdentifier[_]): ProvideInWhenOnSyntax[_] = js.native
  def provide(serviceIdentifier: ServiceIdentifier[_]): js.Function1[/* target */ js.Any, _] = js.native
  def provide(serviceIdentifier: ServiceIdentifier[_], force: Boolean): js.Function1[/* target */ js.Any, _] = js.native
}

