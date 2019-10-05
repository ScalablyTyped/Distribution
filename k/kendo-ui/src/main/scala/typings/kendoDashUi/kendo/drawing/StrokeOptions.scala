package typings.kendoDashUi.kendo.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeOptions extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var dashType: js.UndefOr[String] = js.undefined
  var lineCap: js.UndefOr[String] = js.undefined
  var lineJoin: js.UndefOr[String] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object StrokeOptions {
  @scala.inline
  def apply(
    color: String = null,
    dashType: String = null,
    lineCap: String = null,
    lineJoin: String = null,
    opacity: Int | Double = null,
    width: Int | Double = null
  ): StrokeOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (dashType != null) __obj.updateDynamic("dashType")(dashType)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (lineJoin != null) __obj.updateDynamic("lineJoin")(lineJoin)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeOptions]
  }
}

