package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMatch extends js.Object {
  var `match`: String
  var options: js.Any
}

object AnonMatch {
  @scala.inline
  def apply(`match`: String, options: js.Any): AnonMatch = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMatch]
  }
}

