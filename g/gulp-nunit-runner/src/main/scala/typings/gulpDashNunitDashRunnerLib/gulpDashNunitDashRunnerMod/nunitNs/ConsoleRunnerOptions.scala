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

