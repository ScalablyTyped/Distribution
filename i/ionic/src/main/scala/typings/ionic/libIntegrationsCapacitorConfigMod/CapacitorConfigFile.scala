package typings.ionic.libIntegrationsCapacitorConfigMod

import typings.ionic.Anon_OriginalUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CapacitorConfigFile extends js.Object {
  var appId: js.UndefOr[String] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var server: js.UndefOr[Anon_OriginalUrl] = js.undefined
  var webDir: js.UndefOr[String] = js.undefined
}

object CapacitorConfigFile {
  @scala.inline
  def apply(
    appId: String = null,
    appName: String = null,
    server: Anon_OriginalUrl = null,
    webDir: String = null
  ): CapacitorConfigFile = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (server != null) __obj.updateDynamic("server")(server.asInstanceOf[js.Any])
    if (webDir != null) __obj.updateDynamic("webDir")(webDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapacitorConfigFile]
  }
}

