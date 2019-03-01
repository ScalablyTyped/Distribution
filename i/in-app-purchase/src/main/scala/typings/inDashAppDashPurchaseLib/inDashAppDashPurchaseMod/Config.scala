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

object Config {
  @scala.inline
  def apply(
    amazonAPIVersion: scala.Int | scala.Double = null,
    applePassword: java.lang.String = null,
    clientId: java.lang.String = null,
    clientSecret: java.lang.String = null,
    googleAccToken: java.lang.String = null,
    googlePublicKeyPath: java.lang.String = null,
    googleRefToken: java.lang.String = null,
    refreshToken: java.lang.String = null,
    rokuApiKey: java.lang.String = null,
    secret: java.lang.String = null,
    test: js.UndefOr[scala.Boolean] = js.undefined,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (amazonAPIVersion != null) __obj.updateDynamic("amazonAPIVersion")(amazonAPIVersion.asInstanceOf[js.Any])
    if (applePassword != null) __obj.updateDynamic("applePassword")(applePassword)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret)
    if (googleAccToken != null) __obj.updateDynamic("googleAccToken")(googleAccToken)
    if (googlePublicKeyPath != null) __obj.updateDynamic("googlePublicKeyPath")(googlePublicKeyPath)
    if (googleRefToken != null) __obj.updateDynamic("googleRefToken")(googleRefToken)
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken)
    if (rokuApiKey != null) __obj.updateDynamic("rokuApiKey")(rokuApiKey)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Config]
  }
}

