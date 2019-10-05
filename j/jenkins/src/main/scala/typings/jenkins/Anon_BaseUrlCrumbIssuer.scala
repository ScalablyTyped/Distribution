package typings.jenkins

import typings.jenkins.jenkinsNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrlCrumbIssuer extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var crumbIssuer: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: `true`
}

object Anon_BaseUrlCrumbIssuer {
  @scala.inline
  def apply(
    promisify: `true`,
    baseUrl: String = null,
    crumbIssuer: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null
  ): Anon_BaseUrlCrumbIssuer = {
    val __obj = js.Dynamic.literal(promisify = promisify)
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[Anon_BaseUrlCrumbIssuer]
  }
}

