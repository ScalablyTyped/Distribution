package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about the content to witch a subscription refers.
  */
@js.native
trait SchemaSubscriptionContentDetails extends js.Object {
  /**
    * The type of activity this subscription is for (only uploads, everything).
    */
  var activityType: js.UndefOr[String] = js.native
  /**
    * The number of new items in the subscription since its content was last
    * read.
    */
  var newItemCount: js.UndefOr[Double] = js.native
  /**
    * The approximate number of items that the subscription points to.
    */
  var totalItemCount: js.UndefOr[Double] = js.native
}

object SchemaSubscriptionContentDetails {
  @scala.inline
  def apply(
    activityType: String = null,
    newItemCount: js.UndefOr[Double] = js.undefined,
    totalItemCount: js.UndefOr[Double] = js.undefined
  ): SchemaSubscriptionContentDetails = {
    val __obj = js.Dynamic.literal()
    if (activityType != null) __obj.updateDynamic("activityType")(activityType.asInstanceOf[js.Any])
    if (!js.isUndefined(newItemCount)) __obj.updateDynamic("newItemCount")(newItemCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalItemCount)) __obj.updateDynamic("totalItemCount")(totalItemCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSubscriptionContentDetails]
  }
}

