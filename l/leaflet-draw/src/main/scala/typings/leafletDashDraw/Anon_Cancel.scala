package typings.leafletDashDraw

import typings.leafletDashDraw.leafletMod.Localization.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cancel extends js.Object {
  var cancel: Action
  var clearAll: Action
  var save: Action
}

object Anon_Cancel {
  @scala.inline
  def apply(cancel: Action, clearAll: Action, save: Action): Anon_Cancel = {
    val __obj = js.Dynamic.literal(cancel = cancel, clearAll = clearAll, save = save)
  
    __obj.asInstanceOf[Anon_Cancel]
  }
}

