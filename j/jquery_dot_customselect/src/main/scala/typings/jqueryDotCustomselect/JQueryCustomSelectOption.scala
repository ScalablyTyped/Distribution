package typings.jqueryDotCustomselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCustomSelectOption extends js.Object {
  var customClass: js.UndefOr[String] = js.undefined
  var mapClass: js.UndefOr[Boolean] = js.undefined
  var mapStyle: js.UndefOr[Boolean] = js.undefined
}

object JQueryCustomSelectOption {
  @scala.inline
  def apply(
    customClass: String = null,
    mapClass: js.UndefOr[Boolean] = js.undefined,
    mapStyle: js.UndefOr[Boolean] = js.undefined
  ): JQueryCustomSelectOption = {
    val __obj = js.Dynamic.literal()
    if (customClass != null) __obj.updateDynamic("customClass")(customClass)
    if (!js.isUndefined(mapClass)) __obj.updateDynamic("mapClass")(mapClass)
    if (!js.isUndefined(mapStyle)) __obj.updateDynamic("mapStyle")(mapStyle)
    __obj.asInstanceOf[JQueryCustomSelectOption]
  }
}

