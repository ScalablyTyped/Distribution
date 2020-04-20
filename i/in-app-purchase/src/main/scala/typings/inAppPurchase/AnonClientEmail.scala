package typings.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientEmail extends js.Object {
  // client email from Google API service account JSON key file
  var clientEmail: String
  // private key string from Google API service account JSON key file
  var privateKey: String
}

object AnonClientEmail {
  @scala.inline
  def apply(clientEmail: String, privateKey: String): AnonClientEmail = {
    val __obj = js.Dynamic.literal(clientEmail = clientEmail.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientEmail]
  }
}

