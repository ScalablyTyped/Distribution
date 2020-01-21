package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sitemaps.
  */
@js.native
trait SchemaSitemapsListResponse extends js.Object {
  /**
    * Contains detailed information about a specific URL submitted as a
    * sitemap.
    */
  var sitemap: js.UndefOr[js.Array[SchemaWmxSitemap]] = js.native
}

object SchemaSitemapsListResponse {
  @scala.inline
  def apply(sitemap: js.Array[SchemaWmxSitemap] = null): SchemaSitemapsListResponse = {
    val __obj = js.Dynamic.literal()
    if (sitemap != null) __obj.updateDynamic("sitemap")(sitemap.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSitemapsListResponse]
  }
}

