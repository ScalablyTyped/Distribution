package typings.atJestReporters.buildGenerateEmptyCoverageMod

import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.atJestTypes.buildConfigMod.Path
import typings.atJestTypes.buildConfigMod.ProjectConfig
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/generateEmptyCoverage", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(source: String, filename: Path, globalConfig: GlobalConfig, config: ProjectConfig): CoverageWorkerResult | Null = js.native
  def apply(
    source: String,
    filename: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    changedFiles: Set[Path]
  ): CoverageWorkerResult | Null = js.native
}

