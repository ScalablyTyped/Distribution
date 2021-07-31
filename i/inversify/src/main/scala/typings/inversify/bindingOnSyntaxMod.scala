package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingWhenSyntax
import typings.inversify.interfacesMod.interfaces.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingOnSyntaxMod {
  
  @JSImport("inversify/dts/syntax/binding_on_syntax", "BindingOnSyntax")
  @js.native
  class BindingOnSyntax[T] protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    var _binding: js.Any = js.native
    
    /* CompleteClass */
    override def onActivation(fn: js.Function2[/* context */ Context, T, T]): BindingWhenSyntax[T] = js.native
  }
}
