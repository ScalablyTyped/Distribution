package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Localized versions of certain video properties (e.g. title).
  */
@js.native
trait SchemaVideoLocalization extends js.Object {
  /**
    * Localized version of the video&#39;s description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Localized version of the video&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaVideoLocalization {
  @scala.inline
  def apply(description: String = null, title: String = null): SchemaVideoLocalization = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVideoLocalization]
  }
}

