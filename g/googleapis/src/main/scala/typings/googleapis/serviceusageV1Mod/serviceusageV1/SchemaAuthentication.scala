package typings.googleapis.serviceusageV1Mod.serviceusageV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Authentication` defines the authentication configuration for an API.
  * Example for an API targeted for external use:      name:
  * calendar.googleapis.com     authentication:       providers:       - id:
  * google_calendar_auth         jwks_uri:
  * https://www.googleapis.com/oauth2/v1/certs         issuer:
  * https://securetoken.google.com       rules:       - selector: &quot;*&quot;
  * requirements:           provider_id: google_calendar_auth
  */
@js.native
trait SchemaAuthentication extends js.Object {
  /**
    * Defines a set of authentication providers that a service supports.
    */
  var providers: js.UndefOr[js.Array[SchemaAuthProvider]] = js.native
  /**
    * A list of authentication rules that apply to individual API methods.
    * **NOTE:** All service configuration rules follow &quot;last one
    * wins&quot; order.
    */
  var rules: js.UndefOr[js.Array[SchemaAuthenticationRule]] = js.native
}

object SchemaAuthentication {
  @scala.inline
  def apply(providers: js.Array[SchemaAuthProvider] = null, rules: js.Array[SchemaAuthenticationRule] = null): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAuthentication]
  }
}

