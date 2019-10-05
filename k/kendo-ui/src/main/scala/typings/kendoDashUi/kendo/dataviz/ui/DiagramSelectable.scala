package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramSelectable extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var multiple: js.UndefOr[Boolean] = js.undefined
  var stroke: js.UndefOr[DiagramSelectableStroke] = js.undefined
}

object DiagramSelectable {
  @scala.inline
  def apply(
    key: String = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    stroke: DiagramSelectableStroke = null
  ): DiagramSelectable = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    __obj.asInstanceOf[DiagramSelectable]
  }
}

