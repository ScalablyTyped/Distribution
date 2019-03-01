package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Droppable //////////////////////////////////////////////////
trait DroppableEventUIParam extends js.Object {
  var draggable: jqueryuiLib.JQuery
  var helper: jqueryuiLib.JQuery
  var offset: jqueryuiLib.Anon_Left
  var position: jqueryuiLib.Anon_Left
}

object DroppableEventUIParam {
  @scala.inline
  def apply(
    draggable: jqueryuiLib.JQuery,
    helper: jqueryuiLib.JQuery,
    offset: jqueryuiLib.Anon_Left,
    position: jqueryuiLib.Anon_Left
  ): DroppableEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("draggable")(draggable)
    __obj.updateDynamic("helper")(helper)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[DroppableEventUIParam]
  }
}

