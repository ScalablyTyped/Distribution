package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBin extends js.Object {
  var bin: String
  var critical: Boolean
}

object AnonBin {
  @scala.inline
  def apply(bin: String, critical: Boolean): AnonBin = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBin]
  }
}

