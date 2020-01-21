package typings.keycloakJs.keycloakAuthzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizationRequestMetadata extends js.Object {
  /**
    * A boolean value indicating to the server if resource names should be included in the RPT’s permissions.
    * If false, only the resource identifier is included.
    */
  var responseIncludeResourceName: js.UndefOr[js.Any] = js.undefined
  /**
    * An integer N that defines a limit for the amount of permissions an RPT can have. When used together with
    * rpt parameter, only the last N requested permissions will be kept in the RPT.
    */
  var response_permissions_limit: js.UndefOr[Double] = js.undefined
}

object AuthorizationRequestMetadata {
  @scala.inline
  def apply(responseIncludeResourceName: js.Any = null, response_permissions_limit: Int | Double = null): AuthorizationRequestMetadata = {
    val __obj = js.Dynamic.literal()
    if (responseIncludeResourceName != null) __obj.updateDynamic("responseIncludeResourceName")(responseIncludeResourceName.asInstanceOf[js.Any])
    if (response_permissions_limit != null) __obj.updateDynamic("response_permissions_limit")(response_permissions_limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationRequestMetadata]
  }
}

