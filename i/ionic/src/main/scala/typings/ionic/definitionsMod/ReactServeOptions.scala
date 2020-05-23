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
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], devapp = devapp.asInstanceOf[js.Any], engine = engine.asInstanceOf[js.Any], lab = lab.asInstanceOf[js.Any], labHost = labHost.asInstanceOf[js.Any], labPort = labPort.asInstanceOf[js.Any], livereload = livereload.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    if (browser != null) __obj.updateDynamic("browser")(browser.asInstanceOf[js.Any])
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption.asInstanceOf[js.Any])
    if (!js.isUndefined(ci)) __obj.updateDynamic("ci")(ci.get.asInstanceOf[js.Any])
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired.get.asInstanceOf[js.Any])
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.get.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (reactEditor != null) __obj.updateDynamic("reactEditor")(reactEditor.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactServeOptions]
  }
}

