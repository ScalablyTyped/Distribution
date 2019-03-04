package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IonicAngularServeOptions extends ServeOptions {
  var consolelogs: scala.Boolean
  var env: js.UndefOr[java.lang.String] = js.undefined
  var livereloadPort: scala.Double
  var notificationPort: scala.Double
  var serverlogs: scala.Boolean
  var sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
}

object IonicAngularServeOptions {
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
    env: java.lang.String = null,
    externalAddressRequired: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    project: java.lang.String = null,
    sourcemaps: js.UndefOr[scala.Boolean] = js.undefined
  ): IonicAngularServeOptions = {
    val __obj = js.Dynamic.literal(address = address, consolelogs = consolelogs, devapp = devapp, engine = engine, lab = lab, labHost = labHost, labPort = labPort, livereload = livereload, livereloadPort = livereloadPort, notificationPort = notificationPort, open = open, port = port, proxy = proxy, serverlogs = serverlogs)
    __obj.updateDynamic("--")(`--`)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps)
    __obj.asInstanceOf[IonicAngularServeOptions]
  }
}

