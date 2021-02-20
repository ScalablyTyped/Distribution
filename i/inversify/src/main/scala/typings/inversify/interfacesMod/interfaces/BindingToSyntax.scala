package typings.inversify.interfacesMod.interfaces

import typings.inversify.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindingToSyntax[T] extends StObject {
  
  def to(constructor: Instantiable[T]): BindingInWhenOnSyntax[T] = js.native
  
  def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T] = js.native
  
  def toConstantValue(value: T): BindingWhenOnSyntax[T] = js.native
  
  def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T] = js.native
  
  def toDynamicValue(func: js.Function1[/* context */ Context, T]): BindingInWhenOnSyntax[T] = js.native
  
  def toFactory[T2](factory: FactoryCreator[T2]): BindingWhenOnSyntax[T] = js.native
  
  def toFunction(func: T): BindingWhenOnSyntax[T] = js.native
  
  def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T] = js.native
  
  def toSelf(): BindingInWhenOnSyntax[T] = js.native
  
  def toService(service: ServiceIdentifier[T]): Unit = js.native
}
object BindingToSyntax {
  
  @scala.inline
  def apply[T](
    to: Instantiable[T] => BindingInWhenOnSyntax[T],
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
  
  @scala.inline
  implicit class BindingToSyntaxMutableBuilder[Self <: BindingToSyntax[_], T] (val x: Self with BindingToSyntax[T]) extends AnyVal {
    
    @scala.inline
    def setTo(value: Instantiable[T] => BindingInWhenOnSyntax[T]): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToAutoFactory(value: ServiceIdentifier[js.Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toAutoFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToConstantValue(value: T => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toConstantValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToConstructor(value: Newable[js.Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toConstructor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToDynamicValue(value: js.Function1[/* context */ Context, T] => BindingInWhenOnSyntax[T]): Self = StObject.set(x, "toDynamicValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToFactory(value: FactoryCreator[js.Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toFactory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToFunction(value: T => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toFunction", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToProvider(value: ProviderCreator[js.Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToSelf(value: () => BindingInWhenOnSyntax[T]): Self = StObject.set(x, "toSelf", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToService(value: ServiceIdentifier[T] => Unit): Self = StObject.set(x, "toService", js.Any.fromFunction1(value))
  }
}
