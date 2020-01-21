package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.ContainerModule
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInWhenOnSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def autoProvide(container: Container, modules: js.Any*): Unit = js.native
  def buildProviderModule(): ContainerModule = js.native
  def fluentProvide(serviceIdentifier: ServiceIdentifier[_]): ProvideInWhenOnSyntax[_] = js.native
  def provide(serviceIdentifier: ServiceIdentifier[_]): js.Function1[/* target */ js.Any, _] = js.native
  def provide(serviceIdentifier: ServiceIdentifier[_], force: Boolean): js.Function1[/* target */ js.Any, _] = js.native
}

