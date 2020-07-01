package typings.gtmetrix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<gtmetrix.gtmetrix.AccountStatus> */
trait ReadonlyAccountStatus extends js.Object {
  val api_credits: Double
  val api_refill: Double
}

object ReadonlyAccountStatus {
  @scala.inline
  def apply(api_credits: Double, api_refill: Double): ReadonlyAccountStatus = {
    val __obj = js.Dynamic.literal(api_credits = api_credits.asInstanceOf[js.Any], api_refill = api_refill.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyAccountStatus]
  }
}

