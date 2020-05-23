package typings.jupyterlabServices.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Wait extends js.Object {
  @JSName("wait")
  var wait_FWait: Boolean
}

object Wait {
  @scala.inline
  def apply(wait: Boolean): Wait = {
    val __obj = js.Dynamic.literal(wait = wait.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wait]
  }
}

