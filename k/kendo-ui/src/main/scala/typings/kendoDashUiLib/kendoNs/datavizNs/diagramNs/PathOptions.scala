package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathOptions extends js.Object {
  var data: js.UndefOr[java.lang.String] = js.undefined
  var endCap: js.UndefOr[java.lang.String | PathEndCap] = js.undefined
  var fill: js.UndefOr[java.lang.String | PathFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var startCap: js.UndefOr[java.lang.String | PathStartCap] = js.undefined
  var stroke: js.UndefOr[PathStroke] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var x: js.UndefOr[scala.Double] = js.undefined
  var y: js.UndefOr[scala.Double] = js.undefined
}

object PathOptions {
  @scala.inline
  def apply(
    data: java.lang.String = null,
    endCap: java.lang.String | PathEndCap = null,
    fill: java.lang.String | PathFill = null,
    height: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    startCap: java.lang.String | PathStartCap = null,
    stroke: PathStroke = null,
    width: scala.Int | scala.Double = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
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

