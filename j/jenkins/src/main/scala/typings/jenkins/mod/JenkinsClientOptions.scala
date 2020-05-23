package typings.jenkins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JenkinsClientOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var crumbIssuer: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: js.UndefOr[Boolean | (js.Function1[/* repeated */ js.Any, _])] = js.undefined
}

object JenkinsClientOptions {
  @scala.inline
  def apply(
    baseUrl: String = null,
    crumbIssuer: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    promisify: Boolean | (js.Function1[/* repeated */ js.Any, _]) = null
  ): JenkinsClientOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (promisify != null) __obj.updateDynamic("promisify")(promisify.asInstanceOf[js.Any])
    __obj.asInstanceOf[JenkinsClientOptions]
  }
}

