package typings.jsreportCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<jsreport-core.jsreport-core.Configuration> */
trait PartialConfiguration extends js.Object {
  var autoTempCleanup: js.UndefOr[Boolean] = js.undefined
  var dataDirectory: js.UndefOr[String] = js.undefined
  var extensionsLocationCache: js.UndefOr[Boolean] = js.undefined
  var loadConfig: js.UndefOr[Boolean] = js.undefined
  var logger: js.UndefOr[AnonSilent] = js.undefined
  var rootDirectory: js.UndefOr[String] = js.undefined
  var scripts: js.UndefOr[AnonAllowedModules] = js.undefined
  var tasks: js.UndefOr[PartialallowedModulesArra] = js.undefined
  var tempDirectory: js.UndefOr[String] = js.undefined
}

object PartialConfiguration {
  @scala.inline
  def apply(
    autoTempCleanup: js.UndefOr[Boolean] = js.undefined,
    dataDirectory: String = null,
    extensionsLocationCache: js.UndefOr[Boolean] = js.undefined,
    loadConfig: js.UndefOr[Boolean] = js.undefined,
    logger: AnonSilent = null,
    rootDirectory: String = null,
    scripts: AnonAllowedModules = null,
    tasks: PartialallowedModulesArra = null,
    tempDirectory: String = null
  ): PartialConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoTempCleanup)) __obj.updateDynamic("autoTempCleanup")(autoTempCleanup.asInstanceOf[js.Any])
    if (dataDirectory != null) __obj.updateDynamic("dataDirectory")(dataDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(extensionsLocationCache)) __obj.updateDynamic("extensionsLocationCache")(extensionsLocationCache.asInstanceOf[js.Any])
    if (!js.isUndefined(loadConfig)) __obj.updateDynamic("loadConfig")(loadConfig.asInstanceOf[js.Any])
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (rootDirectory != null) __obj.updateDynamic("rootDirectory")(rootDirectory.asInstanceOf[js.Any])
    if (scripts != null) __obj.updateDynamic("scripts")(scripts.asInstanceOf[js.Any])
    if (tasks != null) __obj.updateDynamic("tasks")(tasks.asInstanceOf[js.Any])
    if (tempDirectory != null) __obj.updateDynamic("tempDirectory")(tempDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfiguration]
  }
}

