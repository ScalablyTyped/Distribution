package typings.atMaterialDashUiLab.autocompleteAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderValueState extends js.Object {
  var className: String
  def onDelete(): js.Object
}

object RenderValueState {
  @scala.inline
  def apply(className: String, onDelete: () => js.Object): RenderValueState = {
    val __obj = js.Dynamic.literal(className = className, onDelete = js.Any.fromFunction0(onDelete))
  
    __obj.asInstanceOf[RenderValueState]
  }
}

