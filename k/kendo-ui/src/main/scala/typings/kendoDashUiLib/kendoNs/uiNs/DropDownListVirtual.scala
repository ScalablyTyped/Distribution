package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownListVirtual extends js.Object {
  var itemHeight: js.UndefOr[scala.Double] = js.undefined
  var mapValueTo: js.UndefOr[java.lang.String] = js.undefined
  var valueMapper: js.UndefOr[js.Function] = js.undefined
}

object DropDownListVirtual {
  @scala.inline
  def apply(
    itemHeight: scala.Int | scala.Double = null,
    mapValueTo: java.lang.String = null,
    valueMapper: js.Function = null
  ): DropDownListVirtual = {
    val __obj = js.Dynamic.literal()
    if (itemHeight != null) __obj.updateDynamic("itemHeight")(itemHeight.asInstanceOf[js.Any])
    if (mapValueTo != null) __obj.updateDynamic("mapValueTo")(mapValueTo)
    if (valueMapper != null) __obj.updateDynamic("valueMapper")(valueMapper)
    __obj.asInstanceOf[DropDownListVirtual]
  }
}

