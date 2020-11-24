package typings.gulpNunitRunner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsoleRunnerOptions extends js.Object {
  
   // true|false,
  // [2.x] Apartment for running tests (Default is MTA).
  var apartment: js.UndefOr[String] = js.native
  
   // true|false,
  // [2.x] Base path to be used when loading the assemblies.
  var basepath: js.UndefOr[String] = js.native
  
   // ['lib', 'bin'],
  // [2.x] Erase any leftover cache files and exit.
  var cleanup: js.UndefOr[Boolean] = js.native
  
   // ['Database', 'Network'],
  // Project configuration (e.g.: Debug) to load.
  var config: js.UndefOr[String] = js.native
  
   // true|false,
  // [3.x] Dispose each test runner after it has finished running its tests.
  var `dispose-runners`: js.UndefOr[Boolean] = js.native
  
   // 'Single|Separate|Multiple',
  // AppDomain Usage for tests.
  var domain: js.UndefOr[String] = js.native
  
   // 'TestOutput.txt',
  // File to receive test error output.
  var err: js.UndefOr[String] = js.native
  
   // ['BaseLine', 'Unit'],
  // List of categories to exclude.
  var exclude: js.UndefOr[js.Array[String]] = js.native
  
   // 'TestResult.xml',
  // [3.x] Save test info rather than running tests. Name of output file.
  var explore: js.UndefOr[String] = js.native
  
   // 'None|Single|Multiple',
  // Framework version to be used for tests.
  var framework: js.UndefOr[String] = js.native
  
   // 'TestsToRun.txt',
  // List of categories to include.
  var include: js.UndefOr[js.Array[String]] = js.native
  
   // true|false,
  // Label each test in stdOut.
  var labels: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // [3.x] Displays console output without color.
  var nocolor: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // [2.x] Do not display progress.
  var nodots: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // [3.x] Suppress display of program information at start of run.
  var noheader: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // [2.x] Do not display the logo.
  var nologo: js.UndefOr[Boolean] = js.native
  
   // 'TestInfo.xml',
  // Suppress XML result output.
  var noresult: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // [2.x] Disable shadow copy when running in separate domain.
  // NOTE In 3.x, The console runner now disables shadow copy by
  // default. use new 'shadowcopy' option in 3.x to turn it on.
  var noshadow: js.UndefOr[Boolean] = js.native
  
   // 'MTA|STA',
  // [2.x] Disable use of a separate thread for tests.
  var nothread: js.UndefOr[Boolean] = js.native
  
   // 'BuildArtifacts',
  // File to receive test output.
  var output: js.UndefOr[String] = js.native
  
   // true|false,
  // [3.x] Pause before run to allow debugging.
  var pause: js.UndefOr[Boolean] = js.native
  
   // 'src',
  // [2.x] Additional directories to be probed when loading assemblies.
  var privatebinpath: js.UndefOr[js.Array[String]] = js.native
  
   // 'Debug',
  // Process model for tests.
  var process: js.UndefOr[String] = js.native
  
   // 'TestErrors.txt',
  // Name of XML result file (Default: TestResult.xml)
  var result: js.UndefOr[String] = js.native
  
   // 'TestsToRun.txt',
  // [2.x] Name of the test case(s), fixture(s) or namespace(s) to run.
  // NOTE: This has been superseded by the 'test' option above in 3.x.
  var run: js.UndefOr[js.Array[String]] = js.native
  
   // ['TestSuite.Unit', 'TestSuite.Integration'],
  // [2.x] Name of a file containing a list of the tests to run, one per line.
  // NOTE: This has been superseded by the 'testlist' option above in 3.x.
  var runlist: js.UndefOr[String] = js.native
  
   // 1000,
  // [3.x] Random seed used to generate test cases.
  var seed: js.UndefOr[Double] = js.native
  
   // 'Off|Error|Warning|Info|Verbose',
  // [3.x] Tells .NET to copy loaded assemblies to the shadowcopy directory.
  var shadowcopy: js.UndefOr[Boolean] = js.native
  
   // 5,
  // Stop after the first test failure or error.
  var stoponerror: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // [3.x] Turns on use of TeamCity service messages.
  var teamcity: js.UndefOr[Boolean] = js.native
  
  // [3.x] Name of the test case(s), fixture(s) or namespace(s) to run.
  var test: js.UndefOr[js.Array[String]] = js.native
  
   // ['TestSuite.Unit', 'TestSuite.Integration'],
  // [3.x] Name of a file containing a list of the tests to run, one per line.
  var testist: js.UndefOr[String] = js.native
  
   // true|false,
  // Timeout for each test case in milliseconds.
  var timeout: js.UndefOr[Double] = js.native
  
   // true|false,
  // Set internal trace level.
  var trace: js.UndefOr[String] = js.native
  
   // true|false,
  // [3.x] Display additional information as the test runs.
  var verbose: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // Wait for input before closing console window.
  @JSName("wait")
  var wait_FConsoleRunnerOptions: js.UndefOr[Boolean] = js.native
  
   // true|false,
  // Work directory for output files.
  var work: js.UndefOr[String] = js.native
  
   // 5150,
  // [3.x] Number of worker threads to be used in running tests.
  var workers: js.UndefOr[Double] = js.native
  
   // 'net-1.1',
  // [3.x] Run tests in a 32-bit process on 64-bit systems.
  var x86: js.UndefOr[Boolean] = js.native
}
object ConsoleRunnerOptions {
  
