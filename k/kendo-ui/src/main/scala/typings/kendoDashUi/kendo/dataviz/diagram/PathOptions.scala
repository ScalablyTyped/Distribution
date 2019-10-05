package typings.kendoDashUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  var data: js.UndefOr[String] = js.undefined
  var endCap: js.UndefOr[String | PathEndCap] = js.undefined
  var fill: js.UndefOr[String | PathFill] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var startCap: js.UndefOr[String | PathStartCap] = js.undefined
  var stroke: js.UndefOr[PathStroke] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var x: js.UndefOr[Double] = js.undefined
  var y: js.UndefOr[Double] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(
    data: String = null,
    endCap: String | PathEndCap = null,
    fill: String | PathFill = null,
    height: Int | Double = null,
    name: String = null,
    startCap: String | PathStartCap = null,
    stroke: PathStroke = null,
    width: Int | Double = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): PathOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathOptions]
  }
}

