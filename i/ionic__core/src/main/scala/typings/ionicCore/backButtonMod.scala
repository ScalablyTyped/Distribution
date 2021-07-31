package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.elementInterfaceMod.ButtonInterface
import typings.ionicCore.ionicCoreStrings.bounded
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.ionicCoreStrings.unbounded
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object backButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/back-button/back-button", "BackButton")
  @js.native
  class BackButton ()
    extends StObject
       with ComponentInterface
       with ButtonInterface {
    
    def backButtonIcon: js.Any = js.native
    
    def backButtonText: js.Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentWillLoad")
    def componentWillLoad_MBackButton(): Unit = js.native
    
    /**
      * The url to navigate back to by default when there is no history.
      */
    var defaultHref: js.UndefOr[String] = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    def hasIconOnly: Boolean = js.native
    
    /**
      * The icon name to use for the back button.
      */
    var icon: js.UndefOr[String | Null] = js.native
    
    var onClick: js.Any = js.native
    
    @JSName("render")
    def render_MBackButton(): js.Any = js.native
    
    def rippleType: bounded | unbounded = js.native
    
    /**
      * When using a router, it specifies the transition animation when navigating to
      * another page.
      */
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    /**
      * The text to display in the back button.
      */
    var text: js.UndefOr[String | Null] = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
  }
}
