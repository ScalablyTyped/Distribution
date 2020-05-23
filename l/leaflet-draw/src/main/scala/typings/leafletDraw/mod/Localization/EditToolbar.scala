package typings.leafletDraw.mod.Localization

import typings.leafletDraw.anon.Cancel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditToolbar extends js.Object {
  var actions: Cancel
  var buttons: typings.leafletDraw.anon.Edit
}

object EditToolbar {
  @scala.inline
  def apply(actions: Cancel, buttons: typings.leafletDraw.anon.Edit): EditToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditToolbar]
  }
}

