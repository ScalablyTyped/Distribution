package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sites with access level information.
  */
@js.native
trait SchemaSitesListResponse extends js.Object {
  /**
    * Contains permission level information about a Search Console site. For
    * more information, see Permissions in Search Console.
    */
  var siteEntry: js.UndefOr[js.Array[SchemaWmxSite]] = js.native
}

object SchemaSitesListResponse {
  @scala.inline
  def apply(siteEntry: js.Array[SchemaWmxSite] = null): SchemaSitesListResponse = {
    val __obj = js.Dynamic.literal()
    if (siteEntry != null) __obj.updateDynamic("siteEntry")(siteEntry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSitesListResponse]
  }
}

