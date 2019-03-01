package typings
package jenkinsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrlCrumbIssuer extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var crumbIssuer: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: js.UndefOr[jenkinsLib.jenkinsLibNumbers.`false`] = js.undefined
}

object Anon_BaseUrlCrumbIssuer {
  @scala.inline
  def apply(
    baseUrl: java.lang.String = null,
    crumbIssuer: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Any = null,
    promisify: jenkinsLib.jenkinsLibNumbers.`false` = null
  ): Anon_BaseUrlCrumbIssuer = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (promisify != null) __obj.updateDynamic("promisify")(promisify)
    __obj.asInstanceOf[Anon_BaseUrlCrumbIssuer]
  }
}

