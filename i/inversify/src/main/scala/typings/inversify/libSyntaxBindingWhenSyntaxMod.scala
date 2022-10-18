package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.Binding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyntaxBindingWhenSyntaxMod {
  
  @JSImport("inversify/lib/syntax/binding_when_syntax", "BindingWhenSyntax")
  @js.native
  open class BindingWhenSyntax[T] protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.BindingWhenSyntax[T] {
    def this(binding: Binding[T]) = this()
    
    /* private */ var _binding: Any = js.native
  }
}
