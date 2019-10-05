package typings.inversifyDashBindingDashDecorators

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Container
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ContainerModule
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversifyDashBindingDashDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideInWhenOnSyntax
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

