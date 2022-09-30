package typings.jestReporters

import typings.jestReporters.anon.Basename
import typings.jestTestResult.anon.Added
import typings.jestTestResult.mod.AggregatedResult
import typings.jestTestResult.mod.AssertionResult
import typings.jestTestResult.mod.SnapshotSummary
import typings.jestTestResult.mod.Suite
import typings.jestTestResult.mod.Test
import typings.jestTestResult.mod.TestCaseResult
import typings.jestTestResult.mod.TestContext
import typings.jestTestResult.mod.TestResult
import typings.jestTypes.mod.GlobalConfig
import typings.jestTypes.mod.ProjectConfig
import typings.node.processMod.global.NodeJS.WriteStream
import typings.std.Set
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/reporters", "BaseReporter")
  @js.native
  open class BaseReporter ()
    extends StObject
       with Reporter {
    
    /* private */ var _error: Any = js.native
    
    /* protected */ def _setError(error: js.Error): Unit = js.native
    
    /* CompleteClass */
    override def getLastError(): js.Error | Unit = js.native
    
    def log(message: String): Unit = js.native
    
    def onRunComplete(): js.Promise[Unit] | Unit = js.native
    def onRunComplete(_testContexts: Unit, _aggregatedResults: AggregatedResult): js.Promise[Unit] | Unit = js.native
    def onRunComplete(_testContexts: Set[TestContext]): js.Promise[Unit] | Unit = js.native
    /* CompleteClass */
    override def onRunComplete(testContexts: Set[TestContext], results: AggregatedResult): js.Promise[Unit] | Unit = js.native
    
    def onRunStart(): Unit = js.native
    def onRunStart(_results: Unit, _options: ReporterOnStartOptions): Unit = js.native
    def onRunStart(_results: AggregatedResult): Unit = js.native
    /* CompleteClass */
    override def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit = js.native
    
    @JSName("onTestCaseResult")
    def onTestCaseResult_MBaseReporter(_test: Test, _testCaseResult: TestCaseResult): Unit = js.native
    
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Unit, _testResult: Unit, _results: AggregatedResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Unit, _testResult: TestResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Unit, _testResult: TestResult, _results: AggregatedResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test, _testResult: Unit, _results: AggregatedResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test, _testResult: TestResult): Unit = js.native
    @JSName("onTestResult")
    def onTestResult_MBaseReporter(_test: Test, _testResult: TestResult, _results: AggregatedResult): Unit = js.native
    
    @JSName("onTestStart")
    def onTestStart_MBaseReporter(): Unit = js.native
    @JSName("onTestStart")
    def onTestStart_MBaseReporter(_test: Test): Unit = js.native
  }
  
  @JSImport("@jest/reporters", "CoverageReporter")
  @js.native
  open class CoverageReporter protected () extends BaseReporter {
    def this(globalConfig: GlobalConfig, context: ReporterContext) = this()
    
    /* private */ var _addUntestedFiles: Any = js.native
    
    /* private */ var _checkThreshold: Any = js.native
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _coverageMap: Any = js.native
    
    /* private */ var _getCoverageResult: Any = js.native
    
    /* private */ var _globalConfig: Any = js.native
    
    /* private */ var _sourceMapStore: Any = js.native
    
    /* private */ var _v8CoverageResults: Any = js.native
    
    @JSName("onTestResult")
    def onTestResult_MCoverageReporter(_test: Test, testResult: TestResult): Unit = js.native
  }
  /* static members */
  object CoverageReporter {
    
    @JSImport("@jest/reporters", "CoverageReporter.filename")
    @js.native
    val filename: String = js.native
  }
  
  @JSImport("@jest/reporters", "DefaultReporter")
  @js.native
  open class DefaultReporter protected () extends BaseReporter {
    def this(globalConfig: GlobalConfig) = this()
    
    /* protected */ def __clearStatus(): Unit = js.native
    
    /* protected */ def __printStatus(): Unit = js.native
    
    /* protected */ def __wrapStdio(stream: WriteStream): Unit = js.native
    /* protected */ def __wrapStdio(stream: WritableStream[Any]): Unit = js.native
    
    /* private */ var _bufferedOutput: Any = js.native
    
    /* private */ var _clear: Any = js.native
    
    /* private */ var _err: Any = js.native
    
    /* protected */ var _globalConfig: GlobalConfig = js.native
    
    /* private */ var _out: Any = js.native
    
    /* private */ var _status: Any = js.native
    
    def forceFlushBufferedOutput(): Unit = js.native
    
    @JSName("onTestCaseResult")
    def onTestCaseResult_MDefaultReporter(test: Test, testCaseResult: TestCaseResult): Unit = js.native
    
    @JSName("onTestResult")
    def onTestResult_MDefaultReporter(test: Test, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
    
    @JSName("onTestStart")
    def onTestStart_MDefaultReporter(test: Test): Unit = js.native
    
    def printTestFileFailureMessage(_testPath: String, _config: ProjectConfig, result: TestResult): Unit = js.native
    
    def printTestFileHeader(testPath: String, config: ProjectConfig, result: TestResult): Unit = js.native
    
    def testFinished(config: ProjectConfig, testResult: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
  }
  /* static members */
  object DefaultReporter {
    
    @JSImport("@jest/reporters", "DefaultReporter.filename")
    @js.native
    val filename: String = js.native
  }
  
  @JSImport("@jest/reporters", "GitHubActionsReporter")
  @js.native
  open class GitHubActionsReporter () extends BaseReporter {
    
    @JSName("onTestFileResult")
    def onTestFileResult_MGitHubActionsReporter(hasContext: Test, hasTestResults: TestResult): Unit = js.native
    
    /* private */ var `private`: Any = js.native
  }
  /* static members */
  object GitHubActionsReporter {
    
    @JSImport("@jest/reporters", "GitHubActionsReporter.filename")
    @js.native
    val filename: String = js.native
  }
  
  @JSImport("@jest/reporters", "NotifyReporter")
  @js.native
  open class NotifyReporter protected () extends BaseReporter {
    def this(globalConfig: GlobalConfig, context: ReporterContext) = this()
    
    /* private */ var _context: Any = js.native
    
    /* private */ var _globalConfig: Any = js.native
    
    /* private */ var _notifier: Any = js.native
  }
  /* static members */
  object NotifyReporter {
    
    @JSImport("@jest/reporters", "NotifyReporter.filename")
    @js.native
    val filename: String = js.native
  }
  
  @JSImport("@jest/reporters", "SummaryReporter")
  @js.native
  open class SummaryReporter protected () extends BaseReporter {
    def this(globalConfig: GlobalConfig) = this()
    
    /* private */ var _estimatedTime: Any = js.native
    
    /* private */ var _getTestSummary: Any = js.native
    
    /* private */ var _globalConfig: Any = js.native
    
    /* private */ var _printSnapshotSummary: Any = js.native
    
    /* private */ var _printSummary: Any = js.native
    
    /* private */ var _write: Any = js.native
  }
  /* static members */
  object SummaryReporter {
    
    @JSImport("@jest/reporters", "SummaryReporter.filename")
    @js.native
    val filename: String = js.native
  }
  
  @JSImport("@jest/reporters", "VerboseReporter")
  @js.native
  open class VerboseReporter protected () extends DefaultReporter {
    def this(globalConfig: GlobalConfig) = this()
    
    /* private */ var _getIcon: Any = js.native
    
    /* private */ var _logLine: Any = js.native
    
    /* private */ var _logSuite: Any = js.native
    
    /* private */ var _logTest: Any = js.native
    
    /* private */ var _logTestResults: Any = js.native
    
    /* private */ var _logTests: Any = js.native
    
    /* private */ var _logTodoOrPendingTest: Any = js.native
    
    @JSName("onTestResult")
    def onTestResult_MVerboseReporter(test: Test, result: TestResult, aggregatedResults: AggregatedResult): Unit = js.native
  }
  /* static members */
  object VerboseReporter {
    
    @JSImport("@jest/reporters", "VerboseReporter")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jest/reporters", "VerboseReporter.filename")
    @js.native
    val filename: String = js.native
    
    inline def filterTestResults(testResults: js.Array[AssertionResult]): js.Array[AssertionResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterTestResults")(testResults.asInstanceOf[js.Any]).asInstanceOf[js.Array[AssertionResult]]
    
    inline def groupTestsBySuites(testResults: js.Array[AssertionResult]): Suite = ^.asInstanceOf[js.Dynamic].applyDynamic("groupTestsBySuites")(testResults.asInstanceOf[js.Any]).asInstanceOf[Suite]
  }
  
  object utils {
    
    @JSImport("@jest/reporters", "utils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@jest/reporters", "utils.formatTestPath")
    @js.native
    def formatTestPath: js.Function2[/* config */ GlobalConfig | ProjectConfig, /* testPath */ String, String] = js.native
    inline def formatTestPath_=(x: js.Function2[/* config */ GlobalConfig | ProjectConfig, /* testPath */ String, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatTestPath")(x.asInstanceOf[js.Any])
    
    @JSImport("@jest/reporters", "utils.getResultHeader")
    @js.native
    def getResultHeader: js.Function3[
        /* result */ TestResult, 
        /* globalConfig */ GlobalConfig, 
        /* projectConfig */ js.UndefOr[ProjectConfig], 
        String
      ] = js.native
    inline def getResultHeader_=(
      x: js.Function3[
          /* result */ TestResult, 
          /* globalConfig */ GlobalConfig, 
          /* projectConfig */ js.UndefOr[ProjectConfig], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getResultHeader")(x.asInstanceOf[js.Any])
    
    @JSImport("@jest/reporters", "utils.getSnapshotStatus")
    @js.native
    def getSnapshotStatus: js.Function2[/* snapshot */ Added, /* afterUpdate */ Boolean, js.Array[String]] = js.native
    inline def getSnapshotStatus_=(x: js.Function2[/* snapshot */ Added, /* afterUpdate */ Boolean, js.Array[String]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSnapshotStatus")(x.asInstanceOf[js.Any])
    
    @JSImport("@jest/reporters", "utils.getSnapshotSummary")
    @js.native
    def getSnapshotSummary: js.Function3[
        /* snapshots */ SnapshotSummary, 
        /* globalConfig */ GlobalConfig, 
        /* updateCommand */ String, 
        js.Array[String]
      ] = js.native
    inline def getSnapshotSummary_=(
      x: js.Function3[
          /* snapshots */ SnapshotSummary, 
          /* globalConfig */ GlobalConfig, 
          /* updateCommand */ String, 
          js.Array[String]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSnapshotSummary")(x.asInstanceOf[js.Any])
    
    @JSImport("@jest/reporters", "utils.getSummary")
    @js.native
    def getSummary: js.Function2[
        /* aggregatedResults */ AggregatedResult, 
        /* options */ js.UndefOr[SummaryOptions], 
        String
      ] = js.native
    inline def getSummary_=(
      x: js.Function2[
          /* aggregatedResults */ AggregatedResult, 
          /* options */ js.UndefOr[SummaryOptions], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSummary")(x.asInstanceOf[js.Any])
    
    @JSImport("@jest/reporters", "utils.printDisplayName")
    @js.native
    def printDisplayName: js.Function1[/* config */ ProjectConfig, String] = js.native
    inline def printDisplayName_=(x: js.Function1[/* config */ ProjectConfig, String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("printDisplayName")(x.asInstanceOf[js.Any])
    
    @JSImport("@jest/reporters", "utils.relativePath")
    @js.native
    def relativePath: js.Function2[/* config */ GlobalConfig | ProjectConfig, /* testPath */ String, Basename] = js.native
    inline def relativePath_=(x: js.Function2[/* config */ GlobalConfig | ProjectConfig, /* testPath */ String, Basename]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("relativePath")(x.asInstanceOf[js.Any])
    
    @JSImport("@jest/reporters", "utils.trimAndFormatPath")
    @js.native
    def trimAndFormatPath: js.Function4[
        /* pad */ Double, 
        /* config */ ProjectConfig | GlobalConfig, 
        /* testPath */ String, 
        /* columns */ Double, 
        String
      ] = js.native
    inline def trimAndFormatPath_=(
      x: js.Function4[
          /* pad */ Double, 
          /* config */ ProjectConfig | GlobalConfig, 
          /* testPath */ String, 
          /* columns */ Double, 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("trimAndFormatPath")(x.asInstanceOf[js.Any])
  }
  
  trait Reporter extends StObject {
    
    def getLastError(): js.Error | Unit
    
    def onRunComplete(testContexts: Set[TestContext], results: AggregatedResult): js.Promise[Unit] | Unit
    
    def onRunStart(results: AggregatedResult, options: ReporterOnStartOptions): js.Promise[Unit] | Unit
    
    val onTestCaseResult: js.UndefOr[
        js.Function2[/* test */ Test, /* testCaseResult */ TestCaseResult, js.Promise[Unit] | Unit]
      ] = js.undefined
    
    val onTestFileResult: js.UndefOr[
        js.Function3[
          /* test */ Test, 
          /* testResult */ TestResult, 
          /* aggregatedResult */ AggregatedResult, 
          js.Promise[Unit] | Unit
        ]
      ] = js.undefined
    
    val onTestFileStart: js.UndefOr[js.Function1[/* test */ Test, js.Promise[Unit] | Unit]] = js.undefined
    
    val onTestResult: js.UndefOr[
        js.Function3[
          /* test */ Test, 
          /* testResult */ TestResult, 
          /* aggregatedResult */ AggregatedResult, 
          js.Promise[Unit] | Unit
        ]
      ] = js.undefined
    
    val onTestStart: js.UndefOr[js.Function1[/* test */ Test, js.Promise[Unit] | Unit]] = js.undefined
  }
  object Reporter {
    
    inline def apply(
      getLastError: () => js.Error | Unit,
      onRunComplete: (Set[TestContext], AggregatedResult) => js.Promise[Unit] | Unit,
      onRunStart: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit
    ): Reporter = {
      val __obj = js.Dynamic.literal(getLastError = js.Any.fromFunction0(getLastError), onRunComplete = js.Any.fromFunction2(onRunComplete), onRunStart = js.Any.fromFunction2(onRunStart))
      __obj.asInstanceOf[Reporter]
    }
    
    extension [Self <: Reporter](x: Self) {
      
      inline def setGetLastError(value: () => js.Error | Unit): Self = StObject.set(x, "getLastError", js.Any.fromFunction0(value))
      
      inline def setOnRunComplete(value: (Set[TestContext], AggregatedResult) => js.Promise[Unit] | Unit): Self = StObject.set(x, "onRunComplete", js.Any.fromFunction2(value))
      
      inline def setOnRunStart(value: (AggregatedResult, ReporterOnStartOptions) => js.Promise[Unit] | Unit): Self = StObject.set(x, "onRunStart", js.Any.fromFunction2(value))
      
      inline def setOnTestCaseResult(value: (/* test */ Test, /* testCaseResult */ TestCaseResult) => js.Promise[Unit] | Unit): Self = StObject.set(x, "onTestCaseResult", js.Any.fromFunction2(value))
      
      inline def setOnTestCaseResultUndefined: Self = StObject.set(x, "onTestCaseResult", js.undefined)
      
      inline def setOnTestFileResult(
        value: (/* test */ Test, /* testResult */ TestResult, /* aggregatedResult */ AggregatedResult) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "onTestFileResult", js.Any.fromFunction3(value))
      
      inline def setOnTestFileResultUndefined: Self = StObject.set(x, "onTestFileResult", js.undefined)
      
      inline def setOnTestFileStart(value: /* test */ Test => js.Promise[Unit] | Unit): Self = StObject.set(x, "onTestFileStart", js.Any.fromFunction1(value))
      
      inline def setOnTestFileStartUndefined: Self = StObject.set(x, "onTestFileStart", js.undefined)
      
      inline def setOnTestResult(
        value: (/* test */ Test, /* testResult */ TestResult, /* aggregatedResult */ AggregatedResult) => js.Promise[Unit] | Unit
      ): Self = StObject.set(x, "onTestResult", js.Any.fromFunction3(value))
      
      inline def setOnTestResultUndefined: Self = StObject.set(x, "onTestResult", js.undefined)
      
      inline def setOnTestStart(value: /* test */ Test => js.Promise[Unit] | Unit): Self = StObject.set(x, "onTestStart", js.Any.fromFunction1(value))
      
      inline def setOnTestStartUndefined: Self = StObject.set(x, "onTestStart", js.undefined)
    }
  }
  
  trait ReporterContext extends StObject {
    
    var changedFiles: js.UndefOr[Set[String]] = js.undefined
    
    var firstRun: Boolean
    
    var previousSuccess: Boolean
    
    var sourcesRelatedToTestsInChangedFiles: js.UndefOr[Set[String]] = js.undefined
    
    var startRun: js.UndefOr[js.Function1[/* globalConfig */ GlobalConfig, Any]] = js.undefined
  }
  object ReporterContext {
    
    inline def apply(firstRun: Boolean, previousSuccess: Boolean): ReporterContext = {
      val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], previousSuccess = previousSuccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReporterContext]
    }
    
    extension [Self <: ReporterContext](x: Self) {
      
      inline def setChangedFiles(value: Set[String]): Self = StObject.set(x, "changedFiles", value.asInstanceOf[js.Any])
      
      inline def setChangedFilesUndefined: Self = StObject.set(x, "changedFiles", js.undefined)
      
      inline def setFirstRun(value: Boolean): Self = StObject.set(x, "firstRun", value.asInstanceOf[js.Any])
      
      inline def setPreviousSuccess(value: Boolean): Self = StObject.set(x, "previousSuccess", value.asInstanceOf[js.Any])
      
      inline def setSourcesRelatedToTestsInChangedFiles(value: Set[String]): Self = StObject.set(x, "sourcesRelatedToTestsInChangedFiles", value.asInstanceOf[js.Any])
      
      inline def setSourcesRelatedToTestsInChangedFilesUndefined: Self = StObject.set(x, "sourcesRelatedToTestsInChangedFiles", js.undefined)
      
      inline def setStartRun(value: /* globalConfig */ GlobalConfig => Any): Self = StObject.set(x, "startRun", js.Any.fromFunction1(value))
      
      inline def setStartRunUndefined: Self = StObject.set(x, "startRun", js.undefined)
    }
  }
  
  trait ReporterOnStartOptions extends StObject {
    
    var estimatedTime: Double
    
    var showStatus: Boolean
  }
  object ReporterOnStartOptions {
    
    inline def apply(estimatedTime: Double, showStatus: Boolean): ReporterOnStartOptions = {
      val __obj = js.Dynamic.literal(estimatedTime = estimatedTime.asInstanceOf[js.Any], showStatus = showStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReporterOnStartOptions]
    }
    
    extension [Self <: ReporterOnStartOptions](x: Self) {
      
      inline def setEstimatedTime(value: Double): Self = StObject.set(x, "estimatedTime", value.asInstanceOf[js.Any])
      
      inline def setShowStatus(value: Boolean): Self = StObject.set(x, "showStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait SummaryOptions extends StObject {
    
    var currentTestCases: js.UndefOr[js.Array[typings.jestReporters.anon.Test]] = js.undefined
    
    var estimatedTime: js.UndefOr[Double] = js.undefined
    
    var roundTime: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object SummaryOptions {
    
    inline def apply(): SummaryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryOptions]
    }
    
    extension [Self <: SummaryOptions](x: Self) {
      
      inline def setCurrentTestCases(value: js.Array[typings.jestReporters.anon.Test]): Self = StObject.set(x, "currentTestCases", value.asInstanceOf[js.Any])
      
      inline def setCurrentTestCasesUndefined: Self = StObject.set(x, "currentTestCases", js.undefined)
      
      inline def setCurrentTestCasesVarargs(value: typings.jestReporters.anon.Test*): Self = StObject.set(x, "currentTestCases", js.Array(value*))
      
      inline def setEstimatedTime(value: Double): Self = StObject.set(x, "estimatedTime", value.asInstanceOf[js.Any])
      
      inline def setEstimatedTimeUndefined: Self = StObject.set(x, "estimatedTime", js.undefined)
      
      inline def setRoundTime(value: Boolean): Self = StObject.set(x, "roundTime", value.asInstanceOf[js.Any])
      
      inline def setRoundTimeUndefined: Self = StObject.set(x, "roundTime", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
