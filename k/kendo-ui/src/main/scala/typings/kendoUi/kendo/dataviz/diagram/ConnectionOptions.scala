package typings.kendoUi.kendo.dataviz.diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var content: js.UndefOr[ConnectionContent] = js.undefined
  var endCap: js.UndefOr[String | ConnectionEndCap] = js.undefined
  var fromConnector: js.UndefOr[String] = js.undefined
  var fromX: js.UndefOr[Double] = js.undefined
  var fromY: js.UndefOr[Double] = js.undefined
  var hover: js.UndefOr[ConnectionHover] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var points: js.UndefOr[js.Array[ConnectionPoint]] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var startCap: js.UndefOr[String | ConnectionStartCap] = js.undefined
  var stroke: js.UndefOr[ConnectionStroke] = js.undefined
  var toConnector: js.UndefOr[String] = js.undefined
  var toX: js.UndefOr[Double] = js.undefined
  var toY: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    content: ConnectionContent = null,
    endCap: String | ConnectionEndCap = null,
    fromConnector: String = null,
    fromX: js.UndefOr[Double] = js.undefined,
    fromY: js.UndefOr[Double] = js.undefined,
    hover: ConnectionHover = null,
    name: String = null,
    points: js.Array[ConnectionPoint] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    startCap: String | ConnectionStartCap = null,
    stroke: ConnectionStroke = null,
    toConnector: String = null,
    toX: js.UndefOr[Double] = js.undefined,
    toY: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (fromConnector != null) __obj.updateDynamic("fromConnector")(fromConnector.asInstanceOf[js.Any])
    if (!js.isUndefined(fromX)) __obj.updateDynamic("fromX")(fromX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fromY)) __obj.updateDynamic("fromY")(fromY.get.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (points != null) __obj.updateDynamic("points")(points.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (toConnector != null) __obj.updateDynamic("toConnector")(toConnector.asInstanceOf[js.Any])
    if (!js.isUndefined(toX)) __obj.updateDynamic("toX")(toX.get.asInstanceOf[js.Any])
    if (!js.isUndefined(toY)) __obj.updateDynamic("toY")(toY.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

