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

