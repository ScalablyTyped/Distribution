package typings.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResponse extends js.Object {
  var service: Service
  var status: Double
}

object ValidationResponse {
  @scala.inline
  def apply(service: Service, status: Double): ValidationResponse = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationResponse]
  }
}

