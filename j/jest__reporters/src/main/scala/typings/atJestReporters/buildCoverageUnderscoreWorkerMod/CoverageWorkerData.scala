package typings.atJestReporters.buildCoverageUnderscoreWorkerMod

import typings.atJestReporters.buildTypesMod.CoverageReporterSerializedOptions
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoverageWorkerData extends js.Object {
  var config: ProjectConfig
  var globalConfig: GlobalConfig
  var options: js.UndefOr[CoverageReporterSerializedOptions] = js.undefined
  var path: Path
}

object CoverageWorkerData {
  @scala.inline
  def apply(
    config: ProjectConfig,
    globalConfig: GlobalConfig,
    path: Path,
    options: CoverageReporterSerializedOptions = null
  ): CoverageWorkerData = {
    val __obj = js.Dynamic.literal(config = config, globalConfig = globalConfig, path = path)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[CoverageWorkerData]
  }
}

