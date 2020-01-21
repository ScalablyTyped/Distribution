package typings.jpm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScript extends js.Object {
  var script: Boolean
}

object AnonScript {
  @scala.inline
  def apply(script: Boolean): AnonScript = {
    val __obj = js.Dynamic.literal(script = script.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonScript]
  }
}