  @scala.inline
  def apply(): ConsoleRunnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsoleRunnerOptions]
  }
  
  @scala.inline
  implicit class ConsoleRunnerOptionsOps[Self <: ConsoleRunnerOptions] (val x: Self) extends AnyVal {
    
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
    def setApartment(value: String): Self = this.set("apartment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApartment: Self = this.set("apartment", js.undefined)
    
    @scala.inline
    def setBasepath(value: String): Self = this.set("basepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasepath: Self = this.set("basepath", js.undefined)
    
    @scala.inline
    def setCleanup(value: Boolean): Self = this.set("cleanup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanup: Self = this.set("cleanup", js.undefined)
    
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def `setDispose-runners`(value: Boolean): Self = this.set("dispose-runners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteDispose-runners`: Self = this.set("dispose-runners", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setErr(value: String): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExplore(value: String): Self = this.set("explore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplore: Self = this.set("explore", js.undefined)
    
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: String*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[String]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLabels(value: Boolean): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setNocolor(value: Boolean): Self = this.set("nocolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNocolor: Self = this.set("nocolor", js.undefined)
    
    @scala.inline
    def setNodots(value: Boolean): Self = this.set("nodots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodots: Self = this.set("nodots", js.undefined)
    
    @scala.inline
    def setNoheader(value: Boolean): Self = this.set("noheader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoheader: Self = this.set("noheader", js.undefined)
    
    @scala.inline
    def setNologo(value: Boolean): Self = this.set("nologo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNologo: Self = this.set("nologo", js.undefined)
    
    @scala.inline
    def setNoresult(value: Boolean): Self = this.set("noresult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoresult: Self = this.set("noresult", js.undefined)
    
    @scala.inline
    def setNoshadow(value: Boolean): Self = this.set("noshadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoshadow: Self = this.set("noshadow", js.undefined)
    
    @scala.inline
    def setNothread(value: Boolean): Self = this.set("nothread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNothread: Self = this.set("nothread", js.undefined)
    
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setPause(value: Boolean): Self = this.set("pause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePause: Self = this.set("pause", js.undefined)
    
    @scala.inline
    def setPrivatebinpathVarargs(value: String*): Self = this.set("privatebinpath", js.Array(value :_*))
    
    @scala.inline
    def setPrivatebinpath(value: js.Array[String]): Self = this.set("privatebinpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivatebinpath: Self = this.set("privatebinpath", js.undefined)
    
    @scala.inline
    def setProcess(value: String): Self = this.set("process", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcess: Self = this.set("process", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setRunVarargs(value: String*): Self = this.set("run", js.Array(value :_*))
    
    @scala.inline
    def setRun(value: js.Array[String]): Self = this.set("run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRun: Self = this.set("run", js.undefined)
    
    @scala.inline
    def setRunlist(value: String): Self = this.set("runlist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunlist: Self = this.set("runlist", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setShadowcopy(value: Boolean): Self = this.set("shadowcopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShadowcopy: Self = this.set("shadowcopy", js.undefined)
    
    @scala.inline
    def setStoponerror(value: Boolean): Self = this.set("stoponerror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoponerror: Self = this.set("stoponerror", js.undefined)
    
    @scala.inline
    def setTeamcity(value: Boolean): Self = this.set("teamcity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeamcity: Self = this.set("teamcity", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: String*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: js.Array[String]): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setTestist(value: String): Self = this.set("testist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestist: Self = this.set("testist", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setTrace(value: String): Self = this.set("trace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrace: Self = this.set("trace", js.undefined)
    
    @scala.inline
    def setVerbose(value: Boolean): Self = this.set("verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerbose: Self = this.set("verbose", js.undefined)
    
    @scala.inline
    def setWait(value: Boolean): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
    
    @scala.inline
    def setWork(value: String): Self = this.set("work", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWork: Self = this.set("work", js.undefined)
    
    @scala.inline
    def setWorkers(value: Double): Self = this.set("workers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkers: Self = this.set("workers", js.undefined)
    
    @scala.inline
    def setX86(value: Boolean): Self = this.set("x86", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX86: Self = this.set("x86", js.undefined)
  }
}
