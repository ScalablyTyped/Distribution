package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsHover extends js.Object {
  var fill: js.UndefOr[String | DiagramShapeDefaultsHoverFill] = js.undefined
}

object DiagramShapeDefaultsHover {
  @scala.inline
  def apply(fill: String | DiagramShapeDefaultsHoverFill = null): DiagramShapeDefaultsHover = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsHover]
  }
}

