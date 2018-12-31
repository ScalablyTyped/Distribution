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

