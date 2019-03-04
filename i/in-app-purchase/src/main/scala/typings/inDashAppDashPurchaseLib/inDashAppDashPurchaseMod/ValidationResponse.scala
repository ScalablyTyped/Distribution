package typings
package inDashAppDashPurchaseLib.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationResponse extends js.Object {
  var service: Service
  var status: scala.Double
}

object ValidationResponse {
  @scala.inline
  def apply(service: Service, status: scala.Double): ValidationResponse = {
    val __obj = js.Dynamic.literal(service = service, status = status)
  
    __obj.asInstanceOf[ValidationResponse]
  }
}

