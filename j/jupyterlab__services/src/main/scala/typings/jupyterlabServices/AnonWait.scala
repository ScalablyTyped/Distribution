package typings.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWait extends js.Object {
  @JSName("wait")
  var wait_FAnonWait: Boolean
}

object AnonWait {
  @scala.inline
  def apply(wait: Boolean): AnonWait = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWait]
  }
}

