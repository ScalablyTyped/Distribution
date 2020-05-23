package typings.inAppPurchase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var data: String
  var signature: String
}

object Data {
  @scala.inline
  def apply(data: String, signature: String): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

