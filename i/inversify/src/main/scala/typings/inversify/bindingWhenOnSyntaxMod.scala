package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.BindingOnSyntax
import typings.inversify.interfacesMod.interfaces.BindingWhenSyntax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("inversify/dts/syntax/binding_when_on_syntax", JSImport.Namespace)
@js.native
object bindingWhenOnSyntaxMod extends js.Object {
  
  @js.native
  class BindingWhenOnSyntax[T] protected ()
    extends BindingWhenSyntax[T]
       with BindingOnSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    var _binding: js.Any = js.native
    
    var _bindingOnSyntax: js.Any = js.native
    
    var _bindingWhenSyntax: js.Any = js.native
  }
}
