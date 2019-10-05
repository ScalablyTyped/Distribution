package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectangleOptions extends js.Object {
  var fill: js.UndefOr[String | RectangleFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stroke: js.UndefOr[RectangleStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object RectangleOptions {
  @scala.inline
  def apply(
    fill: String | RectangleFill = null,
    height: Int | Double = null,
    name: String = null,
    stroke: RectangleStroke = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): RectangleOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectangleOptions]
  }
}

