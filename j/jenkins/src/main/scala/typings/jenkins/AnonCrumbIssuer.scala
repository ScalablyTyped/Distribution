package typings.jenkins

import typings.jenkins.jenkinsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCrumbIssuer extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var crumbIssuer: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var promisify: `true`
}

object AnonCrumbIssuer {
  @scala.inline
  def apply(
    promisify: `true`,
    baseUrl: String = null,
    crumbIssuer: js.UndefOr[Boolean] = js.undefined,
    headers: js.Any = null
  ): AnonCrumbIssuer = {
    val __obj = js.Dynamic.literal(promisify = promisify.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(crumbIssuer)) __obj.updateDynamic("crumbIssuer")(crumbIssuer.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCrumbIssuer]
  }
}

