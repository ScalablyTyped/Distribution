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

object Options {
  @scala.inline
  def apply(path: java.lang.String = null, subDomain: java.lang.String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain)
    __obj.asInstanceOf[Options]
  }
}

