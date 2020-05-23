package typings.inAppPurchase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientEmail extends js.Object {
  // client email from Google API service account JSON key file
  var clientEmail: String
  // private key string from Google API service account JSON key file
  var privateKey: String
}

object ClientEmail {
  @scala.inline
  def apply(clientEmail: String, privateKey: String): ClientEmail = {
    val __obj = js.Dynamic.literal(clientEmail = clientEmail.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientEmail]
  }
}

