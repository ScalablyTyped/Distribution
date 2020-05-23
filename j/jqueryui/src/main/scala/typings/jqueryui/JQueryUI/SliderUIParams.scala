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
  def apply(handle: JQuery = null, value: js.UndefOr[Double] = js.undefined, values: js.Array[Double] = null): SliderUIParams = {
    val __obj = js.Dynamic.literal()
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderUIParams]
  }
}

