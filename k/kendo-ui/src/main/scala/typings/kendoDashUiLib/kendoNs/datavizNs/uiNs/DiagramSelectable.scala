package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramSelectable extends js.Object {
  var key: js.UndefOr[java.lang.String] = js.undefined
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
  var stroke: js.UndefOr[DiagramSelectableStroke] = js.undefined
}

object DiagramSelectable {
  @scala.inline
  def apply(
    key: java.lang.String = null,
    multiple: js.UndefOr[scala.Boolean] = js.undefined,
    stroke: DiagramSelectableStroke = null
  ): DiagramSelectable = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[DiagramSelectable]
  }
}

