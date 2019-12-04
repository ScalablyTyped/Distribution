package typings.atIonicCore

import typings.atIonicCore.atIonicCoreMod.Color
import typings.atIonicCore.distTypesComponentsSpinnerSpinnerDashConfigsMod.SpinnerTypes
import typings.atIonicCore.distTypesStencilDotCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/spinner/spinner", JSImport.Namespace)
@js.native
object distTypesComponentsSpinnerSpinnerMod extends js.Object {
  @js.native
  class Spinner () extends ComponentInterface {
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * Duration of the spinner animation in milliseconds. The default varies based on the spinner.
      */
    var duration: js.UndefOr[Double] = js.native
    var getName: js.Any = js.native
    /**
      * The name of the SVG spinner to use. If a name is not provided, the platform's default
      * spinner will be used.
      */
    var name: js.UndefOr[SpinnerTypes] = js.native
    /**
      * If `true`, the spinner's animation will be paused.
      */
    var paused: Boolean = js.native
    @JSName("render")
    def render_MSpinner(): js.Any = js.native
  }
  
}

