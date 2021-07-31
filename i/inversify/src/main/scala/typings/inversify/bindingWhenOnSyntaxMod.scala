package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingOnSyntax
import typings.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typings.inversify.interfacesMod.interfaces.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingWhenOnSyntaxMod {
  
  @JSImport("inversify/dts/syntax/binding_when_on_syntax", "BindingWhenOnSyntax")
  @js.native
  class BindingWhenOnSyntax[T] protected ()
    extends StObject
       with BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    var _binding: js.Any = js.native
    
    var _bindingOnSyntax: js.Any = js.native
    
    var _bindingWhenSyntax: js.Any = js.native
    
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T]): BindingWhenSyntax[T] = js.native
  }
}
