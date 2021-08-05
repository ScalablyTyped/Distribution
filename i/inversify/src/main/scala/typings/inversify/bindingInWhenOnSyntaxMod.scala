package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingInSyntax
import typings.inversify.interfacesMod.interfaces.BindingOnSyntax
import typings.inversify.interfacesMod.interfaces.BindingWhenOnSyntax
import typings.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typings.inversify.interfacesMod.interfaces.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingInWhenOnSyntaxMod {
  
  @JSImport("inversify/dts/syntax/binding_in_when_on_syntax", "BindingInWhenOnSyntax")
  @js.native
  class BindingInWhenOnSyntax[T] protected ()
    extends StObject
       with BindingInSyntax[T]
       with BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    /* private */ var _binding: js.Any = js.native
    
    /* private */ var _bindingInSyntax: js.Any = js.native
    
    /* private */ var _bindingOnSyntax: js.Any = js.native
    
    /* private */ var _bindingWhenSyntax: js.Any = js.native
    
    /* CompleteClass */
    override def inRequestScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def inSingletonScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def inTransientScope(): BindingWhenOnSyntax[T] = js.native
    
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T]): BindingWhenSyntax[T] = js.native
  }
}
