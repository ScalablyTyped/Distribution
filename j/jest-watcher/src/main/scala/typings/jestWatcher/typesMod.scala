package typings.jestWatcher

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.jestTestResult.typesMod.AggregatedResult
import typings.jestTypes.configMod.CoverageReporterName
import typings.jestTypes.configMod.CoverageReporterWithOptions
import typings.jestTypes.configMod.CoverageReporters
import typings.jestTypes.configMod.Glob
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.NotifyMode
import typings.jestTypes.configMod.ProjectConfig
import typings.jestTypes.configMod.ReporterConfig
import typings.jestTypes.configMod.SnapshotUpdateState
import typings.jestWatcher.anon.Config
import typings.jestWatcher.anon.Stdin
import typings.jestWatcher.jestWatcherStrings.watch
import typings.jestWatcher.jestWatcherStrings.watchAll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'bail' | 'changedSince' | 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom' | 'coverageDirectory' | 'coverageReporters' | 'findRelatedTests' | 'nonFlagArgs' | 'notify' | 'notifyMode' | 'onlyFailures' | 'reporters' | 'testNamePattern' | 'testPathPattern' | 'updateSnapshot' | 'verbose'> & {  mode :'watch' | 'watchAll'}> */
  trait AllowedConfigOptions extends StObject {
    
    var bail: js.UndefOr[Double] = js.undefined
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var collectCoverage: js.UndefOr[Boolean] = js.undefined
    
    var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
    
    var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var coverageDirectory: js.UndefOr[String] = js.undefined
    
    var coverageReporters: js.UndefOr[CoverageReporters] = js.undefined
    
    var findRelatedTests: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[watch | watchAll] = js.undefined
    
    var nonFlagArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    var notifyMode: js.UndefOr[NotifyMode] = js.undefined
    
    @JSName("notify")
    var notify_FAllowedConfigOptions: js.UndefOr[Boolean] = js.undefined
    
    var onlyFailures: js.UndefOr[Boolean] = js.undefined
    
    var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.undefined
    
    var testNamePattern: js.UndefOr[String] = js.undefined
    
    var testPathPattern: js.UndefOr[String] = js.undefined
    
    var updateSnapshot: js.UndefOr[SnapshotUpdateState] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object AllowedConfigOptions {
    
    inline def apply(): AllowedConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowedConfigOptions]
    }
    
    extension [Self <: AllowedConfigOptions](x: Self) {
      
      inline def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      inline def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      inline def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      inline def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      inline def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFrom(value: js.Array[Glob]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
      
      inline def setCollectCoverageFromVarargs(value: Glob*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value :_*))
      
      inline def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = StObject.set(x, "collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageOnlyFromUndefined: Self = StObject.set(x, "collectCoverageOnlyFrom", js.undefined)
      
      inline def setCollectCoverageUndefined: Self = StObject.set(x, "collectCoverage", js.undefined)
      
      inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      inline def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
      
      inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
      
      inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value :_*))
      
      inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      inline def setFindRelatedTestsUndefined: Self = StObject.set(x, "findRelatedTests", js.undefined)
      
      inline def setMode(value: watch | watchAll): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNonFlagArgs(value: js.Array[String]): Self = StObject.set(x, "nonFlagArgs", value.asInstanceOf[js.Any])
      
      inline def setNonFlagArgsUndefined: Self = StObject.set(x, "nonFlagArgs", js.undefined)
      
      inline def setNonFlagArgsVarargs(value: String*): Self = StObject.set(x, "nonFlagArgs", js.Array(value :_*))
      
      inline def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
      
      inline def setNotifyModeUndefined: Self = StObject.set(x, "notifyMode", js.undefined)
      
      inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      inline def setOnlyFailures(value: Boolean): Self = StObject.set(x, "onlyFailures", value.asInstanceOf[js.Any])
      
      inline def setOnlyFailuresUndefined: Self = StObject.set(x, "onlyFailures", js.undefined)
      
      inline def setReporters(value: js.Array[String | ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: (String | ReporterConfig)*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      inline def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      inline def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      inline def setTestPathPattern(value: String): Self = StObject.set(x, "testPathPattern", value.asInstanceOf[js.Any])
      
      inline def setTestPathPatternUndefined: Self = StObject.set(x, "testPathPattern", js.undefined)
      
      inline def setUpdateSnapshot(value: SnapshotUpdateState): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
      
      inline def setUpdateSnapshotUndefined: Self = StObject.set(x, "updateSnapshot", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type FileChange = js.Function1[/* fs */ JestHookExposedFS, Unit]
  
  trait JestHookEmitter extends StObject {
    
    def onFileChange(fs: JestHookExposedFS): Unit
    
    def onTestRunComplete(results: AggregatedResult): Unit
    
    def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean] | Boolean
  }
  object JestHookEmitter {
    
    inline def apply(
      onFileChange: JestHookExposedFS => Unit,
      onTestRunComplete: AggregatedResult => Unit,
      shouldRunTestSuite: TestSuiteInfo => js.Promise[Boolean] | Boolean
    ): JestHookEmitter = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[JestHookEmitter]
    }
    
    extension [Self <: JestHookEmitter](x: Self) {
      
      inline def setOnFileChange(value: JestHookExposedFS => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setOnTestRunComplete(value: AggregatedResult => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      inline def setShouldRunTestSuite(value: TestSuiteInfo => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  trait JestHookExposedFS extends StObject {
    
    var projects: js.Array[Config]
  }
  object JestHookExposedFS {
    
    inline def apply(projects: js.Array[Config]): JestHookExposedFS = {
      val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestHookExposedFS]
    }
    
    extension [Self <: JestHookExposedFS](x: Self) {
      
      inline def setProjects(value: js.Array[Config]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      inline def setProjectsVarargs(value: Config*): Self = StObject.set(x, "projects", js.Array(value :_*))
    }
  }
  
  trait JestHookSubscriber extends StObject {
    
    def onFileChange(fn: FileChange): Unit
    
    def onTestRunComplete(fn: TestRunComplete): Unit
    
    def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit
  }
  object JestHookSubscriber {
    
    inline def apply(
      onFileChange: FileChange => Unit,
      onTestRunComplete: TestRunComplete => Unit,
      shouldRunTestSuite: ShouldRunTestSuite => Unit
    ): JestHookSubscriber = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[JestHookSubscriber]
    }
    
    extension [Self <: JestHookSubscriber](x: Self) {
      
      inline def setOnFileChange(value: FileChange => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      inline def setOnTestRunComplete(value: TestRunComplete => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      inline def setShouldRunTestSuite(value: ShouldRunTestSuite => Unit): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  trait ScrollOptions extends StObject {
    
    var max: Double
    
    var offset: Double
  }
  object ScrollOptions {
    
    inline def apply(max: Double, offset: Double): ScrollOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollOptions]
    }
    
    extension [Self <: ScrollOptions](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type ShouldRunTestSuite = js.Function1[/* testSuiteInfo */ TestSuiteInfo, js.Promise[Boolean]]
  
  type TestRunComplete = js.Function1[/* results */ AggregatedResult, Unit]
  
  trait TestSuiteInfo extends StObject {
    
    var config: ProjectConfig
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var testPath: String
  }
  object TestSuiteInfo {
    
    inline def apply(config: ProjectConfig, testPath: String): TestSuiteInfo = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestSuiteInfo]
    }
    
    extension [Self <: TestSuiteInfo](x: Self) {
      
      inline def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    }
  }
  
  type UpdateConfigCallback = js.Function1[/* config */ js.UndefOr[AllowedConfigOptions], Unit]
  
  trait UsageData extends StObject {
    
    var key: String
    
    var prompt: String
  }
  object UsageData {
    
    inline def apply(key: String, prompt: String): UsageData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageData]
    }
    
    extension [Self <: UsageData](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
  
  trait WatchPlugin extends StObject {
    
    @JSName("apply")
    var apply: js.UndefOr[js.Function1[/* hooks */ JestHookSubscriber, Unit]] = js.undefined
    
    var getUsageInfo: js.UndefOr[js.Function1[/* globalConfig */ GlobalConfig, UsageData | Null]] = js.undefined
    
    var isInternal: js.UndefOr[Boolean] = js.undefined
    
    var onKey: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var run: js.UndefOr[
        js.Function2[
          /* globalConfig */ GlobalConfig, 
          /* updateConfigAndRun */ UpdateConfigCallback, 
          js.Promise[Unit | Boolean]
        ]
      ] = js.undefined
  }
  object WatchPlugin {
    
    inline def apply(): WatchPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchPlugin]
    }
    
    extension [Self <: WatchPlugin](x: Self) {
      
      inline def setApply(value: /* hooks */ JestHookSubscriber => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      inline def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      inline def setGetUsageInfo(value: /* globalConfig */ GlobalConfig => UsageData | Null): Self = StObject.set(x, "getUsageInfo", js.Any.fromFunction1(value))
      
      inline def setGetUsageInfoUndefined: Self = StObject.set(x, "getUsageInfo", js.undefined)
      
      inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
      
      inline def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
      
      inline def setOnKey(value: /* value */ String => Unit): Self = StObject.set(x, "onKey", js.Any.fromFunction1(value))
      
      inline def setOnKeyUndefined: Self = StObject.set(x, "onKey", js.undefined)
      
      inline def setRun(
        value: (/* globalConfig */ GlobalConfig, /* updateConfigAndRun */ UpdateConfigCallback) => js.Promise[Unit | Boolean]
      ): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
  
  @js.native
  trait WatchPluginClass
    extends StObject
       with Instantiable1[/* options */ Stdin, WatchPlugin]
}
