package typings.heremaps.H.service.Platform

import typings.heremaps.H.service.Url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property app_id {string} - The application ID to identify the client against the platform (mandatory to provide)
  * @property app_code {string} - The application code to identify the client against the platform (mandatory to provide)
  * @property baseUrl {H.service.Url=} - The base URL of the platform, default is http://api.here.com
  * @property useCIT {boolean=} - Indicates whether the Customer Integration Testing should be used, default is false
  * @property useHTTPS {boolean=} - Indicates whether secure communication should be used, default is false
  */
trait Options extends js.Object {
  var apikey: String
  var baseUrl: js.UndefOr[Url] = js.undefined
  var useCIT: js.UndefOr[Boolean] = js.undefined
  var useHTTPS: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    apikey: String,
    baseUrl: Url = null,
    useCIT: js.UndefOr[Boolean] = js.undefined,
    useHTTPS: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(useCIT)) __obj.updateDynamic("useCIT")(useCIT.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTTPS)) __obj.updateDynamic("useHTTPS")(useHTTPS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

