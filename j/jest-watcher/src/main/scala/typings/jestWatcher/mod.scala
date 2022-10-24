package typings.jestWatcher

import org.scalablytyped.runtime.Instantiable1
import typings.jestTestResult.mod.AggregatedResult
import typings.jestTypes.mod.CoverageReporterName
import typings.jestTypes.mod.CoverageReporterWithOptions
import typings.jestTypes.mod.CoverageReporters
import typings.jestTypes.mod.GlobalConfig
import typings.jestTypes.mod.NotifyMode
import typings.jestTypes.mod.ProjectConfig
import typings.jestTypes.mod.ReporterConfig
import typings.jestTypes.mod.SnapshotUpdateState
import typings.jestWatcher.anon.Config
import typings.jestWatcher.anon.Header
import typings.jestWatcher.anon.IsWatchMode
import typings.jestWatcher.anon.ReadonlyJestHookEmitter
import typings.jestWatcher.anon.ReadonlyJestHookSubscribe
import typings.jestWatcher.anon.Stdin
import typings.jestWatcher.anon.Stdout
import typings.jestWatcher.jestWatcherStrings.watch
import typings.jestWatcher.jestWatcherStrings.watchAll
import typings.node.NodeJS.WritableStream
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-watcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("jest-watcher", "BaseWatchPlugin")
  @js.native
  open class BaseWatchPlugin protected ()
    extends StObject
       with WatchPlugin {
    def this(param0: Stdin) = this()
    
    /* protected */ var _stdin: ReadStream = js.native
    
    /* protected */ var _stdout: WriteStream = js.native
    
    @JSName("apply")
    def apply_MBaseWatchPlugin(_hooks: JestHookSubscriber): Unit = js.native
    
    @JSName("getUsageInfo")
    def getUsageInfo_MBaseWatchPlugin(_globalConfig: GlobalConfig): UsageData | Null = js.native
    
    @JSName("onKey")
    def onKey_MBaseWatchPlugin(_key: String): Unit = js.native
    
    @JSName("run")
    def run_MBaseWatchPlugin(_globalConfig: GlobalConfig, _updateConfigAndRun: UpdateConfigCallback): js.Promise[Unit | Boolean] = js.native
  }
  
  @JSImport("jest-watcher", "JestHook")
  @js.native
  open class JestHook () extends StObject {
    
    /* private */ val _emitter: Any = js.native
    
    /* private */ val _listeners: Any = js.native
    
    /* private */ val _subscriber: Any = js.native
    
    def getEmitter(): ReadonlyJestHookEmitter = js.native
    
    def getSubscriber(): ReadonlyJestHookSubscribe = js.native
    
    def isUsed(hook: AvailableHooks): Boolean = js.native
  }
  
  object KEYS {
    
    @JSImport("jest-watcher", "KEYS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("jest-watcher", "KEYS.ARROW_DOWN")
    @js.native
    def ARROW_DOWN: String = js.native
    inline def ARROW_DOWN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_DOWN")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ARROW_LEFT")
    @js.native
    def ARROW_LEFT: String = js.native
    inline def ARROW_LEFT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_LEFT")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ARROW_RIGHT")
    @js.native
    def ARROW_RIGHT: String = js.native
    inline def ARROW_RIGHT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_RIGHT")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ARROW_UP")
    @js.native
    def ARROW_UP: String = js.native
    inline def ARROW_UP_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARROW_UP")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.BACKSPACE")
    @js.native
    def BACKSPACE: String = js.native
    inline def BACKSPACE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BACKSPACE")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.CONTROL_C")
    @js.native
    def CONTROL_C: String = js.native
    inline def CONTROL_C_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTROL_C")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.CONTROL_D")
    @js.native
    def CONTROL_D: String = js.native
    inline def CONTROL_D_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTROL_D")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.CONTROL_U")
    @js.native
    def CONTROL_U: String = js.native
    inline def CONTROL_U_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTROL_U")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ENTER")
    @js.native
    def ENTER: String = js.native
    inline def ENTER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENTER")(x.asInstanceOf[js.Any])
    
    @JSImport("jest-watcher", "KEYS.ESCAPE")
    @js.native
    def ESCAPE: String = js.native
    inline def ESCAPE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ESCAPE")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSImport("jest-watcher", "PatternPrompt")
  @js.native
  open class PatternPrompt protected () extends StObject {
    def this(_pipe: WritableStream, _prompt: Prompt) = this()
    def this(_pipe: WritableStream, _prompt: Prompt, _entityName: String) = this()
    
    /* protected */ var _currentUsageRows: Double = js.native
    
    /* protected */ var _entityName: String = js.native
    
    /* protected */ def _onChange(_pattern: String, _options: ScrollOptions2): Unit = js.native
    
    /* protected */ var _pipe: WritableStream = js.native
    
    /* protected */ var _prompt: Prompt = js.native
    
    def run(onSuccess: js.Function1[/* value */ String, Unit], onCancel: js.Function0[Unit]): Unit = js.native
    def run(onSuccess: js.Function1[/* value */ String, Unit], onCancel: js.Function0[Unit], options: Header): Unit = js.native
  }
  
  @JSImport("jest-watcher", "Prompt")
  @js.native
  open class Prompt () extends StObject {
    
    /* private */ var _entering: Any = js.native
    
    /* private */ var _offset: Any = js.native
    
    /* private */ var _onCancel: Any = js.native
    
    /* private */ var _onChange: Any = js.native
    
    /* private */ val _onResize: Any = js.native
    
    /* private */ var _onSuccess: Any = js.native
    
    /* private */ var _promptLength: Any = js.native
    
    /* private */ var _selection: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    def abort(): Unit = js.native
    
    def enter(
      onChange: js.Function2[/* pattern */ String, /* options */ ScrollOptions2, Unit],
      onSuccess: js.Function1[/* pattern */ String, Unit],
      onCancel: js.Function0[Unit]
    ): Unit = js.native
    
    def isEntering(): Boolean = js.native
    
    def put(key: String): Unit = js.native
    
    def setPromptLength(length: Double): Unit = js.native
    
    def setPromptSelection(selected: String): Unit = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Emittery<{  change :State}> * / any */ @JSImport("jest-watcher", "TestWatcher")
  @js.native
  open class TestWatcher protected () extends StObject {
    def this(param0: IsWatchMode) = this()
    
    /* private */ val _isWatchMode: Any = js.native
    
    def isInterrupted(): Boolean = js.native
    
    def isWatchMode(): Boolean = js.native
    
    def setState(state: State): js.Promise[Unit] = js.native
    
    var state: State = js.native
  }
  
  inline def printPatternCaret(pattern: String, pipe: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printPatternCaret")(pattern.asInstanceOf[js.Any], pipe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def printRestoredPatternCaret(pattern: String, currentUsageRows: Double, pipe: WritableStream): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("printRestoredPatternCaret")(pattern.asInstanceOf[js.Any], currentUsageRows.asInstanceOf[js.Any], pipe.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Inlined std.Partial<std.Pick<@jest/types.@jest/types.GlobalConfig, 'bail' | 'changedSince' | 'collectCoverage' | 'collectCoverageFrom' | 'coverageDirectory' | 'coverageReporters' | 'findRelatedTests' | 'nonFlagArgs' | 'notify' | 'notifyMode' | 'onlyFailures' | 'reporters' | 'testNamePattern' | 'testPathPattern' | 'updateSnapshot' | 'verbose'> & {  mode :'watch' | 'watchAll'}> */
  trait AllowedConfigOptions extends StObject {
    
    var bail: js.UndefOr[Double] = js.undefined
    
    var changedSince: js.UndefOr[String] = js.undefined
    
    var collectCoverage: js.UndefOr[Boolean] = js.undefined
    
    var collectCoverageFrom: js.UndefOr[js.Array[String]] = js.undefined
    
    var coverageDirectory: js.UndefOr[String] = js.undefined
    
    var coverageReporters: js.UndefOr[CoverageReporters] = js.undefined
    
    var findRelatedTests: js.UndefOr[Boolean] = js.undefined
    
    var mode: js.UndefOr[watch | watchAll] = js.undefined
    
    var nonFlagArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    var notifyMode: js.UndefOr[NotifyMode] = js.undefined
    
    @JSName("notify")
    var notify_FAllowedConfigOptions: js.UndefOr[Boolean] = js.undefined
    
    var onlyFailures: js.UndefOr[Boolean] = js.undefined
    
    var reporters: js.UndefOr[js.Array[ReporterConfig]] = js.undefined
    
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
      
      inline def setCollectCoverageFrom(value: js.Array[String]): Self = StObject.set(x, "collectCoverageFrom", value.asInstanceOf[js.Any])
      
      inline def setCollectCoverageFromUndefined: Self = StObject.set(x, "collectCoverageFrom", js.undefined)
      
      inline def setCollectCoverageFromVarargs(value: String*): Self = StObject.set(x, "collectCoverageFrom", js.Array(value*))
      
      inline def setCollectCoverageUndefined: Self = StObject.set(x, "collectCoverage", js.undefined)
      
      inline def setCoverageDirectory(value: String): Self = StObject.set(x, "coverageDirectory", value.asInstanceOf[js.Any])
      
      inline def setCoverageDirectoryUndefined: Self = StObject.set(x, "coverageDirectory", js.undefined)
      
      inline def setCoverageReporters(value: CoverageReporters): Self = StObject.set(x, "coverageReporters", value.asInstanceOf[js.Any])
      
      inline def setCoverageReportersUndefined: Self = StObject.set(x, "coverageReporters", js.undefined)
      
      inline def setCoverageReportersVarargs(value: (CoverageReporterName | CoverageReporterWithOptions[CoverageReporterName])*): Self = StObject.set(x, "coverageReporters", js.Array(value*))
      
      inline def setFindRelatedTests(value: Boolean): Self = StObject.set(x, "findRelatedTests", value.asInstanceOf[js.Any])
      
      inline def setFindRelatedTestsUndefined: Self = StObject.set(x, "findRelatedTests", js.undefined)
      
      inline def setMode(value: watch | watchAll): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setNonFlagArgs(value: js.Array[String]): Self = StObject.set(x, "nonFlagArgs", value.asInstanceOf[js.Any])
      
      inline def setNonFlagArgsUndefined: Self = StObject.set(x, "nonFlagArgs", js.undefined)
      
      inline def setNonFlagArgsVarargs(value: String*): Self = StObject.set(x, "nonFlagArgs", js.Array(value*))
      
      inline def setNotifyMode(value: NotifyMode): Self = StObject.set(x, "notifyMode", value.asInstanceOf[js.Any])
      
      inline def setNotifyModeUndefined: Self = StObject.set(x, "notifyMode", js.undefined)
      
      inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
      
      inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
      
      inline def setOnlyFailures(value: Boolean): Self = StObject.set(x, "onlyFailures", value.asInstanceOf[js.Any])
      
      inline def setOnlyFailuresUndefined: Self = StObject.set(x, "onlyFailures", js.undefined)
      
      inline def setReporters(value: js.Array[ReporterConfig]): Self = StObject.set(x, "reporters", value.asInstanceOf[js.Any])
      
      inline def setReportersUndefined: Self = StObject.set(x, "reporters", js.undefined)
      
      inline def setReportersVarargs(value: ReporterConfig*): Self = StObject.set(x, "reporters", js.Array(value*))
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestWatcher.jestWatcherStrings.onFileChange
    - typings.jestWatcher.jestWatcherStrings.onTestRunComplete
    - typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite
  */
  trait AvailableHooks extends StObject
  object AvailableHooks {
    
    inline def onFileChange: typings.jestWatcher.jestWatcherStrings.onFileChange = "onFileChange".asInstanceOf[typings.jestWatcher.jestWatcherStrings.onFileChange]
    
    inline def onTestRunComplete: typings.jestWatcher.jestWatcherStrings.onTestRunComplete = "onTestRunComplete".asInstanceOf[typings.jestWatcher.jestWatcherStrings.onTestRunComplete]
    
    inline def shouldRunTestSuite: typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite = "shouldRunTestSuite".asInstanceOf[typings.jestWatcher.jestWatcherStrings.shouldRunTestSuite]
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
      
      inline def setProjectsVarargs(value: Config*): Self = StObject.set(x, "projects", js.Array(value*))
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
  
  trait ScrollOptions2 extends StObject {
    
    var max: Double
    
    var offset: Double
  }
  object ScrollOptions2 {
    
    inline def apply(max: Double, offset: Double): ScrollOptions2 = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollOptions2]
    }
    
    extension [Self <: ScrollOptions2](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  type ShouldRunTestSuite = js.Function1[/* testSuiteInfo */ TestSuiteInfo, js.Promise[Boolean]]
  
  trait State extends StObject {
    
    var interrupted: Boolean
  }
  object State {
    
    inline def apply(interrupted: Boolean): State = {
      val __obj = js.Dynamic.literal(interrupted = interrupted.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setInterrupted(value: Boolean): Self = StObject.set(x, "interrupted", value.asInstanceOf[js.Any])
    }
  }
  
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
       with Instantiable1[/* options */ Stdout, WatchPlugin]
}
