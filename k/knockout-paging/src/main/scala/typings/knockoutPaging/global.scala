package typings.knockoutPaging

import org.scalablytyped.runtime.Shortcut
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ko extends Shortcut {
    
    @JSGlobal("ko")
    @js.native
    val ^ : KnockoutStatic = js.native
    
    /////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.bindingProvider")
    @js.native
    open class bindingProvider ()
      extends StObject
         with KnockoutBindingProvider {
      
      /* CompleteClass */
      override def getBindings(node: Node, bindingContext: KnockoutBindingContext): js.Object = js.native
      
      /* CompleteClass */
      override def nodeHasBindings(node: Node): Boolean = js.native
    }
    
    //////////////////////////////////
    // nativeTemplateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.nativeTemplateEngine")
    @js.native
    open class nativeTemplateEngine ()
      extends StObject
         with KnockoutNativeTemplateEngine
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.subscribable")
    @js.native
    open class subscribable[T] ()
      extends StObject
         with KnockoutSubscribable[T]
    
    //////////////////////////////////
    // templateEngine.js
    //////////////////////////////////
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("ko.templateEngine")
    @js.native
    open class templateEngine ()
      extends StObject
         with KnockoutTemplateEngine
    
    type _To = KnockoutStatic
    
    /* This means you don't have to write `^`, but can instead just say `ko.foo` */
    override def _to: KnockoutStatic = ^
  }
}
