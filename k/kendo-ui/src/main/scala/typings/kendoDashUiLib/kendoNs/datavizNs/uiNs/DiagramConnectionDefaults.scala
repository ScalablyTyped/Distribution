package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramConnectionDefaults extends js.Object {
  var content: js.UndefOr[DiagramConnectionDefaultsContent] = js.undefined
  var editable: js.UndefOr[scala.Boolean | DiagramConnectionDefaultsEditable] = js.undefined
  var endCap: js.UndefOr[java.lang.String | DiagramConnectionDefaultsEndCap] = js.undefined
  var fromConnector: js.UndefOr[java.lang.String] = js.undefined
  var hover: js.UndefOr[DiagramConnectionDefaultsHover] = js.undefined
  var selectable: js.UndefOr[scala.Boolean] = js.undefined
  var selection: js.UndefOr[DiagramConnectionDefaultsSelection] = js.undefined
  var startCap: js.UndefOr[java.lang.String | DiagramConnectionDefaultsStartCap] = js.undefined
  var stroke: js.UndefOr[DiagramConnectionDefaultsStroke] = js.undefined
  var toConnector: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object DiagramConnectionDefaults {
  @scala.inline
  def apply(
    content: DiagramConnectionDefaultsContent = null,
    editable: scala.Boolean | DiagramConnectionDefaultsEditable = null,
    endCap: java.lang.String | DiagramConnectionDefaultsEndCap = null,
    fromConnector: java.lang.String = null,
    hover: DiagramConnectionDefaultsHover = null,
    selectable: js.UndefOr[scala.Boolean] = js.undefined,
    selection: DiagramConnectionDefaultsSelection = null,
    startCap: java.lang.String | DiagramConnectionDefaultsStartCap = null,
    stroke: DiagramConnectionDefaultsStroke = null,
    toConnector: java.lang.String = null,
    `type`: java.lang.String = null
  ): DiagramConnectionDefaults = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endCap != null) __obj.updateDynamic("endCap")(endCap.asInstanceOf[js.Any])
    if (fromConnector != null) __obj.updateDynamic("fromConnector")(fromConnector)
    if (hover != null) __obj.updateDynamic("hover")(hover)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (selection != null) __obj.updateDynamic("selection")(selection)
    if (startCap != null) __obj.updateDynamic("startCap")(startCap.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke)
    if (toConnector != null) __obj.updateDynamic("toConnector")(toConnector)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DiagramConnectionDefaults]
  }
}

