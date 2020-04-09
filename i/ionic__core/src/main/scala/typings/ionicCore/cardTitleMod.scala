package typings.ionicCore

import typings.ionicCore.mod.Color
import typings.ionicCore.stencilPublicRuntimeMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/card-title/card-title", JSImport.Namespace)
@js.native
object cardTitleMod extends js.Object {
  @js.native
  class CardTitle () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    @JSName("render")
    def render_MCardTitle(): js.Any = js.native
  }
  
}

