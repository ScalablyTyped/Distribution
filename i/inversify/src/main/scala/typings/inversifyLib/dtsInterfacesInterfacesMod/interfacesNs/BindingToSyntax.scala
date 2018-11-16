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

