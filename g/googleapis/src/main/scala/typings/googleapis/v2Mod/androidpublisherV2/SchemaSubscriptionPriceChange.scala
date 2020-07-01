package typings.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains the price change information for a subscription that can be used
  * to control the user journey for the price change in the app. This can be in
  * the form of seeking confirmation from the user or tailoring the experience
  * for a successful conversion.
  */
@js.native
trait SchemaSubscriptionPriceChange extends js.Object {
  /**
    * The new price the subscription will renew with if the price change is
    * accepted by the user.
    */
  var newPrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * The current state of the price change. Possible values are:   -
    * Outstanding: State for a pending price change waiting for the user to
    * agree. In this state, you can optionally seek confirmation from the user
    * using the In-App API.  - Accepted: State for an accepted price change
    * that the subscription will renew with unless it&#39;s canceled. The price
    * change takes effect on a future date when the subscription renews. Note
    * that the change might not occur when the subscription is renewed next.
    */
  var state: js.UndefOr[Double] = js.native
}

object SchemaSubscriptionPriceChange {
  @scala.inline
  def apply(newPrice: SchemaPrice = null, state: js.UndefOr[Double] = js.undefined): SchemaSubscriptionPriceChange = {
    val __obj = js.Dynamic.literal()
    if (newPrice != null) __obj.updateDynamic("newPrice")(newPrice.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionPriceChange]
  }
}

