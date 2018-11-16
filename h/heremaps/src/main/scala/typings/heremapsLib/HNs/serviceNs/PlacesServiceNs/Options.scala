package typings
package heremapsLib.HNs.serviceNs.PlacesServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * @property subDomain {string=} - the sub-domain of the places service relative to the platform's base URL, default is 'places'
             * @property path {string=} - the path of the places service, default is 'places/v1'
             * @property baseUrl {H.service.Url=} - an optional base URL if it differs from the platform's default base URL
             */

trait Options extends js.Object {
  var baseUrl: js.UndefOr[heremapsLib.HNs.serviceNs.Url] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var subDomain: js.UndefOr[java.lang.String] = js.undefined
}

