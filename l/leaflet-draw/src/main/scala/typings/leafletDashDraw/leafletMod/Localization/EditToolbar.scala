package typings.leafletDashDraw.leafletMod.Localization

import typings.leafletDashDraw.Anon_Cancel
import typings.leafletDashDraw.Anon_Edit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditToolbar extends js.Object {
  var actions: Anon_Cancel
  var buttons: Anon_Edit
}

object EditToolbar {
  @scala.inline
  def apply(actions: Anon_Cancel, buttons: Anon_Edit): EditToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditToolbar]
  }
}

