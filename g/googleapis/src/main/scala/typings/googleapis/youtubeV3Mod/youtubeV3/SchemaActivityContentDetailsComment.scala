package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a resource that received a comment.
  */
@js.native
trait SchemaActivityContentDetailsComment extends js.Object {
  /**
    * The resourceId object contains information that identifies the resource
    * associated with the comment.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaActivityContentDetailsComment {
  @scala.inline
  def apply(resourceId: SchemaResourceId = null): SchemaActivityContentDetailsComment = {
    val __obj = js.Dynamic.literal()
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaActivityContentDetailsComment]
  }
}

