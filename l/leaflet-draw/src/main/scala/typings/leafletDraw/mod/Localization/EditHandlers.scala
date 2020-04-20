package typings.leafletDraw.mod.Localization

import typings.leafletDraw.AnonTooltipAnonText
import typings.leafletDraw.AnonTooltipAnonTextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditHandlers extends js.Object {
  var edit: AnonTooltipAnonText
  var remove: AnonTooltipAnonTextString
}

object EditHandlers {
  @scala.inline
  def apply(edit: AnonTooltipAnonText, remove: AnonTooltipAnonTextString): EditHandlers = {
    val __obj = js.Dynamic.literal(edit = edit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditHandlers]
  }
}

