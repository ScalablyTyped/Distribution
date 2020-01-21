package typings.jsreportCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSilent extends js.Object {
  var silent: Boolean
}

object AnonSilent {
  @scala.inline
  def apply(silent: Boolean): AnonSilent = {
    val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSilent]
  }
}

