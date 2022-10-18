package typings.inversifyBindingDecorators

import typings.inversify.libInterfacesInterfacesMod.interfaces.Bind
import typings.inversify.libInterfacesInterfacesMod.interfaces.BindingInSyntax
import typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideDoneSyntax
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dtsSyntaxProvideInSyntaxMod {
  
  @JSImport("inversify-binding-decorators/dts/syntax/provide_in_syntax", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with ProvideInSyntax[T] {
    def this(
      bindingInSyntax: js.Function2[/* bind */ Bind, /* target */ Any, BindingInSyntax[T]],
      provideDoneSyntax: ProvideDoneSyntax
    ) = this()
  }
  
  @js.native
  trait ProvideInSyntax[T]
    extends StObject
       with typings.inversifyBindingDecorators.dtsInterfacesInterfacesMod.interfaces.ProvideInSyntax[T] {
    
    /* private */ var _bindingInSyntax: Any = js.native
    
    /* private */ var _provideDoneSyntax: Any = js.native
  }
}
