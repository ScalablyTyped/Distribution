package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a channel that a user subscribed to.
  */
@js.native
trait SchemaActivityContentDetailsSubscription extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * that the user subscribed to.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsSubscription {
  @scala.inline
  def apply(resourceId: SchemaResourceId = null): SchemaActivityContentDetailsSubscription = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsSubscription]
  }
}

