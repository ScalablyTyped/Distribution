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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined std.Partial<std.Pick<@jest/types.@jest/types.Config.GlobalConfig, 'bail' | 'changedSince' | 'collectCoverage' | 'collectCoverageFrom' | 'collectCoverageOnlyFrom' | 'coverageDirectory' | 'coverageReporters' | 'findRelatedTests' | 'nonFlagArgs' | 'notify' | 'notifyMode' | 'onlyFailures' | 'reporters' | 'testNamePattern' | 'testPathPattern' | 'updateSnapshot' | 'verbose'> & {  mode :'watch' | 'watchAll'}> */
  @js.native
  trait AllowedConfigOptions extends StObject {
    
    var bail: js.UndefOr[Double] = js.native
    
    var changedSince: js.UndefOr[String] = js.native
    
    var collectCoverage: js.UndefOr[Boolean] = js.native
    
    var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.native
    
    var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.native
    
    var coverageDirectory: js.UndefOr[String] = js.native
    
    var coverageReporters: js.UndefOr[CoverageReporters] = js.native
    
    var findRelatedTests: js.UndefOr[Boolean] = js.native
    
    var mode: js.UndefOr[watch | watchAll] = js.native
    
    var nonFlagArgs: js.UndefOr[js.Array[String]] = js.native
    
    var notifyMode: js.UndefOr[NotifyMode] = js.native
    
    @JSName("notify")
    var notify_FAllowedConfigOptions: js.UndefOr[Boolean] = js.native
    
    var onlyFailures: js.UndefOr[Boolean] = js.native
    
    var reporters: js.UndefOr[js.Array[String | ReporterConfig]] = js.native
    
    var testNamePattern: js.UndefOr[String] = js.native
    
    var testPathPattern: js.UndefOr[String] = js.native
    
    var updateSnapshot: js.UndefOr[SnapshotUpdateState] = js.native
    
    var verbose: js.UndefOr[Boolean] = js.native
  }
  object AllowedConfigOptions {
    
    @scala.inline
    def apply(): AllowedConfigOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowedConfigOptions]
    }
    
    @scala.inline
    implicit class AllowedConfigOptionsMutableBuilder[Self <: AllowedConfigOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBail(value: Double): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
      
      @scala.inline
      def setChangedSince(value: String): Self = StObject.set(x, "changedSince", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedSinceUndefined: Self = StObject.set(x, "changedSince", js.undefined)
      
      @scala.inline
      def setCollectCoverage(value: Boolean): Self = StObject.set(x, "collectCoverage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectCoverageFrom(value: js.Array[Glob]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
      
      @scala.inline
      def setCollectCoverageFromVarargs(value: Glob*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value :_*))
      
      @scala.inline
      def setCollectCoverageOnlyFrom(value: StringDictionary[Boolean]): Self = StObject.set(x, "collectCoverageOnlyFrom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollectCoverageOnlyFromUndefined: Self = StObject.set(x, "collectCoverageOnlyFrom", js.undefined)
      
      @scala.inline
      def setCollectCoverageUndefined: Self = StObject.set(x, "collectCoverage", js.undefined)
      
      @scala.inline
      def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
      
      @scala.inline
      def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
      
      @scala.inline
      def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value :_*))
      
      @scala.inline
      def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindRelatedTestsUndefined: Self = StObject.set(x, "findRelatedTests", js.undefined)
      
      @scala.inline
      def setMode(value: watch | watchAll): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setNonFlagArgs(value: js.Array[String]): Self = StObject.set(x, "nonFlagArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonFlagArgsUndefined: Self = StObject.set(x, "nonFlagArgs", js.undefined)
      
      @scala.inline
      def setNonFlagArgsVarargs(value: String*): Self = StObject.set(x, "nonFlagArgs", js.Array(value :_*))
      
      @scala.inline
      def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotifyModeUndefined: Self = StObject.set(x, "notifyMode", js.undefined)
      
      @scala.inline
      def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      @scala.inline
      def setOnlyFailures(value: Boolean): Self = StObject.set(x, "onlyFailures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyFailuresUndefined: Self = StObject.set(x, "onlyFailures", js.undefined)
      
      @scala.inline
      def setReporters(value: js.Array[String | ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      @scala.inline
      def setReportersVarargs(value: (String | ReporterConfig)*): Self = StObject.set(x, "reporters", js.Array(value :_*))
      
      @scala.inline
      def setTestNamePattern(value: String): Self = StObject.set(x, "testNamePattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestNamePatternUndefined: Self = StObject.set(x, "testNamePattern", js.undefined)
      
      @scala.inline
      def setTestPathPattern(value: String): Self = StObject.set(x, "testPathPattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestPathPatternUndefined: Self = StObject.set(x, "testPathPattern", js.undefined)
      
      @scala.inline
      def setUpdateSnapshot(value: SnapshotUpdateState): Self = StObject.set(x, "updateSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateSnapshotUndefined: Self = StObject.set(x, "updateSnapshot", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  type FileChange = js.Function1[/* fs */ JestHookExposedFS, Unit]
  
  @js.native
  trait JestHookEmitter extends StObject {
    
    def onFileChange(fs: JestHookExposedFS): Unit = js.native
    
    def onTestRunComplete(results: AggregatedResult): Unit = js.native
    
    def shouldRunTestSuite(testSuiteInfo: TestSuiteInfo): js.Promise[Boolean] | Boolean = js.native
  }
  object JestHookEmitter {
    
    @scala.inline
    def apply(
      onFileChange: JestHookExposedFS => Unit,
      onTestRunComplete: AggregatedResult => Unit,
      shouldRunTestSuite: TestSuiteInfo => js.Promise[Boolean] | Boolean
    ): JestHookEmitter = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[JestHookEmitter]
    }
    
    @scala.inline
    implicit class JestHookEmitterMutableBuilder[Self <: JestHookEmitter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFileChange(value: JestHookExposedFS => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTestRunComplete(value: AggregatedResult => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRunTestSuite(value: TestSuiteInfo => js.Promise[Boolean] | Boolean): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait JestHookExposedFS extends StObject {
    
    var projects: js.Array[Config] = js.native
  }
  object JestHookExposedFS {
    
    @scala.inline
    def apply(projects: js.Array[Config]): JestHookExposedFS = {
      val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestHookExposedFS]
    }
    
    @scala.inline
    implicit class JestHookExposedFSMutableBuilder[Self <: JestHookExposedFS] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProjects(value: js.Array[Config]): Self = StObject.set(x, "projects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectsVarargs(value: Config*): Self = StObject.set(x, "projects", js.Array(value :_*))
    }
  }
  
  @js.native
  trait JestHookSubscriber extends StObject {
    
    def onFileChange(fn: FileChange): Unit = js.native
    
    def onTestRunComplete(fn: TestRunComplete): Unit = js.native
    
    def shouldRunTestSuite(fn: ShouldRunTestSuite): Unit = js.native
  }
  object JestHookSubscriber {
    
    @scala.inline
    def apply(
      onFileChange: FileChange => Unit,
      onTestRunComplete: TestRunComplete => Unit,
      shouldRunTestSuite: ShouldRunTestSuite => Unit
    ): JestHookSubscriber = {
      val __obj = js.Dynamic.literal(onFileChange = js.Any.fromFunction1(onFileChange), onTestRunComplete = js.Any.fromFunction1(onTestRunComplete), shouldRunTestSuite = js.Any.fromFunction1(shouldRunTestSuite))
      __obj.asInstanceOf[JestHookSubscriber]
    }
    
    @scala.inline
    implicit class JestHookSubscriberMutableBuilder[Self <: JestHookSubscriber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnFileChange(value: FileChange => Unit): Self = StObject.set(x, "onFileChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTestRunComplete(value: TestRunComplete => Unit): Self = StObject.set(x, "onTestRunComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRunTestSuite(value: ShouldRunTestSuite => Unit): Self = StObject.set(x, "shouldRunTestSuite", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ScrollOptions extends StObject {
    
    var max: Double = js.native
    
    var offset: Double = js.native
  }
  object ScrollOptions {
    
    @scala.inline
    def apply(max: Double, offset: Double): ScrollOptions = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollOptions]
    }
    
    @scala.inline
    implicit class ScrollOptionsMutableBuilder[Self <: ScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type ShouldRunTestSuite = js.Function1[/* testSuiteInfo */ TestSuiteInfo, js.Promise[Boolean]]
  
  type TestRunComplete = js.Function1[/* results */ AggregatedResult, Unit]
  
  @js.native
  trait TestSuiteInfo extends StObject {
    
    var config: ProjectConfig = js.native
    
    var duration: js.UndefOr[Double] = js.native
    
    var testPath: String = js.native
  }
  object TestSuiteInfo {
    
    @scala.inline
    def apply(config: ProjectConfig, testPath: String): TestSuiteInfo = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestSuiteInfo]
    }
    
    @scala.inline
    implicit class TestSuiteInfoMutableBuilder[Self <: TestSuiteInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: ProjectConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    }
  }
  
  type UpdateConfigCallback = js.Function1[/* config */ js.UndefOr[AllowedConfigOptions], Unit]
  
  @js.native
  trait UsageData extends StObject {
    
    var key: String = js.native
    
    var prompt: String = js.native
  }
  object UsageData {
    
    @scala.inline
    def apply(key: String, prompt: String): UsageData = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[UsageData]
    }
    
    @scala.inline
    implicit class UsageDataMutableBuilder[Self <: UsageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WatchPlugin extends StObject {
    
    @JSName("apply")
    var apply: js.UndefOr[js.Function1[/* hooks */ JestHookSubscriber, Unit]] = js.native
    
    var getUsageInfo: js.UndefOr[js.Function1[/* globalConfig */ GlobalConfig, UsageData | Null]] = js.native
    
    var isInternal: js.UndefOr[Boolean] = js.native
    
    var onKey: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
    
    var run: js.UndefOr[
        js.Function2[
          /* globalConfig */ GlobalConfig, 
          /* updateConfigAndRun */ UpdateConfigCallback, 
          js.Promise[Unit | Boolean]
        ]
      ] = js.native
  }
  object WatchPlugin {
    
    @scala.inline
    def apply(): WatchPlugin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchPlugin]
    }
    
    @scala.inline
    implicit class WatchPluginMutableBuilder[Self <: WatchPlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApply(value: /* hooks */ JestHookSubscriber => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setApplyUndefined: Self = StObject.set(x, "apply", js.undefined)
      
      @scala.inline
      def setGetUsageInfo(value: /* globalConfig */ GlobalConfig => UsageData | Null): Self = StObject.set(x, "getUsageInfo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetUsageInfoUndefined: Self = StObject.set(x, "getUsageInfo", js.undefined)
      
      @scala.inline
      def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsInternalUndefined: Self = StObject.set(x, "isInternal", js.undefined)
      
      @scala.inline
      def setOnKey(value: /* value */ String => Unit): Self = StObject.set(x, "onKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUndefined: Self = StObject.set(x, "onKey", js.undefined)
      
      @scala.inline
      def setRun(
        value: (/* globalConfig */ GlobalConfig, /* updateConfigAndRun */ UpdateConfigCallback) => js.Promise[Unit | Boolean]
      ): Self = StObject.set(x, "run", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
  
  @js.native
  trait WatchPluginClass extends Instantiable1[/* options */ Stdin, WatchPlugin]
}
