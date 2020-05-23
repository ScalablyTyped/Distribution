package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  @JSName("features.ssl-commands")
  var `featuresDotssl-commands`: js.UndefOr[Boolean] = js.undefined
  @JSName("git.host")
  var gitDothost: js.UndefOr[String] = js.undefined
  @JSName("git.port")
  var gitDotport: js.UndefOr[Double] = js.undefined
  @JSName("git.setup")
  var gitDotsetup: js.UndefOr[Boolean] = js.undefined
  var interactive: js.UndefOr[Boolean] = js.undefined
  var npmClient: NpmClient
  @JSName("org.id")
  var orgDotid: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  @JSName("ssl.cafile")
  var sslDotcafile: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("ssl.certfile")
  var sslDotcertfile: js.UndefOr[String | js.Array[String]] = js.undefined
  @JSName("ssl.keyfile")
  var sslDotkeyfile: js.UndefOr[String | js.Array[String]] = js.undefined
  var telemetry: Boolean
  @JSName("tokens.telemetry")
  var tokensDottelemetry: js.UndefOr[String] = js.undefined
  @JSName("tokens.user")
  var tokensDotuser: js.UndefOr[String] = js.undefined
  @JSName("urls.api")
  var urlsDotapi: js.UndefOr[String] = js.undefined
  @JSName("urls.dash")
  var urlsDotdash: js.UndefOr[String] = js.undefined
  @JSName("user.email")
  var userDotemail: js.UndefOr[String] = js.undefined
  @JSName("user.id")
  var userDotid: js.UndefOr[Double] = js.undefined
  var version: String
}

object ConfigFile {
  @scala.inline
  def apply(
    npmClient: NpmClient,
    telemetry: Boolean,
    version: String,
    `featuresDotssl-commands`: js.UndefOr[Boolean] = js.undefined,
    gitDothost: String = null,
    gitDotport: js.UndefOr[Double] = js.undefined,
    gitDotsetup: js.UndefOr[Boolean] = js.undefined,
    interactive: js.UndefOr[Boolean] = js.undefined,
    orgDotid: String = null,
    proxy: String = null,
    sslDotcafile: String | js.Array[String] = null,
    sslDotcertfile: String | js.Array[String] = null,
    sslDotkeyfile: String | js.Array[String] = null,
    tokensDottelemetry: String = null,
    tokensDotuser: String = null,
    urlsDotapi: String = null,
    urlsDotdash: String = null,
    userDotemail: String = null,
    userDotid: js.UndefOr[Double] = js.undefined
  ): ConfigFile = {
    val __obj = js.Dynamic.literal(npmClient = npmClient.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (!js.isUndefined(`featuresDotssl-commands`)) __obj.updateDynamic("features.ssl-commands")(`featuresDotssl-commands`.get.asInstanceOf[js.Any])
    if (gitDothost != null) __obj.updateDynamic("git.host")(gitDothost.asInstanceOf[js.Any])
    if (!js.isUndefined(gitDotport)) __obj.updateDynamic("git.port")(gitDotport.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gitDotsetup)) __obj.updateDynamic("git.setup")(gitDotsetup.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interactive)) __obj.updateDynamic("interactive")(interactive.get.asInstanceOf[js.Any])
    if (orgDotid != null) __obj.updateDynamic("org.id")(orgDotid.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (sslDotcafile != null) __obj.updateDynamic("ssl.cafile")(sslDotcafile.asInstanceOf[js.Any])
    if (sslDotcertfile != null) __obj.updateDynamic("ssl.certfile")(sslDotcertfile.asInstanceOf[js.Any])
    if (sslDotkeyfile != null) __obj.updateDynamic("ssl.keyfile")(sslDotkeyfile.asInstanceOf[js.Any])
    if (tokensDottelemetry != null) __obj.updateDynamic("tokens.telemetry")(tokensDottelemetry.asInstanceOf[js.Any])
    if (tokensDotuser != null) __obj.updateDynamic("tokens.user")(tokensDotuser.asInstanceOf[js.Any])
    if (urlsDotapi != null) __obj.updateDynamic("urls.api")(urlsDotapi.asInstanceOf[js.Any])
    if (urlsDotdash != null) __obj.updateDynamic("urls.dash")(urlsDotdash.asInstanceOf[js.Any])
    if (userDotemail != null) __obj.updateDynamic("user.email")(userDotemail.asInstanceOf[js.Any])
    if (!js.isUndefined(userDotid)) __obj.updateDynamic("user.id")(userDotid.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigFile]
  }
}

