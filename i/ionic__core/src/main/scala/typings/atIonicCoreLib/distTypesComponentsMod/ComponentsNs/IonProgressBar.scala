package typings
package atIonicCoreLib.distTypesComponentsMod.ComponentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonProgressBar extends js.Object {
  /**
    * If the buffer and value are smaller than 1, the buffer circles will show. The buffer should be between [0, 1].
    */
  var buffer: scala.Double
  /**
    * The color to use from your application's color palette. Default options are: `"primary"`, `"secondary"`, `"tertiary"`, `"success"`, `"warning"`, `"danger"`, `"light"`, `"medium"`, and `"dark"`. For more information on colors, see [theming](/docs/theming/basics).
    */
  var color: js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any
  ] = js.undefined
  /**
    * The mode determines which platform styles to use.
    */
  var mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any
  /**
    * If true, reverse the progress bar direction.
    */
  var reversed: scala.Boolean
  /**
    * The state of the progress bar, based on if the time the process takes is known or not. Default options are: `"determinate"` (no animation), `"indeterminate"` (animate from left to right).
    */
  var `type`: atIonicCoreLib.atIonicCoreLibStrings.determinate | atIonicCoreLib.atIonicCoreLibStrings.indeterminate
  /**
    * The value determines how much of the active bar should display when the `type` is `"determinate"`. The value should be between [0, 1].
    */
  var value: scala.Double
}

object IonProgressBar {
  @scala.inline
  def apply(
    buffer: scala.Double,
    mode: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Mode */ js.Any,
    reversed: scala.Boolean,
    `type`: atIonicCoreLib.atIonicCoreLibStrings.determinate | atIonicCoreLib.atIonicCoreLibStrings.indeterminate,
    value: scala.Double,
    color: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Color */ js.Any = null
  ): IonProgressBar = {
    val __obj = js.Dynamic.literal(buffer = buffer, mode = mode, reversed = reversed, value = value)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[IonProgressBar]
  }
}

