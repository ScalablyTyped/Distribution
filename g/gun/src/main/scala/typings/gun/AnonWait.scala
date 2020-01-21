package typings.gun

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWait extends js.Object {
  @JSName("wait")
  var wait_FAnonWait: Double
}

object AnonWait {
  @scala.inline
  def apply(wait: Double): AnonWait = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonWait]
  }
}

