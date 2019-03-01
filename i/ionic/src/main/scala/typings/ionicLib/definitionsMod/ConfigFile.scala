package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  var `features.ssl-commands`: js.UndefOr[scala.Boolean] = js.undefined
  var `git.host`: js.UndefOr[java.lang.String] = js.undefined
  var `git.port`: js.UndefOr[scala.Double] = js.undefined
  var `git.setup`: js.UndefOr[scala.Boolean] = js.undefined
  var interactive: js.UndefOr[scala.Boolean] = js.undefined
  var npmClient: NpmClient
  var `org.id`: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var `ssl.cafile`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `ssl.certfile`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var `ssl.keyfile`: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var telemetry: scala.Boolean
  var `tokens.telemetry`: js.UndefOr[java.lang.String] = js.undefined
  var `tokens.user`: js.UndefOr[java.lang.String] = js.undefined
  var `urls.api`: js.UndefOr[java.lang.String] = js.undefined
  var `urls.dash`: js.UndefOr[java.lang.String] = js.undefined
  var `user.email`: js.UndefOr[java.lang.String] = js.undefined
  var `user.id`: js.UndefOr[scala.Double] = js.undefined
  var version: java.lang.String
}

object ConfigFile {
  @scala.inline
  def apply(
    npmClient: NpmClient,
    telemetry: scala.Boolean,
    version: java.lang.String,
    `features.ssl-commands`: js.UndefOr[scala.Boolean] = js.undefined,
    `git.host`: java.lang.String = null,
    `git.port`: scala.Int | scala.Double = null,
    `git.setup`: js.UndefOr[scala.Boolean] = js.undefined,
    interactive: js.UndefOr[scala.Boolean] = js.undefined,
    `org.id`: java.lang.String = null,
    proxy: java.lang.String = null,
    `ssl.cafile`: java.lang.String | js.Array[java.lang.String] = null,
    `ssl.certfile`: java.lang.String | js.Array[java.lang.String] = null,
    `ssl.keyfile`: java.lang.String | js.Array[java.lang.String] = null,
    `tokens.telemetry`: java.lang.String = null,
    `tokens.user`: java.lang.String = null,
    `urls.api`: java.lang.String = null,
    `urls.dash`: java.lang.String = null,
    `user.email`: java.lang.String = null,
    `user.id`: scala.Int | scala.Double = null
  ): ConfigFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("npmClient")(npmClient)
    __obj.updateDynamic("telemetry")(telemetry)
    __obj.updateDynamic("version")(version)
    if (!js.isUndefined(`features.ssl-commands`)) __obj.updateDynamic("features.ssl-commands")(`features.ssl-commands`)
    if (`git.host` != null) __obj.updateDynamic("git.host")(`git.host`)
    if (`git.port` != null) __obj.updateDynamic("git.port")(`git.port`.asInstanceOf[js.Any])
    if (!js.isUndefined(`git.setup`)) __obj.updateDynamic("git.setup")(`git.setup`)
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive)
    if (`org.id` != null) __obj.updateDynamic("org.id")(`org.id`)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (`ssl.cafile` != null) __obj.updateDynamic("ssl.cafile")(`ssl.cafile`.asInstanceOf[js.Any])
    if (`ssl.certfile` != null) __obj.updateDynamic("ssl.certfile")(`ssl.certfile`.asInstanceOf[js.Any])
    if (`ssl.keyfile` != null) __obj.updateDynamic("ssl.keyfile")(`ssl.keyfile`.asInstanceOf[js.Any])
    if (`tokens.telemetry` != null) __obj.updateDynamic("tokens.telemetry")(`tokens.telemetry`)
    if (`tokens.user` != null) __obj.updateDynamic("tokens.user")(`tokens.user`)
    if (`urls.api` != null) __obj.updateDynamic("urls.api")(`urls.api`)
    if (`urls.dash` != null) __obj.updateDynamic("urls.dash")(`urls.dash`)
    if (`user.email` != null) __obj.updateDynamic("user.email")(`user.email`)
    if (`user.id` != null) __obj.updateDynamic("user.id")(`user.id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
}

