package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServeOptions extends js.Object {
  var `--`: js.Array[String]
  var address: String
  var browser: js.UndefOr[String] = js.undefined
  var browserOption: js.UndefOr[String] = js.undefined
  var devapp: Boolean
  var engine: String
  var externalAddressRequired: js.UndefOr[Boolean] = js.undefined
  var lab: Boolean
  var labHost: String
  var labPort: Double
  var livereload: Boolean
  var open: Boolean
  var platform: js.UndefOr[String] = js.undefined
  var port: Double
  var project: js.UndefOr[String] = js.undefined
  var proxy: Boolean
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object ServeOptions {
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
    externalAddressRequired: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    project: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
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

