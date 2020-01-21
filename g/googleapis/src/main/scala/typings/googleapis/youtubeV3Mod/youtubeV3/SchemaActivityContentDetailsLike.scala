package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a resource that received a positive (like) rating.
  */
@js.native
trait SchemaActivityContentDetailsLike extends js.Object {
  /**
    * The resourceId object contains information that identifies the rated
    * resource.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsLike {
  @scala.inline
  def apply(resourceId: SchemaResourceId = null): SchemaActivityContentDetailsLike = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsLike]
  }
}

