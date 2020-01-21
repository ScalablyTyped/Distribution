package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the various content types in the sitemap.
  */
@js.native
trait SchemaWmxSitemapContent extends js.Object {
  /**
    * The number of URLs from the sitemap that were indexed (of the content
    * type).
    */
  var indexed: js.UndefOr[String] = js.native
  /**
    * The number of URLs in the sitemap (of the content type).
    */
  var submitted: js.UndefOr[String] = js.native
  /**
    * The specific type of content in this sitemap. For example: web.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaWmxSitemapContent {
  @scala.inline
  def apply(indexed: String = null, submitted: String = null, `type`: String = null): SchemaWmxSitemapContent = {
    val __obj = js.Dynamic.literal()
    if (indexed != null) __obj.updateDynamic("indexed")(indexed.asInstanceOf[js.Any])
    if (submitted != null) __obj.updateDynamic("submitted")(submitted.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWmxSitemapContent]
  }
}

