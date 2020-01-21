package typings.hapiLab.mod.script

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cli extends js.Object {
  /**
    * Specifies an assertion library module path to require and make available under Lab.assertions as well as use for enhanced reporting.
    */
  val assert: js.UndefOr[String] = js.undefined
  /**
    * Forces the process to exist with a non zero exit code on the first test failure.
    * 
    * @default false
    */
  val bail: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables color output.
    * 
    * @default terminal capabilities.
    */
  val colors: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets a timeout value for before, after, beforeEach, afterEach in milliseconds.
    * 
    * @default 0
    */
  val `context-timeout`: js.UndefOr[Double] = js.undefined
  /**
    * Enable code coverage analysis
    * 
    * @default false
    */
  val coverage: js.UndefOr[Boolean] = js.undefined
  /**
    * Includes all files in coveragePath in report.
    * 
    * @default false
    */
  val `coverage-all`: js.UndefOr[Boolean] = js.undefined
  /**
    * Set code coverage excludes (an array of path strings).
    */
  val `coverage-exclude`: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Prevents recursive inclusion of all files in coveragePath in report.
    * 
    * @default false
    */
  val `coverage-flat`: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables coverage on external modules.
    */
  val `coverage-module`: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Sets code coverage path.
    */
  val `coverage-path`: js.UndefOr[String] = js.undefined
  /**
    * File pattern to use for locating files for coverage.
    */
  val coveragePattern: js.UndefOr[RegExp] = js.undefined
  /**
    * Minimum plan threshold to apply to all tests that don't define any plan.
    */
  val `default-plan-threshold`: js.UndefOr[Double] = js.undefined
  /**
    * Skip all tests (dry run).
    * 
    * @default: false
    */
  val dry: js.UndefOr[Boolean] = js.undefined
  /**
    * Value to set NODE_ENV before tests.
    * 
    * @default: 'test'
    */
  val environment: js.UndefOr[String] = js.undefined
  /**
    * Prevent recursive collection of tests within the provided path.
    * 
    * @default false
    */
  val flat: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets a list of globals to ignore for the leak detection (comma separated).
    */
  val globals: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Only run tests matching the given pattern which is internally compiled to a RegExp.
    */
  val grep: js.UndefOr[String] = js.undefined
  /**
    * Range of test ids to execute.
    */
  val id: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Sets lab to start with the node.js native debugger.
    * 
    * @default false
    */
  val inspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets global variable leaks detection.
    * 
    * @default true
    */
  val leaks: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables code lint.
    * 
    * @default false
    */
  val lint: js.UndefOr[Boolean] = js.undefined
  /**
    * Linter errors threshold in absolute value.
    * 
    * @default 0
    */
  val `lint-errors-threshold`: Double
  /**
    * Apply any fixes from the linter.
    * 
    * @default false
    */
  val `lint-fix`: js.UndefOr[Boolean] = js.undefined
  /**
    * Options to pass to linting program. It must be a string that is JSON.parse(able).
    */
  val `lint-options`: js.UndefOr[String] = js.undefined
  /**
    * Linter warnings threshold in absolute value.
    * 
    * @default 0
    */
  val `lint-warnings-threshold`: Double
  /**
    * Linter path.
    * 
    * @default 'eslint'
    */
  val linter: js.UndefOr[String] = js.undefined
  /**
    * File path to write test results. When set to an array, the array size must match the reporter option array.
    * 
    * @default stdout
    */
  val output: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * File paths to load tests from.
    * 
    * @default ['test']
    */
  val path: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * File pattern to use for locating tests (must include file extensions).
    */
  val pattern: js.UndefOr[RegExp] = js.undefined
  /**
    * Sets output verbosity (0: none, 1: normal, 2: verbose).
    *
    * @default 1
    */
  val progress: js.UndefOr[Double] = js.undefined
  /**
    * Reporter type. One of: 'console', 'html', 'json', 'tap', 'lcov', 'clover', 'junit'.
    * 
    * @default 'console'
    */
  val reporter: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Number of times to retry failing tests (marked explicitly for retry).
    * 
    * @default 5
    */
  val retries: js.UndefOr[Double] = js.undefined
  /**
    * Random number seed when shuffle is enabled.
    */
  val seed: js.UndefOr[String] = js.undefined
  /**
    * Shuffle script execution order.
    * 
    * @default false
    */
  val shuffle: Boolean
  /**
    * Silence skipped tests.
    *
    * @default false
    */
  val `silent-skips`: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable support for sourcemaps.
    *
    * @default false
    */
  val sourcemaps: js.UndefOr[Boolean] = js.undefined
  /**
    * Code coverage threshold percentage.
    */
  val threshold: js.UndefOr[Double] = js.undefined
  /**
    * Timeout for each test in milliseconds.
    * 
    * @default 2000
    */
  val timeout: js.UndefOr[Double] = js.undefined
  /**
    * Transformers for non-js file types.
    */
  val transform: js.UndefOr[js.Array[Transformer]] = js.undefined
  /**
    * Test types definitions.
    *
    * @default false
    */
  val types: js.UndefOr[Boolean] = js.undefined
  /**
    * Location of types definitions test file.
    */
  val `types-test`: js.UndefOr[String] = js.undefined
}

