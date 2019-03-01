package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var crumbIssuer: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: jenkinsLib.jenkinsLibNumbers.`true`
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    promisify: jenkinsLib.jenkinsLibNumbers.`true`,
    baseUrl: java.lang.String = null,
    crumbIssuer: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Any = null
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("promisify")(promisify)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

