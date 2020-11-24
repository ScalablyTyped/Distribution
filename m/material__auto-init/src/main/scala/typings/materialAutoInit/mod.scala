package typings.materialAutoInit

import org.scalablytyped.runtime.Instantiable3
import typings.materialBase.componentMod.MDCComponent
import typings.materialBase.foundationMod.MDCFoundation
import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/auto-init", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  trait MDCAttachable
    extends Instantiable3[
          /* root */ Element, 
          js.UndefOr[/* foundation */ MDCFoundation[js.Object]], 
          /* args (repeated) */ js.Any, 
          MDCComponent[MDCFoundation[js.Object]]
        ] {
    
    def attachTo[F /* <: MDCFoundation[js.Object] */](root: Element): MDCComponent[F] = js.native
  }
  
  @js.native
  object default extends js.Object {
    
    /**
      * Auto-initializes all MDC components on a page.
      */
    def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    
    var deregister: js.Function1[/* componentName */ String, Unit] = js.native
    
    var deregisterAll: js.Function0[Unit] = js.native
    
    var register: js.Function3[
        /* componentName */ String, 
        /* Constructor */ MDCAttachable, 
        /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
        Unit
      ] = js.native
  }
  
  @js.native
  object mdcAutoInit extends js.Object {
    
    /**
      * Auto-initializes all MDC components on a page.
      */
    def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    
    var deregister: js.Function1[/* componentName */ String, Unit] = js.native
    
    var deregisterAll: js.Function0[Unit] = js.native
    
    var register: js.Function3[
        /* componentName */ String, 
        /* Constructor */ MDCAttachable, 
        /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
        Unit
      ] = js.native
  }
}
