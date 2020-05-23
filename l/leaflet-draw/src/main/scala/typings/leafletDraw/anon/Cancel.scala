package typings.leafletDraw.anon

import typings.leafletDraw.mod.Localization.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancel extends js.Object {
  var cancel: Action
  var clearAll: Action
  var save: Action
}

object Cancel {
  @scala.inline
  def apply(cancel: Action, clearAll: Action, save: Action): Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clearAll = clearAll.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancel]
  }
}

