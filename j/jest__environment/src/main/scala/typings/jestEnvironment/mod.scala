package typings.jestEnvironment

import typings.jestEnvironment.anon.FnCall
import typings.jestEnvironment.anon.FnCallFn
import typings.jestEnvironment.anon.FnCallObjectMethodKeyAccessType
import typings.jestEnvironment.anon.FnCallSourceOptions
import typings.jestEnvironment.anon.LogErrorsBeforeRetry
import typings.jestEnvironment.anon.Virtual
import typings.jestEnvironment.jestEnvironmentStrings.get
import typings.jestEnvironment.jestEnvironmentStrings.set
import typings.jestFakeTimers.mod.LegacyFakeTimers
import typings.jestFakeTimers.mod.ModernFakeTimers
import typings.jestMock.anon.Shallow
import typings.jestMock.anon.`0`
import typings.jestMock.mod.ConstructorLikeKeys
import typings.jestMock.mod.FunctionLike
import typings.jestMock.mod.MethodLikeKeys
import typings.jestMock.mod.Mock
import typings.jestMock.mod.MockInstance
import typings.jestMock.mod.MockedShallow
import typings.jestMock.mod.Mocked_
import typings.jestMock.mod.ModuleMocker
import typings.jestMock.mod.PropertyLikeKeys
import typings.jestTypes.mod.EventHandler
import typings.jestTypes.mod.FakeTimersConfig
import typings.jestTypes.mod.GlobalConfig
import typings.jestTypes.mod.LegacyFakeTimersConfig
import typings.jestTypes.mod.ProjectConfig
import typings.node.NodeJS.Require
import typings.node.NodeModule
import typings.node.vmMod.Context
import typings.std.Console
import typings.std.ImportMeta
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/environment", "JestEnvironment")
  @js.native
  open class JestEnvironment[Timer] protected () extends StObject {
    def this(config: JestEnvironmentConfig, context: EnvironmentContext) = this()
    
    var exportConditions: js.UndefOr[js.Function0[js.Array[String]]] = js.native
    
    var fakeTimers: LegacyFakeTimers[Timer] | Null = js.native
    
    var fakeTimersModern: ModernFakeTimers | Null = js.native
    
    def getVmContext(): Context | Null = js.native
    
    var global: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.Global */ Any = js.native
    
    var handleTestEvent: js.UndefOr[EventHandler] = js.native
    
    var moduleMocker: ModuleMocker | Null = js.native
    
    def setup(): js.Promise[Unit] = js.native
    
    def teardown(): js.Promise[Unit] = js.native
  }
  
  trait EnvironmentContext extends StObject {
    
    var console: Console
    
    var docblockPragmas: Record[String, String | js.Array[String]]
    
    var testPath: String
  }
  object EnvironmentContext {
    
    inline def apply(console: Console, docblockPragmas: Record[String, String | js.Array[String]], testPath: String): EnvironmentContext = {
      val __obj = js.Dynamic.literal(console = console.asInstanceOf[js.Any], docblockPragmas = docblockPragmas.asInstanceOf[js.Any], testPath = testPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[EnvironmentContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EnvironmentContext] (val x: Self) extends AnyVal {
      
      inline def setConsole(value: Console): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setDocblockPragmas(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "docblockPragmas", value.asInstanceOf[js.Any])
      
      inline def setTestPath(value: String): Self = StObject.set(x, "testPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Jest extends StObject {
    
    /**
      * Advances all timers by `msToRun` milliseconds. All pending "macro-tasks"
      * that have been queued via `setTimeout()` or `setInterval()`, and would be
      * executed within this time frame will be executed.
      */
    def advanceTimersByTime(msToRun: Double): Unit = js.native
    
    /**
      * Advances all timers by the needed milliseconds so that only the next
      * timeouts/intervals will run. Optionally, you can provide steps, so it will
      * run steps amount of next timeouts/intervals.
      */
    def advanceTimersToNextTimer(): Unit = js.native
    def advanceTimersToNextTimer(steps: Double): Unit = js.native
    
    /**
      * Disables automatic mocking in the module loader.
      */
    def autoMockOff(): Jest = js.native
    
    /**
      * Enables automatic mocking in the module loader.
      */
    def autoMockOn(): Jest = js.native
    
    /**
      * Clears the `mock.calls`, `mock.instances`, `mock.contexts` and `mock.results` properties of
      * all mocks. Equivalent to calling `.mockClear()` on every mocked function.
      */
    def clearAllMocks(): Jest = js.native
    
    /**
      * Removes any pending timers from the timer system. If any timers have been
      * scheduled, they will be cleared and will never have the opportunity to
      * execute in the future.
      */
    def clearAllTimers(): Unit = js.native
    
    /**
      * Given the name of a module, use the automatic mocking system to generate a
      * mocked version of the module for you.
      *
      * This is useful when you want to create a manual mock that extends the
      * automatic mock's behavior.
      */
    def createMockFromModule[T](moduleName: String): Mocked_[T] = js.native
    
    /**
      * Indicates that the module system should never return a mocked version of
      * the specified module and its dependencies.
      */
    def deepUnmock(moduleName: String): Jest = js.native
    
    /**
      * Disables automatic mocking in the module loader.
      *
      * After this method is called, all `require()`s will return the real
      * versions of each module (rather than a mocked version).
      */
    def disableAutomock(): Jest = js.native
    
    /**
      * When using `babel-jest`, calls to `jest.mock()` will automatically be hoisted
      * to the top of the code block. Use this method if you want to explicitly
      * avoid this behavior.
      */
    def doMock[T](moduleName: String): Jest = js.native
    def doMock[T](moduleName: String, moduleFactory: js.Function0[T]): Jest = js.native
    def doMock[T](moduleName: String, moduleFactory: js.Function0[T], options: Virtual): Jest = js.native
    def doMock[T](moduleName: String, moduleFactory: Unit, options: Virtual): Jest = js.native
    
    /**
      * When using `babel-jest`, calls to `jest.unmock()` will automatically be hoisted
      * to the top of the code block. Use this method if you want to explicitly
      * avoid this behavior.
      */
    def dontMock(moduleName: String): Jest = js.native
    
    /**
      * Enables automatic mocking in the module loader.
      */
    def enableAutomock(): Jest = js.native
    
    /**
      * Creates a mock function. Optionally takes a mock implementation.
      */
    def fn[T /* <: FunctionLike */](): Mock[T] = js.native
    /**
      * Creates a mock function. Optionally takes a mock implementation.
      */
    def fn[T /* <: FunctionLike */](implementation: T): Mock[T] = js.native
    /**
      * Creates a mock function. Optionally takes a mock implementation.
      */
    @JSName("fn")
    var fn_Original: FnCall = js.native
    
    /**
      * Given the name of a module, use the automatic mocking system to generate a
      * mocked version of the module for you.
      *
      * This is useful when you want to create a manual mock that extends the
      * automatic mock's behavior.
      *
      * @deprecated Use `jest.createMockFromModule()` instead
      */
    def genMockFromModule[T](moduleName: String): Mocked_[T] = js.native
    
    /**
      * When mocking time, `Date.now()` will also be mocked. If you for some reason
      * need access to the real current time, you can invoke this function.
      *
      * @remarks
      * Not available when using legacy fake timers implementation.
      */
    def getRealSystemTime(): Double = js.native
    
    /**
      * Retrieves the seed value. It will be randomly generated for each test run
      * or can be manually set via the `--seed` CLI argument.
      */
    def getSeed(): Double = js.native
    
    /**
      * Returns the number of fake timers still left to run.
      */
    def getTimerCount(): Double = js.native
    
    /**
      * Determines if the given function is a mocked function.
      */
    def isMockFunction(fn: Any): /* is jest-mock.jest-mock.Mock<jest-mock.jest-mock.UnknownFunction> */ Boolean = js.native
    /**
      * Determines if the given function is a mocked function.
      */
    def isMockFunction[T /* <: FunctionLike */](fn: MockInstance[T]): /* is jest-mock.jest-mock.MockInstance<T> */ Boolean = js.native
    /**
      * Determines if the given function is a mocked function.
      */
    def isMockFunction[P /* <: js.Array[Any] */, R](fn: js.Function1[/* args */ P, R]): /* is jest-mock.jest-mock.Mock<(args : P): R> */ Boolean = js.native
    /**
      * Determines if the given function is a mocked function.
      */
    @JSName("isMockFunction")
    var isMockFunction_Original: FnCallFn = js.native
    
    /**
      * `jest.isolateModules()` goes a step further than `jest.resetModules()` and
      * creates a sandbox registry for the modules that are loaded inside the callback
      * function. This is useful to isolate specific modules for every test so that
      * local module state doesn't conflict between tests.
      */
    def isolateModules(fn: js.Function0[Unit]): Jest = js.native
    
    /**
      * Mocks a module with an auto-mocked version when it is being required.
      */
    def mock[T](moduleName: String): Jest = js.native
    def mock[T](moduleName: String, moduleFactory: js.Function0[T]): Jest = js.native
    def mock[T](moduleName: String, moduleFactory: js.Function0[T], options: Virtual): Jest = js.native
    def mock[T](moduleName: String, moduleFactory: Unit, options: Virtual): Jest = js.native
    
    /**
      * Wraps types of the `source` object and its deep members with type definitions
      * of Jest mock function. Pass `{shallow: true}` option to disable the deeply
      * mocked behavior.
      */
    def mocked[T /* <: js.Object */](source: T): Mocked_[T] = js.native
    /**
      * Wraps types of the `source` object and its deep members with type definitions
      * of Jest mock function. Pass `{shallow: true}` option to disable the deeply
      * mocked behavior.
      */
    def mocked[T /* <: js.Object */](source: T, options: Shallow): Mocked_[T] = js.native
    /**
      * Wraps types of the `source` object and its deep members with type definitions
      * of Jest mock function. Pass `{shallow: true}` option to disable the deeply
      * mocked behavior.
      */
    def mocked[T /* <: js.Object */](source: T, options: `0`): MockedShallow[T] = js.native
    /**
      * Wraps types of the `source` object and its deep members with type definitions
      * of Jest mock function. Pass `{shallow: true}` option to disable the deeply
      * mocked behavior.
      */
    @JSName("mocked")
    var mocked_Original: FnCallSourceOptions = js.native
    
    /**
      * Returns the current time in ms of the fake timer clock.
      */
    def now(): Double = js.native
    
    /**
      * Returns the actual module instead of a mock, bypassing all checks on
      * whether the module should receive a mock implementation or not.
      *
      * @example
      * ```js
      * jest.mock('../myModule', () => {
      *   // Require the original module to not be mocked...
      *   const originalModule = jest.requireActual('../myModule');
      *
      *   return {
      *     __esModule: true, // Use it when dealing with esModules
      *     ...originalModule,
      *     getRandom: jest.fn().mockReturnValue(10),
      *   };
      * });
      *
      * const getRandom = require('../myModule').getRandom;
      *
      * getRandom(); // Always returns 10
      * ```
      */
    def requireActual[T](moduleName: String): T = js.native
    
    /**
      * Returns a mock module instead of the actual module, bypassing all checks
      * on whether the module should be required normally or not.
      */
    def requireMock[T](moduleName: String): T = js.native
    
    /**
      * Resets the state of all mocks. Equivalent to calling `.mockReset()` on
      * every mocked function.
      */
    def resetAllMocks(): Jest = js.native
    
    /**
      * Resets the module registry - the cache of all required modules. This is
      * useful to isolate modules where local state might conflict between tests.
      */
    def resetModules(): Jest = js.native
    
    /**
      * Restores all mocks back to their original value. Equivalent to calling
      * `.mockRestore()` on every mocked function.
      *
      * Beware that `jest.restoreAllMocks()` only works when the mock was created
      * with `jest.spyOn()`; other mocks will require you to manually restore them.
      */
    def restoreAllMocks(): Jest = js.native
    
    /**
      * Runs failed tests n-times until they pass or until the max number of
      * retries is exhausted.
      *
      * If `logErrorsBeforeRetry` is enabled, Jest will log the error(s) that caused
      * the test to fail to the console, providing visibility on why a retry occurred.
      * retries is exhausted.
      *
      * @remarks
      * Only available with `jest-circus` runner.
      */
    def retryTimes(numRetries: Double): Jest = js.native
    def retryTimes(numRetries: Double, options: LogErrorsBeforeRetry): Jest = js.native
    
    /**
      * Exhausts tasks queued by `setImmediate()`.
      *
      * @remarks
      * Only available when using legacy fake timers implementation.
      */
    def runAllImmediates(): Unit = js.native
    
    /**
      * Exhausts the micro-task queue (usually interfaced in node via
      * `process.nextTick()`).
      */
    def runAllTicks(): Unit = js.native
    
    /**
      * Exhausts the macro-task queue (i.e., all tasks queued by `setTimeout()`
      * and `setInterval()`).
      */
    def runAllTimers(): Unit = js.native
    
    /**
      * Executes only the macro-tasks that are currently pending (i.e., only the
      * tasks that have been queued by `setTimeout()` or `setInterval()` up to this
      * point). If any of the currently pending macro-tasks schedule new
      * macro-tasks, those new tasks will not be executed by this call.
      */
    def runOnlyPendingTimers(): Unit = js.native
    
    /**
      * Explicitly supplies the mock object that the module system should return
      * for the specified module.
      *
      * @remarks
      * It is recommended to use `jest.mock()` instead. The `jest.mock()` API's second
      * argument is a module factory instead of the expected exported module object.
      */
    def setMock(moduleName: String, moduleExports: Any): Jest = js.native
    
    /**
      * Set the current system time used by fake timers. Simulates a user changing
      * the system clock while your program is running. It affects the current time,
      * but it does not in itself cause e.g. timers to fire; they will fire exactly
      * as they would have done without the call to `jest.setSystemTime()`.
      *
      * @remarks
      * Not available when using legacy fake timers implementation.
      */
    def setSystemTime(): Unit = js.native
    def setSystemTime(now: js.Date): Unit = js.native
    def setSystemTime(now: Double): Unit = js.native
    
    /**
      * Set the default timeout interval for tests and before/after hooks in
      * milliseconds.
      *
      * @remarks
      * The default timeout interval is 5 seconds if this method is not called.
      */
    def setTimeout(timeout: Double): Jest = js.native
    
    /**
      * Creates a mock function similar to `jest.fn()` but also tracks calls to
      * `object[methodName]`.
      *
      * Optional third argument of `accessType` can be either 'get' or 'set', which
      * proves to be useful when you want to spy on a getter or a setter, respectively.
      *
      * @remarks
      * By default, `jest.spyOn()` also calls the spied method. This is different
      * behavior from most other test libraries.
      */
    def spyOn[T /* <: js.Object */, K /* <: ConstructorLikeKeys[T] | MethodLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */](`object`: T, methodKey: K): /* import warning: importer.ImportType#apply Failed type conversion: V extends jest-mock.jest-mock.ClassLike | jest-mock.jest-mock.FunctionLike ? jest-mock.jest-mock.Spied<V> : never */ js.Any = js.native
    /**
      * Creates a mock function similar to `jest.fn()` but also tracks calls to
      * `object[methodName]`.
      *
      * Optional third argument of `accessType` can be either 'get' or 'set', which
      * proves to be useful when you want to spy on a getter or a setter, respectively.
      *
      * @remarks
      * By default, `jest.spyOn()` also calls the spied method. This is different
      * behavior from most other test libraries.
      */
    def spyOn[T /* <: js.Object */, K /* <: PropertyLikeKeys[T] */, V /* <: /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[K] */ js.Any */, A /* <: get | set */](`object`: T, methodKey: K, accessType: A): /* import warning: importer.ImportType#apply Failed type conversion: A extends 'get' ? jest-mock.jest-mock.SpiedGetter<V> : A extends 'set' ? jest-mock.jest-mock.SpiedSetter<V> : never */ js.Any = js.native
    /**
      * Creates a mock function similar to `jest.fn()` but also tracks calls to
      * `object[methodName]`.
      *
      * Optional third argument of `accessType` can be either 'get' or 'set', which
      * proves to be useful when you want to spy on a getter or a setter, respectively.
      *
      * @remarks
      * By default, `jest.spyOn()` also calls the spied method. This is different
      * behavior from most other test libraries.
      */
    @JSName("spyOn")
    var spyOn_Original: FnCallObjectMethodKeyAccessType = js.native
    
    /**
      * Indicates that the module system should never return a mocked version of
      * the specified module from `require()` (e.g. that it should always return the
      * real module).
      */
    def unmock(moduleName: String): Jest = js.native
    
    /**
      * Mocks a module with the provided module factory when it is being imported.
      */
    def unstable_mockModule[T](moduleName: String, moduleFactory: js.Function0[T | js.Promise[T]]): Jest = js.native
    def unstable_mockModule[T](moduleName: String, moduleFactory: js.Function0[T | js.Promise[T]], options: Virtual): Jest = js.native
    
    /**
      * Instructs Jest to use fake versions of the global date, performance,
      * time and timer APIs. Fake timers implementation is backed by
      * [`@sinonjs/fake-timers`](https://github.com/sinonjs/fake-timers).
      *
      * @remarks
      * Calling `jest.useFakeTimers()` once again in the same test file would reinstall
      * fake timers using the provided options.
      */
    def useFakeTimers(): Jest = js.native
    def useFakeTimers(fakeTimersConfig: FakeTimersConfig): Jest = js.native
    def useFakeTimers(fakeTimersConfig: LegacyFakeTimersConfig): Jest = js.native
    
    /**
      * Instructs Jest to restore the original implementations of the global date,
      * performance, time and timer APIs.
      */
    def useRealTimers(): Jest = js.native
  }
  
  trait JestEnvironmentConfig extends StObject {
    
    var globalConfig: GlobalConfig
    
    var projectConfig: ProjectConfig
  }
  object JestEnvironmentConfig {
    
    inline def apply(globalConfig: GlobalConfig, projectConfig: ProjectConfig): JestEnvironmentConfig = {
      val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], projectConfig = projectConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestEnvironmentConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JestEnvironmentConfig] (val x: Self) extends AnyVal {
      
      inline def setGlobalConfig(value: GlobalConfig): Self = StObject.set(x, "globalConfig", value.asInstanceOf[js.Any])
      
      inline def setProjectConfig(value: ProjectConfig): Self = StObject.set(x, "projectConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait JestImportMeta
    extends StObject
       with ImportMeta {
    
    var jest: Jest
  }
  object JestImportMeta {
    
    inline def apply(jest: Jest, url: String): JestImportMeta = {
      val __obj = js.Dynamic.literal(jest = jest.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JestImportMeta]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JestImportMeta] (val x: Self) extends AnyVal {
      
      inline def setJest(value: Jest): Self = StObject.set(x, "jest", value.asInstanceOf[js.Any])
    }
  }
  
  type Module = NodeModule
  
  @js.native
  trait ModuleWrapper extends StObject {
    
    def apply(
      module: Module,
      exports: /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ js.Any,
      require: Require & (js.Function1[/* id */ String, Any]),
      __dirname: String,
      __filename: String,
      jest: Unit,
      sandboxInjectedGlobals: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.Global * / any[keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.Global * / any] */ js.Any)*
    ): Any = js.native
    def apply(
      module: Module,
      exports: /* import warning: importer.ImportType#apply Failed type conversion: @jest/environment.@jest/environment.Module['exports'] */ js.Any,
      require: Require & (js.Function1[/* id */ String, Any]),
      __dirname: String,
      __filename: String,
      jest: Jest,
      sandboxInjectedGlobals: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.Global * / any[keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Global.Global * / any] */ js.Any)*
    ): Any = js.native
  }
}
