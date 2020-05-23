package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CriticalBoolean extends js.Object {
  var critical: Boolean
}

object CriticalBoolean {
  @scala.inline
  def apply(critical: Boolean): CriticalBoolean = {
    val __obj = js.Dynamic.literal(critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[CriticalBoolean]
  }
}

