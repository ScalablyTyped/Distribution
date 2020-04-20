package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOidString extends js.Object {
  var oid: String
}

object AnonOidString {
  @scala.inline
  def apply(oid: String): AnonOidString = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOidString]
  }
}

