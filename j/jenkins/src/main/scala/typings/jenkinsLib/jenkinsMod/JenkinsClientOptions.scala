package typings
package jenkinsLib.jenkinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsClientOptions extends js.Object {
  var baseUrl: js.UndefOr[java.lang.String] = js.undefined
  var crumbIssuer: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: js.UndefOr[scala.Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object JenkinsClientOptions {
  @scala.inline
  def apply(
    baseUrl: java.lang.String = null,
    crumbIssuer: js.UndefOr[scala.Boolean] = js.undefined,
    headers: js.Any = null,
    promisify: scala.Boolean | (js.Function1[/* repeated */ js.Any, _]) = null
  ): JenkinsClientOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (promisify != null) __obj.updateDynamic("promisify")(promisify.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsClientOptions]
  }
}

