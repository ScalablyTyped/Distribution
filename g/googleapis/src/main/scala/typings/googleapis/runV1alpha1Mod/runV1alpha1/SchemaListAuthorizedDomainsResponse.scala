package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Authorized Domains.
  */
@js.native
trait SchemaListAuthorizedDomainsResponse extends js.Object {
  /**
    * The authorized domains belonging to the user.
    */
  var domains: js.UndefOr[js.Array[SchemaAuthorizedDomain]] = js.native
  /**
    * Continuation token for fetching the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAuthorizedDomainsResponse {
  @scala.inline
  def apply(domains: js.Array[SchemaAuthorizedDomain] = null, nextPageToken: String = null): SchemaListAuthorizedDomainsResponse = {
    val __obj = js.Dynamic.literal()
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAuthorizedDomainsResponse]
  }
}

