package typings
package gulpDashNunitDashRunnerLib.gulpDashNunitDashRunnerMod.nunitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleRunnerOptions extends js.Object {
   // true|false,
  // [2.x] Apartment for running tests (Default is MTA).
  var apartment: js.UndefOr[java.lang.String] = js.undefined
   // true|false,
  // [2.x] Base path to be used when loading the assemblies.
  var basepath: js.UndefOr[java.lang.String] = js.undefined
   // ['lib', 'bin'],
  // [2.x] Erase any leftover cache files and exit.
  var cleanup: js.UndefOr[scala.Boolean] = js.undefined
   // ['Database', 'Network'],
  // Project configuration (e.g.: Debug) to load.
  var config: js.UndefOr[java.lang.String] = js.undefined
   // true|false,
  // [3.x] Dispose each test runner after it has finished running its tests.
  var `dispose-runners`: js.UndefOr[scala.Boolean] = js.undefined
   // 'Single|Separate|Multiple',
  // AppDomain Usage for tests.
  var domain: js.UndefOr[java.lang.String] = js.undefined
   // 'TestOutput.txt',
  // File to receive test error output.
  var err: js.UndefOr[java.lang.String] = js.undefined
   // ['BaseLine', 'Unit'],
  // List of categories to exclude.
  var exclude: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // 'TestResult.xml',
  // [3.x] Save test info rather than running tests. Name of output file.
  var explore: js.UndefOr[java.lang.String] = js.undefined
   // 'None|Single|Multiple',
  // Framework version to be used for tests.
  var framework: js.UndefOr[java.lang.String] = js.undefined
   // 'TestsToRun.txt',
  // List of categories to include.
  var include: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // true|false,
  // Label each test in stdOut.
  var labels: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // [3.x] Displays console output without color.
  var nocolor: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // [2.x] Do not display progress.
  var nodots: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // [3.x] Suppress display of program information at start of run.
  var noheader: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // [2.x] Do not display the logo.
  var nologo: js.UndefOr[scala.Boolean] = js.undefined
   // 'TestInfo.xml',
  // Suppress XML result output.
  var noresult: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // [2.x] Disable shadow copy when running in separate domain.
  // NOTE In 3.x, The console runner now disables shadow copy by
  // default. use new 'shadowcopy' option in 3.x to turn it on.
  var noshadow: js.UndefOr[scala.Boolean] = js.undefined
   // 'MTA|STA',
  // [2.x] Disable use of a separate thread for tests.
  var nothread: js.UndefOr[scala.Boolean] = js.undefined
   // 'BuildArtifacts',
  // File to receive test output.
  var output: js.UndefOr[java.lang.String] = js.undefined
   // true|false,
  // [3.x] Pause before run to allow debugging.
  var pause: js.UndefOr[scala.Boolean] = js.undefined
   // 'src',
  // [2.x] Additional directories to be probed when loading assemblies.
  var privatebinpath: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // 'Debug',
  // Process model for tests.
  var process: js.UndefOr[java.lang.String] = js.undefined
   // 'TestErrors.txt',
  // Name of XML result file (Default: TestResult.xml)
  var result: js.UndefOr[java.lang.String] = js.undefined
   // 'TestsToRun.txt',
  // [2.x] Name of the test case(s), fixture(s) or namespace(s) to run.
  // NOTE: This has been superseded by the 'test' option above in 3.x.
  var run: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // ['TestSuite.Unit', 'TestSuite.Integration'],
  // [2.x] Name of a file containing a list of the tests to run, one per line.
  // NOTE: This has been superseded by the 'testlist' option above in 3.x.
  var runlist: js.UndefOr[java.lang.String] = js.undefined
   // 1000,
  // [3.x] Random seed used to generate test cases.
  var seed: js.UndefOr[scala.Double] = js.undefined
   // 'Off|Error|Warning|Info|Verbose',
  // [3.x] Tells .NET to copy loaded assemblies to the shadowcopy directory.
  var shadowcopy: js.UndefOr[scala.Boolean] = js.undefined
   // 5,
  // Stop after the first test failure or error.
  var stoponerror: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // [3.x] Turns on use of TeamCity service messages.
  var teamcity: js.UndefOr[scala.Boolean] = js.undefined
  // [3.x] Name of the test case(s), fixture(s) or namespace(s) to run.
  var test: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // ['TestSuite.Unit', 'TestSuite.Integration'],
  // [3.x] Name of a file containing a list of the tests to run, one per line.
  var testist: js.UndefOr[java.lang.String] = js.undefined
   // true|false,
  // Timeout for each test case in milliseconds.
  var timeout: js.UndefOr[scala.Double] = js.undefined
   // true|false,
  // Set internal trace level.
  var trace: js.UndefOr[java.lang.String] = js.undefined
   // true|false,
  // [3.x] Display additional information as the test runs.
  var verbose: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // Wait for input before closing console window.
  @JSName("wait")
  var wait_FConsoleRunnerOptions: js.UndefOr[scala.Boolean] = js.undefined
   // true|false,
  // Work directory for output files.
  var work: js.UndefOr[java.lang.String] = js.undefined
   // 5150,
  // [3.x] Number of worker threads to be used in running tests.
  var workers: js.UndefOr[scala.Double] = js.undefined
   // 'net-1.1',
  // [3.x] Run tests in a 32-bit process on 64-bit systems.
  var x86: js.UndefOr[scala.Boolean] = js.undefined
}

