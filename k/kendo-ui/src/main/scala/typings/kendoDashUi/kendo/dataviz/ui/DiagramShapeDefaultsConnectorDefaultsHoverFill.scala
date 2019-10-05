package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeDefaultsConnectorDefaultsHoverFill extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object DiagramShapeDefaultsConnectorDefaultsHoverFill {
  @scala.inline
  def apply(color: String = null, opacity: Int | Double = null): DiagramShapeDefaultsConnectorDefaultsHoverFill = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeDefaultsConnectorDefaultsHoverFill]
  }
}

