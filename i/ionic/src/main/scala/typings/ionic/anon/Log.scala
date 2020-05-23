package typings.ionic.anon

import typings.ionic.definitionsMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log extends js.Object {
  var log: ILogger
}

object Log {
  @scala.inline
  def apply(log: ILogger): Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[Log]
  }
}

