package typings
package jqueryDotCustomselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCustomSelectOption extends js.Object {
  var customClass: js.UndefOr[java.lang.String] = js.undefined
  var mapClass: js.UndefOr[scala.Boolean] = js.undefined
  var mapStyle: js.UndefOr[scala.Boolean] = js.undefined
}

object JQueryCustomSelectOption {
  @scala.inline
  def apply(
    customClass: java.lang.String = null,
    mapClass: js.UndefOr[scala.Boolean] = js.undefined,
    mapStyle: js.UndefOr[scala.Boolean] = js.undefined
  ): JQueryCustomSelectOption = {
    val __obj = js.Dynamic.literal()
    if (customClass != null) __obj.updateDynamic("customClass")(customClass)
    if (!js.isUndefined(mapClass)) __obj.updateDynamic("mapClass")(mapClass)
    if (!js.isUndefined(mapStyle)) __obj.updateDynamic("mapStyle")(mapStyle)
    __obj.asInstanceOf[JQueryCustomSelectOption]
  }
}

