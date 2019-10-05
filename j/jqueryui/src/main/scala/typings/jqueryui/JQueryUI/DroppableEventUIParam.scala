package typings.jqueryui.JQueryUI

import typings.jqueryui.Anon_Left
import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Droppable //////////////////////////////////////////////////
trait DroppableEventUIParam extends js.Object {
  var draggable: JQuery
  var helper: JQuery
  var offset: Anon_Left
  var position: Anon_Left
}

object DroppableEventUIParam {
  @scala.inline
  def apply(draggable: JQuery, helper: JQuery, offset: Anon_Left, position: Anon_Left): DroppableEventUIParam = {
    val __obj = js.Dynamic.literal(draggable = draggable, helper = helper, offset = offset, position = position)
  
    __obj.asInstanceOf[DroppableEventUIParam]
  }
}

