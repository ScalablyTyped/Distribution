package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactServeOptions extends ServeOptions {
  var ci: js.UndefOr[scala.Boolean] = js.undefined
  var https: js.UndefOr[scala.Boolean] = js.undefined
  var reactEditor: js.UndefOr[java.lang.String] = js.undefined
}

object ReactServeOptions {
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
    ci: js.UndefOr[scala.Boolean] = js.undefined,
    externalAddressRequired: js.UndefOr[scala.Boolean] = js.undefined,
    https: js.UndefOr[scala.Boolean] = js.undefined,
    platform: java.lang.String = null,
    project: java.lang.String = null,
    reactEditor: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
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

