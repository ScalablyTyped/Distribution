package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderUIParams extends js.Object {
  var handle: js.UndefOr[JQuery] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}

object SliderUIParams {
  @scala.inline
  def apply(handle: JQuery = null, value: Int | Double = null, values: js.Array[Double] = null): SliderUIParams = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[SliderUIParams]
  }
}

