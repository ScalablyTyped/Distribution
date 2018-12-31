package typings
package inversifyDashBindingDashDecoratorsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify-binding-decorators", JSImport.Namespace)
@js.native
object inversifyDashBindingDashDecoratorsMod extends js.Object {
  def autoProvide(
    container: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify interfaces.Container */ js.Any,
    modules: js.Any*
  ): scala.Unit = js.native
  def buildProviderModule(): js.Any = js.native
  def fluentProvide(
    serviceIdentifier: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify inversifyInterfaces.ServiceIdentifier<any> */ js.Any
  ): inversifyDashBindingDashDecoratorsLib.dtsInterfacesInterfacesMod.interfacesNs.ProvideInWhenOnSyntax[_] = js.native
  def provide(
    serviceIdentifier: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify inversifyInterfaces.ServiceIdentifier<any> */ js.Any
  ): js.Function1[/* target */ js.Any, _] = js.native
  def provide(
    serviceIdentifier: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify inversifyInterfaces.ServiceIdentifier<any> */ js.Any,
    force: scala.Boolean
  ): js.Function1[/* target */ js.Any, _] = js.native
}

