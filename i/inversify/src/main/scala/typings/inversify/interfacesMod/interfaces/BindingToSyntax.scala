package typings.inversify.interfacesMod.interfaces

import typings.inversify.anon.Instantiable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingToSyntax[T] extends StObject {
  
  def to(constructor: Instantiable[T]): BindingInWhenOnSyntax[T]
  
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
  implicit class BindingToSyntaxMutableBuilder[Self <: BindingToSyntax[?], T] (val x: Self & BindingToSyntax[T]) extends AnyVal {
    
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
