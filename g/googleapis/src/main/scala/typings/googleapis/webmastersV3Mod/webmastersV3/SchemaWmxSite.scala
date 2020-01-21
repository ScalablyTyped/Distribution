package typings.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains permission level information about a Search Console site. For more
  * information, see  Permissions in Search Console.
  */
@js.native
trait SchemaWmxSite extends js.Object {
  /**
    * The user&#39;s permission level for the site.
    */
  var permissionLevel: js.UndefOr[String] = js.native
  /**
    * The URL of the site.
    */
  var siteUrl: js.UndefOr[String] = js.native
}

object SchemaWmxSite {
  @scala.inline
  def apply(permissionLevel: String = null, siteUrl: String = null): SchemaWmxSite = {
    val __obj = js.Dynamic.literal()
    if (permissionLevel != null) __obj.updateDynamic("permissionLevel")(permissionLevel.asInstanceOf[js.Any])
    if (siteUrl != null) __obj.updateDynamic("siteUrl")(siteUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWmxSite]
  }
}

