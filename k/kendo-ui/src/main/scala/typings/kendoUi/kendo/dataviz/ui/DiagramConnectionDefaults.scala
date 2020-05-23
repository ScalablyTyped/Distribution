package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaults extends js.Object {
  var content: js.UndefOr[DiagramConnectionDefaultsContent] = js.undefined
  var editable: js.UndefOr[Boolean | DiagramConnectionDefaultsEditable] = js.undefined
  var endCap: js.UndefOr[String | DiagramConnectionDefaultsEndCap] = js.undefined
  var fromConnector: js.UndefOr[String] = js.undefined
  var hover: js.UndefOr[DiagramConnectionDefaultsHover] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var selection: js.UndefOr[DiagramConnectionDefaultsSelection] = js.undefined
  var startCap: js.UndefOr[String | DiagramConnectionDefaultsStartCap] = js.undefined
  var stroke: js.UndefOr[DiagramConnectionDefaultsStroke] = js.undefined
  var toConnector: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object DiagramConnectionDefaults {
  @scala.inline
  def apply(
    content: DiagramConnectionDefaultsContent = null,
    editable: Boolean | DiagramConnectionDefaultsEditable = null,
    endCap: String | DiagramConnectionDefaultsEndCap = null,
    fromConnector: String = null,
    hover: DiagramConnectionDefaultsHover = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    selection: DiagramConnectionDefaultsSelection = null,
    startCap: String | DiagramConnectionDefaultsStartCap = null,
    stroke: DiagramConnectionDefaultsStroke = null,
    toConnector: String = null,
    `type`: String = null
  ): DiagramConnectionDefaults = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (fromConnector != null) __obj.updateDynamic("fromConnector")(fromConnector.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.get.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (toConnector != null) __obj.updateDynamic("toConnector")(toConnector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramConnectionDefaults]
  }
}

