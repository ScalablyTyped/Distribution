package typings.honeybadger.honeybadgerMod

import typings.std.Console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureOptions extends js.Object {
  var apiKey: String
  var developmentEnvironments: js.UndefOr[js.Array[String]] = js.undefined
  var endpoint: js.UndefOr[String] = js.undefined
  var environment: js.UndefOr[String] = js.undefined
  var filters: js.UndefOr[js.Array[String]] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var logger: js.UndefOr[Console] = js.undefined
  var projectRoot: js.UndefOr[String] = js.undefined
}

object ConfigureOptions {
  @scala.inline
  def apply(
    apiKey: String,
    developmentEnvironments: js.Array[String] = null,
    endpoint: String = null,
    environment: String = null,
    filters: js.Array[String] = null,
    hostname: String = null,
    logger: Console = null,
    projectRoot: String = null
  ): ConfigureOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
    if (developmentEnvironments != null) __obj.updateDynamic("developmentEnvironments")(developmentEnvironments)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (environment != null) __obj.updateDynamic("environment")(environment)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (logger != null) __obj.updateDynamic("logger")(logger)
    if (projectRoot != null) __obj.updateDynamic("projectRoot")(projectRoot)
    __obj.asInstanceOf[ConfigureOptions]
  }
}

