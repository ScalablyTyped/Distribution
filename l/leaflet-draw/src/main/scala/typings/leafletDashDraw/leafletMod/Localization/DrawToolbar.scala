package typings.leafletDashDraw.leafletMod.Localization

import typings.leafletDashDraw.Anon_Circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawToolbar extends js.Object {
  var actions: Action
  var buttons: Anon_Circle
  var finish: Action
  var undo: Action
}

object DrawToolbar {
  @scala.inline
  def apply(actions: Action, buttons: Anon_Circle, finish: Action, undo: Action): DrawToolbar = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], finish = finish.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DrawToolbar]
  }
}

