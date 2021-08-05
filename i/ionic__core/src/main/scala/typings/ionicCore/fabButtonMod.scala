package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.elementInterfaceMod.AnchorInterface
import typings.ionicCore.elementInterfaceMod.ButtonInterface
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.small
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.ionicCore.stencilPublicRuntimeMod.EventEmitter
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fabButtonMod {
  
  @JSImport("@ionic/core/dist/types/components/fab-button/fab-button", "FabButton")
  @js.native
  class FabButton ()
    extends StObject
       with ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    
    /**
      * If `true`, the fab button will be show a close icon.
      */
    var activated: Boolean = js.native
    
    /**
      * The icon name to use for the close icon. This will appear when the fab button
      * is pressed. Only applies if it is the main button inside of a fab containing a
      * fab list.
      */
    var closeIcon: String = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    var el: HTMLElement = js.native
    
    /**
      * Emitted when the button loses focus.
      */
    var ionBlur: EventEmitter[Unit] = js.native
    
    /**
      * Emitted when the button has focus.
      */
    var ionFocus: EventEmitter[Unit] = js.native
    
    /* private */ var onBlur: js.Any = js.native
    
    /* private */ var onFocus: js.Any = js.native
    
    @JSName("render")
    def render_MFabButton(): js.Any = js.native
    
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
      * If `true`, the fab button will show when in a fab-list.
      */
    var show: Boolean = js.native
    
    /**
      * The size of the button. Set this to `small` in order to have a mini fab button.
      */
    var size: js.UndefOr[small] = js.native
    
    /**
      * If `true`, the fab button will be translucent.
      * Only applies when the mode is `"ios"` and the device supports
      * [`backdrop-filter`](https://developer.mozilla.org/en-US/docs/Web/CSS/backdrop-filter#Browser_compatibility).
      */
    var translucent: Boolean = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
  }
}
