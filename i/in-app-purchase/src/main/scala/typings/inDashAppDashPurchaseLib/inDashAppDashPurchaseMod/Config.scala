package typings
package inDashAppDashPurchaseLib.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /* Configurations for Amazon Store */
  var amazonAPIVersion: js.UndefOr[scala.Double] = js.undefined
  /* Configurations for Apple */
  // this comes from iTunes Connect (You need this to valiate subscriptions)
  var applePassword: js.UndefOr[java.lang.String] = js.undefined
  // optional, for Google Play subscriptions
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  // optional, for Google Play subscriptions
  var clientSecret: js.UndefOr[java.lang.String] = js.undefined
  // optional, for Google Play subscriptions
  var googleAccToken: js.UndefOr[java.lang.String] = js.undefined
  /* Configurations for Google Play */
  // this is the path to the directory containing iap-sanbox/iap-live files
  var googlePublicKeyPath: js.UndefOr[java.lang.String] = js.undefined
  // optional, for Google Play subscritions
  var googleRefToken: js.UndefOr[java.lang.String] = js.undefined
  // optional, for Google Play subscriptions
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
  /* Configurations for Roku */
  // this comes from Roku Developer Dashboard
  var rokuApiKey: js.UndefOr[java.lang.String] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
  /* Configurations all platforms */
  // For Apple and Googl Play to force Sandbox validation only
  var test: js.UndefOr[scala.Boolean] = js.undefined
  // Output debug logs to stdout stream
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
}

