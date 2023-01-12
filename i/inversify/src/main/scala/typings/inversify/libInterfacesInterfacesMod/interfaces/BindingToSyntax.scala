package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BindingToSyntax[T] extends StObject {
  
  def to(constructor: Instantiable1[/* args (repeated) */ scala.Nothing, T]): BindingInWhenOnSyntax[T]
  
  def toAutoFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T]
  
  def toAutoNamedFactory[T2](serviceIdentifier: ServiceIdentifier[T2]): BindingWhenOnSyntax[T]
  
  def toConstantValue(value: T): BindingWhenOnSyntax[T]
  
  def toConstructor[T2](constructor: Newable[T2]): BindingWhenOnSyntax[T]
  
  def toDynamicValue(func: DynamicValue[T]): BindingInWhenOnSyntax[T]
  
  def toFactory[T2, T3 /* <: js.Array[Any] */, T4 /* <: js.Array[Any] */](factory: FactoryCreator[T2, T3, T4]): BindingWhenOnSyntax[T]
  
  def toFunction(func: T): BindingWhenOnSyntax[T]
  
  def toProvider[T2](provider: ProviderCreator[T2]): BindingWhenOnSyntax[T]
  
  def toSelf(): BindingInWhenOnSyntax[T]
  
  def toService(service: ServiceIdentifier[T]): Unit
}
object BindingToSyntax {
  
  inline def apply[T](
    to: Instantiable1[/* args (repeated) */ scala.Nothing, T] => BindingInWhenOnSyntax[T],
    toAutoFactory: ServiceIdentifier[Any] => BindingWhenOnSyntax[T],
    toAutoNamedFactory: ServiceIdentifier[Any] => BindingWhenOnSyntax[T],
    toConstantValue: T => BindingWhenOnSyntax[T],
    toConstructor: Newable[Any] => BindingWhenOnSyntax[T],
    toDynamicValue: DynamicValue[T] => BindingInWhenOnSyntax[T],
    toFactory: FactoryCreator[Any, Any, Any] => BindingWhenOnSyntax[T],
    toFunction: T => BindingWhenOnSyntax[T],
    toProvider: ProviderCreator[Any] => BindingWhenOnSyntax[T],
    toSelf: () => BindingInWhenOnSyntax[T],
    toService: ServiceIdentifier[T] => Unit
  ): BindingToSyntax[T] = {
    val __obj = js.Dynamic.literal(to = js.Any.fromFunction1(to), toAutoFactory = js.Any.fromFunction1(toAutoFactory), toAutoNamedFactory = js.Any.fromFunction1(toAutoNamedFactory), toConstantValue = js.Any.fromFunction1(toConstantValue), toConstructor = js.Any.fromFunction1(toConstructor), toDynamicValue = js.Any.fromFunction1(toDynamicValue), toFactory = js.Any.fromFunction1(toFactory), toFunction = js.Any.fromFunction1(toFunction), toProvider = js.Any.fromFunction1(toProvider), toSelf = js.Any.fromFunction0(toSelf), toService = js.Any.fromFunction1(toService))
    __obj.asInstanceOf[BindingToSyntax[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BindingToSyntax[?], T] (val x: Self & BindingToSyntax[T]) extends AnyVal {
    
    inline def setTo(value: Instantiable1[/* args (repeated) */ scala.Nothing, T] => BindingInWhenOnSyntax[T]): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
    
    inline def setToAutoFactory(value: ServiceIdentifier[Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toAutoFactory", js.Any.fromFunction1(value))
    
    inline def setToAutoNamedFactory(value: ServiceIdentifier[Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toAutoNamedFactory", js.Any.fromFunction1(value))
    
    inline def setToConstantValue(value: T => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toConstantValue", js.Any.fromFunction1(value))
    
    inline def setToConstructor(value: Newable[Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toConstructor", js.Any.fromFunction1(value))
    
    inline def setToDynamicValue(value: DynamicValue[T] => BindingInWhenOnSyntax[T]): Self = StObject.set(x, "toDynamicValue", js.Any.fromFunction1(value))
    
    inline def setToFactory(value: FactoryCreator[Any, Any, Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toFactory", js.Any.fromFunction1(value))
    
    inline def setToFunction(value: T => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toFunction", js.Any.fromFunction1(value))
    
    inline def setToProvider(value: ProviderCreator[Any] => BindingWhenOnSyntax[T]): Self = StObject.set(x, "toProvider", js.Any.fromFunction1(value))
    
    inline def setToSelf(value: () => BindingInWhenOnSyntax[T]): Self = StObject.set(x, "toSelf", js.Any.fromFunction0(value))
    
    inline def setToService(value: ServiceIdentifier[T] => Unit): Self = StObject.set(x, "toService", js.Any.fromFunction1(value))
  }
}
