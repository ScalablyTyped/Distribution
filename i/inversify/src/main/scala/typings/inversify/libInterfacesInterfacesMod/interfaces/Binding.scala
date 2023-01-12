package typings.inversify.libInterfacesInterfacesMod.interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binding[TActivated]
  extends StObject
     with Clonable[Binding[TActivated]] {
  
  var activated: Boolean
  
  var cache: Null | TActivated | js.Promise[TActivated]
  
  def constraint(): Boolean
  def constraint(request: Request): Boolean
  @JSName("constraint")
  var constraint_Original: ConstraintFunction
  
  var dynamicValue: DynamicValue[TActivated] | Null
  
  var factory: (FactoryCreator[Any, js.Array[Any], js.Array[Any]]) | Null
  
  var id: Double
  
  var implementationType: Newable[TActivated] | TActivated | Null
  
  var moduleId: Double
  
  var onActivation: BindingActivation[TActivated] | Null
  
  var onDeactivation: BindingDeactivation[TActivated] | Null
  
  var provider: ProviderCreator[Any] | Null
  
  var scope: BindingScope
  
  var serviceIdentifier: ServiceIdentifier[TActivated]
  
  var `type`: BindingType
}
object Binding {
  
  inline def apply[TActivated](
    activated: Boolean,
    constraint: ConstraintFunction,
    id: Double,
    moduleId: Double,
    scope: BindingScope,
    serviceIdentifier: ServiceIdentifier[TActivated],
    `type`: BindingType
  ): Binding[TActivated] = {
    val __obj = js.Dynamic.literal(activated = activated.asInstanceOf[js.Any], constraint = constraint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], moduleId = moduleId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any], cache = null, dynamicValue = null, factory = null, implementationType = null, onActivation = null, onDeactivation = null, provider = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Binding[TActivated]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Binding[?], TActivated] (val x: Self & Binding[TActivated]) extends AnyVal {
    
    inline def setActivated(value: Boolean): Self = StObject.set(x, "activated", value.asInstanceOf[js.Any])
    
    inline def setCache(value: TActivated | js.Promise[TActivated]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheNull: Self = StObject.set(x, "cache", null)
    
    inline def setConstraint(value: ConstraintFunction): Self = StObject.set(x, "constraint", value.asInstanceOf[js.Any])
    
    inline def setDynamicValue(value: /* context */ Context => TActivated | js.Promise[TActivated]): Self = StObject.set(x, "dynamicValue", js.Any.fromFunction1(value))
    
    inline def setDynamicValueNull: Self = StObject.set(x, "dynamicValue", null)
    
    inline def setFactory(value: /* context */ Context => Factory[Any, js.Array[Any], js.Array[Any]]): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
    
    inline def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImplementationType(value: Newable[TActivated] | TActivated): Self = StObject.set(x, "implementationType", value.asInstanceOf[js.Any])
    
    inline def setImplementationTypeNull: Self = StObject.set(x, "implementationType", null)
    
    inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
    
    inline def setOnActivation(value: (/* context */ Context, TActivated) => TActivated | js.Promise[TActivated]): Self = StObject.set(x, "onActivation", js.Any.fromFunction2(value))
    
    inline def setOnActivationNull: Self = StObject.set(x, "onActivation", null)
    
    inline def setOnDeactivation(value: TActivated => Unit | js.Promise[Unit]): Self = StObject.set(x, "onDeactivation", js.Any.fromFunction1(value))
    
    inline def setOnDeactivationNull: Self = StObject.set(x, "onDeactivation", null)
    
    inline def setProvider(value: /* context */ Context => Provider[Any]): Self = StObject.set(x, "provider", js.Any.fromFunction1(value))
    
    inline def setProviderNull: Self = StObject.set(x, "provider", null)
    
    inline def setScope(value: BindingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier[TActivated]): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: BindingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
