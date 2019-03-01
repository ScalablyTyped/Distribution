package typings
package heredatalensLib.HNs.datalensNs.ServiceNs

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
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Defines an alternative host for the Data Lens REST API URL */
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * To increase the number of simultaneous requests to the Data Lens REST API, domain sharding is used.
    * This option can be used when the Data Lens environment does not support domain sharding.
    */
  var domainSharding: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The token used to fetch a new access token after the previous access token has expired.
    * When refresh_token is provided, Service will automatically update the expired access_token.
    */
  var refresh_token: js.UndefOr[java.lang.String] = js.undefined
  /** Subdomain of the Data Lens REST API URL */
  var subDomain: js.UndefOr[java.lang.String] = js.undefined
  /** Pathname prefix of the Data Lens REST API endpoints */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    access_token: java.lang.String = null,
    baseUrl: java.lang.String = null,
    domainSharding: js.Array[java.lang.String] = null,
    refresh_token: java.lang.String = null,
    subDomain: java.lang.String = null,
    version: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (domainSharding != null) __obj.updateDynamic("domainSharding")(domainSharding)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Options]
  }
}

