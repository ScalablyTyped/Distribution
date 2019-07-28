package typings.jest.jestMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.jest.Anon_Actual
import typings.jest.Anon_Added
import typings.jest.Anon_End
import typings.jest.Anon_Global
import typings.jest.Anon_Message
import typings.jest.Typeofjest
import typings.jest.jestMod.jasmineNs.CustomMatcherFactories
import typings.jest.jestMod.jestNs.$JestEnvironment
import typings.jest.jestMod.jestNs.AggregatedResult
import typings.jest.jestMod.jestNs.ArgsType
import typings.jest.jestMod.jestNs.AssertionResult
import typings.jest.jestMod.jestNs.Bytes
import typings.jest.jestMod.jestNs.ConfigGlobals
import typings.jest.jestMod.jestNs.ConsoleBuffer
import typings.jest.jestMod.jestNs.Constructable
import typings.jest.jestMod.jestNs.Context
import typings.jest.jestMod.jestNs.CoverageMap
import typings.jest.jestMod.jestNs.CoverageSummary
import typings.jest.jestMod.jestNs.CustomMatcher
import typings.jest.jestMod.jestNs.CustomMatcherResult
import typings.jest.jestMod.jestNs.Describe
import typings.jest.jestMod.jestNs.DoneCallback
import typings.jest.jestMod.jestNs.Each
import typings.jest.jestMod.jestNs.EmptyFunction
import typings.jest.jestMod.jestNs.Environment
import typings.jest.jestMod.jestNs.ExpectExtendMap
import typings.jest.jestMod.jestNs.FakeTimers
import typings.jest.jestMod.jestNs.FileCoverage
import typings.jest.jestMod.jestNs.FileCoverageTotal
import typings.jest.jestMod.jestNs.FunctionLike
import typings.jest.jestMod.jestNs.FunctionPropertyNames
import typings.jest.jestMod.jestNs.Glob
import typings.jest.jestMod.jestNs.Global
import typings.jest.jestMod.jestNs.GlobalConfig
import typings.jest.jestMod.jestNs.HasteConfig
import typings.jest.jestMod.jestNs.HasteFS
import typings.jest.jestMod.jestNs.HasteResolver
import typings.jest.jestMod.jestNs.InverseAsymmetricMatchers
import typings.jest.jestMod.jestNs.It
import typings.jest.jestMod.jestNs.LogEntry
import typings.jest.jestMod.jestNs.LogMessage
import typings.jest.jestMod.jestNs.LogType
import typings.jest.jestMod.jestNs.MatcherUtils
import typings.jest.jestMod.jestNs.Matchers
import typings.jest.jestMod.jestNs.Maybe
import typings.jest.jestMod.jestNs.Milliseconds
import typings.jest.jestMod.jestNs.Mock
import typings.jest.jestMod.jestNs.MockContext
import typings.jest.jestMod.jestNs.MockInstance
import typings.jest.jestMod.jestNs.MockOptions
import typings.jest.jestMod.jestNs.MockResult
import typings.jest.jestMod.jestNs.ModuleMap
import typings.jest.jestMod.jestNs.ModuleMocker
import typings.jest.jestMod.jestNs.NonFunctionPropertyNames
import typings.jest.jestMod.jestNs.Path
import typings.jest.jestMod.jestNs.ProjectConfig
import typings.jest.jestMod.jestNs.ProvidesCallback
import typings.jest.jestMod.jestNs.RawCoverage
import typings.jest.jestMod.jestNs.RawFileCoverage
import typings.jest.jestMod.jestNs.RejectedValue
import typings.jest.jestMod.jestNs.ReporterConfig
import typings.jest.jestMod.jestNs.ReporterOnStartOptions
import typings.jest.jestMod.jestNs.ResolvedValue
import typings.jest.jestMod.jestNs.Runtime
import typings.jest.jestMod.jestNs.Script
import typings.jest.jestMod.jestNs.SerializableError
import typings.jest.jestMod.jestNs.Set
import typings.jest.jestMod.jestNs.SnapshotSerializerColor
import typings.jest.jestMod.jestNs.SnapshotSerializerColors
import typings.jest.jestMod.jestNs.SnapshotSerializerOptions
import typings.jest.jestMod.jestNs.SnapshotSerializerOptionsTheme
import typings.jest.jestMod.jestNs.SnapshotSerializerPlugin
import typings.jest.jestMod.jestNs.SnapshotSummary
import typings.jest.jestMod.jestNs.SnapshotUpdateState
import typings.jest.jestMod.jestNs.SpyInstance
import typings.jest.jestMod.jestNs.Status
import typings.jest.jestMod.jestNs.Test
import typings.jest.jestMod.jestNs.TestResult
import typings.jest.jestMod.jestNs.TransformOptions
import typings.jest.jestMod.jestNs.TransformedSource
import typings.jest.jestStrings.`return`
import typings.jest.jestStrings.`throw`
import typings.jest.jestStrings.fake
import typings.jest.jestStrings.get
import typings.jest.jestStrings.incomplete
import typings.jest.jestStrings.real
import typings.jest.jestStrings.set
import typings.std.Error
import typings.std.Partial
import typings.std.RegExp
import typings.std.Required
import typings.std.ReturnType
import typings.std.TemplateStringsArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest", "jest")
@js.native
object jestNs extends js.Object {
  trait $JestEnvironment extends js.Object {
    var fakeTimers: FakeTimers
    var global: Global
    var moduleMocker: ModuleMocker
    var testFilePath: String
    def dispose(): Unit
    def runScript(script: Script): js.Any
  }
  
  trait AggregatedResult extends js.Object {
    var coverageMap: js.UndefOr[Maybe[CoverageMap]] = js.undefined
    var numFailedTestSuites: Double
    var numFailedTests: Double
    var numPassedTestSuites: Double
    var numPassedTests: Double
    var numPendingTestSuites: Double
    var numPendingTests: Double
    var numRuntimeErrorTestSuites: Double
    var numTodoTests: Double
    var numTotalTestSuites: Double
    var numTotalTests: Double
    var snapshot: SnapshotSummary
    var startTime: Double
    var success: Boolean
    var testResults: js.Array[TestResult]
    var wasInterrupted: Boolean
  }
  
  trait AssertionResult extends js.Object {
    var ancestorTitles: js.Array[String]
    var duration: js.UndefOr[Maybe[Milliseconds]] = js.undefined
    var failureMessages: js.Array[String]
    var fullName: String
    var numPassingAsserts: Double
    var status: Status
    var title: String
  }
  
  @js.native
  trait Constructable
    extends Instantiable1[/* args (repeated) */ js.Any, js.Any]
  
  // Context
  trait Context extends js.Object {
    var config: ProjectConfig
    var hasteFS: HasteFS
    var moduleMap: ModuleMap
    var resolver: HasteResolver
  }
  
  trait CoverageMap extends js.Object {
    var data: RawCoverage
    def addFileCoverage(fileCoverage: RawFileCoverage): Unit
    def fileCoverageFor(file: String): FileCoverage
    def files(): js.Array[String]
    def getCoverageSummary(): FileCoverage
    def merge(data: js.Object): Unit
  }
  
  trait CoverageSummary extends js.Object {
    var branches: FileCoverageTotal
    var functions: FileCoverageTotal
    var lines: FileCoverageTotal
    var statements: FileCoverageTotal
  }
  
  trait CustomMatcherResult extends js.Object {
    var message: String | js.Function0[String]
    var pass: Boolean
  }
  
  trait DefaultOptions extends js.Object {
    var automock: Boolean
    var bail: Boolean
    var browser: Boolean
    var cache: Boolean
    var cacheDirectory: Path
    var changedFilesWithAncestor: Boolean
    var clearMocks: Boolean
    var collectCoverage: Boolean
    var collectCoverageFrom: Maybe[js.Array[String]]
    var coverageDirectory: Maybe[String]
    var coveragePathIgnorePatterns: js.Array[String]
    var coverageReporters: js.Array[String]
    var coverageThreshold: Maybe[Anon_Global]
    var detectLeaks: Boolean
    var detectOpenHandles: Boolean
    var errorOnDeprecated: Boolean
    var expand: Boolean
    var filter: Maybe[Path]
    var forceCoverageMatch: js.Array[Glob]
    var globalSetup: Maybe[String]
    var globalTeardown: Maybe[String]
    var globals: ConfigGlobals
    var haste: HasteConfig
    var moduleDirectories: js.Array[String]
    var moduleFileExtensions: js.Array[String]
    var moduleNameMapper: StringDictionary[String]
    var modulePathIgnorePatterns: js.Array[String]
    var noStackTrace: Boolean
    var notifyMode: String
    @JSName("notify")
    var notify_FDefaultOptions: Boolean
    var preset: Maybe[String]
    var projects: Maybe[js.Array[String | ProjectConfig]]
    var resetMocks: Boolean
    var resetModules: Boolean
    var resolver: Maybe[Path]
    var restoreMocks: Boolean
    var rootDir: Maybe[Path]
    var roots: Maybe[js.Array[Path]]
    var runTestsByPath: Boolean
    var runner: String
    var setupFiles: js.Array[Path]
    var setupTestFrameworkScriptFile: Maybe[Path]
    var skipFilter: Boolean
    var snapshotSerializers: js.Array[Path]
    var testEnvironment: String
    var testEnvironmentOptions: js.Object
    var testFailureExitCode: String | Double
    var testLocationInResults: Boolean
    var testMatch: js.Array[Glob]
    var testPathIgnorePatterns: js.Array[String]
    var testRegex: String
    var testResultsProcessor: Maybe[String]
    var testRunner: Maybe[String]
    var testURL: String
    var timers: real | fake
    var transform: Maybe[StringDictionary[String]]
    var transformIgnorePatterns: js.Array[Glob]
    var useStderr: Boolean
    var verbose: Maybe[Boolean]
    var watch: Boolean
    var watchPathIgnorePatterns: js.Array[String]
    var watchman: Boolean
  }
  
