package typings.ltijs.providerMod

import typings.express.mod.Express
import typings.ltijs.anon.Cert
import typings.ltijs.anon.SameSite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProviderOptions extends js.Object {
  var appUrl: js.UndefOr[String] = js.undefined
  var cookies: js.UndefOr[SameSite] = js.undefined
  var cors: js.UndefOr[Boolean] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  var invalidTokenUrl: js.UndefOr[String] = js.undefined
  var keysetUrl: js.UndefOr[String] = js.undefined
  var logger: js.UndefOr[Boolean] = js.undefined
  var loginUrl: js.UndefOr[String] = js.undefined
  var serverAddon: js.UndefOr[ServerAddonFunction] = js.undefined
  var sessionTimeoutUrl: js.UndefOr[String] = js.undefined
  var ssl: js.UndefOr[Cert] = js.undefined
  var staticPath: js.UndefOr[String] = js.undefined
}

object ProviderOptions {
  @scala.inline
  def apply(
    appUrl: String = null,
    cookies: SameSite = null,
    cors: js.UndefOr[Boolean] = js.undefined,
    https: js.UndefOr[Boolean] = js.undefined,
    invalidTokenUrl: String = null,
    keysetUrl: String = null,
    logger: js.UndefOr[Boolean] = js.undefined,
    loginUrl: String = null,
    serverAddon: /* app */ Express => Unit = null,
    sessionTimeoutUrl: String = null,
    ssl: Cert = null,
    staticPath: String = null
  ): ProviderOptions = {
    val __obj = js.Dynamic.literal()
    if (appUrl != null) __obj.updateDynamic("appUrl")(appUrl.asInstanceOf[js.Any])
    if (cookies != null) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    if (invalidTokenUrl != null) __obj.updateDynamic("invalidTokenUrl")(invalidTokenUrl.asInstanceOf[js.Any])
    if (keysetUrl != null) __obj.updateDynamic("keysetUrl")(keysetUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(logger)) __obj.updateDynamic("logger")(logger.get.asInstanceOf[js.Any])
    if (loginUrl != null) __obj.updateDynamic("loginUrl")(loginUrl.asInstanceOf[js.Any])
    if (serverAddon != null) __obj.updateDynamic("serverAddon")(js.Any.fromFunction1(serverAddon))
    if (sessionTimeoutUrl != null) __obj.updateDynamic("sessionTimeoutUrl")(sessionTimeoutUrl.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl.asInstanceOf[js.Any])
    if (staticPath != null) __obj.updateDynamic("staticPath")(staticPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderOptions]
  }
}

