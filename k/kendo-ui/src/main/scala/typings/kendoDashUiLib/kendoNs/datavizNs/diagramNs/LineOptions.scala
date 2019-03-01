package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  var from: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stroke: js.UndefOr[LineStroke] = js.undefined
  var to: js.UndefOr[js.Any] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(from: js.Any = null, name: java.lang.String = null, stroke: LineStroke = null, to: js.Any = null): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (to != null) __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[LineOptions]
  }
}

