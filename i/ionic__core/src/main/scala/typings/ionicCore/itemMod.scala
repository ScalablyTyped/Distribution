package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.componentsMod.global.HTMLIonItemElement
import typings.ionicCore.elementInterfaceMod.AnchorInterface
import typings.ionicCore.elementInterfaceMod.ButtonInterface
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.full
import typings.ionicCore.ionicCoreStrings.inset
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import typings.ionicCore.mod.StyleEventDetail
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemMod {
  
  @JSImport("@ionic/core/dist/types/components/item/item", "Item")
  @js.native
  class Item ()
    extends StObject
       with ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    
    /**
      * If `true`, a button tag will be rendered and the item will be tappable.
      */
    var button: Boolean = js.native
    
    /* private */ var canActivate: js.Any = js.native
    
    /* private */ var clickListener: js.Any = js.native
    
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    
    @JSName("componentDidLoad")
    def componentDidLoad_MItem(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MItem(): Unit = js.native
    
    /* private */ var delegateFocus: js.Any = js.native
    
    /**
      * If `true`, a detail arrow will appear on the item. Defaults to `false` unless the `mode`
      * is `ios` and an `href` or `button` property is present.
      */
    var detail: js.UndefOr[Boolean] = js.native
    
    /**
      * The icon to use when `detail` is set to `true`.
      */
    var detailIcon: String = js.native
    
    /* CompleteClass */
    var disabled: Boolean = js.native
    
    @JSName("disconnectedCallback")
    def disconnectedCallback_MItem(): Unit = js.native
    
    var el: HTMLIonItemElement = js.native
    
    /* private */ var getFirstInput: js.Any = js.native
    
    /* private */ var hasCover: js.Any = js.native
    
    /* private */ var isClickable: js.Any = js.native
    
    def itemStyle(ev: CustomEvent[StyleEventDetail]): Unit = js.native
    
    /* private */ var itemStyles: js.Any = js.native
    
    def labelColorChanged(ev: CustomEvent[String]): Unit = js.native
    
    /* private */ var labelColorStyles: js.Any = js.native
    
    /**
      * How the bottom border should be displayed on the item.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    
    var multipleInputs: Boolean = js.native
    
    @JSName("render")
    def render_MItem(): js.Any = js.native
    
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
    
    /* private */ var setMultipleInputs: js.Any = js.native
    
    /* CompleteClass */
    var `type`: submit | reset | button = js.native
  }
}
