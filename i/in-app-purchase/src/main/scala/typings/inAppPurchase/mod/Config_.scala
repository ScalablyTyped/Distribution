package typings.inAppPurchase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config_ extends js.Object {
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

object Config_ {
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
  ): Config_ = {
    val __obj = js.Dynamic.literal()
    if (amazonAPIVersion != null) __obj.updateDynamic("amazonAPIVersion")(amazonAPIVersion.asInstanceOf[js.Any])
    if (applePassword != null) __obj.updateDynamic("applePassword")(applePassword.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (clientSecret != null) __obj.updateDynamic("clientSecret")(clientSecret.asInstanceOf[js.Any])
    if (googleAccToken != null) __obj.updateDynamic("googleAccToken")(googleAccToken.asInstanceOf[js.Any])
    if (googlePublicKeyPath != null) __obj.updateDynamic("googlePublicKeyPath")(googlePublicKeyPath.asInstanceOf[js.Any])
    if (googleRefToken != null) __obj.updateDynamic("googleRefToken")(googleRefToken.asInstanceOf[js.Any])
    if (refreshToken != null) __obj.updateDynamic("refreshToken")(refreshToken.asInstanceOf[js.Any])
    if (rokuApiKey != null) __obj.updateDynamic("rokuApiKey")(rokuApiKey.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
}

