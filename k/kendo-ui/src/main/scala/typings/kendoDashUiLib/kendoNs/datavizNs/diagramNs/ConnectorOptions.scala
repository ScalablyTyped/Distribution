package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectorOptions extends js.Object {
  var fill: js.UndefOr[java.lang.String | ConnectorFill] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[ConnectorHover] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stroke: js.UndefOr[java.lang.String | ConnectorStroke] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ConnectorOptions {
  @scala.inline
  def apply(
    fill: java.lang.String | ConnectorFill = null,
    height: scala.Int | scala.Double = null,
    hover: ConnectorHover = null,
    name: java.lang.String = null,
    stroke: java.lang.String | ConnectorStroke = null,
    width: scala.Int | scala.Double = null
  ): ConnectorOptions = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (name != null) __obj.updateDynamic("name")(name)
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorOptions]
  }
}

