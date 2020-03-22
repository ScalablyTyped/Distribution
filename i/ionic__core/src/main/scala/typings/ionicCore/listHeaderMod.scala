package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.full
import typings.ionicCore.ionicCoreStrings.inset
import typings.ionicCore.ionicCoreStrings.none
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/list-header/list-header", JSImport.Namespace)
@js.native
object listHeaderMod extends js.Object {
  @js.native
  class ListHeader () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * How the bottom border should be displayed on the list header.
      */
    var lines: js.UndefOr[full | inset | none] = js.native
    @JSName("render")
    def render_MListHeader(): js.Any = js.native
  }
  
}

