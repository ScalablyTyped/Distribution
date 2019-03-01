package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditable extends js.Object {
  var connectionTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var drag: js.UndefOr[scala.Boolean | DiagramEditableDrag] = js.undefined
  var remove: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[scala.Boolean | DiagramEditableResize] = js.undefined
  var rotate: js.UndefOr[scala.Boolean | DiagramEditableRotate] = js.undefined
  var shapeTemplate: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramEditableTool]] = js.undefined
}

object DiagramEditable {
  @scala.inline
  def apply(
    connectionTemplate: java.lang.String | js.Function = null,
    drag: scala.Boolean | DiagramEditableDrag = null,
    remove: js.UndefOr[scala.Boolean] = js.undefined,
    resize: scala.Boolean | DiagramEditableResize = null,
    rotate: scala.Boolean | DiagramEditableRotate = null,
    shapeTemplate: java.lang.String | js.Function = null,
    tools: js.Array[DiagramEditableTool] = null
  ): DiagramEditable = {
    val __obj = js.Dynamic.literal()
    if (connectionTemplate != null) __obj.updateDynamic("connectionTemplate")(connectionTemplate.asInstanceOf[js.Any])
    if (drag != null) __obj.updateDynamic("drag")(drag.asInstanceOf[js.Any])
    if (!js.isUndefined(remove)) __obj.updateDynamic("remove")(remove)
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (shapeTemplate != null) __obj.updateDynamic("shapeTemplate")(shapeTemplate.asInstanceOf[js.Any])
    if (tools != null) __obj.updateDynamic("tools")(tools)
    __obj.asInstanceOf[DiagramEditable]
  }
}

