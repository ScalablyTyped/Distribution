package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/core/dist/types/components/router-link/router-link", JSImport.Namespace)
@js.native
object routerLinkMod extends js.Object {
  
  @js.native
  class RouterLink () extends ComponentInterface {
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    /**
      * Contains a URL or a URL fragment that the hyperlink points to.
      * If this property is set, an anchor tag will be rendered.
      */
    var href: js.UndefOr[String] = js.native
    
    var onClick: js.Any = js.native
    
    /**
      * Specifies the relationship of the target object to the link object.
      * The value is a space-separated list of [link types](https://developer.mozilla.org/en-US/docs/Web/HTML/Link_types).
      */
    var rel: js.UndefOr[String] = js.native
    
    @JSName("render")
    def render_MRouterLink(): js.Any = js.native
    
    /**
      * When using a router, it specifies the transition animation when navigating to
      * another page using `href`.
      */
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /**
      * When using a router, it specifies the transition direction when navigating to
      * another page using `href`.
      */
    var routerDirection: RouterDirection = js.native
    
    /**
      * Specifies where to display the linked URL.
      * Only applies when an `href` is provided.
      * Special keywords: `"_blank"`, `"_self"`, `"_parent"`, `"_top"`.
      */
    var target: js.UndefOr[String] = js.native
  }
}
