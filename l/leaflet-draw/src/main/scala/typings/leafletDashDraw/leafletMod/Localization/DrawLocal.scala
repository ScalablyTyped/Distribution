package typings.leafletDashDraw.leafletMod.Localization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawLocal extends js.Object {
  var draw: typings.leafletDashDraw.leafletMod.Localization.Draw
  var edit: Edit
}

object DrawLocal {
  @scala.inline
  def apply(draw: typings.leafletDashDraw.leafletMod.Localization.Draw, edit: Edit): DrawLocal = {
    val __obj = js.Dynamic.literal(draw = draw, edit = edit)
  
    __obj.asInstanceOf[DrawLocal]
  }
}

