package typings.inversify.interfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binding[T]
  extends StObject
     with Clonable[Binding[T]] {
  
  var activated: Boolean
  
  var cache: T | Null
  
  def constraint(): Boolean
  def constraint(request: Request): Boolean
  @JSName("constraint")
  var constraint_Original: ConstraintFunction
  
  var dynamicValue: (js.Function1[/* context */ Context, T]) | Null
  
  var factory: FactoryCreator[js.Any] | Null
  
  var id: Double
  
  var implementationType: Newable[T] | Null
  
  var moduleId: String
  
  var onActivation: (js.Function2[/* context */ Context, /* injectable */ T, T]) | Null
  
  var provider: ProviderCreator[js.Any] | Null
  
  var scope: BindingScope
  
  var serviceIdentifier: ServiceIdentifier[T]
  
  var `type`: BindingType
}
object Binding {
  
  inline def apply[T](
    activated: Boolean,
    constraint: ConstraintFunction,
    id: Double,
    moduleId: String,
    scope: BindingScope,
    serviceIdentifier: ServiceIdentifier[T],
    `type`: BindingType
  ): Binding[T] = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], cache = null, dynamicValue = null, factory = null, implementationType = null, onActivation = null, provider = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding[T]]
  }
  
  extension [Self <: Binding[?], T](x: Self & Binding[T]) {
    
    inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setCache(value: T): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheNull: Self = StObject.set(x, "cache", null)
    
    inline def setConstraint(value: ConstraintFunction): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setDynamicValue(value: /* context */ Context => T): Self = StObject.set(x, "dynamicValue", js.Any.fromFunction1(value))
    
    inline def setDynamicValueNull: Self = StObject.set(x, "dynamicValue", null)
    
    inline def setFactory(value: /* context */ Context => Factory[js.Any]): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    inline def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplementationType(value: Newable[T]): Self = StObject.set(x, "implementationType", value.asInstanceOf[js.Any])
    
    inline def setImplementationTypeNull: Self = StObject.set(x, "implementationType", null)
    
    inline def setModuleId(value: String): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setOnActivation(value: (/* context */ Context, /* injectable */ T) => T): Self = StObject.set(x, "onActivation", js.Any.fromFunction2(value))
    
    inline def setOnActivationNull: Self = StObject.set(x, "onActivation", null)
    
    inline def setProvider(value: /* context */ Context => Provider[js.Any]): Self = StObject.set(x, "provider", js.Any.fromFunction1(value))
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setScope(value: BindingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier[T]): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: BindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
