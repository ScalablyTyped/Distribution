package typings.heremaps.H.service.TrafficIncidentsService

import typings.heremaps.H.service.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property subDomain {string=} - the sub-domain of the traffic incidents service relative to the platform's base URL, default is 'traffic'
  * @property path {string=} - the path of the traffic incidents service, default is 'traffic/6.1'
  * @property baseUrl {H.service.Url=} - an optional base URL if it differs from the platform's default base URL
  */
trait Options extends js.Object {
  var baseUrl: js.UndefOr[Url] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var subDomain: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(baseUrl: Url = null, path: String = null, subDomain: String = null): Options = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (subDomain != null) __obj.updateDynamic("subDomain")(subDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

