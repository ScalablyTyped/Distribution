package typings.inversify

import org.scalablytyped.runtime.Instantiable1
import typings.inversify.interfacesMod.interfaces.Abstract
import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingInWhenOnSyntax
import typings.inversify.interfacesMod.interfaces.BindingWhenOnSyntax
import typings.inversify.interfacesMod.interfaces.DynamicValue
import typings.inversify.interfacesMod.interfaces.FactoryCreator
import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.ProviderCreator
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingToSyntaxMod {
  
  @JSImport("inversify/lib/syntax/binding_to_syntax", "BindingToSyntax")
  @js.native
  open class BindingToSyntax[T] protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.BindingToSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    /* private */ var _binding: Any = js.native
    
    /* CompleteClass */
    override def to(constructor: Instantiable1[/* args (repeated) */ scala.Nothing, T]): BindingInWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def toAutoNamedFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def toConstantValue(value: T): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def toDynamicValue(func: DynamicValue[T]): BindingInWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def toFactory[T2, T3 /* <: js.Array[Any] */, T4 /* <: js.Array[Any] */](factory: FactoryCreator[T2, T3, T4]): BindingWhenOnSyntax[T] = js.native
    
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
