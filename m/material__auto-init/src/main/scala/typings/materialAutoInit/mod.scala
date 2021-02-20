package typings.materialAutoInit

import org.scalablytyped.runtime.Instantiable3
import typings.materialBase.componentMod.MDCComponent
import typings.materialBase.foundationMod.MDCFoundation
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * Auto-initializes all MDC components on a page.
      */
    @JSImport("@material/auto-init", JSImport.Default)
    @js.native
    def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    @JSImport("@material/auto-init", JSImport.Default)
    @js.native
    def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    @JSImport("@material/auto-init", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/auto-init", "default.deregister")
    @js.native
    def deregister: js.Function1[/* componentName */ String, Unit] = js.native
    
    @JSImport("@material/auto-init", "default.deregisterAll")
    @js.native
    def deregisterAll: js.Function0[Unit] = js.native
    @scala.inline
    def deregisterAll_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregisterAll")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def deregister_=(x: js.Function1[/* componentName */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregister")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/auto-init", "default.register")
    @js.native
    def register: js.Function3[
        /* componentName */ String, 
        /* Constructor */ MDCAttachable, 
        /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
        Unit
      ] = js.native
    @scala.inline
    def register_=(
      x: js.Function3[
          /* componentName */ String, 
          /* Constructor */ MDCAttachable, 
          /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object mdcAutoInit {
    
    /**
      * Auto-initializes all MDC components on a page.
      */
    @JSImport("@material/auto-init", "mdcAutoInit")
    @js.native
    def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    @JSImport("@material/auto-init", "mdcAutoInit")
    @js.native
    def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = js.native
    @JSImport("@material/auto-init", "mdcAutoInit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/auto-init", "mdcAutoInit.deregister")
    @js.native
    def deregister: js.Function1[/* componentName */ String, Unit] = js.native
    
    @JSImport("@material/auto-init", "mdcAutoInit.deregisterAll")
    @js.native
    def deregisterAll: js.Function0[Unit] = js.native
    @scala.inline
    def deregisterAll_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregisterAll")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def deregister_=(x: js.Function1[/* componentName */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregister")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/auto-init", "mdcAutoInit.register")
    @js.native
    def register: js.Function3[
        /* componentName */ String, 
        /* Constructor */ MDCAttachable, 
        /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
        Unit
      ] = js.native
    @scala.inline
    def register_=(
      x: js.Function3[
          /* componentName */ String, 
          /* Constructor */ MDCAttachable, 
          /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
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
}
