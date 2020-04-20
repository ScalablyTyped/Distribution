package typings.gulpHelpDoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  var log: js.Function
}

object AnonLog {
  @scala.inline
  def apply(log: js.Function): AnonLog = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLog]
  }
}

