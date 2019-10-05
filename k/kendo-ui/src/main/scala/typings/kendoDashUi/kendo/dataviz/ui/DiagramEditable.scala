package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditable extends js.Object {
  var connectionTemplate: js.UndefOr[String | js.Function] = js.undefined
  var drag: js.UndefOr[Boolean | DiagramEditableDrag] = js.undefined
  var remove: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[Boolean | DiagramEditableResize] = js.undefined
  var rotate: js.UndefOr[Boolean | DiagramEditableRotate] = js.undefined
  var shapeTemplate: js.UndefOr[String | js.Function] = js.undefined
  var tools: js.UndefOr[js.Array[DiagramEditableTool]] = js.undefined
}

object DiagramEditable {
  @scala.inline
  def apply(
    connectionTemplate: String | js.Function = null,
    drag: Boolean | DiagramEditableDrag = null,
    remove: js.UndefOr[Boolean] = js.undefined,
    resize: Boolean | DiagramEditableResize = null,
    rotate: Boolean | DiagramEditableRotate = null,
    shapeTemplate: String | js.Function = null,
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

