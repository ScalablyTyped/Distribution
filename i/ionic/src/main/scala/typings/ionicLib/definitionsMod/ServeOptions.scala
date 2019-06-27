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
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
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
    project: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined
  ): ServeOptions = {
    val __obj = js.Dynamic.literal(address = address, devapp = devapp, engine = engine, lab = lab, labHost = labHost, labPort = labPort, livereload = livereload, open = open, port = port, proxy = proxy)
    __obj.updateDynamic("--")(`--`)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption)
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[ServeOptions]
  }
}

