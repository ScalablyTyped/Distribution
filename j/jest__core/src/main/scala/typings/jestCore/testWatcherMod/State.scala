package typings.jestCore.testWatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var interrupted: Boolean
}

object State {
  @scala.inline
  def apply(interrupted: Boolean): State = {
    val __obj = js.Dynamic.literal(interrupted = interrupted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

