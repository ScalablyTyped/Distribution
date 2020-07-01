package typings.ionicCore

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.elementInterfaceMod.AnchorInterface
import typings.ionicCore.elementInterfaceMod.ButtonInterface
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/card/card", JSImport.Namespace)
@js.native
object cardMod extends js.Object {
  @js.native
  class Card ()
    extends ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    /**
      * If `true`, a button tag will be rendered and the card will be tappable.
      */
    var button: Boolean = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /* CompleteClass */
    override var disabled: Boolean = js.native
    var isClickable: js.Any = js.native
    var renderCard: js.Any = js.native
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
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    @JSName("render")
    def render_MCard(): js.Any = js.native
  }
  
}

