package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularServeOptions extends ServeOptions {
  var configuration: js.UndefOr[java.lang.String] = js.undefined
  var consolelogs: js.UndefOr[scala.Boolean] = js.undefined
  var consolelogsPort: js.UndefOr[scala.Double] = js.undefined
  var sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
  var ssl: js.UndefOr[scala.Boolean] = js.undefined
}

object AngularServeOptions {
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
    configuration: java.lang.String = null,
    consolelogs: js.UndefOr[scala.Boolean] = js.undefined,
    consolelogsPort: scala.Int | scala.Double = null,
    externalAddressRequired: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    project: java.lang.String = null,
    sourcemaps: js.UndefOr[scala.Boolean] = js.undefined,
    ssl: js.UndefOr[scala.Boolean] = js.undefined
  ): AngularServeOptions = {
    val __obj = js.Dynamic.literal(address = address, devapp = devapp, engine = engine, lab = lab, labHost = labHost, labPort = labPort, livereload = livereload, open = open, port = port, proxy = proxy)
    __obj.updateDynamic("--")(`--`)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption)
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (!js.isUndefined(consolelogs)) __obj.updateDynamic("consolelogs")(consolelogs)
    if (consolelogsPort != null) __obj.updateDynamic("consolelogsPort")(consolelogsPort.asInstanceOf[js.Any])
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps)
    if (!js.isUndefined(ssl)) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[AngularServeOptions]
  }
}

