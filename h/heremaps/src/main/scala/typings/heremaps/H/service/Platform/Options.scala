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
  var app_code: String
  var app_id: String
  var baseUrl: js.UndefOr[Url] = js.undefined
  var useCIT: js.UndefOr[Boolean] = js.undefined
  var useHTTPS: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    app_code: String,
    app_id: String,
    baseUrl: Url = null,
    useCIT: js.UndefOr[Boolean] = js.undefined,
    useHTTPS: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(app_code = app_code, app_id = app_id)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(useCIT)) __obj.updateDynamic("useCIT")(useCIT)
    if (!js.isUndefined(useHTTPS)) __obj.updateDynamic("useHTTPS")(useHTTPS)
    __obj.asInstanceOf[Options]
  }
}

