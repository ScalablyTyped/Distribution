package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactServeOptions extends ServeOptions {
  var ci: js.UndefOr[Boolean] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  var reactEditor: js.UndefOr[String] = js.undefined
}

object ReactServeOptions {
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
    ci: js.UndefOr[Boolean] = js.undefined,
    externalAddressRequired: js.UndefOr[Boolean] = js.undefined,
    https: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    project: String = null,
    reactEditor: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): ReactServeOptions = {
    val __obj = js.Dynamic.literal(address = address, devapp = devapp, engine = engine, lab = lab, labHost = labHost, labPort = labPort, livereload = livereload, open = open, port = port, proxy = proxy)
    __obj.updateDynamic("--")(`--`)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption)
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci)
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired)
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (reactEditor != null) __obj.updateDynamic("reactEditor")(reactEditor)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ReactServeOptions]
  }
}

