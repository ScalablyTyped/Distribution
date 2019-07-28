package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AngularServeOptions extends ServeOptions {
  var configuration: js.UndefOr[String] = js.undefined
  var consolelogs: js.UndefOr[Boolean] = js.undefined
  var consolelogsPort: js.UndefOr[Double] = js.undefined
  var sourcemaps: js.UndefOr[Boolean] = js.undefined
  var ssl: js.UndefOr[Boolean] = js.undefined
}

object AngularServeOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    address: String,
    devapp: Boolean,
    engine: String,
    lab: Boolean,
    labHost: String,
    labPort: Double,
    livereload: Boolean,
    open: Boolean,
    port: Double,
    proxy: Boolean,
    browser: String = null,
    browserOption: String = null,
    configuration: String = null,
    consolelogs: js.UndefOr[Boolean] = js.undefined,
    consolelogsPort: Int | Double = null,
    externalAddressRequired: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    project: String = null,
    sourcemaps: js.UndefOr[Boolean] = js.undefined,
    ssl: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
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
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[AngularServeOptions]
  }
}

