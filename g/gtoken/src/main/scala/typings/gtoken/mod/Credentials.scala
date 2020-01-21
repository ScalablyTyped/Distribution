package typings.gtoken.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var clientEmail: js.UndefOr[String] = js.undefined
  var privateKey: String
}

object Credentials {
  @scala.inline
  def apply(privateKey: String, clientEmail: String = null): Credentials = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any])
    if (clientEmail != null) __obj.updateDynamic("clientEmail")(clientEmail.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

