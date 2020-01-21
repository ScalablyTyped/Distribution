package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var from: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[LineStroke] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(from: js.Any = null, name: String = null, stroke: LineStroke = null, to: js.Any = null): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
}

