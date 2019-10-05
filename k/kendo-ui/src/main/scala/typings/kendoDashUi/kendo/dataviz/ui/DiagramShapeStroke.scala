package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramShapeStroke extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DiagramShapeStroke {
  @scala.inline
  def apply(color: String = null, dashType: String = null, width: Int | Double = null): DiagramShapeStroke = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramShapeStroke]
  }
}

