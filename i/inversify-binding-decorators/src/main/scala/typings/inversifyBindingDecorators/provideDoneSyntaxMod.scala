package typings.inversifyBindingDecorators

import typings.inversifyBindingDecorators.interfacesMod.interfaces.BindConstraint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object provideDoneSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_done_syntax", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ProvideDoneSyntax {
    def this(binding: BindConstraint) = this()
  }
  
  @js.native
  trait ProvideDoneSyntax
    extends StObject
       with typings.inversifyBindingDecorators.interfacesMod.interfaces.ProvideDoneSyntax {
    
    /* private */ var _binding: js.Any = js.native
  }
}
