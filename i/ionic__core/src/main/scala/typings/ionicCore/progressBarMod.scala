package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.determinate
import typings.ionicCore.ionicCoreStrings.indeterminate
import typings.ionicCore.mod.Color
import typings.ionicCore.stencilCoreMod.ComponentInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/progress-bar/progress-bar", JSImport.Namespace)
@js.native
object progressBarMod extends js.Object {
  @js.native
  class ProgressBar () extends ComponentInterface {
    /**
      * If the buffer and value are smaller than 1, the buffer circles will show.
      * The buffer should be between [0, 1].
      */
    var buffer: Double = js.native
    /**
      * The color to use from your application's color palette.
      * Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`.
      * For more information on colors, see [theming](/docs/theming/basics).
      */
    var color: js.UndefOr[Color] = js.native
    /**
      * If true, reverse the progress bar direction.
      */
    var reversed: Boolean = js.native
    /**
      * The state of the progress bar, based on if the time the process takes is known or not.
      * Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
      */
    var `type`: determinate | indeterminate = js.native
    /**
      * The value determines how much of the active bar should display when the
      * `type` is `"determinate"`.
      * The value should be between [0, 1].
      */
    var value: Double = js.native
    @JSName("render")
    def render_MProgressBar(): js.Any = js.native
  }
  
}

