package typings.jqueryui.JQueryUI

import typings.jqueryui.AnonLeft
import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Draggable //////////////////////////////////////////////////
trait DraggableEventUIParams extends js.Object {
  var helper: JQuery
  var offset: AnonLeft
  var position: AnonLeft
}

object DraggableEventUIParams {
  @scala.inline
  def apply(helper: JQuery, offset: AnonLeft, position: AnonLeft): DraggableEventUIParams = {
    val __obj = js.Dynamic.literal(helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableEventUIParams]
  }
}

