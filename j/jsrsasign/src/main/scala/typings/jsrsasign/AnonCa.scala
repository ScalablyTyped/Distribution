package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCa extends js.Object {
  var ca: Boolean
  var critical: Boolean
}

object AnonCa {
  @scala.inline
  def apply(ca: Boolean, critical: Boolean): AnonCa = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCa]
  }
}

