package typings.hapiLab.mod.script

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cli extends js.Object {
  /**
    * Specifies an assertion library module path to require and make available under Lab.assertions as well as use for enhanced reporting.
    */
  val assert: js.UndefOr[String] = js.native
  /**
    * Forces the process to exist with a non zero exit code on the first test failure.
    * 
    * @default false
    */
  val bail: js.UndefOr[Boolean] = js.native
  /**
    * Enables color output.
    * 
    * @default terminal capabilities.
    */
  val colors: js.UndefOr[Boolean] = js.native
  /**
    * Sets a timeout value for before, after, beforeEach, afterEach in milliseconds.
    * 
    * @default 0
    */
  val `context-timeout`: js.UndefOr[Double] = js.native
  /**
    * Enable code coverage analysis
    * 
    * @default false
    */
  val coverage: js.UndefOr[Boolean] = js.native
  /**
    * Includes all files in coveragePath in report.
    * 
    * @default false
    */
  val `coverage-all`: js.UndefOr[Boolean] = js.native
  /**
    * Set code coverage excludes (an array of path strings).
    */
  val `coverage-exclude`: js.UndefOr[js.Array[String]] = js.native
  /**
    * Prevents recursive inclusion of all files in coveragePath in report.
    * 
    * @default false
    */
  val `coverage-flat`: js.UndefOr[Boolean] = js.native
  /**
    * Enables coverage on external modules.
    */
  val `coverage-module`: js.UndefOr[js.Array[String]] = js.native
  /**
    * Sets code coverage path.
    */
  val `coverage-path`: js.UndefOr[String] = js.native
  /**
    * File pattern to use for locating files for coverage.
    */
  val coveragePattern: js.UndefOr[RegExp] = js.native
  /**
    * Minimum plan threshold to apply to all tests that don't define any plan.
    */
  val `default-plan-threshold`: js.UndefOr[Double] = js.native
  /**
    * Skip all tests (dry run).
    * 
    * @default: false
    */
  val dry: js.UndefOr[Boolean] = js.native
  /**
    * Value to set NODE_ENV before tests.
    * 
    * @default: 'test'
    */
  val environment: js.UndefOr[String] = js.native
  /**
    * Prevent recursive collection of tests within the provided path.
    * 
    * @default false
    */
  val flat: js.UndefOr[Boolean] = js.native
  /**
    * Sets a list of globals to ignore for the leak detection (comma separated).
    */
  val globals: js.UndefOr[js.Array[String]] = js.native
  /**
    * Only run tests matching the given pattern which is internally compiled to a RegExp.
    */
  val grep: js.UndefOr[String] = js.native
  /**
    * Range of test ids to execute.
    */
  val id: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Sets lab to start with the node.js native debugger.
    * 
    * @default false
    */
  val inspect: js.UndefOr[Boolean] = js.native
  /**
    * Sets global variable leaks detection.
    * 
    * @default true
    */
  val leaks: js.UndefOr[Boolean] = js.native
  /**
    * Enables code lint.
    * 
    * @default false
    */
  val lint: js.UndefOr[Boolean] = js.native
  /**
    * Linter errors threshold in absolute value.
    * 
    * @default 0
    */
  val `lint-errors-threshold`: Double = js.native
  /**
    * Apply any fixes from the linter.
    * 
    * @default false
    */
  val `lint-fix`: js.UndefOr[Boolean] = js.native
  /**
    * Options to pass to linting program. It must be a string that is JSON.parse(able).
    */
  val `lint-options`: js.UndefOr[String] = js.native
  /**
    * Linter warnings threshold in absolute value.
    * 
    * @default 0
    */
  val `lint-warnings-threshold`: Double = js.native
  /**
    * Linter path.
    * 
    * @default 'eslint'
    */
  val linter: js.UndefOr[String] = js.native
  /**
    * File path to write test results. When set to an array, the array size must match the reporter option array.
    * 
    * @default stdout
    */
  val output: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * File paths to load tests from.
    * 
    * @default ['test']
    */
  val path: js.UndefOr[js.Array[String]] = js.native
  /**
    * File pattern to use for locating tests (must include file extensions).
    */
  val pattern: js.UndefOr[RegExp] = js.native
  /**
    * Sets output verbosity (0: none, 1: normal, 2: verbose).
    *
    * @default 1
    */
  val progress: js.UndefOr[Double] = js.native
  /**
    * Reporter type. One of: 'console', 'html', 'json', 'tap', 'lcov', 'clover', 'junit'.
    * 
    * @default 'console'
    */
  val reporter: js.UndefOr[String | js.Array[String]] = js.native
  /**
    * Number of times to retry failing tests (marked explicitly for retry).
    * 
    * @default 5
    */
  val retries: js.UndefOr[Double] = js.native
  /**
    * Random number seed when shuffle is enabled.
    */
  val seed: js.UndefOr[String] = js.native
  /**
    * Shuffle script execution order.
    * 
    * @default false
    */
  val shuffle: Boolean = js.native
  /**
    * Silence skipped tests.
    *
    * @default false
    */
  val `silent-skips`: js.UndefOr[Boolean] = js.native
  /**
    * Enable support for sourcemaps.
    *
    * @default false
    */
  val sourcemaps: js.UndefOr[Boolean] = js.native
  /**
    * Code coverage threshold percentage.
    */
  val threshold: js.UndefOr[Double] = js.native
  /**
    * Timeout for each test in milliseconds.
    * 
    * @default 2000
    */
  val timeout: js.UndefOr[Double] = js.native
  /**
    * Transformers for non-js file types.
    */
  val transform: js.UndefOr[js.Array[Transformer]] = js.native
  /**
    * Test types definitions.
    *
    * @default false
    */
  val types: js.UndefOr[Boolean] = js.native
  /**
    * Location of types definitions test file.
    */
  val `types-test`: js.UndefOr[String] = js.native
}

