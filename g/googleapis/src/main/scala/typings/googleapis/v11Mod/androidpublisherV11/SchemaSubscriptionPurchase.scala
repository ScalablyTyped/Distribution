package typings.googleapis.v11Mod.androidpublisherV11

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A SubscriptionPurchase resource indicates the status of a user&#39;s
  * subscription purchase.
  */
@js.native
trait SchemaSubscriptionPurchase extends js.Object {
  /**
    * Whether the subscription will automatically be renewed when it reaches
    * its current expiry time.
    */
  var autoRenewing: js.UndefOr[Boolean] = js.native
  /**
    * Time at which the subscription was granted, in milliseconds since the
    * Epoch.
    */
  var initiationTimestampMsec: js.UndefOr[String] = js.native
  /**
    * This kind represents a subscriptionPurchase object in the
    * androidpublisher service.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Time at which the subscription will expire, in milliseconds since the
    * Epoch.
    */
  var validUntilTimestampMsec: js.UndefOr[String] = js.native
}

object SchemaSubscriptionPurchase {
  @scala.inline
  def apply(
    autoRenewing: js.UndefOr[Boolean] = js.undefined,
    initiationTimestampMsec: String = null,
    kind: String = null,
    validUntilTimestampMsec: String = null
  ): SchemaSubscriptionPurchase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoRenewing)) __obj.updateDynamic("autoRenewing")(autoRenewing.get.asInstanceOf[js.Any])
    if (initiationTimestampMsec != null) __obj.updateDynamic("initiationTimestampMsec")(initiationTimestampMsec.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (validUntilTimestampMsec != null) __obj.updateDynamic("validUntilTimestampMsec")(validUntilTimestampMsec.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionPurchase]
  }
}

