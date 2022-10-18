package typings.inversifyBindingDecorators

import typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideOnSyntax
import typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideWhenSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSyntaxProvideWhenOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_when_on_syntax", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with ProvideWhenOnSyntax[T] {
    def this(provideWhenSyntax: ProvideWhenSyntax[T], provideOnSyntax: ProvideOnSyntax[T]) = this()
  }
  
  @js.native
  trait ProvideWhenOnSyntax[T]
    extends StObject
       with typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideWhenOnSyntax[T] {
    
    /* private */ var _provideOnSyntax: Any = js.native
    
    /* private */ var _provideWhenSyntax: Any = js.native
  }
}
