package typings
package heremapsLib.HNs.serviceNs.venuesNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
                 * @property subDomain {string=} - the sub-domain of the Venue Maps service relative to the platform's base URL, default is 'venue.maps'
                 * @property path {string=} - the path to append after host name when making requests to the Venue Maps API, default is empty
                 */

trait Options extends js.Object {
  var path: js.UndefOr[java.lang.String] = js.undefined
  var subDomain: js.UndefOr[java.lang.String] = js.undefined
}

