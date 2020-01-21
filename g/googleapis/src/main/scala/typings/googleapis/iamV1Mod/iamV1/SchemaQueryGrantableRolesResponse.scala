package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The grantable role query response.
  */
@js.native
trait SchemaQueryGrantableRolesResponse extends js.Object {
  /**
    * To retrieve the next page of results, set
    * `QueryGrantableRolesRequest.page_token` to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of matching roles.
    */
  var roles: js.UndefOr[js.Array[SchemaRole]] = js.native
}

object SchemaQueryGrantableRolesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, roles: js.Array[SchemaRole] = null): SchemaQueryGrantableRolesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (roles != null) __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryGrantableRolesResponse]
  }
}

