package typings.karma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPattern extends js.Object {
  var pattern: String
  var `type`: String
}

object AnonPattern {
  @scala.inline
  def apply(pattern: String, `type`: String): AnonPattern = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPattern]
  }
}

