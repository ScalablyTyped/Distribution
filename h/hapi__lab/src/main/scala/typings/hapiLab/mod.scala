package typings.hapiLab

import org.scalablytyped.runtime.Shortcut
import typings.hapiLab.anon.OmitTestOptionsplan
import typings.std.Error
import typings.std.Record
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object script {
    
    @scala.inline
    def apply(): Script = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Script]
    @scala.inline
    def apply(options: Options): Script = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Script]
    
    @JSImport("@hapi/lab", "script")
    @js.native
    val ^ : js.Any = js.native
    
    @js.native
    trait Action extends StObject {
      
      def apply(flags: Flags): Unit = js.native
    }
    
    trait Cli extends StObject {
      
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
      def apply(`lint-errors-threshold`: Double, `lint-warnings-threshold`: Double, shuffle: Boolean): Cli = {
        val __obj = js.Dynamic.literal(shuffle = shuffle.asInstanceOf[js.Any])
        __obj.updateDynamic("lint-errors-threshold")(`lint-errors-threshold`.asInstanceOf[js.Any])
        __obj.updateDynamic("lint-warnings-threshold")(`lint-warnings-threshold`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Cli]
      }
      
      @scala.inline
      implicit class CliMutableBuilder[Self <: Cli] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAssert(value: String): Self = StObject.set(x, "assert", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAssertUndefined: Self = StObject.set(x, "assert", js.undefined)
        
        @scala.inline
        def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBailUndefined: Self = StObject.set(x, "bail", js.undefined)
        
        @scala.inline
        def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
        
        @scala.inline
        def `setContext-timeout`(value: Double): Self = StObject.set(x, "context-timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setContext-timeoutUndefined`: Self = StObject.set(x, "context-timeout", js.undefined)
        
        @scala.inline
        def setCoverage(value: Boolean): Self = StObject.set(x, "coverage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCoverage-all`(value: Boolean): Self = StObject.set(x, "coverage-all", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCoverage-allUndefined`: Self = StObject.set(x, "coverage-all", js.undefined)
        
        @scala.inline
        def `setCoverage-exclude`(value: js.Array[String]): Self = StObject.set(x, "coverage-exclude", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCoverage-excludeUndefined`: Self = StObject.set(x, "coverage-exclude", js.undefined)
        
        @scala.inline
        def `setCoverage-excludeVarargs`(value: String*): Self = StObject.set(x, "coverage-exclude", js.Array(value :_*))
        
        @scala.inline
        def `setCoverage-flat`(value: Boolean): Self = StObject.set(x, "coverage-flat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCoverage-flatUndefined`: Self = StObject.set(x, "coverage-flat", js.undefined)
        
        @scala.inline
        def `setCoverage-module`(value: js.Array[String]): Self = StObject.set(x, "coverage-module", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCoverage-moduleUndefined`: Self = StObject.set(x, "coverage-module", js.undefined)
        
        @scala.inline
        def `setCoverage-moduleVarargs`(value: String*): Self = StObject.set(x, "coverage-module", js.Array(value :_*))
        
        @scala.inline
        def `setCoverage-path`(value: String): Self = StObject.set(x, "coverage-path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setCoverage-pathUndefined`: Self = StObject.set(x, "coverage-path", js.undefined)
        
        @scala.inline
        def setCoveragePattern(value: RegExp): Self = StObject.set(x, "coveragePattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoveragePatternUndefined: Self = StObject.set(x, "coveragePattern", js.undefined)
        
        @scala.inline
        def setCoverageUndefined: Self = StObject.set(x, "coverage", js.undefined)
        
        @scala.inline
        def `setDefault-plan-threshold`(value: Double): Self = StObject.set(x, "default-plan-threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setDefault-plan-thresholdUndefined`: Self = StObject.set(x, "default-plan-threshold", js.undefined)
        
        @scala.inline
        def setDry(value: Boolean): Self = StObject.set(x, "dry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDryUndefined: Self = StObject.set(x, "dry", js.undefined)
        
        @scala.inline
        def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
        
        @scala.inline
        def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
        
        @scala.inline
        def setGlobals(value: js.Array[String]): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
        
        @scala.inline
        def setGlobalsVarargs(value: String*): Self = StObject.set(x, "globals", js.Array(value :_*))
        
        @scala.inline
        def setGrep(value: String): Self = StObject.set(x, "grep", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGrepUndefined: Self = StObject.set(x, "grep", js.undefined)
        
        @scala.inline
        def setId(value: js.Array[Double]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setIdVarargs(value: Double*): Self = StObject.set(x, "id", js.Array(value :_*))
        
        @scala.inline
        def setInspect(value: Boolean): Self = StObject.set(x, "inspect", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInspectUndefined: Self = StObject.set(x, "inspect", js.undefined)
        
        @scala.inline
        def setLeaks(value: Boolean): Self = StObject.set(x, "leaks", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLeaksUndefined: Self = StObject.set(x, "leaks", js.undefined)
        
        @scala.inline
        def setLint(value: Boolean): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLint-errors-threshold`(value: Double): Self = StObject.set(x, "lint-errors-threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLint-fix`(value: Boolean): Self = StObject.set(x, "lint-fix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLint-fixUndefined`: Self = StObject.set(x, "lint-fix", js.undefined)
        
        @scala.inline
        def `setLint-options`(value: String): Self = StObject.set(x, "lint-options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setLint-optionsUndefined`: Self = StObject.set(x, "lint-options", js.undefined)
        
        @scala.inline
        def `setLint-warnings-threshold`(value: Double): Self = StObject.set(x, "lint-warnings-threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
        
        @scala.inline
        def setLinter(value: String): Self = StObject.set(x, "linter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinterUndefined: Self = StObject.set(x, "linter", js.undefined)
        
        @scala.inline
        def setOutput(value: String | js.Array[String]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        @scala.inline
        def setOutputVarargs(value: String*): Self = StObject.set(x, "output", js.Array(value :_*))
        
        @scala.inline
        def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
        
        @scala.inline
        def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
        
        @scala.inline
        def setPattern(value: RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        
        @scala.inline
        def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
        
        @scala.inline
        def setReporter(value: String | js.Array[String]): Self = StObject.set(x, "reporter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReporterUndefined: Self = StObject.set(x, "reporter", js.undefined)
        
        @scala.inline
        def setReporterVarargs(value: String*): Self = StObject.set(x, "reporter", js.Array(value :_*))
        
        @scala.inline
        def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
        
        @scala.inline
        def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
        
        @scala.inline
        def setShuffle(value: Boolean): Self = StObject.set(x, "shuffle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSilent-skips`(value: Boolean): Self = StObject.set(x, "silent-skips", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setSilent-skipsUndefined`: Self = StObject.set(x, "silent-skips", js.undefined)
        
        @scala.inline
        def setSourcemaps(value: Boolean): Self = StObject.set(x, "sourcemaps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSourcemapsUndefined: Self = StObject.set(x, "sourcemaps", js.undefined)
        
        @scala.inline
        def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        @scala.inline
        def setTransform(value: js.Array[Transformer]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
        
        @scala.inline
        def setTransformVarargs(value: Transformer*): Self = StObject.set(x, "transform", js.Array(value :_*))
        
        @scala.inline
        def setTypes(value: Boolean): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setTypes-test`(value: String): Self = StObject.set(x, "types-test", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setTypes-testUndefined`: Self = StObject.set(x, "types-test", js.undefined)
        
        @scala.inline
        def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      }
    }
    
    type ErrorHandler = js.Function1[/* err */ Error, Unit]
    
    @js.native
    trait Experiment extends StObject {
      
      def apply(title: String, content: js.Function0[Unit]): Unit = js.native
      def apply(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
      
      def only(title: String, content: js.Function0[Unit]): Unit = js.native
      def only(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
      
      def skip(title: String, content: js.Function0[Unit]): Unit = js.native
      def skip(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit = js.native
    }
    
    trait Flags extends StObject {
      
      /**
        * An object that is passed to `before` and `after` functions in addition to tests themselves.
        */
      val context: Record[String, js.Any]
      
      /**
        * Sets a requirement that a function must be called a certain number of times.
        * 
        * @param func - the function to be called.
        * @param count - the number of required invocations.
        * 
        * @returns a wrapped function.
        */
      def mustCall[T /* <: js.Function1[/* repeated */ js.Any, js.Any] */](func: T, count: Double): T
      
      /**
        * Adds notes to the test log.
        * 
        * @param note - a string to be included in the console reporter at the end of the output.
        */
      def note(note: String): Unit
      
      /**
        * A property that can be assigned a cleanup function registered at runtime to be executed after the test completes.
        */
      var onCleanup: js.UndefOr[Action] = js.undefined
      
      /**
        * A property that can be assigned an override for global exception handling.
        */
      var onUncaughtException: js.UndefOr[ErrorHandler] = js.undefined
      
      /**
        * A property that can be assigned an override function for global rejection handling.
        */
      var onUnhandledRejection: js.UndefOr[ErrorHandler] = js.undefined
    }
    object Flags {
      
      @scala.inline
      def apply(context: Record[String, js.Any], mustCall: (js.Any, Double) => js.Any, note: String => Unit): Flags = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], mustCall = js.Any.fromFunction2(mustCall), note = js.Any.fromFunction1(note))
        __obj.asInstanceOf[Flags]
      }
      
      @scala.inline
      implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContext(value: Record[String, js.Any]): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMustCall(value: (js.Any, Double) => js.Any): Self = StObject.set(x, "mustCall", js.Any.fromFunction2(value))
        
        @scala.inline
        def setNote(value: String => Unit): Self = StObject.set(x, "note", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCleanup(value: Action): Self = StObject.set(x, "onCleanup", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnCleanupUndefined: Self = StObject.set(x, "onCleanup", js.undefined)
        
        @scala.inline
        def setOnUncaughtException(value: /* err */ Error => Unit): Self = StObject.set(x, "onUncaughtException", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnUncaughtExceptionUndefined: Self = StObject.set(x, "onUncaughtException", js.undefined)
        
        @scala.inline
        def setOnUnhandledRejection(value: /* err */ Error => Unit): Self = StObject.set(x, "onUnhandledRejection", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnUnhandledRejectionUndefined: Self = StObject.set(x, "onUnhandledRejection", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      /**
        * 
        */
      var cli: js.UndefOr[Cli] = js.undefined
      
      /**
        * Determines if execution of tests should be delayed until the CLI runs them explicitly.
        * 
        * @default true
        */
      var schedule: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCli(value: Cli): Self = StObject.set(x, "cli", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCliUndefined: Self = StObject.set(x, "cli", js.undefined)
        
        @scala.inline
        def setSchedule(value: Boolean): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScheduleUndefined: Self = StObject.set(x, "schedule", js.undefined)
      }
    }
    
    trait Script extends StObject {
      
      def after(action: Action): Unit
      def after(options: TestOptions, action: Action): Unit
      
      def afterEach(action: Action): Unit
      def afterEach(options: TestOptions, action: Action): Unit
      @JSName("afterEach")
      var afterEach_Original: Setup
      
      @JSName("after")
      var after_Original: Setup
      
      def before(action: Action): Unit
      def before(options: TestOptions, action: Action): Unit
      
      def beforeEach(action: Action): Unit
      def beforeEach(options: TestOptions, action: Action): Unit
      @JSName("beforeEach")
      var beforeEach_Original: Setup
      
      @JSName("before")
      var before_Original: Setup
      
      def describe(title: String, content: js.Function0[Unit]): Unit
      def describe(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit
      @JSName("describe")
      var describe_Original: Experiment
      
      def experiment(title: String, content: js.Function0[Unit]): Unit
      def experiment(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit
      @JSName("experiment")
      var experiment_Original: Experiment
      
      def it(title: String, options: TestOptions, test: Action): Unit
      def it(title: String, test: Action): Unit
      @JSName("it")
      var it_Original: Test
      
      def suite(title: String, content: js.Function0[Unit]): Unit
      def suite(title: String, options: OmitTestOptionsplan, content: js.Function0[Unit]): Unit
      @JSName("suite")
      var suite_Original: Experiment
      
      def test(title: String, options: TestOptions, test: Action): Unit
      def test(title: String, test: Action): Unit
      @JSName("test")
      var test_Original: Test
    }
    object Script {
      
      @scala.inline
      def apply(
        after: Setup,
        afterEach: Setup,
        before: Setup,
        beforeEach: Setup,
        describe: Experiment,
        experiment: Experiment,
        it: Test,
        suite: Experiment,
        test: Test
      ): Script = {
        val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any], afterEach = afterEach.asInstanceOf[js.Any], before = before.asInstanceOf[js.Any], beforeEach = beforeEach.asInstanceOf[js.Any], describe = describe.asInstanceOf[js.Any], experiment = experiment.asInstanceOf[js.Any], it = it.asInstanceOf[js.Any], suite = suite.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
        __obj.asInstanceOf[Script]
      }
      
      @scala.inline
      implicit class ScriptMutableBuilder[Self <: Script] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAfter(value: Setup): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAfterEach(value: Setup): Self = StObject.set(x, "afterEach", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBefore(value: Setup): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBeforeEach(value: Setup): Self = StObject.set(x, "beforeEach", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescribe(value: Experiment): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExperiment(value: Experiment): Self = StObject.set(x, "experiment", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIt(value: Test): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuite(value: Experiment): Self = StObject.set(x, "suite", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTest(value: Test): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Setup extends StObject {
      
      def apply(action: Action): Unit = js.native
      def apply(options: TestOptions, action: Action): Unit = js.native
    }
    
    @js.native
    trait Test extends StObject {
      
      def apply(title: String, options: TestOptions, test: Action): Unit = js.native
      def apply(title: String, test: Action): Unit = js.native
      
      def only(title: String, options: TestOptions, test: Action): Unit = js.native
      def only(title: String, test: Action): Unit = js.native
      
      def skip(title: String, options: TestOptions, test: Action): Unit = js.native
      def skip(title: String, test: Action): Unit = js.native
    }
    
    trait TestOptions extends StObject {
      
      /**
        * Sets all other experiments to skip.
        * 
        * @default false
        */
      val only: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The expected number of assertions the test must execute.
        */
      val plan: js.UndefOr[Double] = js.undefined
      
      /**
        * Set the test to be retried a few times when it fails. Can be set to true to used the default number of retries or an exact number of maximum retries.
        *
        * @default false
        */
      val retry: js.UndefOr[Double | Boolean] = js.undefined
      
      /**
        * Sets the entire experiment content to be skipped during execution.
        * 
        * @default false
        */
      val skip: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Overrides the default test timeout for tests and other timed operations in milliseconds.
        * 
        * @default 2000
        */
      val timeout: js.UndefOr[Double] = js.undefined
    }
    object TestOptions {
      
      @scala.inline
      def apply(): TestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TestOptions]
      }
      
      @scala.inline
      implicit class TestOptionsMutableBuilder[Self <: TestOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnly(value: Boolean): Self = StObject.set(x, "only", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
        
        @scala.inline
        def setPlan(value: Double): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
        
        @scala.inline
        def setRetry(value: Double | Boolean): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
        
        @scala.inline
        def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      }
    }
    
    trait Transformer extends StObject {
      
      val ext: String
      
      def transform(content: String, filename: String): String
    }
    object Transformer {
      
      @scala.inline
      def apply(ext: String, transform: (String, String) => String): Transformer = {
        val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], transform = js.Any.fromFunction2(transform))
        __obj.asInstanceOf[Transformer]
      }
      
      @scala.inline
      implicit class TransformerMutableBuilder[Self <: Transformer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransform(value: (String, String) => String): Self = StObject.set(x, "transform", js.Any.fromFunction2(value))
      }
    }
  }
  
  object types extends Shortcut {
    
    @JSImport("@hapi/lab", "types")
    @js.native
    val ^ : Types = js.native
    
    trait Expect extends StObject {
      
      /**
        * Assert the value to throw an argument error
        * 
        * @param value - the value being asserted.
        */
      def error[T](value: T): Unit
      
      /**
        * Assert the type of the value expected
        * 
        * @param value - the value being asserted.
        */
      def `type`[T](value: T): Unit
    }
    object Expect {
      
      @scala.inline
      def apply(error: js.Any => Unit, `type`: js.Any => Unit): Expect = {
        val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error))
        __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
        __obj.asInstanceOf[Expect]
      }
      
      @scala.inline
      implicit class ExpectMutableBuilder[Self <: Expect] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
        
        @scala.inline
        def setType(value: js.Any => Unit): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
      }
    }
    
    trait Types extends StObject {
      
      var expect: Expect
    }
    object Types {
      
      @scala.inline
      def apply(expect: Expect): Types = {
        val __obj = js.Dynamic.literal(expect = expect.asInstanceOf[js.Any])
        __obj.asInstanceOf[Types]
      }
      
      @scala.inline
      implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setExpect(value: Expect): Self = StObject.set(x, "expect", value.asInstanceOf[js.Any])
      }
    }
    
    type _To = Types
    
    /* This means you don't have to write `^`, but can instead just say `types.foo` */
    override def _to: Types = ^
  }
}
