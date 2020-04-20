package typings.leafletDraw

import typings.leafletDraw.mod.Localization.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancel extends js.Object {
  var cancel: Action
  var clearAll: Action
  var save: Action
}

object AnonCancel {
  @scala.inline
  def apply(cancel: Action, clearAll: Action, save: Action): AnonCancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clearAll = clearAll.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancel]
  }
}

