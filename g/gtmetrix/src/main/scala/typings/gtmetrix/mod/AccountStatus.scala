package typings.gtmetrix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountStatus extends js.Object {
  var api_credits: Double
  var api_refill: Double
}

object AccountStatus {
  @scala.inline
  def apply(api_credits: Double, api_refill: Double): AccountStatus = {
    val __obj = js.Dynamic.literal(api_credits = api_credits.asInstanceOf[js.Any], api_refill = api_refill.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountStatus]
  }
}

