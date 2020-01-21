package typings.karma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayout extends js.Object {
  var layout: AnonPattern
  var `type`: String
}

object AnonLayout {
  @scala.inline
  def apply(layout: AnonPattern, `type`: String): AnonLayout = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayout]
  }
}

