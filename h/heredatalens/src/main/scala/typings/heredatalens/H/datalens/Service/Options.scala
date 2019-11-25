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
trait Options extends js.Object {
  /** The token used to authenticate all requests */
  var access_token: js.UndefOr[String] = js.undefined
  /** Defines an alternative host for the Data Lens REST API URL */
  var baseUrl: js.UndefOr[String] = js.undefined
  /**
    * To increase the number of simultaneous requests to the Data Lens REST API, domain sharding is used.
    * This option can be used when the Data Lens environment does not support domain sharding.
    */
  var domainSharding: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The token used to fetch a new access token after the previous access token has expired.
    * When refresh_token is provided, Service will automatically update the expired access_token.
    */
  var refresh_token: js.UndefOr[String] = js.undefined
  /** Subdomain of the Data Lens REST API URL */
  var subDomain: js.UndefOr[String] = js.undefined
  /** Pathname prefix of the Data Lens REST API endpoints */
  var version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    access_token: String = null,
    baseUrl: String = null,
    domainSharding: js.Array[String] = null,
    refresh_token: String = null,
    subDomain: String = null,
    version: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (domainSharding != null) __obj.updateDynamic("domainSharding")(domainSharding.asInstanceOf[js.Any])
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token.asInstanceOf[js.Any])
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

