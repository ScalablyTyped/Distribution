package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialOAuth2Options extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  var loginUrl: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
}

object PartialOAuth2Options {
  @scala.inline
  def apply(
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    loginUrl: java.lang.String = null,
    redirectUri: java.lang.String = null
  ): PartialOAuth2Options = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    __obj.asInstanceOf[PartialOAuth2Options]
  }
}

