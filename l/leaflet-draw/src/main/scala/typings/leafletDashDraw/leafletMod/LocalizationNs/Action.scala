package typings.leafletDashDraw.leafletMod.LocalizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  var text: String
  var title: String
}

object Action {
  @scala.inline
  def apply(text: String, title: String): Action = {
    val __obj = js.Dynamic.literal(text = text, title = title)
  
    __obj.asInstanceOf[Action]
  }
}

