package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ionic1ServeOptions extends ServeOptions {
  var consolelogs: Boolean
  var livereloadPort: Double
  var notificationPort: Double
  var serverlogs: Boolean
}

object Ionic1ServeOptions {
  @scala.inline
  def apply(
    `--`: js.Array[String],
    address: String,
    consolelogs: Boolean,
    devapp: Boolean,
    engine: String,
    lab: Boolean,
    labHost: String,
    labPort: Double,
    livereload: Boolean,
    livereloadPort: Double,
    notificationPort: Double,
    open: Boolean,
    port: Double,
    proxy: Boolean,
    serverlogs: Boolean,
    browser: String = null,
    browserOption: String = null,
    externalAddressRequired: js.UndefOr[Boolean] = js.undefined,
    platform: String = null,
    project: String = null,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Ionic1ServeOptions = {
    val __obj = js.Dynamic.literal(address = address, consolelogs = consolelogs, devapp = devapp, engine = engine, lab = lab, labHost = labHost, labPort = labPort, livereload = livereload, livereloadPort = livereloadPort, notificationPort = notificationPort, open = open, port = port, proxy = proxy, serverlogs = serverlogs)
    __obj.updateDynamic("--")(`--`)
    if (browser != null) __obj.updateDynamic("browser")(browser)
    if (browserOption != null) __obj.updateDynamic("browserOption")(browserOption)
    if (!js.isUndefined(externalAddressRequired)) __obj.updateDynamic("externalAddressRequired")(externalAddressRequired)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (project != null) __obj.updateDynamic("project")(project)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Ionic1ServeOptions]
  }
}

