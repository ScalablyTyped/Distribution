package typings.jenkins

import typings.jenkins.jenkinsNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var crumbIssuer: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: js.UndefOr[`false`] = js.undefined
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: String = null,
    crumbIssuer: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null,
    promisify: `false` = null
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (promisify != null) __obj.updateDynamic("promisify")(promisify)
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

