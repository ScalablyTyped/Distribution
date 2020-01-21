package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes the billing configuration for a new tenant project.
  */
@js.native
trait SchemaBillingConfig extends js.Object {
  /**
    * Name of the billing account. For example
    * `billingAccounts/012345-567890-ABCDEF`.
    */
  var billingAccount: js.UndefOr[String] = js.native
}

object SchemaBillingConfig {
  @scala.inline
  def apply(billingAccount: String = null): SchemaBillingConfig = {
    val __obj = js.Dynamic.literal()
    if (billingAccount != null) __obj.updateDynamic("billingAccount")(billingAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBillingConfig]
  }
}

