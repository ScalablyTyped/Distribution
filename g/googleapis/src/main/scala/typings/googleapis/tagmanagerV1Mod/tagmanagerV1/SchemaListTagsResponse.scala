package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Tags Response.
  */
@js.native
trait SchemaListTagsResponse extends js.Object {
  /**
    * All GTM Tags of a GTM Container.
    */
  var tags: js.UndefOr[js.Array[SchemaTag]] = js.native
}

object SchemaListTagsResponse {
  @scala.inline
  def apply(tags: js.Array[SchemaTag] = null): SchemaListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTagsResponse]
  }
}

