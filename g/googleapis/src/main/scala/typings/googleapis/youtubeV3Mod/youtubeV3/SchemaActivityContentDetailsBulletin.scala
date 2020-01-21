package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details about a channel bulletin post.
  */
@js.native
trait SchemaActivityContentDetailsBulletin extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * associated with a bulletin post.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsBulletin {
  @scala.inline
  def apply(resourceId: SchemaResourceId = null): SchemaActivityContentDetailsBulletin = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsBulletin]
  }
}

