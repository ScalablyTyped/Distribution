package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListDomainsResponse extends js.Object {
  /**
    * The list of domains, if any exist.
    */
  var domains: js.UndefOr[js.Array[SchemaDomain]] = js.native
  /**
    * The pagination token, if more results exist.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDomainsResponse {
  @scala.inline
  def apply(domains: js.Array[SchemaDomain] = null, nextPageToken: String = null): SchemaListDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListDomainsResponse]
  }
}

