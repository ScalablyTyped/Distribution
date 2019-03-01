package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeOptions extends js.Object {
  var `--`: js.Array[java.lang.String]
  var address: java.lang.String
  var browser: js.UndefOr[java.lang.String] = js.undefined
  var browserOption: js.UndefOr[java.lang.String] = js.undefined
  var devapp: scala.Boolean
  var engine: java.lang.String
  var externalAddressRequired: js.UndefOr[scala.Boolean] = js.undefined
  var lab: scala.Boolean
  var labHost: java.lang.String
  var labPort: scala.Double
  var livereload: scala.Boolean
  var open: scala.Boolean
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var project: js.UndefOr[java.lang.String] = js.undefined
  var proxy: scala.Boolean
}

object ServeOptions {
  @scala.inline
  def apply(
    `--`: js.Array[java.lang.String],
    address: java.lang.String,
    devapp: scala.Boolean,
    engine: java.lang.String,
    lab: scala.Boolean,
    labHost: java.lang.String,
    labPort: scala.Double,
    livereload: scala.Boolean,
    open: scala.Boolean,
    port: scala.Double,
    proxy: scala.Boolean,
    browser: java.lang.String = null,
    browserOption: java.lang.String = null,
    externalAddressRequired: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    project: java.lang.String = null
  ): ServeOptions = {
    val __obj = js.Dynamic.literal(`--` = `--`)
    __obj.updateDynamic("address")(address)
    __obj.updateDynamic("devapp")(devapp)
    __obj.updateDynamic("engine")(engine)
    __obj.updateDynamic("lab")(lab)
    __obj.updateDynamic("labHost")(labHost)
    __obj.updateDynamic("labPort")(labPort)
    __obj.updateDynamic("livereload")(livereload)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("port")(port)
    __obj.updateDynamic("proxy")(proxy)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption)
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    __obj.asInstanceOf[ServeOptions]
  }
}

