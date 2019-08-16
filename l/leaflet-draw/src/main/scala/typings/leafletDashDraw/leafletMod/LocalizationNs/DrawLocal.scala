package typings.leafletDashDraw.leafletMod.LocalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawLocal extends js.Object {
  var draw: Draw
  var edit: Edit
}

object DrawLocal {
  @scala.inline
  def apply(draw: Draw, edit: Edit): DrawLocal = {
    val __obj = js.Dynamic.literal(draw = draw, edit = edit)
  
    __obj.asInstanceOf[DrawLocal]
  }
}

