package typings.jestReporters

import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jest/reporters/build/generateEmptyCoverage", JSImport.Namespace)
@js.native
object generateEmptyCoverageMod extends js.Object {
  
  def default(source: String, filename: Path, globalConfig: GlobalConfig, config: ProjectConfig): CoverageWorkerResult | Null = js.native
  def default(
    source: String,
    filename: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    changedFiles: js.UndefOr[scala.Nothing],
    sourcesRelatedToTestsInChangedFiles: Set[Path]
  ): CoverageWorkerResult | Null = js.native
  def default(
    source: String,
    filename: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    changedFiles: Set[Path]
  ): CoverageWorkerResult | Null = js.native
  def default(
    source: String,
    filename: Path,
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    changedFiles: Set[Path],
    sourcesRelatedToTestsInChangedFiles: Set[Path]
  ): CoverageWorkerResult | Null = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestReporters.anon.Coverage
    - typings.jestReporters.anon.Kind
  */
  trait CoverageWorkerResult extends js.Object
  
  type SingleV8Coverage = /* import warning: importer.ImportType#apply Failed type conversion: collect-v8-coverage.collect-v8-coverage.V8Coverage[number] */ js.Any
}
