package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.navInterfaceMod.NavComponent
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navLinkMod {
  
  @JSImport("@ionic/core/dist/types/components/nav-link/nav-link", "NavLink")
  @js.native
  class NavLink ()
    extends StObject
       with ComponentInterface {
    
    /**
      * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
      */
    var component: js.UndefOr[NavComponent] = js.native
    
    /**
      * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
      */
    var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
    
    var el: HTMLElement = js.native
    
    /* private */ var onClick: js.Any = js.native
    
    @JSName("render")
    def render_MNavLink(): js.Any = js.native
    
    /**
      * The transition animation when navigating to another page.
      */
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /**
      * The transition direction when navigating to another page.
      */
    var routerDirection: RouterDirection = js.native
  }
}
