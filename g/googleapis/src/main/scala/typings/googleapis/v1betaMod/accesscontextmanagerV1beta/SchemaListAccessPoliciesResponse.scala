package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response to `ListAccessPoliciesRequest`.
  */
@js.native
trait SchemaListAccessPoliciesResponse extends js.Object {
  /**
    * List of the AccessPolicy instances.
    */
  var accessPolicies: js.UndefOr[js.Array[SchemaAccessPolicy]] = js.native
  /**
    * The pagination token to retrieve the next page of results. If the value
    * is empty, no further results remain.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListAccessPoliciesResponse {
  @scala.inline
  def apply(accessPolicies: js.Array[SchemaAccessPolicy] = null, nextPageToken: String = null): SchemaListAccessPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (accessPolicies != null) __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListAccessPoliciesResponse]
  }
}

