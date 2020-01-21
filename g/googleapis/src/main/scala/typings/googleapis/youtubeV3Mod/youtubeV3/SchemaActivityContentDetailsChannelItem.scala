package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a resource which was added to a channel.
  */
@js.native
trait SchemaActivityContentDetailsChannelItem extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * that was added to the channel.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsChannelItem {
  @scala.inline
  def apply(resourceId: SchemaResourceId = null): SchemaActivityContentDetailsChannelItem = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsChannelItem]
  }
}

