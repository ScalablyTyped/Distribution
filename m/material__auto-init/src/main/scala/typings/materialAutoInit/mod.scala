package typings.materialAutoInit

import typings.materialBase.componentMod.MDCComponent
import typings.materialBase.foundationMod.MDCFoundation
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
      * Auto-initializes all MDC components on a page.
      */
    inline def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[MDCComponent[MDCFoundation[js.Object]]]]
    inline def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[MDCComponent[MDCFoundation[js.Object]]]]
    
    @JSImport("@material/auto-init", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/auto-init", "default.deregister")
    @js.native
    def deregister: js.Function1[/* componentName */ String, Unit] = js.native
    
    @JSImport("@material/auto-init", "default.deregisterAll")
    @js.native
    def deregisterAll: js.Function0[Unit] = js.native
    inline def deregisterAll_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregisterAll")(x.asInstanceOf[js.Any])
    
    inline def deregister_=(x: js.Function1[/* componentName */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregister")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/auto-init", "default.register")
    @js.native
    def register: js.Function3[
        /* componentName */ String, 
        /* Constructor */ MDCAttachable, 
        /* warn */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], 
        Unit
      ] = js.native
    inline def register_=(
      x: js.Function3[
          /* componentName */ String, 
          /* Constructor */ MDCAttachable, 
          /* warn */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  object mdcAutoInit {
    
    /**
      * Auto-initializes all MDC components on a page.
      */
    inline def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[MDCComponent[MDCFoundation[js.Object]]]]
    inline def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[MDCComponent[MDCFoundation[js.Object]]]]
    
    @JSImport("@material/auto-init", "mdcAutoInit")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@material/auto-init", "mdcAutoInit.deregister")
    @js.native
    def deregister: js.Function1[/* componentName */ String, Unit] = js.native
    
    @JSImport("@material/auto-init", "mdcAutoInit.deregisterAll")
    @js.native
    def deregisterAll: js.Function0[Unit] = js.native
    inline def deregisterAll_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregisterAll")(x.asInstanceOf[js.Any])
    
    inline def deregister_=(x: js.Function1[/* componentName */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregister")(x.asInstanceOf[js.Any])
    
    @JSImport("@material/auto-init", "mdcAutoInit.register")
    @js.native
    def register: js.Function3[
        /* componentName */ String, 
        /* Constructor */ MDCAttachable, 
        /* warn */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], 
        Unit
      ] = js.native
    inline def register_=(
      x: js.Function3[
          /* componentName */ String, 
          /* Constructor */ MDCAttachable, 
          /* warn */ js.UndefOr[js.Function1[/* repeated */ Any, Unit]], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MDCAttachable
    extends js.Function {
    
    def attachTo(root: Element): MDCComponent[MDCFoundation[js.Object]] = js.native
  }
}
