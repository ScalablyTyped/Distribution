package typings.kendoUi.kendo.dataviz.ui

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
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramSelectable]
  }
}

