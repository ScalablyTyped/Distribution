package typings.googleapis.youtubeAnalyticsV2Mod.youtubeAnalyticsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A group snippet.
  */
@js.native
trait SchemaGroupSnippet extends js.Object {
  /**
    * The date and time that the group was created. The value is specified in
    * ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var publishedAt: js.UndefOr[String] = js.native
  /**
    * The group name. The value must be a non-empty string.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaGroupSnippet {
  @scala.inline
  def apply(publishedAt: String = null, title: String = null): SchemaGroupSnippet = {
    val __obj = js.Dynamic.literal()
    if (publishedAt != null) __obj.updateDynamic("publishedAt")(publishedAt.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupSnippet]
  }
}

