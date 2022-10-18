package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingActivation
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingDeactivation
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingScope
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingType
import typings.inversify.libInterfacesInterfacesMod.interfaces.ConstraintFunction
import typings.inversify.libInterfacesInterfacesMod.interfaces.DynamicValue
import typings.inversify.libInterfacesInterfacesMod.interfaces.FactoryCreator
import typings.inversify.libInterfacesInterfacesMod.interfaces.Newable
import typings.inversify.libInterfacesInterfacesMod.interfaces.ProviderCreator
import typings.inversify.libInterfacesInterfacesMod.interfaces.Request
import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBindingsBindingMod {
  
  @JSImport("inversify/lib/bindings/binding", "Binding")
  @js.native
  open class Binding[TActivated] protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.Binding[TActivated] {
    def this(serviceIdentifier: ServiceIdentifier[TActivated], scope: BindingScope) = this()
    
    /* CompleteClass */
    var activated: Boolean = js.native
    
    /* CompleteClass */
    var cache: Null | TActivated | js.Promise[TActivated] = js.native
    
    /* CompleteClass */
    override def constraint(): Boolean = js.native
    /* CompleteClass */
    override def constraint(request: Request): Boolean = js.native
    /* CompleteClass */
    @JSName("constraint")
    var constraint_Original: ConstraintFunction = js.native
    
    /* CompleteClass */
    var dynamicValue: DynamicValue[TActivated] | Null = js.native
    
    /* CompleteClass */
    var factory: (FactoryCreator[Any, js.Array[Any], js.Array[Any]]) | Null = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var implementationType: Newable[TActivated] | TActivated | Null = js.native
    
    /* CompleteClass */
    var moduleId: Double = js.native
    
    /* CompleteClass */
    var onActivation: BindingActivation[TActivated] | Null = js.native
    
    /* CompleteClass */
    var onDeactivation: BindingDeactivation[TActivated] | Null = js.native
    
    /* CompleteClass */
    var provider: ProviderCreator[Any] | Null = js.native
    
    /* CompleteClass */
    var scope: BindingScope = js.native
    
    /* CompleteClass */
    var serviceIdentifier: ServiceIdentifier[TActivated] = js.native
    
    /* CompleteClass */
    var `type`: BindingType = js.native
  }
}
