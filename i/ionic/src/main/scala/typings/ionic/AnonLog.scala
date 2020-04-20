package typings.ionic

import typings.ionic.definitionsMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  var log: ILogger
}

object AnonLog {
  @scala.inline
  def apply(log: ILogger): AnonLog = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLog]
  }
}

