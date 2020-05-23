package typings.inAppPurchase.mod

import typings.inAppPurchase.anon.ClientEmail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config_ extends js.Object {
  /* Configurations for Amazon Store */
  var amazonAPIVersion: js.UndefOr[Double] = js.undefined
  /* Configurations for Apple */
  // if you want to exclude old transaction, set this to true. Default is false
  var appleExcludeOldTransactions: js.UndefOr[Boolean] = js.undefined
  // this comes from iTunes Connect (You need this to valiate subscriptions)
  var applePassword: js.UndefOr[String] = js.undefined
  /* Configurations for Facebook (Payments Lite) */
  var facebookAppId: js.UndefOr[String] = js.undefined
  var facebookAppSecret: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var googleAccToken: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var googleClientID: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var googleClientSecret: js.UndefOr[String] = js.undefined
  /* Configurations for Google Play */
  // this is the path to the directory containing iap-sanbox/iap-live files
  var googlePublicKeyPath: js.UndefOr[String] = js.undefined
  // this is the google iap-live public key string
  var googlePublicKeyStrLive: js.UndefOr[String] = js.undefined
  // this is the google iap-sandbox public key string
  var googlePublicKeyStrSandBox: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscritions
  var googleRefToken: js.UndefOr[String] = js.undefined
  // optional, for Google Play subscriptions
  var googleRefreshToken: js.UndefOr[String] = js.undefined
  // Configurations for Google Service Account validation: You can validate with just packageName, productId, and purchaseToken
  var googleServiceAccount: js.UndefOr[ClientEmail] = js.undefined
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
    amazonAPIVersion: js.UndefOr[Double] = js.undefined,
    appleExcludeOldTransactions: js.UndefOr[Boolean] = js.undefined,
    applePassword: String = null,
    facebookAppId: String = null,
    facebookAppSecret: String = null,
    googleAccToken: String = null,
    googleClientID: String = null,
    googleClientSecret: String = null,
    googlePublicKeyPath: String = null,
    googlePublicKeyStrLive: String = null,
    googlePublicKeyStrSandBox: String = null,
    googleRefToken: String = null,
    googleRefreshToken: String = null,
    googleServiceAccount: ClientEmail = null,
    rokuApiKey: String = null,
    secret: String = null,
    test: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Config_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amazonAPIVersion)) __obj.updateDynamic("amazonAPIVersion")(amazonAPIVersion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(appleExcludeOldTransactions)) __obj.updateDynamic("appleExcludeOldTransactions")(appleExcludeOldTransactions.get.asInstanceOf[js.Any])
    if (applePassword != null) __obj.updateDynamic("applePassword")(applePassword.asInstanceOf[js.Any])
    if (facebookAppId != null) __obj.updateDynamic("facebookAppId")(facebookAppId.asInstanceOf[js.Any])
    if (facebookAppSecret != null) __obj.updateDynamic("facebookAppSecret")(facebookAppSecret.asInstanceOf[js.Any])
    if (googleAccToken != null) __obj.updateDynamic("googleAccToken")(googleAccToken.asInstanceOf[js.Any])
    if (googleClientID != null) __obj.updateDynamic("googleClientID")(googleClientID.asInstanceOf[js.Any])
    if (googleClientSecret != null) __obj.updateDynamic("googleClientSecret")(googleClientSecret.asInstanceOf[js.Any])
    if (googlePublicKeyPath != null) __obj.updateDynamic("googlePublicKeyPath")(googlePublicKeyPath.asInstanceOf[js.Any])
    if (googlePublicKeyStrLive != null) __obj.updateDynamic("googlePublicKeyStrLive")(googlePublicKeyStrLive.asInstanceOf[js.Any])
    if (googlePublicKeyStrSandBox != null) __obj.updateDynamic("googlePublicKeyStrSandBox")(googlePublicKeyStrSandBox.asInstanceOf[js.Any])
    if (googleRefToken != null) __obj.updateDynamic("googleRefToken")(googleRefToken.asInstanceOf[js.Any])
    if (googleRefreshToken != null) __obj.updateDynamic("googleRefreshToken")(googleRefreshToken.asInstanceOf[js.Any])
    if (googleServiceAccount != null) __obj.updateDynamic("googleServiceAccount")(googleServiceAccount.asInstanceOf[js.Any])
    if (rokuApiKey != null) __obj.updateDynamic("rokuApiKey")(rokuApiKey.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (!js.isUndefined(test)) __obj.updateDynamic("test")(test.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config_]
  }
}

