package typings.materialComponentsWeb.mod

import typings.materialAutoInit.mod.MDCAttachable
import typings.materialBase.componentMod.MDCComponent
import typings.materialBase.foundationMod.MDCFoundation
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoInit {
  
  /**
    * Auto-initializes all MDC components on a page.
    */
  inline def apply(): js.Array[MDCComponent[MDCFoundation[js.Object]]] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[MDCComponent[MDCFoundation[js.Object]]]]
  inline def apply(root: Document): js.Array[MDCComponent[MDCFoundation[js.Object]]] = ^.asInstanceOf[js.Dynamic].apply(root.asInstanceOf[js.Any]).asInstanceOf[js.Array[MDCComponent[MDCFoundation[js.Object]]]]
  
  @JSImport("material-components-web", "autoInit")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("material-components-web", "autoInit.deregister")
  @js.native
  def deregister: js.Function1[/* componentName */ String, Unit] = js.native
  
  @JSImport("material-components-web", "autoInit.deregisterAll")
  @js.native
  def deregisterAll: js.Function0[Unit] = js.native
  inline def deregisterAll_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregisterAll")(x.asInstanceOf[js.Any])
  
  inline def deregister_=(x: js.Function1[/* componentName */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deregister")(x.asInstanceOf[js.Any])
  
  @JSImport("material-components-web", "autoInit.register")
  @js.native
  def register: js.Function3[
    /* componentName */ String, 
    /* Constructor */ MDCAttachable, 
    /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
    Unit
  ] = js.native
  inline def register_=(
    x: js.Function3[
      /* componentName */ String, 
      /* Constructor */ MDCAttachable, 
      /* warn */ js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]], 
      Unit
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("register")(x.asInstanceOf[js.Any])
}
