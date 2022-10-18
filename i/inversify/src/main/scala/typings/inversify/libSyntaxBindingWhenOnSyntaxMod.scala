package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.Binding
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingOnSyntax
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingWhenSyntax
import typings.inversify.libInterfacesInterfacesMod.interfaces.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxBindingWhenOnSyntaxMod {
  
  @JSImport("inversify/lib/syntax/binding_when_on_syntax", "BindingWhenOnSyntax")
  @js.native
  open class BindingWhenOnSyntax[T] protected ()
    extends StObject
       with BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    /* private */ var _binding: Any = js.native
    
    /* private */ var _bindingOnSyntax: Any = js.native
    
    /* private */ var _bindingWhenSyntax: Any = js.native
    
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T | js.Promise[T]]): BindingWhenSyntax[T] = js.native
    
    /* CompleteClass */
    override def onDeactivation(fn: js.Function1[T, Unit | js.Promise[Unit]]): BindingWhenSyntax[T] = js.native
  }
}
