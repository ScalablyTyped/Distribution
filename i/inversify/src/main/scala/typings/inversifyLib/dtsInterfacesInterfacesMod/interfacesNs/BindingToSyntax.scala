package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingToSyntax[T] extends js.Object {
  def to(constructor: inversifyLib.Anon_Args[T]): BindingInWhenOnSyntax[T]
  def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T]
  def toConstantValue(value: T): BindingWhenOnSyntax[T]
  def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T]
  def toDynamicValue(func: js.Function1[/* context */ Context, T]): BindingInWhenOnSyntax[T]
  def toFactory[T2](factory: FactoryCreator[T2]): BindingWhenOnSyntax[T]
  def toFunction(func: T): BindingWhenOnSyntax[T]
  def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T]
  def toSelf(): BindingInWhenOnSyntax[T]
  def toService(service: ServiceIdentifier[T]): scala.Unit
}

object BindingToSyntax {
  @scala.inline
  def apply[T](
    to: js.Function1[inversifyLib.Anon_Args[T], BindingInWhenOnSyntax[T]],
    toAutoFactory: js.Function1[ServiceIdentifier[js.Any], BindingWhenOnSyntax[T]],
    toConstantValue: js.Function1[T, BindingWhenOnSyntax[T]],
    toConstructor: js.Function1[Newable[js.Any], BindingWhenOnSyntax[T]],
    toDynamicValue: js.Function1[js.Function1[/* context */ Context, T], BindingInWhenOnSyntax[T]],
    toFactory: js.Function1[FactoryCreator[js.Any], BindingWhenOnSyntax[T]],
    toFunction: js.Function1[T, BindingWhenOnSyntax[T]],
    toProvider: js.Function1[ProviderCreator[js.Any], BindingWhenOnSyntax[T]],
    toSelf: js.Function0[BindingInWhenOnSyntax[T]],
    toService: js.Function1[ServiceIdentifier[T], scala.Unit]
  ): BindingToSyntax[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("toAutoFactory")(toAutoFactory)
    __obj.updateDynamic("toConstantValue")(toConstantValue)
    __obj.updateDynamic("toConstructor")(toConstructor)
    __obj.updateDynamic("toDynamicValue")(toDynamicValue)
    __obj.updateDynamic("toFactory")(toFactory)
    __obj.updateDynamic("toFunction")(toFunction)
    __obj.updateDynamic("toProvider")(toProvider)
    __obj.updateDynamic("toSelf")(toSelf)
    __obj.updateDynamic("toService")(toService)
    __obj.asInstanceOf[BindingToSyntax[T]]
  }
}

