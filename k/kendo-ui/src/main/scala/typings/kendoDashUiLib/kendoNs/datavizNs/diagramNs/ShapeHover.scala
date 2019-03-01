package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeHover extends js.Object {
  var fill: js.UndefOr[java.lang.String | ShapeHoverFill] = js.undefined
}

object ShapeHover {
  @scala.inline
  def apply(fill: java.lang.String | ShapeHoverFill = null): ShapeHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeHover]
  }
}

