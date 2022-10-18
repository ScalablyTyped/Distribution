package typings.inversifyBindingDecorators

import typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.BindConstraint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSyntaxProvideDoneSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_done_syntax", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ProvideDoneSyntax {
    def this(binding: BindConstraint) = this()
  }
  
  @js.native
  trait ProvideDoneSyntax
    extends StObject
       with typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideDoneSyntax {
    
    /* private */ var _binding: Any = js.native
  }
}
