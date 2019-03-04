package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Draggable //////////////////////////////////////////////////
trait DraggableEventUIParams extends js.Object {
  var helper: jqueryuiLib.JQuery
  var offset: jqueryuiLib.Anon_Left
  var position: jqueryuiLib.Anon_Left
}

object DraggableEventUIParams {
  @scala.inline
  def apply(helper: jqueryuiLib.JQuery, offset: jqueryuiLib.Anon_Left, position: jqueryuiLib.Anon_Left): DraggableEventUIParams = {
    val __obj = js.Dynamic.literal(helper = helper, offset = offset, position = position)
  
    __obj.asInstanceOf[DraggableEventUIParams]
  }
}