  @js.native
  trait Describe extends js.Object {
    @JSName("each")
    var each_Original: Each = js.native
    /** Only runs the tests inside this `describe` for the current file */
    @JSName("only")
    var only_Original: Describe = js.native
    /** Skips running the tests inside this `describe` for the current file */
    @JSName("skip")
    var skip_Original: Describe = js.native
    def apply(name: String, fn: EmptyFunction): Unit = js.native
    def apply(name: js.Function, fn: EmptyFunction): Unit = js.native
    // tslint:disable-next-line ban-types
    def apply(name: Double, fn: EmptyFunction): Unit = js.native
    def apply(name: FunctionLike, fn: EmptyFunction): Unit = js.native
    def each(cases: js.Array[js.Array[_]]): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* repeated */ js.Any, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    def each(strings: TemplateStringsArray, placeholders: js.Any*): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* arg */ js.Any, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    // Not arrays.
    @JSName("each")
    def each_T[T](cases: js.Array[T]): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* repeated */ T, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    // Exclusively arrays.
    @JSName("each")
    def each_T_ArrayWildcard[T /* <: js.Array[_] */](cases: js.Array[T]): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* args */ T, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    def only(name: String, fn: EmptyFunction): Unit = js.native
    def only(name: js.Function, fn: EmptyFunction): Unit = js.native
    // tslint:disable-next-line ban-types
    /** Only runs the tests inside this `describe` for the current file */
    def only(name: Double, fn: EmptyFunction): Unit = js.native
    def only(name: FunctionLike, fn: EmptyFunction): Unit = js.native
    def skip(name: String, fn: EmptyFunction): Unit = js.native
    def skip(name: js.Function, fn: EmptyFunction): Unit = js.native
    // tslint:disable-next-line ban-types
    /** Skips running the tests inside this `describe` for the current file */
    def skip(name: Double, fn: EmptyFunction): Unit = js.native
    def skip(name: FunctionLike, fn: EmptyFunction): Unit = js.native
  }
  
  @js.native
  trait DoneCallback extends js.Object {
    def apply(args: js.Any*): js.Any = js.native
    def fail(): js.Any = js.native
    def fail(error: String): js.Any = js.native
    def fail(error: Anon_Message): js.Any = js.native
  }
  
  @js.native
  trait Each extends js.Object {
    def apply(cases: js.Array[js.Array[_]]): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* repeated */ js.Any, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    def apply(strings: TemplateStringsArray, placeholders: js.Any*): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* arg */ js.Any, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
  }
  
  /**
    * The `expect` function is used every time you want to test a value.
    * You will rarely call `expect` by itself.
    */
  @js.native
  trait Expect extends js.Object {
    var not: InverseAsymmetricMatchers = js.native
    /**
      * The `expect` function is used every time you want to test a value.
      * You will rarely call `expect` by itself.
      *
      * @param actual The value to apply matchers against.
      */
    def apply[T](actual: T): Matchers[T] = js.native
    /**
      * Adds a module to format application-specific data structures for serialization.
      */
    def addSnapshotSerializer(serializer: SnapshotSerializerPlugin): Unit = js.native
    /**
      * Matches anything that was created with the given constructor.
      * You can use it inside `toEqual` or `toBeCalledWith` instead of a literal value.
      *
      * @example
      *
      * function randocall(fn) {
      *   return fn(Math.floor(Math.random() * 6 + 1));
      * }
      *
      * test('randocall calls its callback with a number', () => {
      *   const mock = jest.fn();
      *   randocall(mock);
      *   expect(mock).toBeCalledWith(expect.any(Number));
      * });
      */
    def any(classType: js.Any): js.Any = js.native
    /**
      * Matches anything but null or undefined. You can use it inside `toEqual` or `toBeCalledWith` instead
      * of a literal value. For example, if you want to check that a mock function is called with a
      * non-null argument:
      *
      * @example
      *
      * test('map calls its argument with a non-null argument', () => {
      *   const mock = jest.fn();
      *   [1].map(x => mock(x));
      *   expect(mock).toBeCalledWith(expect.anything());
      * });
      *
      */
    def anything(): js.Any = js.native
    /**
      * Matches any array made up entirely of elements in the provided array.
      * You can use it inside `toEqual` or `toBeCalledWith` instead of a literal value.
      */
    def arrayContaining(arr: js.Array[_]): js.Any = js.native
    /**
      * Verifies that a certain number of assertions are called during a test.
      * This is often useful when testing asynchronous code, in order to
      * make sure that assertions in a callback actually got called.
      */
    def assertions(num: Double): Unit = js.native
    /**
      * You can use `expect.extend` to add your own matchers to Jest.
      */
    def extend(obj: ExpectExtendMap): Unit = js.native
    /**
      * Verifies that at least one assertion is called during a test.
      * This is often useful when testing asynchronous code, in order to
      * make sure that assertions in a callback actually got called.
      */
    def hasAssertions(): Unit = js.native
    /**
      * Matches any object that recursively matches the provided keys.
      * This is often handy in conjunction with other asymmetric matchers.
      */
    def objectContaining(obj: js.Object): js.Any = js.native
    /**
      * Matches any received string that contains the exact expected string
      */
    def stringContaining(str: String): js.Any = js.native
    /**
      * Matches any string that contains the exact provided string
      */
    def stringMatching(str: String): js.Any = js.native
    def stringMatching(str: RegExp): js.Any = js.native
  }
  
  // Environment
  trait FakeTimers extends js.Object {
    def advanceTimersByTime(msToRun: Double): Unit
    def clearAllTimers(): Unit
    def runAllImmediates(): Unit
    def runAllTicks(): Unit
    def runAllTimers(): Unit
    def runOnlyPendingTimers(): Unit
    def runTimersToTime(msToRun: Double): Unit
    def runWithRealTimers(callback: js.Any): Unit
    def useFakeTimers(): Unit
    def useRealTimers(): Unit
  }
  
  trait FileCoverage extends js.Object {
    def computeBranchTotals(): FileCoverageTotal
    def computeSimpleTotals(property: String): FileCoverageTotal
    def getBranchCoverageByLine(): js.Object
    def getLineCoverage(): js.Object
    def getUncoveredLines(): js.Array[Double]
    def merge(other: js.Object): Unit
    def resetHits(): Unit
    def toJSON(): js.Object
    def toSummary(): CoverageSummary
  }
  
  trait FileCoverageTotal extends js.Object {
    var covered: Double
    var pct: js.UndefOr[Double] = js.undefined
    var skipped: Double
    var total: Double
  }
  
  trait FunctionLike extends js.Object {
    val name: String
  }
  
  trait GlobalConfig extends js.Object {
    var bail: Boolean
    var collectCoverage: Boolean
    var collectCoverageFrom: js.Array[Glob]
    var collectCoverageOnlyFrom: Maybe[StringDictionary[Boolean]]
    var coverageDirectory: String
    var coverageReporters: js.Array[String]
    var coverageThreshold: Anon_Global
    var expand: Boolean
    var forceExit: Boolean
    var logHeapUsage: Boolean
    var mapCoverage: Boolean
    var noStackTrace: Boolean
    @JSName("notify")
    var notify_FGlobalConfig: Boolean
    var projects: js.Array[Glob]
    var replname: Maybe[String]
    var reporters: js.Array[ReporterConfig]
    var rootDir: Path
    var silent: Boolean
    var testNamePattern: String
    var testPathPattern: String
    var testResultsProcessor: Maybe[String]
    var updateSnapshot: SnapshotUpdateState
    var useStderr: Boolean
    var verbose: Maybe[Boolean]
    var watch: Boolean
    var watchman: Boolean
  }
  
  trait HasteConfig extends js.Object {
    var defaultPlatform: js.UndefOr[Maybe[String]] = js.undefined
    var hasteImplModulePath: js.UndefOr[String] = js.undefined
    var platforms: js.UndefOr[js.Array[String]] = js.undefined
    var providesModuleNodeModules: js.Array[String]
  }
  
