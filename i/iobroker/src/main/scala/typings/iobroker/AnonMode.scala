package typings.iobroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMode extends js.Object {
  var mode: Double | String
}

object AnonMode {
  @scala.inline
  def apply(mode: Double | String): AnonMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMode]
  }
}

