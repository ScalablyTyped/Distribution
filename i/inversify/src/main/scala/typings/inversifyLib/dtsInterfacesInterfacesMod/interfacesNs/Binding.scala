package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding[T] extends Clonable[Binding[T]] {
  var activated: scala.Boolean = js.native
  var cache: T | scala.Null = js.native
  @JSName("constraint")
  var constraint_Original: ConstraintFunction = js.native
  var dynamicValue: (js.Function1[/* context */ Context, T]) | scala.Null = js.native
  var factory: FactoryCreator[_] | scala.Null = js.native
  var id: scala.Double = js.native
  var implementationType: Newable[T] | scala.Null = js.native
  var moduleId: java.lang.String = js.native
  var onActivation: (js.Function2[/* context */ Context, /* injectable */ T, T]) | scala.Null = js.native
  var provider: ProviderCreator[_] | scala.Null = js.native
  var scope: BindingScope = js.native
  var serviceIdentifier: ServiceIdentifier[T] = js.native
  var `type`: BindingType = js.native
  def constraint(): scala.Boolean = js.native
  def constraint(request: Request): scala.Boolean = js.native
}

