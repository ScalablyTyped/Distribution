package typings
package heremapsLib.HNs.serviceNs.metaInfoNs.ServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
                 * @property type {string=} - the type of the map tile service to communicate with, e.g. 'base' (default), 'aerial', etc. (refer to the Map Tile REST API documentation for
                 * available types)
                 * @property version {string=} - the map version hash to use for retrieving tiles, default is newest and will be automatically updated
                 * @property subDomain {string=} - the sub-domain of the map tile service relative to the platform's base URL, default is 'maps'
                 */

trait Options extends js.Object {
  var subDomain: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

