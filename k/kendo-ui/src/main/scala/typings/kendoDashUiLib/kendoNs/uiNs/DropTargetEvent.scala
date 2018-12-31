package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTargetEvent
  extends kendoDashUiLib.JQueryEventObject {
  var draggable: js.UndefOr[Draggable] = js.undefined
  var dropTarget: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var sender: js.UndefOr[DropTarget] = js.undefined
}

