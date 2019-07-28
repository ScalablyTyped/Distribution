package typings.inDashAppDashPurchase.inDashAppDashPurchaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /* Configurations for Amazon Store */
  var amazonAPIVersion: js.UndefOr[Double] = js.undefined
  /* Configurations for Apple */
  // this comes from iTunes Connect (You need this to valiate subscriptions)
  var applePassword: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var clientId: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var clientSecret: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var googleAccToken: js.UndefOr[String] = js.undefined
  /* Configurations for Google Play */
  // this is the path to the directory containing iap-sanbox/iap-live files
  var googlePublicKeyPath: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscritions
  var googleRefToken: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var refreshToken: js.UndefOr[String] = js.undefined
  /* Configurations for Roku */
  // this comes from Roku Developer Dashboard
  var rokuApiKey: js.UndefOr[String] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
  /* Configurations all platforms */
  // For Apple and Googl Play to force Sandbox validation only
  var test: js.UndefOr[Boolean] = js.undefined
  // Output debug logs to stdout stream
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    amazonAPIVersion: Int | Double = null,
    applePassword: String = null,
    clientId: String = null,
    clientSecret: String = null,
    googleAccToken: String = null,
    googlePublicKeyPath: String = null,
    googleRefToken: String = null,
    refreshToken: String = null,
    rokuApiKey: String = null,
    secret: String = null,
    test: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
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

