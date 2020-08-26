package typings.heredatalens.H.datalens.Service

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overrides the Service configuration
  * Normally the Service instance is configured with the service.Platform instance.
  * This configuration can be overridden by specifying these options.
  * It can be useful when the Data Lens environment is different from the HERE Platform environment.
  */
@js.native
trait Options extends js.Object {
  /** The token used to authenticate all requests */
  var access_token: js.UndefOr[String] = js.native
  /** Defines an alternative host for the Data Lens REST API URL */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * To increase the number of simultaneous requests to the Data Lens REST API, domain sharding is used.
    * This option can be used when the Data Lens environment does not support domain sharding.
    */
  var domainSharding: js.UndefOr[js.Array[String]] = js.native
  /**
    * The token used to fetch a new access token after the previous access token has expired.
    * When refresh_token is provided, Service will automatically update the expired access_token.
    */
  var refresh_token: js.UndefOr[String] = js.native
  /** Subdomain of the Data Lens REST API URL */
  var subDomain: js.UndefOr[String] = js.native
  /** Pathname prefix of the Data Lens REST API endpoints */
  var version: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setDomainShardingVarargs(value: String*): Self = this.set("domainSharding", js.Array(value :_*))
    @scala.inline
    def setDomainSharding(value: js.Array[String]): Self = this.set("domainSharding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainSharding: Self = this.set("domainSharding", js.undefined)
    @scala.inline
    def setRefresh_token(value: String): Self = this.set("refresh_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh_token: Self = this.set("refresh_token", js.undefined)
    @scala.inline
    def setSubDomain(value: String): Self = this.set("subDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubDomain: Self = this.set("subDomain", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

