package typings
package heremapsLib.HNs.serviceNs.EnterpriseRoutingServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property subDomain {string=} - The sub-domain of the routing service relative to the platform's base URL (default is 'route')
  * @property path {string=} - The path of the map tile service, default is "routing/7.2"
  * @property baseUrl {H.service.Url=} - The base URL of the service, defaults to the the platform's base URL if instance was created using H.service.Platform#getEnterpriseRoutingService
  * method.
  */
trait Options extends js.Object {
  var baseUrl: js.UndefOr[heremapsLib.HNs.serviceNs.Url] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var subDomain: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    baseUrl: heremapsLib.HNs.serviceNs.Url = null,
    path: java.lang.String = null,
    subDomain: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (path != null) __obj.updateDynamic("path")(path)
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain)
    __obj.asInstanceOf[Options]
  }
}

