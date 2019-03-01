package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ionic1ServeOptions extends ServeOptions {
  var consolelogs: scala.Boolean
  var livereloadPort: scala.Double
  var notificationPort: scala.Double
  var serverlogs: scala.Boolean
}

object Ionic1ServeOptions {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String],
    address: java.lang.String,
    consolelogs: scala.Boolean,
    devapp: scala.Boolean,
    engine: java.lang.String,
    lab: scala.Boolean,
    labHost: java.lang.String,
    labPort: scala.Double,
    livereload: scala.Boolean,
    livereloadPort: scala.Double,
    notificationPort: scala.Double,
    open: scala.Boolean,
    port: scala.Double,
    proxy: scala.Boolean,
    serverlogs: scala.Boolean,
    browser: java.lang.String = null,
    browserOption: java.lang.String = null,
    externalAddressRequired: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    project: java.lang.String = null
  ): Ionic1ServeOptions = {
    val __obj = js.Dynamic.literal(`--` = `--`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("consolelogs")(consolelogs)
    __obj.updateDynamic("devapp")(devapp)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("lab")(lab)
    __obj.updateDynamic("labHost")(labHost)
    __obj.updateDynamic("labPort")(labPort)
    __obj.updateDynamic("livereload")(livereload)
    __obj.updateDynamic("livereloadPort")(livereloadPort)
    __obj.updateDynamic("notificationPort")(notificationPort)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("proxy")(proxy)
    __obj.updateDynamic("serverlogs")(serverlogs)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption)
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[Ionic1ServeOptions]
  }
}

