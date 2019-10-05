package typings.inversify.dtsInterfacesInterfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding[T] extends Clonable[Binding[T]] {
  var activated: Boolean = js.native
  var cache: T | Null = js.native
  @JSName("constraint")
  var constraint_Original: ConstraintFunction = js.native
  var dynamicValue: (js.Function1[/* context */ Context, T]) | Null = js.native
  var factory: FactoryCreator[_] | Null = js.native
  var id: Double = js.native
  var implementationType: Newable[T] | Null = js.native
  var moduleId: String = js.native
  var onActivation: (js.Function2[/* context */ Context, /* injectable */ T, T]) | Null = js.native
  var provider: ProviderCreator[_] | Null = js.native
  var scope: BindingScope = js.native
  var serviceIdentifier: ServiceIdentifier[T] = js.native
  var `type`: BindingType = js.native
  def constraint(): Boolean = js.native
  def constraint(request: Request): Boolean = js.native
}

