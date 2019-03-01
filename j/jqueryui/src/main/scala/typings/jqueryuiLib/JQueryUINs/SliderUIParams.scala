package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderUIParams extends js.Object {
  var handle: js.UndefOr[jqueryuiLib.JQuery] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
  var values: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object SliderUIParams {
  @scala.inline
  def apply(
    handle: jqueryuiLib.JQuery = null,
    value: scala.Int | scala.Double = null,
    values: js.Array[scala.Double] = null
  ): SliderUIParams = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SliderUIParams]
  }
}

