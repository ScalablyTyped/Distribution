package typings
package jsforceLib.connectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends PartialOAuth2Options {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var callOptions: js.UndefOr[js.Object] = js.undefined
  var instanceUrl: js.UndefOr[java.lang.String] = js.undefined
  var logLevel: js.UndefOr[java.lang.String] = js.undefined
  var maxRequest: js.UndefOr[scala.Double] = js.undefined
  var oauth2: js.UndefOr[stdLib.Partial[PartialOAuth2Options]] = js.undefined
  var proxyUrl: js.UndefOr[java.lang.String] = js.undefined
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  var serverUrl: js.UndefOr[java.lang.String] = js.undefined
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  var signedRequest: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

