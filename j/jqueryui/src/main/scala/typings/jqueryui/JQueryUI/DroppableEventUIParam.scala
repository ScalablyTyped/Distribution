package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.jqueryui.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Droppable //////////////////////////////////////////////////
trait DroppableEventUIParam extends js.Object {
  var draggable: JQuery
  var helper: JQuery
  var offset: Left
  var position: Left
}

object DroppableEventUIParam {
  @scala.inline
  def apply(draggable: JQuery, helper: JQuery, offset: Left, position: Left): DroppableEventUIParam = {
    val __obj = js.Dynamic.literal(draggable = draggable.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableEventUIParam]
  }
}