  trait InitialOptions extends js.Object {
    var automock: js.UndefOr[Boolean] = js.undefined
    var bail: js.UndefOr[Boolean] = js.undefined
    var browser: js.UndefOr[Boolean] = js.undefined
    var cache: js.UndefOr[Boolean] = js.undefined
    var cacheDirectory: js.UndefOr[Path] = js.undefined
    var changedFilesWithAncestor: js.UndefOr[Boolean] = js.undefined
    var changedSince: js.UndefOr[String] = js.undefined
    var clearMocks: js.UndefOr[Boolean] = js.undefined
    var collectCoverage: js.UndefOr[Boolean] = js.undefined
    var collectCoverageFrom: js.UndefOr[js.Array[Glob]] = js.undefined
    var collectCoverageOnlyFrom: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    var coverageDirectory: js.UndefOr[String] = js.undefined
    var coveragePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    var coverageReporters: js.UndefOr[js.Array[String]] = js.undefined
    var coverageThreshold: js.UndefOr[Anon_Global] = js.undefined
    var detectLeaks: js.UndefOr[Boolean] = js.undefined
    var detectOpenHandles: js.UndefOr[Boolean] = js.undefined
    var displayName: js.UndefOr[String] = js.undefined
    var errorOnDeprecated: js.UndefOr[Boolean] = js.undefined
    var expand: js.UndefOr[Boolean] = js.undefined
    var filter: js.UndefOr[Path] = js.undefined
    var findRelatedTests: js.UndefOr[Boolean] = js.undefined
    var forceCoverageMatch: js.UndefOr[js.Array[Glob]] = js.undefined
    var forceExit: js.UndefOr[Boolean] = js.undefined
    var globalSetup: js.UndefOr[Maybe[String]] = js.undefined
    var globalTeardown: js.UndefOr[Maybe[String]] = js.undefined
    var globals: js.UndefOr[ConfigGlobals] = js.undefined
    var haste: js.UndefOr[HasteConfig] = js.undefined
    var json: js.UndefOr[Boolean] = js.undefined
    var lastCommit: js.UndefOr[Boolean] = js.undefined
    var listTests: js.UndefOr[Boolean] = js.undefined
    var logHeapUsage: js.UndefOr[Boolean] = js.undefined
    var mapCoverage: js.UndefOr[Boolean] = js.undefined
    var moduleDirectories: js.UndefOr[js.Array[String]] = js.undefined
    var moduleFileExtensions: js.UndefOr[js.Array[String]] = js.undefined
    var moduleLoader: js.UndefOr[Path] = js.undefined
    var moduleNameMapper: js.UndefOr[StringDictionary[String]] = js.undefined
    var modulePathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    var modulePaths: js.UndefOr[js.Array[String]] = js.undefined
    var name: js.UndefOr[String] = js.undefined
    var noStackTrace: js.UndefOr[Boolean] = js.undefined
    var notifyMode: js.UndefOr[String] = js.undefined
    @JSName("notify")
    var notify_FInitialOptions: js.UndefOr[Boolean] = js.undefined
    var onlyChanged: js.UndefOr[Boolean] = js.undefined
    var outputFile: js.UndefOr[Path] = js.undefined
    var passWithNoTests: js.UndefOr[Boolean] = js.undefined
    var preprocessorIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
    var preset: js.UndefOr[Maybe[String]] = js.undefined
    var projects: js.UndefOr[js.Array[Glob]] = js.undefined
    var replname: js.UndefOr[Maybe[String]] = js.undefined
    var reporters: js.UndefOr[js.Array[ReporterConfig | String]] = js.undefined
    var resetMocks: js.UndefOr[Boolean] = js.undefined
    var resetModules: js.UndefOr[Boolean] = js.undefined
    var resolver: js.UndefOr[Maybe[Path]] = js.undefined
    var restoreMocks: js.UndefOr[Boolean] = js.undefined
    var rootDir: js.UndefOr[Path] = js.undefined
    var roots: js.UndefOr[js.Array[Path]] = js.undefined
    var runTestsByPath: js.UndefOr[Boolean] = js.undefined
    var runner: js.UndefOr[String] = js.undefined
    var scriptPreprocessor: js.UndefOr[String] = js.undefined
    var setupFiles: js.UndefOr[js.Array[Path]] = js.undefined
    var setupFilesAfterEnv: js.UndefOr[js.Array[Path]] = js.undefined
    var setupTestFrameworkScriptFile: js.UndefOr[Path] = js.undefined
    var silent: js.UndefOr[Boolean] = js.undefined
    var skipFilter: js.UndefOr[Boolean] = js.undefined
    var skipNodeResolution: js.UndefOr[Boolean] = js.undefined
    var snapshotSerializers: js.UndefOr[js.Array[Path]] = js.undefined
    var testEnvironment: js.UndefOr[String] = js.undefined
    var testEnvironmentOptions: js.UndefOr[js.Object] = js.undefined
    var testFailureExitCode: js.UndefOr[String | Double] = js.undefined
    var testLocationInResults: js.UndefOr[Boolean] = js.undefined
    var testMatch: js.UndefOr[js.Array[Glob]] = js.undefined
    var testNamePattern: js.UndefOr[String] = js.undefined
    var testPathDirs: js.UndefOr[js.Array[Path]] = js.undefined
    var testPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    var testRegex: js.UndefOr[String] = js.undefined
    var testResultsProcessor: js.UndefOr[Maybe[String]] = js.undefined
    var testRunner: js.UndefOr[String] = js.undefined
    var testURL: js.UndefOr[String] = js.undefined
    var timers: js.UndefOr[real | fake] = js.undefined
    var transform: js.UndefOr[StringDictionary[String]] = js.undefined
    var transformIgnorePatterns: js.UndefOr[js.Array[Glob]] = js.undefined
    var unmockedModulePathPatterns: js.UndefOr[js.Array[String]] = js.undefined
    var updateSnapshot: js.UndefOr[Boolean] = js.undefined
    var useStderr: js.UndefOr[Boolean] = js.undefined
    var verbose: js.UndefOr[Maybe[Boolean]] = js.undefined
    var watch: js.UndefOr[Boolean] = js.undefined
    var watchAll: js.UndefOr[Boolean] = js.undefined
    var watchPathIgnorePatterns: js.UndefOr[js.Array[String]] = js.undefined
    var watchPlugins: js.UndefOr[js.Array[String]] = js.undefined
    var watchman: js.UndefOr[Boolean] = js.undefined
  }
  
  @js.native
  trait InverseAsymmetricMatchers extends js.Object {
    /**
      * `expect.not.arrayContaining(array)` matches a received array which
      * does not contain all of the elements in the expected array. That is,
      * the expected array is not a subset of the received array. It is the
      * inverse of `expect.arrayContaining`.
      */
    def arrayContaining(arr: js.Array[_]): js.Any = js.native
    /**
      * `expect.not.objectContaining(object)` matches any received object
      * that does not recursively match the expected properties. That is, the
      * expected object is not a subset of the received object. Therefore,
      * it matches a received object which contains properties that are not
      * in the expected object. It is the inverse of `expect.objectContaining`.
      */
    def objectContaining(obj: js.Object): js.Any = js.native
    /**
      * `expect.not.stringContaining(string)` matches the received string
      * that does not contain the exact expected string. It is the inverse of
      * `expect.stringContaining`.
      */
    def stringContaining(str: String): js.Any = js.native
    /**
      * `expect.not.stringMatching(string | regexp)` matches the received
      * string that does not match the expected regexp. It is the inverse of
      * `expect.stringMatching`.
      */
    def stringMatching(str: String): js.Any = js.native
    def stringMatching(str: RegExp): js.Any = js.native
  }
  
