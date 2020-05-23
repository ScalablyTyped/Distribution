package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OidString extends js.Object {
  var oid: String
}

object OidString {
  @scala.inline
  def apply(oid: String): OidString = {
    val __obj = js.Dynamic.literal(oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[OidString]
  }
}

