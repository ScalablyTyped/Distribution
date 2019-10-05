package typings.heremaps.H.service.GeocodingService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property subDomain {string=} - the sub-domain of the geo-coding service relative to the platform's base URL, default is 'geocoder'
  * @property path {string=} - the path of the Geocoding service, default is '6.2'
  */
trait Options extends js.Object {
  var path: js.UndefOr[String] = js.undefined
  var subDomain: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(path: String = null, subDomain: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain)
    __obj.asInstanceOf[Options]
  }
}

