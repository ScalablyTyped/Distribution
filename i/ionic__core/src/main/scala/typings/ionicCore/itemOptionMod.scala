package typings.ionicCore

import typings.ionicCore.elementInterfaceMod.AnchorInterface
import typings.ionicCore.elementInterfaceMod.ButtonInterface
import typings.ionicCore.ionicCoreStrings.button
import typings.ionicCore.ionicCoreStrings.reset
import typings.ionicCore.ionicCoreStrings.submit
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/item-option/item-option", JSImport.Namespace)
@js.native
object itemOptionMod extends js.Object {
  @js.native
  class ItemOption ()
    extends ComponentInterface
       with AnchorInterface
       with ButtonInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /* CompleteClass */
    override var disabled: Boolean = js.native
    var el: HTMLElement = js.native
    /**
      * If `true`, the option will expand to take up the available width and cover any other options.
      */
    var expandable: Boolean = js.native
    var onClick: js.Any = js.native
    /* CompleteClass */
    override var `type`: submit | reset | button = js.native
    @JSName("render")
    def render_MItemOption(): js.Any = js.native
  }
  
}