  /**
    * Creates a test closure
    */
  @js.native
  trait It extends js.Object {
    /**
      * Experimental and should be avoided.
      */
    @JSName("concurrent")
    var concurrent_Original: It = js.native
    /**
      * Use if you keep duplicating the same test with different data. `.each` allows you to write the
      * test once and pass data in.
      *
      * `.each` is available with two APIs:
      *
      * #### 1  `test.each(table)(name, fn)`
      *
      * - `table`: Array of Arrays with the arguments that are passed into the test fn for each row.
      * - `name`: String the title of the test block.
      * - `fn`: Function the test to be ran, this is the function that will receive the parameters in each row as function arguments.
      *
      *
      * #### 2  `test.each table(name, fn)`
      *
      * - `table`: Tagged Template Literal
      * - `name`: String the title of the test, use `$variable` to inject test data into the test title from the tagged template expressions.
      * - `fn`: Function the test to be ran, this is the function that will receive the test data object..
      *
      * @example
      *
      * // API 1
      * test.each([[1, 1, 2], [1, 2, 3], [2, 1, 3]])(
      *   '.add(%i, %i)',
      *   (a, b, expected) => {
      *     expect(a + b).toBe(expected);
      *   },
      * );
      *
      * // API 2
      * test.each`
      * a    | b    | expected
      * ${1} | ${1} | ${2}
      * ${1} | ${2} | ${3}
      * ${2} | ${1} | ${3}
      * `('returns $expected when $a is added $b', ({a, b, expected}) => {
      *    expect(a + b).toBe(expected);
      * });
      *
      */
    @JSName("each")
    var each_Original: Each = js.native
    /**
      * Only runs this test in the current file.
      */
    @JSName("only")
    var only_Original: It = js.native
    /**
      * Skips running this test in the current file.
      */
    @JSName("skip")
    var skip_Original: It = js.native
    /**
      * Sketch out which tests to write in the future.
      */
    @JSName("todo")
    var todo_Original: It = js.native
    /**
      * Creates a test closure.
      *
      * @param name The name of your test
      * @param fn The function for your test
      * @param timeout The timeout for an async function test
      */
    def apply(name: String): Unit = js.native
    def apply(name: String, fn: ProvidesCallback): Unit = js.native
    def apply(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
    /**
      * Creates a test closure.
      *
      * @param name The name of your test
      * @param fn The function for your test
      * @param timeout The timeout for an async function test
      */
    /**
      * Experimental and should be avoided.
      */
    def concurrent(name: String): Unit = js.native
    def concurrent(name: String, fn: ProvidesCallback): Unit = js.native
    def concurrent(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
    /**
      * Use if you keep duplicating the same test with different data. `.each` allows you to write the
      * test once and pass data in.
      *
      * `.each` is available with two APIs:
      *
      * #### 1  `test.each(table)(name, fn)`
      *
      * - `table`: Array of Arrays with the arguments that are passed into the test fn for each row.
      * - `name`: String the title of the test block.
      * - `fn`: Function the test to be ran, this is the function that will receive the parameters in each row as function arguments.
      *
      *
      * #### 2  `test.each table(name, fn)`
      *
      * - `table`: Tagged Template Literal
      * - `name`: String the title of the test, use `$variable` to inject test data into the test title from the tagged template expressions.
      * - `fn`: Function the test to be ran, this is the function that will receive the test data object..
      *
      * @example
      *
      * // API 1
      * test.each([[1, 1, 2], [1, 2, 3], [2, 1, 3]])(
      *   '.add(%i, %i)',
      *   (a, b, expected) => {
      *     expect(a + b).toBe(expected);
      *   },
      * );
      *
      * // API 2
      * test.each`
      * a    | b    | expected
      * ${1} | ${1} | ${2}
      * ${1} | ${2} | ${3}
      * ${2} | ${1} | ${3}
      * `('returns $expected when $a is added $b', ({a, b, expected}) => {
      *    expect(a + b).toBe(expected);
      * });
      *
      */
    def each(cases: js.Array[js.Array[_]]): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* repeated */ js.Any, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    /**
      * Use if you keep duplicating the same test with different data. `.each` allows you to write the
      * test once and pass data in.
      *
      * `.each` is available with two APIs:
      *
      * #### 1  `test.each(table)(name, fn)`
      *
      * - `table`: Array of Arrays with the arguments that are passed into the test fn for each row.
      * - `name`: String the title of the test block.
      * - `fn`: Function the test to be ran, this is the function that will receive the parameters in each row as function arguments.
      *
      *
      * #### 2  `test.each table(name, fn)`
      *
      * - `table`: Tagged Template Literal
      * - `name`: String the title of the test, use `$variable` to inject test data into the test title from the tagged template expressions.
      * - `fn`: Function the test to be ran, this is the function that will receive the test data object..
      *
      * @example
      *
      * // API 1
      * test.each([[1, 1, 2], [1, 2, 3], [2, 1, 3]])(
      *   '.add(%i, %i)',
      *   (a, b, expected) => {
      *     expect(a + b).toBe(expected);
      *   },
      * );
      *
      * // API 2
      * test.each`
      * a    | b    | expected
      * ${1} | ${1} | ${2}
      * ${1} | ${2} | ${3}
      * ${2} | ${1} | ${3}
      * `('returns $expected when $a is added $b', ({a, b, expected}) => {
      *    expect(a + b).toBe(expected);
      * });
      *
      */
    def each(strings: TemplateStringsArray, placeholders: js.Any*): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* arg */ js.Any, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    // Not arrays.
    /**
      * Use if you keep duplicating the same test with different data. `.each` allows you to write the
      * test once and pass data in.
      *
      * `.each` is available with two APIs:
      *
      * #### 1  `test.each(table)(name, fn)`
      *
      * - `table`: Array of Arrays with the arguments that are passed into the test fn for each row.
      * - `name`: String the title of the test block.
      * - `fn`: Function the test to be ran, this is the function that will receive the parameters in each row as function arguments.
      *
      *
      * #### 2  `test.each table(name, fn)`
      *
      * - `table`: Tagged Template Literal
      * - `name`: String the title of the test, use `$variable` to inject test data into the test title from the tagged template expressions.
      * - `fn`: Function the test to be ran, this is the function that will receive the test data object..
      *
      * @example
      *
      * // API 1
      * test.each([[1, 1, 2], [1, 2, 3], [2, 1, 3]])(
      *   '.add(%i, %i)',
      *   (a, b, expected) => {
      *     expect(a + b).toBe(expected);
      *   },
      * );
      *
      * // API 2
      * test.each`
      * a    | b    | expected
      * ${1} | ${1} | ${2}
      * ${1} | ${2} | ${3}
      * ${2} | ${1} | ${3}
      * `('returns $expected when $a is added $b', ({a, b, expected}) => {
      *    expect(a + b).toBe(expected);
      * });
      *
      */
    @JSName("each")
    def each_T[T](cases: js.Array[T]): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* repeated */ T, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    // Exclusively arrays.
    /**
      * Use if you keep duplicating the same test with different data. `.each` allows you to write the
      * test once and pass data in.
      *
      * `.each` is available with two APIs:
      *
      * #### 1  `test.each(table)(name, fn)`
      *
      * - `table`: Array of Arrays with the arguments that are passed into the test fn for each row.
      * - `name`: String the title of the test block.
      * - `fn`: Function the test to be ran, this is the function that will receive the parameters in each row as function arguments.
      *
      *
      * #### 2  `test.each table(name, fn)`
      *
      * - `table`: Tagged Template Literal
      * - `name`: String the title of the test, use `$variable` to inject test data into the test title from the tagged template expressions.
      * - `fn`: Function the test to be ran, this is the function that will receive the test data object..
      *
      * @example
      *
      * // API 1
      * test.each([[1, 1, 2], [1, 2, 3], [2, 1, 3]])(
      *   '.add(%i, %i)',
      *   (a, b, expected) => {
      *     expect(a + b).toBe(expected);
      *   },
      * );
      *
      * // API 2
      * test.each`
      * a    | b    | expected
      * ${1} | ${1} | ${2}
      * ${1} | ${2} | ${3}
      * ${2} | ${1} | ${3}
      * `('returns $expected when $a is added $b', ({a, b, expected}) => {
      *    expect(a + b).toBe(expected);
      * });
      *
      */
    @JSName("each")
    def each_T_ArrayWildcard[T /* <: js.Array[_] */](cases: js.Array[T]): js.Function3[
        /* name */ String, 
        /* fn */ js.Function1[/* args */ T, _], 
        /* timeout */ js.UndefOr[Double], 
        Unit
      ] = js.native
    /**
      * Creates a test closure.
      *
      * @param name The name of your test
      * @param fn The function for your test
      * @param timeout The timeout for an async function test
      */
    /**
      * Only runs this test in the current file.
      */
    def only(name: String): Unit = js.native
    def only(name: String, fn: ProvidesCallback): Unit = js.native
    def only(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
    /**
      * Creates a test closure.
      *
      * @param name The name of your test
      * @param fn The function for your test
      * @param timeout The timeout for an async function test
      */
    /**
      * Skips running this test in the current file.
      */
    def skip(name: String): Unit = js.native
    def skip(name: String, fn: ProvidesCallback): Unit = js.native
    def skip(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
    /**
      * Creates a test closure.
      *
      * @param name The name of your test
      * @param fn The function for your test
      * @param timeout The timeout for an async function test
      */
    /**
      * Sketch out which tests to write in the future.
      */
    def todo(name: String): Unit = js.native
    def todo(name: String, fn: ProvidesCallback): Unit = js.native
    def todo(name: String, fn: ProvidesCallback, timeout: Double): Unit = js.native
  }
  
  trait LogEntry extends js.Object {
    var message: LogMessage
    var origin: String
    var `type`: LogType
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jest.jestStrings.log
    - typings.jest.jestStrings.info
    - typings.jest.jestStrings.warn
    - typings.jest.jestStrings.error
  */
  trait LogType extends js.Object
  
  trait MatcherUtils extends js.Object {
    val expand: Boolean
    val isNot: Boolean
    var utils: Anon_Actual
    /**
      *  This is a deep-equality function that will return true if two objects have the same values (recursively).
      */
    def equals(a: js.Any, b: js.Any): Boolean
  }
  
  @js.native
  trait Matchers[R] extends js.Object {
    /**
      * If you know how to test something, `.not` lets you test its opposite.
      */
    var not: Matchers[R] = js.native
    /**
      * Unwraps the reason of a rejected promise so any other matcher can be chained.
      * If the promise is fulfilled the assertion fails.
      */
    var rejects: Matchers[js.Promise[R]] = js.native
    /**
      * Use resolves to unwrap the value of a fulfilled promise so any other
      * matcher can be chained. If the promise is rejected the assertion fails.
      */
    var resolves: Matchers[js.Promise[R]] = js.native
    /**
      * Ensures the last call to a mock function was provided specific args.
      */
    def lastCalledWith(args: js.Any*): R = js.native
    /**
      * Ensure that the last call to a mock function has returned a specified value.
      */
    def lastReturnedWith(value: js.Any): R = js.native
    /**
      * Ensure that a mock function is called with specific arguments on an Nth call.
      */
    def nthCalledWith(nthCall: Double, params: js.Any*): R = js.native
    /**
      * Ensure that the nth call to a mock function has returned a specified value.
      */
    def nthReturnedWith(n: Double, value: js.Any): R = js.native
    /**
      * Checks that a value is what you expect. It uses `===` to check strict equality.
      * Don't use `toBe` with floating-point numbers.
      */
    def toBe(expected: js.Any): R = js.native
    /**
      * Ensures that a mock function is called.
      */
    def toBeCalled(): R = js.native
    /**
      * Ensures that a mock function is called an exact number of times.
      */
    def toBeCalledTimes(expected: Double): R = js.native
    /**
      * Ensure that a mock function is called with specific arguments.
      */
    def toBeCalledWith(args: js.Any*): R = js.native
    /**
      * Using exact equality with floating point numbers is a bad idea.
      * Rounding means that intuitive things fail.
      * The default for numDigits is 2.
      */
    def toBeCloseTo(expected: Double): R = js.native
    def toBeCloseTo(expected: Double, numDigits: Double): R = js.native
    /**
      * Ensure that a variable is not undefined.
      */
    def toBeDefined(): R = js.native
    /**
      * When you don't care what a value is, you just want to
      * ensure a value is false in a boolean context.
      */
    def toBeFalsy(): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeGreaterThan(expected: Double): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeGreaterThanOrEqual(expected: Double): R = js.native
    /**
      * Ensure that an object is an instance of a class.
      * This matcher uses `instanceof` underneath.
      */
    def toBeInstanceOf(expected: js.Any): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeLessThan(expected: Double): R = js.native
    /**
      * For comparing floating point numbers.
      */
    def toBeLessThanOrEqual(expected: Double): R = js.native
    /**
      * Used to check that a variable is NaN.
      */
    def toBeNaN(): R = js.native
    /**
      * This is the same as `.toBe(null)` but the error messages are a bit nicer.
      * So use `.toBeNull()` when you want to check that something is null.
      */
    def toBeNull(): R = js.native
    /**
      * Use when you don't care what a value is, you just want to ensure a value
      * is true in a boolean context. In JavaScript, there are six falsy values:
      * `false`, `0`, `''`, `null`, `undefined`, and `NaN`. Everything else is truthy.
      */
    def toBeTruthy(): R = js.native
    /**
      * Used to check that a variable is undefined.
      */
    def toBeUndefined(): R = js.native
    /**
      * Used when you want to check that an item is in a list.
      * For testing the items in the list, this uses `===`, a strict equality check.
      */
    def toContain(expected: js.Any): R = js.native
    /**
      * Used when you want to check that an item is in a list.
      * For testing the items in the list, this  matcher recursively checks the
      * equality of all fields, rather than checking for object identity.
      */
    def toContainEqual(expected: js.Any): R = js.native
    /**
      * Used when you want to check that two objects have the same value.
      * This matcher recursively checks the equality of all fields, rather than checking for object identity.
      */
    def toEqual(expected: js.Any): R = js.native
    /**
      * Ensures that a mock function is called.
      */
    def toHaveBeenCalled(): R = js.native
    /**
      * Ensures that a mock function is called an exact number of times.
      */
    def toHaveBeenCalledTimes(expected: Double): R = js.native
    /**
      * Ensure that a mock function is called with specific arguments.
      */
    def toHaveBeenCalledWith(params: js.Any*): R = js.native
    /**
      * If you have a mock function, you can use `.toHaveBeenLastCalledWith`
      * to test what arguments it was last called with.
      */
    def toHaveBeenLastCalledWith(params: js.Any*): R = js.native
    /**
      * Ensure that a mock function is called with specific arguments on an Nth call.
      */
    def toHaveBeenNthCalledWith(nthCall: Double, params: js.Any*): R = js.native
    /**
      * Use to test the specific value that a mock function last returned.
      * If the last call to the mock function threw an error, then this matcher will fail
      * no matter what value you provided as the expected return value.
      */
    def toHaveLastReturnedWith(expected: js.Any): R = js.native
    /**
      * Used to check that an object has a `.length` property
      * and it is set to a certain numeric value.
      */
    def toHaveLength(expected: Double): R = js.native
    /**
      * Use to test the specific value that a mock function returned for the nth call.
      * If the nth call to the mock function threw an error, then this matcher will fail
      * no matter what value you provided as the expected return value.
      */
    def toHaveNthReturnedWith(nthCall: Double, expected: js.Any): R = js.native
    /**
      * Use to check if property at provided reference keyPath exists for an object.
      * For checking deeply nested properties in an object you may use dot notation or an array containing
      * the keyPath for deep references.
      *
      * Optionally, you can provide a value to check if it's equal to the value present at keyPath
      * on the target object. This matcher uses 'deep equality' (like `toEqual()`) and recursively checks
      * the equality of all fields.
      *
      * @example
      *
      * expect(houseForSale).toHaveProperty('kitchen.area', 20);
      */
    def toHaveProperty(propertyPath: String): R = js.native
    def toHaveProperty(propertyPath: String, value: js.Any): R = js.native
    def toHaveProperty(propertyPath: js.Array[_]): R = js.native
    def toHaveProperty(propertyPath: js.Array[_], value: js.Any): R = js.native
    /**
      * Use to test that the mock function successfully returned (i.e., did not throw an error) at least one time
      */
    def toHaveReturned(): R = js.native
    /**
      * Use to ensure that a mock function returned successfully (i.e., did not throw an error) an exact number of times.
      * Any calls to the mock function that throw an error are not counted toward the number of times the function returned.
      */
    def toHaveReturnedTimes(expected: Double): R = js.native
    /**
      * Use to ensure that a mock function returned a specific value.
      */
    def toHaveReturnedWith(expected: js.Any): R = js.native
    /**
      * Check that a string matches a regular expression.
      */
    def toMatch(expected: String): R = js.native
    def toMatch(expected: RegExp): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
      */
    def toMatchInlineSnapshot(): R = js.native
    def toMatchInlineSnapshot(snapshot: String): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
      */
    def toMatchInlineSnapshot[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof R ]: any}
      */ typings.jest.jestStrings.Matchers with js.Any */](propertyMatchers: Partial[T]): R = js.native
    def toMatchInlineSnapshot[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof R ]: any}
      */ typings.jest.jestStrings.Matchers with js.Any */](propertyMatchers: Partial[T], snapshot: String): R = js.native
    /**
      * Used to check that a JavaScript object matches a subset of the properties of an object
      *
      * Optionally, you can provide an object to use as Generic type for the expected value.
      * This ensures that the matching object matches the structure of the provided object-like type.
      *
      * @example
      *
      * type House = {
      *   bath: boolean;
      *   bedrooms: number;
      *   kitchen: {
      *     amenities: string[];
      *     area: number;
      *     wallColor: string;
      *   }
      * };
      *
      * expect(desiredHouse).toMatchObject<House>(...standardHouse, kitchen: {area: 20}) // wherein standardHouse is some base object of type House
      */
    def toMatchObject[E /* <: js.Object | js.Array[_] */](expected: E): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot.
      * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
      */
    def toMatchSnapshot(): R = js.native
    def toMatchSnapshot(snapshotName: String): R = js.native
    /**
      * This ensures that a value matches the most recent snapshot with property matchers.
      * Check out [the Snapshot Testing guide](http://facebook.github.io/jest/docs/snapshot-testing.html) for more information.
      */
    def toMatchSnapshot[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof R ]: any}
      */ typings.jest.jestStrings.Matchers with js.Any */](propertyMatchers: Partial[T]): R = js.native
    def toMatchSnapshot[T /* <: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ P in keyof R ]: any}
      */ typings.jest.jestStrings.Matchers with js.Any */](propertyMatchers: Partial[T], snapshotName: String): R = js.native
    /**
      * Ensure that a mock function has returned (as opposed to thrown) at least once.
      */
    def toReturn(): R = js.native
    /**
      * Ensure that a mock function has returned (as opposed to thrown) a specified number of times.
      */
    def toReturnTimes(count: Double): R = js.native
    /**
      * Ensure that a mock function has returned a specified value at least once.
      */
    def toReturnWith(value: js.Any): R = js.native
    /**
      * Use to test that objects have the same types as well as structure.
      */
    def toStrictEqual(expected: js.Object): R = js.native
    /**
      * Used to test that a function throws when it is called.
      */
    def toThrow(): R = js.native
    def toThrow(error: String): R = js.native
    def toThrow(error: Constructable): R = js.native
    def toThrow(error: Error): R = js.native
    def toThrow(error: RegExp): R = js.native
    /**
      * If you want to test that a specific error is thrown inside a function.
      */
    def toThrowError(): R = js.native
    def toThrowError(error: String): R = js.native
    def toThrowError(error: Constructable): R = js.native
    def toThrowError(error: Error): R = js.native
    def toThrowError(error: RegExp): R = js.native
    /**
      * Used to test that a function throws a error matching the most recent snapshot when it is called.
      * Instead of writing the snapshot value to a .snap file, it will be written into the source code automatically.
      */
    def toThrowErrorMatchingInlineSnapshot(): R = js.native
    def toThrowErrorMatchingInlineSnapshot(snapshot: String): R = js.native
    /**
      * Used to test that a function throws a error matching the most recent snapshot when it is called.
      */
    def toThrowErrorMatchingSnapshot(): R = js.native
  }
  
  @js.native
  trait Mock[T, Y /* <: js.Array[_] */]
    extends js.Function
       with MockInstance[T, Y]
       with Instantiable1[/* args */ Y, T] {
    def apply(
      /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Y is not an array type */ args: Y
    ): T = js.native
  }
  
  trait MockContext[T, Y /* <: js.Array[_] */] extends js.Object {
    var calls: js.Array[Y]
    var instances: js.Array[T]
    var invocationCallOrder: js.Array[Double]
    /**
      * List of results of calls to the mock function.
      */
    var results: js.Array[MockResult[T]]
  }
  
  @js.native
  trait MockInstance[T, Y /* <: js.Array[_] */] extends js.Object {
    /** Provides access to the mock's metadata */
    var mock: MockContext[T, Y] = js.native
    /** Returns the mock name string set by calling `mockFn.mockName(value)`. */
    def getMockName(): String = js.native
    /**
      * Resets all information stored in the mockFn.mock.calls and mockFn.mock.instances arrays.
      *
      * Often this is useful when you want to clean up a mock's usage data between two assertions.
      *
      * Beware that `mockClear` will replace `mockFn.mock`, not just `mockFn.mock.calls` and `mockFn.mock.instances`.
      * You should therefore avoid assigning mockFn.mock to other variables, temporary or not, to make sure you
      * don't access stale data.
      */
    def mockClear(): Unit = js.native
    /**
      * Accepts a function that should be used as the implementation of the mock. The mock itself will still record
      * all calls that go into and instances that come from itself – the only difference is that the implementation
      * will also be executed when the mock is called.
      *
      * Note: `jest.fn(implementation)` is a shorthand for `jest.fn().mockImplementation(implementation)`.
      */
    def mockImplementation(): this.type = js.native
    def mockImplementation(fn: js.Function1[/* args */ Y, T]): this.type = js.native
    /**
      * Accepts a function that will be used as an implementation of the mock for one call to the mocked function.
      * Can be chained so that multiple function calls produce different results.
      *
      * @example
      *
      * const myMockFn = jest
      *   .fn()
      *    .mockImplementationOnce(cb => cb(null, true))
      *    .mockImplementationOnce(cb => cb(null, false));
      *
      * myMockFn((err, val) => console.log(val)); // true
      *
      * myMockFn((err, val) => console.log(val)); // false
      */
    def mockImplementationOnce(fn: js.Function1[/* args */ Y, T]): this.type = js.native
    /** Sets the name of the mock`. */
    def mockName(name: String): this.type = js.native
    /**
      * Simple sugar function for: `jest.fn().mockImplementation(() => Promise.reject(value));`
      *
      * @example
      *
      * test('async test', async () => {
      *   const asyncMock = jest.fn().mockRejectedValue(new Error('Async error'));
      *
      *   await asyncMock(); // throws "Async error"
      * });
      */
    def mockRejectedValue(value: RejectedValue[T]): this.type = js.native
    /**
      * Simple sugar function for: `jest.fn().mockImplementationOnce(() => Promise.reject(value));`
      *
      * @example
      *
      * test('async test', async () => {
      *  const asyncMock = jest
      *    .fn()
      *    .mockResolvedValueOnce('first call')
      *    .mockRejectedValueOnce(new Error('Async error'));
      *
      *  await asyncMock(); // first call
      *  await asyncMock(); // throws "Async error"
      * });
      *
      */
    def mockRejectedValueOnce(value: RejectedValue[T]): this.type = js.native
    /**
      * Resets all information stored in the mock, including any initial implementation and mock name given.
      *
      * This is useful when you want to completely restore a mock back to its initial state.
      *
      * Beware that `mockReset` will replace `mockFn.mock`, not just `mockFn.mock.calls` and `mockFn.mock.instances`.
      * You should therefore avoid assigning mockFn.mock to other variables, temporary or not, to make sure you
      * don't access stale data.
      */
    def mockReset(): Unit = js.native
    /**
      * Simple sugar function for: `jest.fn().mockImplementation(() => Promise.resolve(value));`
      */
    def mockResolvedValue(value: ResolvedValue[T]): this.type = js.native
    /**
      * Simple sugar function for: `jest.fn().mockImplementationOnce(() => Promise.resolve(value));`
      *
      * @example
      *
      * test('async test', async () => {
      *  const asyncMock = jest
      *    .fn()
      *    .mockResolvedValue('default')
      *    .mockResolvedValueOnce('first call')
      *    .mockResolvedValueOnce('second call');
      *
      *  await asyncMock(); // first call
      *  await asyncMock(); // second call
      *  await asyncMock(); // default
      *  await asyncMock(); // default
      * });
      *
      */
    def mockResolvedValueOnce(value: ResolvedValue[T]): this.type = js.native
    /**
      * Does everything that `mockFn.mockReset()` does, and also restores the original (non-mocked) implementation.
      *
      * This is useful when you want to mock functions in certain test cases and restore the original implementation in others.
      *
      * Beware that `mockFn.mockRestore` only works when mock was created with `jest.spyOn`. Thus you have to take care of restoration
      * yourself when manually assigning `jest.fn()`.
      *
      * The [`restoreMocks`](https://jestjs.io/docs/en/configuration.html#restoremocks-boolean) configuration option is available
      * to restore mocks automatically between tests.
      */
    def mockRestore(): Unit = js.native
    /**
      * Just a simple sugar function for:
      *
      * @example
      *
      *   jest.fn(function() {
      *     return this;
      *   });
      */
    def mockReturnThis(): this.type = js.native
    /**
      * Accepts a value that will be returned whenever the mock function is called.
      *
      * @example
      *
      * const mock = jest.fn();
      * mock.mockReturnValue(42);
      * mock(); // 42
      * mock.mockReturnValue(43);
      * mock(); // 43
      */
    def mockReturnValue(value: T): this.type = js.native
    /**
      * Accepts a value that will be returned for one call to the mock function. Can be chained so that
      * successive calls to the mock function return different values. When there are no more
      * `mockReturnValueOnce` values to use, calls will return a value specified by `mockReturnValue`.
      *
      * @example
      *
      * const myMockFn = jest.fn()
      *   .mockReturnValue('default')
      *   .mockReturnValueOnce('first call')
      *   .mockReturnValueOnce('second call');
      *
      * // 'first call', 'second call', 'default', 'default'
      * console.log(myMockFn(), myMockFn(), myMockFn(), myMockFn());
      *
      */
    def mockReturnValueOnce(value: T): this.type = js.native
  }
  
  trait MockOptions extends js.Object {
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jest.jestMod.jestNs.MockResultReturn[T]
    - typings.jest.jestMod.jestNs.MockResultThrow
    - typings.jest.jestMod.jestNs.MockResultIncomplete
  */
  trait MockResult[T] extends js.Object
  
  /**
    * Represents the result of a single incomplete call to a mock function.
    */
  trait MockResultIncomplete
    extends MockResult[js.Any] {
    var `type`: incomplete
    var value: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  /**
    * Represents the result of a single call to a mock function with a return value.
    */
  trait MockResultReturn[T] extends MockResult[T] {
    var `type`: `return`
    var value: T
  }
  
  /**
    * Represents the result of a single call to a mock function with a thrown error.
    */
  trait MockResultThrow
    extends MockResult[js.Any] {
    var `type`: `throw`
    var value: js.Any
  }
  
  trait ProjectConfig extends js.Object {
    var automock: Boolean
    var browser: Boolean
    var cache: Boolean
    var cacheDirectory: Path
    var clearMocks: Boolean
    var coveragePathIgnorePatterns: js.Array[String]
    var cwd: Path
    var detectLeaks: Boolean
    var displayName: Maybe[String]
    var forceCoverageMatch: js.Array[Glob]
    var globals: ConfigGlobals
    var haste: HasteConfig
    var moduleDirectories: js.Array[String]
    var moduleFileExtensions: js.Array[String]
    var moduleLoader: Path
    var moduleNameMapper: js.Array[js.Tuple2[String, String]]
    var modulePathIgnorePatterns: js.Array[String]
    var modulePaths: js.Array[String]
    var name: String
    var resetMocks: Boolean
    var resetModules: Boolean
    var resolver: Maybe[Path]
    var rootDir: Path
    var roots: js.Array[Path]
    var runner: String
    var setupFiles: js.Array[Path]
    var setupTestFrameworkScriptFile: Path
    var skipNodeResolution: Boolean
    var snapshotSerializers: js.Array[Path]
    var testEnvironment: String
    var testEnvironmentOptions: js.Object
    var testLocationInResults: Boolean
    var testMatch: js.Array[Glob]
    var testPathIgnorePatterns: js.Array[String]
    var testRegex: String
    var testRunner: String
    var testURL: String
    var timers: real | fake
    var transform: js.Array[js.Tuple2[String, Path]]
    var transformIgnorePatterns: js.Array[Glob]
    var unmockedModulePathPatterns: Maybe[js.Array[String]]
    var watchPathIgnorePatterns: js.Array[String]
  }
  
  // TestResult
  trait RawFileCoverage extends js.Object {
    var b: NumberDictionary[Double]
    var branchMap: NumberDictionary[js.Any]
    var f: NumberDictionary[Double]
    var fnMap: NumberDictionary[js.Any]
    var inputSourceMap: js.UndefOr[js.Object] = js.undefined
    var l: NumberDictionary[Double]
    var path: String
    var s: NumberDictionary[Double]
    var statementMap: NumberDictionary[js.Any]
  }
  
  // To allow non-ES6 users the Set below
  trait Reporter extends js.Object {
    var getLastError: js.UndefOr[js.Function0[Maybe[Error]]] = js.undefined
    var onRunComplete: js.UndefOr[
        js.Function2[/* contexts */ Set[Context], /* results */ AggregatedResult, Maybe[js.Promise[Unit]]]
      ] = js.undefined
    var onRunStart: js.UndefOr[
        js.Function2[/* results */ AggregatedResult, /* options */ ReporterOnStartOptions, Unit]
      ] = js.undefined
    var onTestResult: js.UndefOr[
        js.Function3[
          /* test */ Test, 
          /* testResult */ TestResult, 
          /* aggregatedResult */ AggregatedResult, 
          Unit
        ]
      ] = js.undefined
    var onTestStart: js.UndefOr[js.Function1[/* test */ Test, Unit]] = js.undefined
  }
  
  // Reporter
  trait ReporterOnStartOptions extends js.Object {
    var estimatedTime: Double
    var showStatus: Boolean
  }
  
  trait SerializableError extends js.Object {
    var code: js.UndefOr[js.Any] = js.undefined
    var message: String
    var stack: Maybe[String]
    var `type`: js.UndefOr[String] = js.undefined
  }
  
  // tslint:disable-next-line:no-empty-interface
  trait Set[T] extends js.Object
  
  trait SnapshotSerializerColor extends js.Object {
    var close: String
    var open: String
  }
  
  trait SnapshotSerializerColors extends js.Object {
    var comment: SnapshotSerializerColor
    var content: SnapshotSerializerColor
    var prop: SnapshotSerializerColor
    var tag: SnapshotSerializerColor
    var value: SnapshotSerializerColor
  }
  
  trait SnapshotSerializerOptions extends js.Object {
    var callToJSON: js.UndefOr[Boolean] = js.undefined
    var edgeSpacing: js.UndefOr[String] = js.undefined
    var escapeRegex: js.UndefOr[Boolean] = js.undefined
    var highlight: js.UndefOr[Boolean] = js.undefined
    var indent: js.UndefOr[Double] = js.undefined
    var maxDepth: js.UndefOr[Double] = js.undefined
    var min: js.UndefOr[Boolean] = js.undefined
    var plugins: js.UndefOr[js.Array[SnapshotSerializerPlugin]] = js.undefined
    var printFunctionName: js.UndefOr[Boolean] = js.undefined
    var spacing: js.UndefOr[String] = js.undefined
    var theme: js.UndefOr[SnapshotSerializerOptionsTheme] = js.undefined
  }
  
  trait SnapshotSerializerOptionsTheme extends js.Object {
    var comment: js.UndefOr[String] = js.undefined
    var content: js.UndefOr[String] = js.undefined
    var prop: js.UndefOr[String] = js.undefined
    var tag: js.UndefOr[String] = js.undefined
    var value: js.UndefOr[String] = js.undefined
  }
  
  trait SnapshotSerializerPlugin extends js.Object {
    def print(
      `val`: js.Any,
      serialize: js.Function1[/* val */ js.Any, String],
      indent: js.Function1[/* str */ String, String],
      opts: SnapshotSerializerOptions,
      colors: SnapshotSerializerColors
    ): String
    def test(`val`: js.Any): Boolean
  }
  
  trait SnapshotSummary extends js.Object {
    var added: Double
    var didUpdate: Boolean
    var failure: Boolean
    var filesAdded: Double
    var filesRemoved: Double
    var filesUnmatched: Double
    var filesUpdated: Double
    var matched: Double
    var total: Double
    var unchecked: Double
    var unmatched: Double
    var updated: Double
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jest.jestStrings.all
    - typings.jest.jestStrings.`new`
    - typings.jest.jestStrings.none
  */
  trait SnapshotUpdateState extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.jest.jestStrings.passed
    - typings.jest.jestStrings.failed
    - typings.jest.jestStrings.skipped
    - typings.jest.jestStrings.pending
  */
  trait Status extends js.Object
  
  // TestRunner
  trait Test extends js.Object {
    var context: Context
    var duration: js.UndefOr[Double] = js.undefined
    var path: Path
  }
  
  trait TestResult extends js.Object {
    var console: Maybe[ConsoleBuffer]
    var coverage: js.UndefOr[RawCoverage] = js.undefined
    var failureMessage: Maybe[String]
    var memoryUsage: js.UndefOr[Bytes] = js.undefined
    var numFailingTests: Double
    var numPassingTests: Double
    var numPendingTests: Double
    var perfStats: Anon_End
    var skipped: Boolean
    var snapshot: Anon_Added
    var sourceMaps: StringDictionary[String]
    var testExecError: js.UndefOr[SerializableError] = js.undefined
    var testFilePath: String
    var testResults: js.Array[AssertionResult]
  }
  
  trait TransformOptions extends js.Object {
    var instrument: Boolean
  }
  
  // Transform
  trait TransformedSource extends js.Object {
    var code: String
    var map: Maybe[js.Object | String]
  }
  
  @js.native
  trait Transformer extends js.Object {
    var canInstrument: js.UndefOr[Boolean] = js.native
    var createTransformer: js.UndefOr[js.Function1[/* options */ js.Any, this.type]] = js.native
    var getCacheKey: js.UndefOr[
        js.Function4[
          /* fileData */ String, 
          /* filePath */ Path, 
          /* configStr */ String, 
          /* options */ TransformOptions, 
          String
        ]
      ] = js.native
    def process(sourceText: String, sourcePath: Path, config: ProjectConfig): String | TransformedSource = js.native
    def process(sourceText: String, sourcePath: Path, config: ProjectConfig, options: TransformOptions): String | TransformedSource = js.native
  }
  
  /**
    * Provides a way to add Jasmine-compatible matchers into your Jest context.
    */
  def addMatchers(matchers: CustomMatcherFactories): Typeofjest = js.native
  /**
    * Advances all timers by msToRun milliseconds. All pending "macro-tasks" that have been
    * queued via setTimeout() or setInterval(), and would be executed within this timeframe
    * will be executed.
    */
  def advanceTimersByTime(msToRun: Double): Typeofjest = js.native
  /**
    * Disables automatic mocking in the module loader.
    */
  def autoMockOff(): Typeofjest = js.native
  /**
    * Enables automatic mocking in the module loader.
    */
  def autoMockOn(): Typeofjest = js.native
  /**
    * Clears the mock.calls and mock.instances properties of all mocks.
    * Equivalent to calling .mockClear() on every mocked function.
    */
  def clearAllMocks(): Typeofjest = js.native
  /**
    * Removes any pending timers from the timer system. If any timers have
    * been scheduled, they will be cleared and will never have the opportunity
    * to execute in the future.
    */
  def clearAllTimers(): Typeofjest = js.native
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module, including all of the specificied module's dependencies.
    */
  def deepUnmock(moduleName: String): Typeofjest = js.native
  /**
    * Disables automatic mocking in the module loader.
    */
  def disableAutomock(): Typeofjest = js.native
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def doMock(moduleName: String): Typeofjest = js.native
  def doMock(moduleName: String, factory: js.Function0[_]): Typeofjest = js.native
  def doMock(moduleName: String, factory: js.Function0[_], options: MockOptions): Typeofjest = js.native
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module from require() (e.g. that it should always return the real module).
    */
  def dontMock(moduleName: String): Typeofjest = js.native
  /**
    * Enables automatic mocking in the module loader.
    */
  def enableAutomock(): Typeofjest = js.native
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  def fn(): Mock[_, _] = js.native
  def fn[T, Y /* <: js.Array[_] */](implementation: js.Function1[/* args */ Y, T]): Mock[T, Y] = js.native
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  @JSName("fn")
  def fn_TY_ArrayWildcard[T, Y /* <: js.Array[_] */](): Mock[T, Y] = js.native
  /**
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  def genMockFromModule[T](moduleName: String): T = js.native
  /**
    * Returns whether the given function is a mock function.
    */
  def isMockFunction(fn: js.Any): /* is jest.jest.jest.Mock<any, any> */ Boolean = js.native
  /**
    * Creates a sandbox registry for the modules that are loaded inside the callback function..
    * This is useful to isolate specific modules for every test so that local module state doesn't conflict between tests.
    */
  def isolateModules(fn: js.Function0[Unit]): Typeofjest = js.native
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def mock(moduleName: String): Typeofjest = js.native
  def mock(moduleName: String, factory: js.Function0[_]): Typeofjest = js.native
  def mock(moduleName: String, factory: js.Function0[_], options: MockOptions): Typeofjest = js.native
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    */
  def requireActual(moduleName: String): js.Any = js.native
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    */
  def requireMock(moduleName: String): js.Any = js.native
  /**
    * Resets the state of all mocks.
    * Equivalent to calling .mockReset() on every mocked function.
    */
  def resetAllMocks(): Typeofjest = js.native
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def resetModuleRegistry(): Typeofjest = js.native
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def resetModules(): Typeofjest = js.native
  /**
    * available since Jest 21.1.0
    * Restores all mocks back to their original value.
    * Equivalent to calling .mockRestore on every mocked function.
    * Beware that jest.restoreAllMocks() only works when mock was created with
    * jest.spyOn; other mocks will require you to manually restore them.
    */
  def restoreAllMocks(): Typeofjest = js.native
  /**
    * Runs failed tests n-times until they pass or until the max number of retries is exhausted.
    * This only works with jest-circus!
    */
  def retryTimes(numRetries: Double): Typeofjest = js.native
  /**
    * Exhausts tasks queued by setImmediate().
    */
  def runAllImmediates(): Typeofjest = js.native
  /**
    * Exhausts the micro-task queue (usually interfaced in node via process.nextTick).
    */
  def runAllTicks(): Typeofjest = js.native
  /**
    * Exhausts the macro-task queue (i.e., all tasks queued by setTimeout() and setInterval()).
    */
  def runAllTimers(): Typeofjest = js.native
  /**
    * Executes only the macro-tasks that are currently pending (i.e., only the
    * tasks that have been queued by setTimeout() or setInterval() up to this point).
    * If any of the currently pending macro-tasks schedule new macro-tasks,
    * those new tasks will not be executed by this call.
    */
  def runOnlyPendingTimers(): Typeofjest = js.native
  /**
    * (renamed to `advanceTimersByTime` in Jest 21.3.0+) Executes only the macro
    * task queue (i.e. all tasks queued by setTimeout() or setInterval() and setImmediate()).
    */
  def runTimersToTime(msToRun: Double): Typeofjest = js.native
  /**
    * Explicitly supplies the mock object that the module system should return
    * for the specified module.
    */
  def setMock[T](moduleName: String, moduleExports: T): Typeofjest = js.native
  /**
    * Set the default timeout interval for tests and before/after hooks in milliseconds.
    * Note: The default timeout interval is 5 seconds if this method is not called.
    */
  def setTimeout(timeout: Double): Typeofjest = js.native
  def spyOn[T /* <: js.Object */, M /* <: FunctionPropertyNames[Required[T]] */](`object`: T, method: M): SpyInstance[
    ReturnType[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    ArgsType[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
  /**
    * Creates a mock function similar to jest.fn but also tracks calls to `object[methodName]`
    *
    * Note: By default, jest.spyOn also calls the spied method. This is different behavior from most
    * other test libraries.
    *
    * @example
    *
    * const video = require('./video');
    *
    * test('plays video', () => {
    *   const spy = jest.spyOn(video, 'play');
    *   const isPlaying = video.play();
    *
    *   expect(spy).toHaveBeenCalled();
    *   expect(isPlaying).toBe(true);
    *
    *   spy.mockReset();
    *   spy.mockRestore();
    * });
    */
  @JSName("spyOn")
  def spyOn_get[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[Required[T]] */](`object`: T, method: M, accessType: get): SpyInstance[
    /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any, 
    js.Array[js.Any]
  ] = js.native
  @JSName("spyOn")
  def spyOn_set[T /* <: js.Object */, M /* <: NonFunctionPropertyNames[Required[T]] */](`object`: T, method: M, accessType: set): SpyInstance[
    Unit, 
    js.Array[
      /* import warning: ImportType.apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = js.native
  /**
    * Indicates that the module system should never return a mocked version of
    * the specified module from require() (e.g. that it should always return the real module).
    */
  def unmock(moduleName: String): Typeofjest = js.native
  /**
    * Instructs Jest to use fake versions of the standard timer functions.
    */
  def useFakeTimers(): Typeofjest = js.native
  /**
    * Instructs Jest to use the real versions of the standard timer functions.
    */
  def useRealTimers(): Typeofjest = js.native
  type ArgsType[T] = js.Any
  type Bytes = Double
  type ConfigGlobals = js.Object
  type ConsoleBuffer = js.Array[LogEntry]
  type CustomMatcher = js.ThisFunction2[
    /* this */ MatcherUtils, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    CustomMatcherResult | js.Promise[CustomMatcherResult]
  ]
  type EmptyFunction = js.Function0[Unit]
  type Environment = $JestEnvironment
  type ExpectExtendMap = StringDictionary[CustomMatcher]
  type FunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with String
  type Glob = String
  // Global
  type Global = js.Object
  type HasteFS = js.Any
  type HasteResolver = js.Any
  type Lifecycle = js.Function2[/* fn */ ProvidesCallback, /* timeout */ js.UndefOr[Double], js.Any]
  // Console
  type LogMessage = String
  // types for implementing custom interfaces, from https://github.com/facebook/jest/tree/dd6c5c4/types
  // https://facebook.github.io/jest/docs/en/configuration.html#transform-object-string-string
  // const transformer: Transformer;
  // https://facebook.github.io/jest/docs/en/configuration.html#reporters-array-modulename-modulename-options
  // const reporter: Reporter;
  // https://facebook.github.io/jest/docs/en/configuration.html#testrunner-string
  // const testRunner: TestFramework;
  // https://facebook.github.io/jest/docs/en/configuration.html#testresultsprocessor-string
  // const testResultsProcessor: TestResultsProcessor;
  // leave above declarations for referening type-dependencies
  // .vscode/settings.json: "typescript.referencesCodeLens.enabled": true
  // custom
  // flow's Maybe type https://flow.org/en/docs/types/primitives/#toc-maybe-types
  type Maybe[T] = js.UndefOr[Unit | Null | T]
  type Milliseconds = Double
  /**
    * Wrap module with mock definitions
    *
    * @example
    *
    *  jest.mock("../api");
    *  import { Api } from "../api";
    *
    *  const myApi: jest.Mocked<Api> = new Api() as any;
    *  myApi.myApiMethod.mockImplementation(() => "test");
    */
  type Mocked[T] = typings.jest.jestStrings.Mocked with js.Any with T
  type ModuleMap = js.Any
  type ModuleMocker = js.Any
  // see https://github.com/Microsoft/TypeScript/issues/25215
  type NonFunctionPropertyNames[T] = (/* import warning: ImportType.apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with String
  // Config
  type Path = String
  type ProvidesCallback = js.Function1[/* cb */ DoneCallback, js.Any]
  type RawCoverage = StringDictionary[RawFileCoverage]
  type RejectedValue[T] = js.Any
  type ReporterConfig = js.Tuple2[String, js.Object]
  type ResolvedValue[T] = js.Any | T
  type Runtime = js.Any
  type Script = js.Any
  type SpyInstance[T, Y /* <: js.Array[_] */] = MockInstance[T, Y]
  type TestFramework = js.Function5[
    /* globalConfig */ GlobalConfig, 
    /* config */ ProjectConfig, 
    /* environment */ Environment, 
    /* runtime */ Runtime, 
    /* testPath */ String, 
    js.Promise[TestResult]
  ]
  type TestResultsProcessor = js.Function1[/* testResult */ AggregatedResult, AggregatedResult]
}

