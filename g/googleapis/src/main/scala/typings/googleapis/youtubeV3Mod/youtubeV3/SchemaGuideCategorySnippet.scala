package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Basic details about a guide category.
  */
@js.native
trait SchemaGuideCategorySnippet extends js.Object {
  var channelId: js.UndefOr[String] = js.native
  /**
    * Description of the guide category.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGuideCategorySnippet {
  @scala.inline
  def apply(channelId: String = null, title: String = null): SchemaGuideCategorySnippet = {
    val __obj = js.Dynamic.literal()
    if (channelId != null) __obj.updateDynamic("channelId")(channelId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGuideCategorySnippet]
  }
}

