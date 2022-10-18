package typings.inversifyBindingDecorators

import typings.inversify.libInterfacesInterfacesMod.interfaces.Bind
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingOnSyntax
import typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideDoneSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSyntaxProvideOnSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_on_syntax", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with ProvideOnSyntax[T] {
    def this(
      bindingOnSyntax: js.Function2[/* bind */ Bind, /* target */ Any, BindingOnSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
  @js.native
  trait ProvideOnSyntax[T]
    extends StObject
       with typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideOnSyntax[T] {
    
    /* private */ var _bindingOnSyntax: Any = js.native
    
    /* private */ var _provideDoneSyntax: Any = js.native
  }
}
