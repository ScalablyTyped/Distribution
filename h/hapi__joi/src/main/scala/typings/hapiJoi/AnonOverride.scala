package typings.hapiJoi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverride extends js.Object {
  var `override`: Boolean
}

object AnonOverride {
  @scala.inline
  def apply(`override`: Boolean): AnonOverride = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("override")(`override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverride]
  }
}

