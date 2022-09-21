package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingWhenOnSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingInSyntaxMod {
  
  @JSImport("inversify/lib/syntax/binding_in_syntax", "BindingInSyntax")
  @js.native
  open class BindingInSyntax[T] protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.BindingInSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    /* private */ var _binding: Any = js.native
    
    /* CompleteClass */
    override def inRequestScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def inSingletonScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def inTransientScope(): BindingWhenOnSyntax[T] = js.native
  }
}
