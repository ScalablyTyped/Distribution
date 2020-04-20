package typings.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData extends js.Object {
  var data: String
  var signature: String
}

object AnonData {
  @scala.inline
  def apply(data: String, signature: String): AnonData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData]
  }
}

