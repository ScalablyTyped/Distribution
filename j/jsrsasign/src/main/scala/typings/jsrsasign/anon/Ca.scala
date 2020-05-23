package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ca extends js.Object {
  var ca: Boolean
  var critical: Boolean
}

object Ca {
  @scala.inline
  def apply(ca: Boolean, critical: Boolean): Ca = {
    val __obj = js.Dynamic.literal(ca = ca.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ca]
  }
}

