package typings.inversifyBindingDecorators

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversify.interfacesMod.interfaces.ContainerModule
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideInWhenOnSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-binding-decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def autoProvide(container: Container, modules: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("autoProvide")(container.asInstanceOf[js.Any], modules.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def buildProviderModule(): ContainerModule = ^.asInstanceOf[js.Dynamic].applyDynamic("buildProviderModule")().asInstanceOf[ContainerModule]
  
  @scala.inline
  def fluentProvide(serviceIdentifier: ServiceIdentifier[js.Any]): ProvideInWhenOnSyntax[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("fluentProvide")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[ProvideInWhenOnSyntax[js.Any]]
  
  @scala.inline
  def provide(serviceIdentifier: ServiceIdentifier[js.Any]): js.Function1[/* target */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("provide")(serviceIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ js.Any, js.Any]]
  @scala.inline
  def provide(serviceIdentifier: ServiceIdentifier[js.Any], force: Boolean): js.Function1[/* target */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("provide")(serviceIdentifier.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* target */ js.Any, js.Any]]
}
