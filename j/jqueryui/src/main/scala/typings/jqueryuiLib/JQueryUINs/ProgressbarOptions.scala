package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Progressbar //////////////////////////////////////////////////
trait ProgressbarOptions extends ProgressbarEvents {
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double | scala.Boolean] = js.undefined
}

object ProgressbarOptions {
  @scala.inline
  def apply(
    change: ProgressbarEvent = null,
    complete: ProgressbarEvent = null,
    create: ProgressbarEvent = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    max: scala.Int | scala.Double = null,
    value: scala.Double | scala.Boolean = null
  ): ProgressbarOptions = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(change)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (create != null) __obj.updateDynamic("create")(create)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressbarOptions]
  }
}

