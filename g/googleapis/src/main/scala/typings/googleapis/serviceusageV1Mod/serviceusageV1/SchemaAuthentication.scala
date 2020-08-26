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
  def apply(): SchemaAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAuthentication]
  }
  @scala.inline
  implicit class SchemaAuthenticationOps[Self <: SchemaAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProvidersVarargs(value: SchemaAuthProvider*): Self = this.set("providers", js.Array(value :_*))
    @scala.inline
    def setProviders(value: js.Array[SchemaAuthProvider]): Self = this.set("providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProviders: Self = this.set("providers", js.undefined)
    @scala.inline
    def setRulesVarargs(value: SchemaAuthenticationRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[SchemaAuthenticationRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
  
}

