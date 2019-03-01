package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var content: js.UndefOr[ConnectionContent] = js.undefined
  var endCap: js.UndefOr[java.lang.String | ConnectionEndCap] = js.undefined
  var fromConnector: js.UndefOr[java.lang.String] = js.undefined
  var fromX: js.UndefOr[scala.Double] = js.undefined
  var fromY: js.UndefOr[scala.Double] = js.undefined
  var hover: js.UndefOr[ConnectionHover] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var points: js.UndefOr[js.Array[ConnectionPoint]] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var startCap: js.UndefOr[java.lang.String | ConnectionStartCap] = js.undefined
  var stroke: js.UndefOr[ConnectionStroke] = js.undefined
  var toConnector: js.UndefOr[java.lang.String] = js.undefined
  var toX: js.UndefOr[scala.Double] = js.undefined
  var toY: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    content: ConnectionContent = null,
    endCap: java.lang.String | ConnectionEndCap = null,
    fromConnector: java.lang.String = null,
    fromX: scala.Int | scala.Double = null,
    fromY: scala.Int | scala.Double = null,
    hover: ConnectionHover = null,
    name: java.lang.String = null,
    points: js.Array[ConnectionPoint] = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    startCap: java.lang.String | ConnectionStartCap = null,
    stroke: ConnectionStroke = null,
    toConnector: java.lang.String = null,
    toX: scala.Int | scala.Double = null,
    toY: scala.Int | scala.Double = null,
    `type`: java.lang.String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (fromConnector != null) __obj.updateDynamic("fromConnector")(fromConnector)
    if (fromX != null) __obj.updateDynamic("fromX")(fromX.asInstanceOf[js.Any])
    if (fromY != null) __obj.updateDynamic("fromY")(fromY.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (name != null) __obj.updateDynamic("name")(name)
    if (points != null) __obj.updateDynamic("points")(points)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (toConnector != null) __obj.updateDynamic("toConnector")(toConnector)
    if (toX != null) __obj.updateDynamic("toX")(toX.asInstanceOf[js.Any])
    if (toY != null) __obj.updateDynamic("toY")(toY.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

