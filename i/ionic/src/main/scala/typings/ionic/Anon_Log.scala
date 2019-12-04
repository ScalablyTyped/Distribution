package typings.ionic

import typings.ionic.definitionsMod.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Log extends js.Object {
  var log: ILogger
}

object Anon_Log {
  @scala.inline
  def apply(log: ILogger): Anon_Log = {
    val __obj = js.Dynamic.literal(log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Log]
  }
}

