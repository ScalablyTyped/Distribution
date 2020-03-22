package typings.inversify.interfacesMod.interfaces

import typings.inversify.AnonInstantiable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingToSyntax[T] extends js.Object {
  def to(constructor: AnonInstantiable[T]): BindingInWhenOnSyntax[T]
  def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T]
  def toConstantValue(value: T): BindingWhenOnSyntax[T]
  def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T]
  def toDynamicValue(func: js.Function1[/* context */ Context, T]): BindingInWhenOnSyntax[T]
  def toFactory[T2](factory: FactoryCreator[T2]): BindingWhenOnSyntax[T]
  def toFunction(func: T): BindingWhenOnSyntax[T]
  def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T]
  def toSelf(): BindingInWhenOnSyntax[T]
  def toService(service: ServiceIdentifier[T]): Unit
}

object BindingToSyntax {
  @scala.inline
  def apply[T](
    to: AnonInstantiable[T] => BindingInWhenOnSyntax[T],
    toAutoFactory: ServiceIdentifier[js.Any] => BindingWhenOnSyntax[T],
    toConstantValue: T => BindingWhenOnSyntax[T],
    toConstructor: Newable[js.Any] => BindingWhenOnSyntax[T],
    toDynamicValue: js.Function1[/* context */ Context, T] => BindingInWhenOnSyntax[T],
    toFactory: FactoryCreator[js.Any] => BindingWhenOnSyntax[T],
    toFunction: T => BindingWhenOnSyntax[T],
    toProvider: ProviderCreator[js.Any] => BindingWhenOnSyntax[T],
    toSelf: () => BindingInWhenOnSyntax[T],
    toService: ServiceIdentifier[T] => Unit
  ): BindingToSyntax[T] = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction1(to), toAutoFactory = js.Any.fromFunction1(toAutoFactory), toConstantValue = js.Any.fromFunction1(toConstantValue), toConstructor = js.Any.fromFunction1(toConstructor), toDynamicValue = js.Any.fromFunction1(toDynamicValue), toFactory = js.Any.fromFunction1(toFactory), toFunction = js.Any.fromFunction1(toFunction), toProvider = js.Any.fromFunction1(toProvider), toSelf = js.Any.fromFunction0(toSelf), toService = js.Any.fromFunction1(toService))
  
    __obj.asInstanceOf[BindingToSyntax[T]]
  }
}

