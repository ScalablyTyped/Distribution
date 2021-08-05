package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.mod.FrameworkDelegate
import typings.ionicCore.navInterfaceMod.NavComponentWithProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewControllerMod {
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "VIEW_STATE_ATTACHED")
  @js.native
  val VIEW_STATE_ATTACHED: /* 2 */ Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "VIEW_STATE_DESTROYED")
  @js.native
  val VIEW_STATE_DESTROYED: /* 3 */ Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "VIEW_STATE_NEW")
  @js.native
  val VIEW_STATE_NEW: /* 1 */ Double = js.native
  
  @JSImport("@ionic/core/dist/types/components/nav/view-controller", "ViewController")
  @js.native
  class ViewController protected () extends StObject {
    def this(component: js.Any) = this()
    def this(component: js.Any, params: ComponentProps[Null]) = this()
    
    /**
      * DOM WRITE
      */
    def _destroy(): Unit = js.native
    
    var animationBuilder: js.UndefOr[AnimationBuilder] = js.native
    
    var component: js.Any = js.native
    
    var delegate: js.UndefOr[FrameworkDelegate] = js.native
    
    var element: js.UndefOr[HTMLElement] = js.native
    
    def init(container: HTMLElement): js.Promise[Unit] = js.native
    
    var nav: js.UndefOr[js.Any] = js.native
    
    var params: js.UndefOr[ComponentProps[Null]] = js.native
    
    var state: Double = js.native
  }
  
  inline def convertToView(page: js.Any): ViewController | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToView")(page.asInstanceOf[js.Any]).asInstanceOf[ViewController | Null]
  inline def convertToView(page: js.Any, params: ComponentProps[Null]): ViewController | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("convertToView")(page.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[ViewController | Null]
  
  inline def convertToViews(pages: js.Array[NavComponentWithProps[js.Any]]): js.Array[ViewController] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToViews")(pages.asInstanceOf[js.Any]).asInstanceOf[js.Array[ViewController]]
  
  inline def matches(view: Unit, id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
  inline def matches(view: Unit, id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
  inline def matches(view: ViewController, id: String): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
  inline def matches(view: ViewController, id: String, params: ComponentProps[Null]): /* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(view.asInstanceOf[js.Any], id.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[/* is @ionic/core.@ionic/core/dist/types/components/nav/view-controller.ViewController */ Boolean]
}
