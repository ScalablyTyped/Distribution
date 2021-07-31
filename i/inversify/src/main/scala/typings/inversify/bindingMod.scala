package typings.inversify

import typings.inversify.interfacesMod.interfaces.BindingScope
import typings.inversify.interfacesMod.interfaces.BindingType
import typings.inversify.interfacesMod.interfaces.ConstraintFunction
import typings.inversify.interfacesMod.interfaces.Context
import typings.inversify.interfacesMod.interfaces.FactoryCreator
import typings.inversify.interfacesMod.interfaces.Newable
import typings.inversify.interfacesMod.interfaces.ProviderCreator
import typings.inversify.interfacesMod.interfaces.Request
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingMod {
  
  @JSImport("inversify/dts/bindings/binding", "Binding")
  @js.native
  class Binding[T] protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
    
    /* CompleteClass */
    var activated: Boolean = js.native
    
    /* CompleteClass */
    var cache: T | Null = js.native
    
    /* CompleteClass */
    override def constraint(): Boolean = js.native
    /* CompleteClass */
    override def constraint(request: Request): Boolean = js.native
    /* CompleteClass */
    @JSName("constraint")
    var constraint_Original: ConstraintFunction = js.native
    
    /* CompleteClass */
    var dynamicValue: (js.Function1[/* context */ Context, T]) | Null = js.native
    
    /* CompleteClass */
    var factory: FactoryCreator[js.Any] | Null = js.native
    
    /* CompleteClass */
    var id: Double = js.native
    
    /* CompleteClass */
    var implementationType: Newable[T] | Null = js.native
    
    /* CompleteClass */
    var moduleId: String = js.native
    
    /* CompleteClass */
    var onActivation: (js.Function2[/* context */ Context, T, T]) | Null = js.native
    
    /* CompleteClass */
    var provider: ProviderCreator[js.Any] | Null = js.native
    
    /* CompleteClass */
    var scope: BindingScope = js.native
    
    /* CompleteClass */
    var serviceIdentifier: ServiceIdentifier[T] = js.native
    
    /* CompleteClass */
    var `type`: BindingType = js.native
  }
}