object ConsoleRunnerOptions {
  @scala.inline
  def apply(
    apartment: java.lang.String = null,
    basepath: java.lang.String = null,
    cleanup: js.UndefOr[scala.Boolean] = js.undefined,
    config: java.lang.String = null,
    `dispose-runners`: js.UndefOr[scala.Boolean] = js.undefined,
    domain: java.lang.String = null,
    err: java.lang.String = null,
    exclude: js.Array[java.lang.String] = null,
    explore: java.lang.String = null,
    framework: java.lang.String = null,
    include: js.Array[java.lang.String] = null,
    labels: js.UndefOr[scala.Boolean] = js.undefined,
    nocolor: js.UndefOr[scala.Boolean] = js.undefined,
    nodots: js.UndefOr[scala.Boolean] = js.undefined,
    noheader: js.UndefOr[scala.Boolean] = js.undefined,
    nologo: js.UndefOr[scala.Boolean] = js.undefined,
    noresult: js.UndefOr[scala.Boolean] = js.undefined,
    noshadow: js.UndefOr[scala.Boolean] = js.undefined,
    nothread: js.UndefOr[scala.Boolean] = js.undefined,
    output: java.lang.String = null,
    pause: js.UndefOr[scala.Boolean] = js.undefined,
    privatebinpath: js.Array[java.lang.String] = null,
    process: java.lang.String = null,
    result: java.lang.String = null,
    run: js.Array[java.lang.String] = null,
    runlist: java.lang.String = null,
    seed: scala.Int | scala.Double = null,
    shadowcopy: js.UndefOr[scala.Boolean] = js.undefined,
    stoponerror: js.UndefOr[scala.Boolean] = js.undefined,
    teamcity: js.UndefOr[scala.Boolean] = js.undefined,
    test: js.Array[java.lang.String] = null,
    testist: java.lang.String = null,
    timeout: scala.Int | scala.Double = null,
    trace: java.lang.String = null,
    verbose: js.UndefOr[scala.Boolean] = js.undefined,
    wait: js.UndefOr[scala.Boolean] = js.undefined,
    work: java.lang.String = null,
    workers: scala.Int | scala.Double = null,
    x86: js.UndefOr[scala.Boolean] = js.undefined
  ): ConsoleRunnerOptions = {
    val __obj = js.Dynamic.literal()
    if (apartment != null) __obj.updateDynamic("apartment")(apartment)
    if (basepath != null) __obj.updateDynamic("basepath")(basepath)
    if (!js.isUndefined(cleanup)) __obj.updateDynamic("cleanup")(cleanup)
    if (config != null) __obj.updateDynamic("config")(config)
    if (!js.isUndefined(`dispose-runners`)) __obj.updateDynamic("dispose-runners")(`dispose-runners`)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (err != null) __obj.updateDynamic("err")(err)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (explore != null) __obj.updateDynamic("explore")(explore)
    if (framework != null) __obj.updateDynamic("framework")(framework)
    if (include != null) __obj.updateDynamic("include")(include)
    if (!js.isUndefined(labels)) __obj.updateDynamic("labels")(labels)
    if (!js.isUndefined(nocolor)) __obj.updateDynamic("nocolor")(nocolor)
    if (!js.isUndefined(nodots)) __obj.updateDynamic("nodots")(nodots)
    if (!js.isUndefined(noheader)) __obj.updateDynamic("noheader")(noheader)
    if (!js.isUndefined(nologo)) __obj.updateDynamic("nologo")(nologo)
    if (!js.isUndefined(noresult)) __obj.updateDynamic("noresult")(noresult)
    if (!js.isUndefined(noshadow)) __obj.updateDynamic("noshadow")(noshadow)
    if (!js.isUndefined(nothread)) __obj.updateDynamic("nothread")(nothread)
    if (output != null) __obj.updateDynamic("output")(output)
    if (!js.isUndefined(pause)) __obj.updateDynamic("pause")(pause)
    if (privatebinpath != null) __obj.updateDynamic("privatebinpath")(privatebinpath)
    if (process != null) __obj.updateDynamic("process")(process)
    if (result != null) __obj.updateDynamic("result")(result)
    if (run != null) __obj.updateDynamic("run")(run)
    if (runlist != null) __obj.updateDynamic("runlist")(runlist)
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    if (!js.isUndefined(shadowcopy)) __obj.updateDynamic("shadowcopy")(shadowcopy)
    if (!js.isUndefined(stoponerror)) __obj.updateDynamic("stoponerror")(stoponerror)
    if (!js.isUndefined(teamcity)) __obj.updateDynamic("teamcity")(teamcity)
    if (test != null) __obj.updateDynamic("test")(test)
    if (testist != null) __obj.updateDynamic("testist")(testist)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (trace != null) __obj.updateDynamic("trace")(trace)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait)
    if (work != null) __obj.updateDynamic("work")(work)
    if (workers != null) __obj.updateDynamic("workers")(workers.asInstanceOf[js.Any])
    if (!js.isUndefined(x86)) __obj.updateDynamic("x86")(x86)
    __obj.asInstanceOf[ConsoleRunnerOptions]
  }
}

