package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Domain ID of Gmail phishing alerts.
  */
@js.native
trait SchemaDomainId extends js.Object {
  /**
    * The primary domain for the customer.
    */
  var customerPrimaryDomain: js.UndefOr[String] = js.native
}

object SchemaDomainId {
  @scala.inline
  def apply(customerPrimaryDomain: String = null): SchemaDomainId = {
    val __obj = js.Dynamic.literal()
    if (customerPrimaryDomain != null) __obj.updateDynamic("customerPrimaryDomain")(customerPrimaryDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDomainId]
  }
}

