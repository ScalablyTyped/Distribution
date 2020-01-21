package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a video that was marked as a favorite video.
  */
@js.native
trait SchemaActivityContentDetailsFavorite extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * that was marked as a favorite.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsFavorite {
  @scala.inline
  def apply(resourceId: SchemaResourceId = null): SchemaActivityContentDetailsFavorite = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsFavorite]
  }
}

