package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsHover extends js.Object {
  var fill: js.UndefOr[java.lang.String | DiagramShapeDefaultsHoverFill] = js.undefined
}

object DiagramShapeDefaultsHover {
  @scala.inline
  def apply(fill: java.lang.String | DiagramShapeDefaultsHoverFill = null): DiagramShapeDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsHover]
  }
}

