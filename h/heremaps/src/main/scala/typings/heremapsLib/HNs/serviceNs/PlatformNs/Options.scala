package typings
package heremapsLib.HNs.serviceNs.PlatformNs

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
  var app_code: java.lang.String
  var app_id: java.lang.String
  var baseUrl: js.UndefOr[heremapsLib.HNs.serviceNs.Url] = js.undefined
  var useCIT: js.UndefOr[scala.Boolean] = js.undefined
  var useHTTPS: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    app_code: java.lang.String,
    app_id: java.lang.String,
    baseUrl: heremapsLib.HNs.serviceNs.Url = null,
    useCIT: js.UndefOr[scala.Boolean] = js.undefined,
    useHTTPS: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("app_code")(app_code)
    __obj.updateDynamic("app_id")(app_id)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(useCIT)) __obj.updateDynamic("useCIT")(useCIT)
    if (!js.isUndefined(useHTTPS)) __obj.updateDynamic("useHTTPS")(useHTTPS)
    __obj.asInstanceOf[Options]
  }
}

