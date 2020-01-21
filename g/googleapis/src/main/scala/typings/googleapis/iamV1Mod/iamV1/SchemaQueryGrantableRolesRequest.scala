package typings.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The grantable role query request.
  */
@js.native
trait SchemaQueryGrantableRolesRequest extends js.Object {
  /**
    * Required. The full resource name to query from the list of grantable
    * roles.  The name follows the Google Cloud Platform resource format. For
    * example, a Cloud Platform project with id `my-project` will be named
    * `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var fullResourceName: js.UndefOr[String] = js.native
  /**
    * Optional limit on the number of roles to include in the response.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional pagination token returned in an earlier
    * QueryGrantableRolesResponse.
    */
  var pageToken: js.UndefOr[String] = js.native
  var view: js.UndefOr[String] = js.native
}

object SchemaQueryGrantableRolesRequest {
  @scala.inline
  def apply(
    fullResourceName: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    view: String = null
  ): SchemaQueryGrantableRolesRequest = {
    val __obj = js.Dynamic.literal()
    if (fullResourceName != null) __obj.updateDynamic("fullResourceName")(fullResourceName.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQueryGrantableRolesRequest]
  }
}

