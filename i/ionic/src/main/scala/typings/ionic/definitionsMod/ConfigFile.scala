package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  var `features.ssl-commands`: js.UndefOr[Boolean] = js.undefined
  var `git.host`: js.UndefOr[String] = js.undefined
  var `git.port`: js.UndefOr[Double] = js.undefined
  var `git.setup`: js.UndefOr[Boolean] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  var npmClient: NpmClient
  var `org.id`: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var `ssl.cafile`: js.UndefOr[String | js.Array[String]] = js.undefined
  var `ssl.certfile`: js.UndefOr[String | js.Array[String]] = js.undefined
  var `ssl.keyfile`: js.UndefOr[String | js.Array[String]] = js.undefined
  var telemetry: Boolean
  var `tokens.telemetry`: js.UndefOr[String] = js.undefined
  var `tokens.user`: js.UndefOr[String] = js.undefined
  var `urls.api`: js.UndefOr[String] = js.undefined
  var `urls.dash`: js.UndefOr[String] = js.undefined
  var `user.email`: js.UndefOr[String] = js.undefined
  var `user.id`: js.UndefOr[Double] = js.undefined
  var version: String
}

object ConfigFile {
  @scala.inline
  def apply(
    npmClient: NpmClient,
    telemetry: Boolean,
    version: String,
    `features.ssl-commands`: js.UndefOr[Boolean] = js.undefined,
    `git.host`: String = null,
    `git.port`: Int | Double = null,
    `git.setup`: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    `org.id`: String = null,
    proxy: String = null,
    `ssl.cafile`: String | js.Array[String] = null,
    `ssl.certfile`: String | js.Array[String] = null,
    `ssl.keyfile`: String | js.Array[String] = null,
    `tokens.telemetry`: String = null,
    `tokens.user`: String = null,
    `urls.api`: String = null,
    `urls.dash`: String = null,
    `user.email`: String = null,
    `user.id`: Int | Double = null
  ): ConfigFile = {
    val __obj = js.Dynamic.literal(npmClient = npmClient.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(`features.ssl-commands`)) __obj.updateDynamic("features.ssl-commands")(`features.ssl-commands`.asInstanceOf[js.Any])
    if (`git.host` != null) __obj.updateDynamic("git.host")(`git.host`.asInstanceOf[js.Any])
    if (`git.port` != null) __obj.updateDynamic("git.port")(`git.port`.asInstanceOf[js.Any])
    if (!js.isUndefined(`git.setup`)) __obj.updateDynamic("git.setup")(`git.setup`.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.asInstanceOf[js.Any])
    if (`org.id` != null) __obj.updateDynamic("org.id")(`org.id`.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (`ssl.cafile` != null) __obj.updateDynamic("ssl.cafile")(`ssl.cafile`.asInstanceOf[js.Any])
    if (`ssl.certfile` != null) __obj.updateDynamic("ssl.certfile")(`ssl.certfile`.asInstanceOf[js.Any])
    if (`ssl.keyfile` != null) __obj.updateDynamic("ssl.keyfile")(`ssl.keyfile`.asInstanceOf[js.Any])
    if (`tokens.telemetry` != null) __obj.updateDynamic("tokens.telemetry")(`tokens.telemetry`.asInstanceOf[js.Any])
    if (`tokens.user` != null) __obj.updateDynamic("tokens.user")(`tokens.user`.asInstanceOf[js.Any])
    if (`urls.api` != null) __obj.updateDynamic("urls.api")(`urls.api`.asInstanceOf[js.Any])
    if (`urls.dash` != null) __obj.updateDynamic("urls.dash")(`urls.dash`.asInstanceOf[js.Any])
    if (`user.email` != null) __obj.updateDynamic("user.email")(`user.email`.asInstanceOf[js.Any])
    if (`user.id` != null) __obj.updateDynamic("user.id")(`user.id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
}