object Cli {
  @scala.inline
  def apply(`lint-errors-threshold`: Double, `lint-warnings-threshold`: Double, shuffle: Boolean): Cli = {
    val __obj = js.Dynamic.literal(shuffle = shuffle.asInstanceOf[js.Any])
    __obj.updateDynamic("lint-errors-threshold")(`lint-errors-threshold`.asInstanceOf[js.Any])
    __obj.updateDynamic("lint-warnings-threshold")(`lint-warnings-threshold`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cli]
  }
  @scala.inline
  implicit class CliOps[Self <: Cli] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setLint-errors-threshold`(value: Double): Self = this.set("lint-errors-threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLint-warnings-threshold`(value: Double): Self = this.set("lint-warnings-threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssert(value: String): Self = this.set("assert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssert: Self = this.set("assert", js.undefined)
    @scala.inline
    def setBail(value: Boolean): Self = this.set("bail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBail: Self = this.set("bail", js.undefined)
    @scala.inline
    def setColors(value: Boolean): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def `setContext-timeout`(value: Double): Self = this.set("context-timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContext-timeout`: Self = this.set("context-timeout", js.undefined)
    @scala.inline
    def setCoverage(value: Boolean): Self = this.set("coverage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoverage: Self = this.set("coverage", js.undefined)
    @scala.inline
    def `setCoverage-all`(value: Boolean): Self = this.set("coverage-all", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCoverage-all`: Self = this.set("coverage-all", js.undefined)
    @scala.inline
    def `setCoverage-excludeVarargs`(value: String*): Self = this.set("coverage-exclude", js.Array(value :_*))
    @scala.inline
    def `setCoverage-exclude`(value: js.Array[String]): Self = this.set("coverage-exclude", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCoverage-exclude`: Self = this.set("coverage-exclude", js.undefined)
    @scala.inline
    def `setCoverage-flat`(value: Boolean): Self = this.set("coverage-flat", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCoverage-flat`: Self = this.set("coverage-flat", js.undefined)
    @scala.inline
    def `setCoverage-moduleVarargs`(value: String*): Self = this.set("coverage-module", js.Array(value :_*))
    @scala.inline
    def `setCoverage-module`(value: js.Array[String]): Self = this.set("coverage-module", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCoverage-module`: Self = this.set("coverage-module", js.undefined)
    @scala.inline
    def `setCoverage-path`(value: String): Self = this.set("coverage-path", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCoverage-path`: Self = this.set("coverage-path", js.undefined)
    @scala.inline
    def setCoveragePattern(value: RegExp): Self = this.set("coveragePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoveragePattern: Self = this.set("coveragePattern", js.undefined)
    @scala.inline
    def `setDefault-plan-threshold`(value: Double): Self = this.set("default-plan-threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteDefault-plan-threshold`: Self = this.set("default-plan-threshold", js.undefined)
    @scala.inline
    def setDry(value: Boolean): Self = this.set("dry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDry: Self = this.set("dry", js.undefined)
    @scala.inline
    def setEnvironment(value: String): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setGlobalsVarargs(value: String*): Self = this.set("globals", js.Array(value :_*))
    @scala.inline
    def setGlobals(value: js.Array[String]): Self = this.set("globals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobals: Self = this.set("globals", js.undefined)
    @scala.inline
    def setGrep(value: String): Self = this.set("grep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrep: Self = this.set("grep", js.undefined)
    @scala.inline
    def setIdVarargs(value: Double*): Self = this.set("id", js.Array(value :_*))
    @scala.inline
    def setId(value: js.Array[Double]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setInspect(value: Boolean): Self = this.set("inspect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInspect: Self = this.set("inspect", js.undefined)
    @scala.inline
    def setLeaks(value: Boolean): Self = this.set("leaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaks: Self = this.set("leaks", js.undefined)
    @scala.inline
    def setLint(value: Boolean): Self = this.set("lint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLint: Self = this.set("lint", js.undefined)
    @scala.inline
    def `setLint-fix`(value: Boolean): Self = this.set("lint-fix", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLint-fix`: Self = this.set("lint-fix", js.undefined)
    @scala.inline
    def `setLint-options`(value: String): Self = this.set("lint-options", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteLint-options`: Self = this.set("lint-options", js.undefined)
    @scala.inline
    def setLinter(value: String): Self = this.set("linter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinter: Self = this.set("linter", js.undefined)
    @scala.inline
    def setOutputVarargs(value: String*): Self = this.set("output", js.Array(value :_*))
    @scala.inline
    def setOutput(value: String | js.Array[String]): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPattern(value: RegExp): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setReporterVarargs(value: String*): Self = this.set("reporter", js.Array(value :_*))
    @scala.inline
    def setReporter(value: String | js.Array[String]): Self = this.set("reporter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReporter: Self = this.set("reporter", js.undefined)
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    @scala.inline
    def setSeed(value: String): Self = this.set("seed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    @scala.inline
    def `setSilent-skips`(value: Boolean): Self = this.set("silent-skips", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteSilent-skips`: Self = this.set("silent-skips", js.undefined)
    @scala.inline
    def setSourcemaps(value: Boolean): Self = this.set("sourcemaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourcemaps: Self = this.set("sourcemaps", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTransformVarargs(value: Transformer*): Self = this.set("transform", js.Array(value :_*))
    @scala.inline
    def setTransform(value: js.Array[Transformer]): Self = this.set("transform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTypes(value: Boolean): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
    @scala.inline
    def `setTypes-test`(value: String): Self = this.set("types-test", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteTypes-test`: Self = this.set("types-test", js.undefined)
  }
  
}

