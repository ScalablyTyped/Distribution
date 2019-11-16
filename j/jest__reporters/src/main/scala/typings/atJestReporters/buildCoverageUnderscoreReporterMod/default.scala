package typings.atJestReporters.buildCoverageUnderscoreReporterMod

import typings.atJestReporters.buildTypesMod.Context
import typings.atJestReporters.buildTypesMod.CoverageReporterOptions
import typings.atJestReporters.buildTypesMod.ReporterOnStartOptions
import typings.atJestReporters.buildTypesMod.Test
import typings.atJestTestDashResult.buildTypesMod.AggregatedResult
import typings.atJestTestDashResult.buildTypesMod.TestResult
import typings.atJestTypes.buildConfigMod.GlobalConfig
import typings.istanbulDashLibDashCoverage.istanbulDashLibDashCoverageMod.CoverageMap
import typings.std.Error
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jest/reporters/build/coverage_reporter", JSImport.Default)
@js.native
class default protected () extends CoverageReporter {
  def this(globalConfig: GlobalConfig) = this()
  def this(globalConfig: GlobalConfig, options: CoverageReporterOptions) = this()
  /* CompleteClass */
  override var _addUntestedFiles: js.Any = js.native
  /* CompleteClass */
  override var _checkThreshold: js.Any = js.native
  /* CompleteClass */
  override var _coverageMap: js.Any = js.native
  /* CompleteClass */
  override var _globalConfig: js.Any = js.native
  /* CompleteClass */
  override var _options: js.Any = js.native
  /* CompleteClass */
  override var _sourceMapStore: js.Any = js.native
  /* CompleteClass */
  /* protected */ override def _setError(error: Error): Unit = js.native
  /* CompleteClass */
  override def getCoverageMap(): CoverageMap = js.native
  /* CompleteClass */
  override def getLastError(): Error | Unit = js.native
  /* CompleteClass */
  override def log(message: String): Unit = js.native
  /* CompleteClass */
  override def onRunComplete(contexts: Set[Context], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestResult(test: Test, testResult: TestResult, aggregatedResult: AggregatedResult): js.Promise[Unit] | Unit = js.native
  /* CompleteClass */
  override def onTestStart(test: Test): js.Promise[Unit] | Unit = js.native
}

