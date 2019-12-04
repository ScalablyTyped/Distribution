package typings.inversify

import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Abstract
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingInWhenOnSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingWhenOnSyntax
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Context
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.FactoryCreator
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.Newable
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ProviderCreator
import typings.inversify.dtsInterfacesInterfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/syntax/binding_to_syntax", JSImport.Namespace)
@js.native
object dtsSyntaxBindingUnderscoreToUnderscoreSyntaxMod extends js.Object {
  @js.native
  class BindingToSyntax[T] protected ()
    extends typings.inversify.dtsInterfacesInterfacesMod.interfaces.BindingToSyntax[T] {
    def this(binding: Binding[T]) = this()
    var _binding: js.Any = js.native
    /* CompleteClass */
    override def to(constructor: Anon_Args[T]): BindingInWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toConstantValue(value: T): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toDynamicValue(func: js.Function1[/* context */ Context, T]): BindingInWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toFactory[T2](factory: FactoryCreator[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toFunction(func: T): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T] = js.native
    /* CompleteClass */
    override def toSelf(): BindingInWhenOnSyntax[T] = js.native
    def toService(service: String): Unit = js.native
    def toService(service: js.Symbol): Unit = js.native
    def toService(service: Abstract[T]): Unit = js.native
    def toService(service: Newable[T]): Unit = js.native
    /* CompleteClass */
    override def toService(service: ServiceIdentifier[T]): Unit = js.native
  }
  
}