object Cli {
  @scala.inline
  def apply(
    `lint-errors-threshold`: Double,
    `lint-warnings-threshold`: Double,
    shuffle: Boolean,
    assert: String = null,
    bail: js.UndefOr[Boolean] = js.undefined,
    colors: js.UndefOr[Boolean] = js.undefined,
    `context-timeout`: Int | Double = null,
    coverage: js.UndefOr[Boolean] = js.undefined,
    `coverage-all`: js.UndefOr[Boolean] = js.undefined,
    `coverage-exclude`: js.Array[String] = null,
    `coverage-flat`: js.UndefOr[Boolean] = js.undefined,
    `coverage-module`: js.Array[String] = null,
    `coverage-path`: String = null,
    coveragePattern: RegExp = null,
    `default-plan-threshold`: Int | Double = null,
    dry: js.UndefOr[Boolean] = js.undefined,
    environment: String = null,
    flat: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    grep: String = null,
    id: js.Array[Double] = null,
    inspect: js.UndefOr[Boolean] = js.undefined,
    leaks: js.UndefOr[Boolean] = js.undefined,
    lint: js.UndefOr[Boolean] = js.undefined,
    `lint-fix`: js.UndefOr[Boolean] = js.undefined,
    `lint-options`: String = null,
    linter: String = null,
    output: String | js.Array[String] = null,
    path: js.Array[String] = null,
    pattern: RegExp = null,
    progress: Int | Double = null,
    reporter: String | js.Array[String] = null,
    retries: Int | Double = null,
    seed: String = null,
    `silent-skips`: js.UndefOr[Boolean] = js.undefined,
    sourcemaps: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null,
    timeout: Int | Double = null,
    transform: js.Array[Transformer] = null,
    types: js.UndefOr[Boolean] = js.undefined,
    `types-test`: String = null
  ): Cli = {
    val __obj = js.Dynamic.literal(shuffle = shuffle.asInstanceOf[js.Any])
    __obj.updateDynamic("lint-errors-threshold")(`lint-errors-threshold`.asInstanceOf[js.Any])
    __obj.updateDynamic("lint-warnings-threshold")(`lint-warnings-threshold`.asInstanceOf[js.Any])
    if (assert != null) __obj.updateDynamic("assert")(assert.asInstanceOf[js.Any])
    if (!js.isUndefined(bail)) __obj.updateDynamic("bail")(bail.asInstanceOf[js.Any])
    if (!js.isUndefined(colors)) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (`context-timeout` != null) __obj.updateDynamic("context-timeout")(`context-timeout`.asInstanceOf[js.Any])
    if (!js.isUndefined(coverage)) __obj.updateDynamic("coverage")(coverage.asInstanceOf[js.Any])
    if (!js.isUndefined(`coverage-all`)) __obj.updateDynamic("coverage-all")(`coverage-all`.asInstanceOf[js.Any])
    if (`coverage-exclude` != null) __obj.updateDynamic("coverage-exclude")(`coverage-exclude`.asInstanceOf[js.Any])
    if (!js.isUndefined(`coverage-flat`)) __obj.updateDynamic("coverage-flat")(`coverage-flat`.asInstanceOf[js.Any])
    if (`coverage-module` != null) __obj.updateDynamic("coverage-module")(`coverage-module`.asInstanceOf[js.Any])
    if (`coverage-path` != null) __obj.updateDynamic("coverage-path")(`coverage-path`.asInstanceOf[js.Any])
    if (coveragePattern != null) __obj.updateDynamic("coveragePattern")(coveragePattern.asInstanceOf[js.Any])
    if (`default-plan-threshold` != null) __obj.updateDynamic("default-plan-threshold")(`default-plan-threshold`.asInstanceOf[js.Any])
    if (!js.isUndefined(dry)) __obj.updateDynamic("dry")(dry.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (grep != null) __obj.updateDynamic("grep")(grep.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(inspect)) __obj.updateDynamic("inspect")(inspect.asInstanceOf[js.Any])
    if (!js.isUndefined(leaks)) __obj.updateDynamic("leaks")(leaks.asInstanceOf[js.Any])
    if (!js.isUndefined(lint)) __obj.updateDynamic("lint")(lint.asInstanceOf[js.Any])
    if (!js.isUndefined(`lint-fix`)) __obj.updateDynamic("lint-fix")(`lint-fix`.asInstanceOf[js.Any])
    if (`lint-options` != null) __obj.updateDynamic("lint-options")(`lint-options`.asInstanceOf[js.Any])
    if (linter != null) __obj.updateDynamic("linter")(linter.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(progress.asInstanceOf[js.Any])
    if (reporter != null) __obj.updateDynamic("reporter")(reporter.asInstanceOf[js.Any])
    if (retries != null) __obj.updateDynamic("retries")(retries.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (!js.isUndefined(`silent-skips`)) __obj.updateDynamic("silent-skips")(`silent-skips`.asInstanceOf[js.Any])
    if (!js.isUndefined(sourcemaps)) __obj.updateDynamic("sourcemaps")(sourcemaps.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (!js.isUndefined(types)) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (`types-test` != null) __obj.updateDynamic("types-test")(`types-test`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cli]
  }
}

