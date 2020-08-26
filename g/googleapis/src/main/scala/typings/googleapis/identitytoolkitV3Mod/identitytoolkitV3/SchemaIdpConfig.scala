package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for a single idp configuration.
  */
@js.native
trait SchemaIdpConfig extends js.Object {
  /**
    * OAuth2 client ID.
    */
  var clientId: js.UndefOr[String] = js.native
  /**
    * Whether this IDP is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Percent of users who will be prompted/redirected federated login for this
    * IDP.
    */
  var experimentPercent: js.UndefOr[Double] = js.native
  /**
    * OAuth2 provider.
    */
  var provider: js.UndefOr[String] = js.native
  /**
    * OAuth2 client secret.
    */
  var secret: js.UndefOr[String] = js.native
  /**
    * Whitelisted client IDs for audience check.
    */
  var whitelistedAudiences: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIdpConfig {
  @scala.inline
  def apply(): SchemaIdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdpConfig]
  }
  @scala.inline
  implicit class SchemaIdpConfigOps[Self <: SchemaIdpConfig] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setExperimentPercent(value: Double): Self = this.set("experimentPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperimentPercent: Self = this.set("experimentPercent", js.undefined)
    @scala.inline
    def setProvider(value: String): Self = this.set("provider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProvider: Self = this.set("provider", js.undefined)
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
    @scala.inline
    def setWhitelistedAudiencesVarargs(value: String*): Self = this.set("whitelistedAudiences", js.Array(value :_*))
    @scala.inline
    def setWhitelistedAudiences(value: js.Array[String]): Self = this.set("whitelistedAudiences", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhitelistedAudiences: Self = this.set("whitelistedAudiences", js.undefined)
  }
  
}

