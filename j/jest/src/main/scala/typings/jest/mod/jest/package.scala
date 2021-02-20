package typings.jest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object jest {
  
  type AndNot[T] = T with typings.jest.anon.Not[T]
  
  type ArgsType[T] = js.Any
  
  type ConstructorArgsType[T] = js.Any
  
  type ConstructorPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends new (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  
  type CustomAsymmetricMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Function1[
    /* args */ typings.jest.mod.jest.RemoveFirstFromTuple[typings.jest.mod.jest.Parameters[TMatcher]], 
    typings.jest.mod.jest.AsymmetricMatcher
  ]
  
  type CustomAsyncMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in jest.jest.jest.NonAsyncMatchers<TMatchers> ]: jest.jest.jest.CustomAsymmetricMatcher<TMatchers[K]>}
    */ typings.jest.jestStrings.CustomAsyncMatchers with org.scalablytyped.runtime.TopLevel[TMatchers]
  
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  type CustomJestMatcher[TMatcher /* <: js.Function1[/* repeated */ js.Any, _] */, TMatcherReturn] = js.Function1[
    /* args */ typings.jest.mod.jest.RemoveFirstFromTuple[typings.jest.mod.jest.Parameters[TMatcher]], 
    TMatcherReturn
  ]
  
  type CustomMatcher = js.ThisFunction2[
    /* this */ typings.jest.mod.jest.MatcherContext, 
    /* received */ js.Any, 
    /* repeated */ js.Any, 
    typings.jest.mod.jest.CustomMatcherResult | js.Promise[typings.jest.mod.jest.CustomMatcherResult]
  ]
  
  type EmptyFunction = js.Function0[scala.Unit]
  
  type EqualityTester = js.Function2[/* a */ js.Any, /* b */ js.Any, js.UndefOr[scala.Boolean]]
  
  type ExpectExtendMap = org.scalablytyped.runtime.StringDictionary[typings.jest.mod.jest.CustomMatcher]
  
  type ExtendedExpect[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = typings.jest.mod.jest.ExpectProperties with typings.jest.mod.jest.AndNot[typings.jest.mod.jest.CustomAsyncMatchers[TMatchers]] with typings.jest.mod.jest.ExtendedExpectFunction[TMatchers]
  
  // when have called expect.extend
  type ExtendedExpectFunction[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = js.Function1[/* actual */ js.Any, typings.jest.mod.jest.JestExtendedMatchers[TMatchers, js.Any]]
  
  // should be TMatcherReturn extends void|Promise<void> but getting dtslint error
  // Use the `void` type for return types only. Otherwise, use `undefined`. See: https://github.com/Microsoft/dtslint/blob/master/docs/void-return.md
  // have added issue https://github.com/microsoft/dtslint/issues/256 - Cannot have type union containing void ( to be used as return type only
  type ExtendedMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */, TMatcherReturn, TActual] = (typings.jest.mod.jest.Matchers[TMatcherReturn, TActual]) with typings.jest.jestStrings.ExtendedMatchers with org.scalablytyped.runtime.TopLevel[TMatchers]
  
  type FunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with java.lang.String
  
  type JestExtendedMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */, TActual] = typings.jest.mod.jest.JestMatchersShape[
    typings.jest.mod.jest.ExtendedMatchers[TMatchers, scala.Unit, TActual], 
    typings.jest.mod.jest.ExtendedMatchers[TMatchers, js.Promise[scala.Unit], TActual]
  ]
  
  type JestMatchersShape[TNonPromise /* <: js.Object */, TPromise /* <: js.Object */] = typings.jest.anon.Rejects[TPromise] with typings.jest.mod.jest.AndNot[TNonPromise]
  
  type Lifecycle = js.Function2[
    /* fn */ typings.jest.mod.jest.ProvidesCallback, 
    /* timeout */ js.UndefOr[scala.Double], 
    js.Any
  ]
  
  type MatcherHintColor = js.Function1[/* arg */ java.lang.String, java.lang.String]
  
  /**
    * Wrap an object or a module with mock definitions
    *
    * @example
    *
    *  jest.mock("../api");
    *  import * as api from "../api";
    *
    *  const mockApi = api as jest.Mocked<typeof api>;
    *  api.MyApi.prototype.myApiMethod.mockImplementation(() => "test");
    */
  type Mocked[T] = typings.jest.jestStrings.Mocked with org.scalablytyped.runtime.TopLevel[js.Any] with T
  
  /**
    * Wrap a class with mock definitions
    *
    * @example
    *
    *  import { MyClass } from "./library";
    *  jest.mock("./library");
    *
    *  const mockedMyClass = MyClass as jest.MockedClass<typeof MyClass>;
    *
    *  expect(mockedMyClass.mock.calls[0][0]).toBe(42); // Constructor calls
    *  expect(mockedMyClass.prototype.myMethod.mock.calls[0][0]).toBe(42); // Method calls
    */
  type MockedClass[T /* <: typings.jest.mod.jest.Constructable */] = (typings.jest.mod.jest.MockInstance[typings.std.InstanceType[T], _]) with js.Object with T
  
  /**
    * Wrap a function with mock definitions
    *
    * @example
    *
    *  import { myFunction } from "./library";
    *  jest.mock("./library");
    *
    *  const mockMyFunction = myFunction as jest.MockedFunction<typeof myFunction>;
    *  expect(mockMyFunction.mock.calls[0][0]).toBe(42);
    */
  type MockedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = (typings.jest.mod.jest.MockInstance[typings.std.ReturnType[T], typings.jest.mod.jest.ArgsType[T]]) with T
  
  type NonAsyncMatchers[TMatchers /* <: typings.jest.mod.jest.ExpectExtendMap */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof TMatchers ]: std.ReturnType<TMatchers[K]> extends std.Promise<jest.jest.jest.CustomMatcherResult>? never : K}[keyof TMatchers] */ js.Any
  
  // see https://github.com/Microsoft/TypeScript/issues/25215
  type NonFunctionPropertyNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? never : K}[keyof T] */ js.Any) with java.lang.String
  
  type NonPromiseMatchers[T /* <: typings.jest.anon.JestMatchersShape */] = typings.jest.mod.jest.Omit[
    T, 
    typings.jest.jestStrings.resolves | typings.jest.jestStrings.rejects | typings.jest.jestStrings.not
  ]
  
  /**
    * Construct a type with the properties of T except for those in type K.
    */
  type Omit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  
  type PrintLabel = js.Function1[/* string */ java.lang.String, java.lang.String]
  
  type PromiseMatchers[T /* <: typings.jest.anon.JestMatchersShape */] = typings.jest.mod.jest.Omit[
    /* import warning: importer.ImportType#apply Failed type conversion: T['resolves'] */ js.Any, 
    typings.jest.jestStrings.not
  ]
  
  type ProvidesCallback = js.Function1[/* cb */ typings.jest.mod.jest.DoneCallback, js.Any]
  
  type RejectedValue[T] = js.Any
  
  type RemoveFirstFromTuple[T /* <: js.Array[_] */] = js.Array[js.Any]
  
  type ResolvedValue[T] = js.Any | T
  
  type SnapshotSerializerPlugin = typings.prettyFormat.mod.Plugin
  
  /**
    * Represents a function that has been spied on.
    */
  type SpiedFunction[T /* <: js.Function1[/* repeated */ js.Any, _] */] = typings.jest.mod.jest.SpyInstance[typings.std.ReturnType[T], typings.jest.mod.jest.ArgsType[T]]
  
  type SpyInstance[T, Y /* <: js.Array[_] */] = typings.jest.mod.jest.MockInstance[T, Y]
  
  /**
    * Provides a way to add Jasmine-compatible matchers into your Jest context.
    */
  @scala.inline
  def addMatchers(matchers: typings.jest.mod.jasmine.CustomMatcherFactories): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("addMatchers")(matchers.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Advances all timers by msToRun milliseconds. All pending "macro-tasks" that have been
    * queued via setTimeout() or setInterval(), and would be executed within this timeframe
    * will be executed.
    */
  @scala.inline
  def advanceTimersByTime(msToRun: scala.Double): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("advanceTimersByTime")(msToRun.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Advances all timers by the needed milliseconds so that only the next
    * timeouts/intervals will run. Optionally, you can provide steps, so it
    * will run steps amount of next timeouts/intervals.
    */
  @scala.inline
  def advanceTimersToNextTimer(): scala.Unit = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("advanceTimersToNextTimer")().asInstanceOf[scala.Unit]
  @scala.inline
  def advanceTimersToNextTimer(step: scala.Double): scala.Unit = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("advanceTimersToNextTimer")(step.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Disables automatic mocking in the module loader.
    */
  @scala.inline
  def autoMockOff(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("autoMockOff")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Enables automatic mocking in the module loader.
    */
  @scala.inline
  def autoMockOn(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("autoMockOn")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Clears the mock.calls and mock.instances properties of all mocks.
    * Equivalent to calling .mockClear() on every mocked function.
    */
  @scala.inline
  def clearAllMocks(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("clearAllMocks")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Removes any pending timers from the timer system. If any timers have
    * been scheduled, they will be cleared and will never have the opportunity
    * to execute in the future.
    */
  @scala.inline
  def clearAllTimers(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("clearAllTimers")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def createMockFromModule[T](moduleName: java.lang.String): T = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("createMockFromModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module, including all of the specificied module's dependencies.
    */
  @scala.inline
  def deepUnmock(moduleName: java.lang.String): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("deepUnmock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Disables automatic mocking in the module loader.
    */
  @scala.inline
  def disableAutomock(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("disableAutomock")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  @scala.inline
  def doMock(moduleName: java.lang.String): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  @scala.inline
  def doMock(
    moduleName: java.lang.String,
    factory: js.UndefOr[scala.Nothing],
    options: typings.jest.mod.jest.MockOptions
  ): typings.jest.anon.Typeofjest = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jest.anon.Typeofjest]
  @scala.inline
  def doMock(moduleName: java.lang.String, factory: js.Function0[_]): typings.jest.anon.Typeofjest = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[typings.jest.anon.Typeofjest]
  @scala.inline
  def doMock(moduleName: java.lang.String, factory: js.Function0[_], options: typings.jest.mod.jest.MockOptions): typings.jest.anon.Typeofjest = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("doMock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module from require() (e.g. that it should always return the real module).
    */
  @scala.inline
  def dontMock(moduleName: java.lang.String): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("dontMock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Enables automatic mocking in the module loader.
    */
  @scala.inline
  def enableAutomock(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("enableAutomock")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  @scala.inline
  def fn(): typings.jest.mod.jest.Mock_[_, _] = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("fn")().asInstanceOf[typings.jest.mod.jest.Mock_[_, _]]
  @scala.inline
  def fn[T, Y /* <: js.Array[_] */](implementation: js.Function1[/* args */ Y, T]): typings.jest.mod.jest.Mock_[T, Y] = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("fn")(implementation.asInstanceOf[js.Any]).asInstanceOf[typings.jest.mod.jest.Mock_[T, Y]]
  
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  @scala.inline
  def fn_TY_ArrayWildcard[T, Y /* <: js.Array[_] */](): typings.jest.mod.jest.Mock_[T, Y] = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("fn")().asInstanceOf[typings.jest.mod.jest.Mock_[T, Y]]
  
  /**
    * (renamed to `createMockFromModule` in Jest 26.0.0+)
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def genMockFromModule[T](moduleName: java.lang.String): T = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("genMockFromModule")(moduleName.asInstanceOf[js.Any]).asInstanceOf[T]
  
  /**
    * When mocking time, Date.now() will also be mocked. If you for some
    * reason need access to the real current time, you can invoke this
    * function.
    *
    * > Note: This function is only available when using modern fake timers
    * > implementation
    */
  @scala.inline
  def getRealSystemTime(): scala.Double = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("getRealSystemTime")().asInstanceOf[scala.Double]
  
  /**
    * Returns the number of fake timers still left to run.
    */
  @scala.inline
  def getTimerCount(): scala.Double = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("getTimerCount")().asInstanceOf[scala.Double]
  
  /**
    * Returns whether the given function is a mock function.
    */
  @scala.inline
  def isMockFunction(fn: js.Any): /* is jest.jest.jest.Mock<any, any> */ scala.Boolean = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("isMockFunction")(fn.asInstanceOf[js.Any]).asInstanceOf[/* is jest.jest.jest.Mock<any, any> */ scala.Boolean]
  
  /**
    * Creates a sandbox registry for the modules that are loaded inside the callback function..
    * This is useful to isolate specific modules for every test so that local module state doesn't conflict between tests.
    */
  @scala.inline
  def isolateModules(fn: js.Function0[scala.Unit]): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("isolateModules")(fn.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  @scala.inline
  def mock(moduleName: java.lang.String): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  @scala.inline
  def mock(
    moduleName: java.lang.String,
    factory: js.UndefOr[scala.Nothing],
    options: typings.jest.mod.jest.MockOptions
  ): typings.jest.anon.Typeofjest = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jest.anon.Typeofjest]
  @scala.inline
  def mock(moduleName: java.lang.String, factory: js.Function0[_]): typings.jest.anon.Typeofjest = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[typings.jest.anon.Typeofjest]
  @scala.inline
  def mock(moduleName: java.lang.String, factory: js.Function0[_], options: typings.jest.mod.jest.MockOptions): typings.jest.anon.Typeofjest = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("mock")(moduleName.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Returns the actual module instead of a mock, bypassing all checks on
    * whether the module should receive a mock implementation or not.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def requireActual[TModule](moduleName: java.lang.String): TModule = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("requireActual")(moduleName.asInstanceOf[js.Any]).asInstanceOf[TModule]
  
  /**
    * Returns a mock module instead of the actual module, bypassing all checks
    * on whether the module should be required normally or not.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def requireMock[TModule](moduleName: java.lang.String): TModule = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("requireMock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[TModule]
  
  /**
    * Resets the state of all mocks.
    * Equivalent to calling .mockReset() on every mocked function.
    */
  @scala.inline
  def resetAllMocks(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("resetAllMocks")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  @scala.inline
  def resetModuleRegistry(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("resetModuleRegistry")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  @scala.inline
  def resetModules(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("resetModules")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * available since Jest 21.1.0
    * Restores all mocks back to their original value.
    * Equivalent to calling .mockRestore on every mocked function.
    * Beware that jest.restoreAllMocks() only works when mock was created with
    * jest.spyOn; other mocks will require you to manually restore them.
    */
  @scala.inline
  def restoreAllMocks(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("restoreAllMocks")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Runs failed tests n-times until they pass or until the max number of retries is exhausted.
    * This only works with jest-circus!
    */
  @scala.inline
  def retryTimes(numRetries: scala.Double): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("retryTimes")(numRetries.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Exhausts tasks queued by setImmediate().
    */
  @scala.inline
  def runAllImmediates(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runAllImmediates")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Exhausts the micro-task queue (usually interfaced in node via process.nextTick).
    */
  @scala.inline
  def runAllTicks(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runAllTicks")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Exhausts the macro-task queue (i.e., all tasks queued by setTimeout() and setInterval()).
    */
  @scala.inline
  def runAllTimers(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runAllTimers")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Executes only the macro-tasks that are currently pending (i.e., only the
    * tasks that have been queued by setTimeout() or setInterval() up to this point).
    * If any of the currently pending macro-tasks schedule new macro-tasks,
    * those new tasks will not be executed by this call.
    */
  @scala.inline
  def runOnlyPendingTimers(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runOnlyPendingTimers")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * (renamed to `advanceTimersByTime` in Jest 21.3.0+) Executes only the macro
    * task queue (i.e. all tasks queued by setTimeout() or setInterval() and setImmediate()).
    */
  @scala.inline
  def runTimersToTime(msToRun: scala.Double): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("runTimersToTime")(msToRun.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Explicitly supplies the mock object that the module system should return
    * for the specified module.
    */
  // tslint:disable-next-line: no-unnecessary-generics
  @scala.inline
  def setMock[T](moduleName: java.lang.String, moduleExports: T): typings.jest.anon.Typeofjest = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setMock")(moduleName.asInstanceOf[js.Any], moduleExports.asInstanceOf[js.Any])).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Set the current system time used by fake timers. Simulates a user
    * changing the system clock while your program is running. It affects the
    * current time but it does not in itself cause e.g. timers to fire; they
    * will fire exactly as they would have done without the call to
    * jest.setSystemTime().
    *
    * > Note: This function is only available when using modern fake timers
    * > implementation
    */
  @scala.inline
  def setSystemTime(): scala.Unit = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setSystemTime")().asInstanceOf[scala.Unit]
  @scala.inline
  def setSystemTime(now: scala.Double): scala.Unit = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setSystemTime")(now.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def setSystemTime(now: typings.std.Date): scala.Unit = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setSystemTime")(now.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  /**
    * Set the default timeout interval for tests and before/after hooks in milliseconds.
    * Note: The default timeout interval is 5 seconds if this method is not called.
    */
  @scala.inline
  def setTimeout(timeout: scala.Double): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  @scala.inline
  def spyOn[T /* <: js.Object */, M /* <: typings.jest.mod.jest.ConstructorPropertyNames[typings.std.Required[T]] */](`object`: T, method: M): typings.jest.mod.jest.SpyInstance[
    typings.std.InstanceType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typings.jest.mod.jest.ConstructorArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.jest.mod.jest.SpyInstance[
    typings.std.InstanceType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typings.jest.mod.jest.ConstructorArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ]]
  
  @scala.inline
  def spyOn_T_ObjectM_FunctionPropertyNamesRequiredT[T /* <: js.Object */, M /* <: typings.jest.mod.jest.FunctionPropertyNames[typings.std.Required[T]] */](`object`: T, method: M): typings.jest.mod.jest.SpyInstance[
    typings.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typings.jest.mod.jest.ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[typings.jest.mod.jest.SpyInstance[
    typings.std.ReturnType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ], 
    typings.jest.mod.jest.ArgsType[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ]]
  
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
  @scala.inline
  def spyOn_get[T /* <: js.Object */, M /* <: typings.jest.mod.jest.NonFunctionPropertyNames[typings.std.Required[T]] */](`object`: T, method: M, accessType: typings.jest.jestStrings.get): typings.jest.mod.jest.SpyInstance[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any, 
    js.Array[js.Any]
  ] = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any])).asInstanceOf[typings.jest.mod.jest.SpyInstance[
    /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any, 
    js.Array[js.Any]
  ]]
  
  @scala.inline
  def spyOn_set[T /* <: js.Object */, M /* <: typings.jest.mod.jest.NonFunctionPropertyNames[typings.std.Required[T]] */](`object`: T, method: M, accessType: typings.jest.jestStrings.set): typings.jest.mod.jest.SpyInstance[
    scala.Unit, 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ] = (typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("spyOn")(`object`.asInstanceOf[js.Any], method.asInstanceOf[js.Any], accessType.asInstanceOf[js.Any])).asInstanceOf[typings.jest.mod.jest.SpyInstance[
    scala.Unit, 
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: std.Required<T>[M] */ js.Any
    ]
  ]]
  
  /**
    * Indicates that the module system should never return a mocked version of
    * the specified module from require() (e.g. that it should always return the real module).
    */
  @scala.inline
  def unmock(moduleName: java.lang.String): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("unmock")(moduleName.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Instructs Jest to use fake versions of the standard timer functions.
    */
  @scala.inline
  def useFakeTimers(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useFakeTimers")().asInstanceOf[typings.jest.anon.Typeofjest]
  
  @scala.inline
  def useFakeTimers_legacy(implementation: typings.jest.jestStrings.legacy): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useFakeTimers")(implementation.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  @scala.inline
  def useFakeTimers_modern(implementation: typings.jest.jestStrings.modern): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useFakeTimers")(implementation.asInstanceOf[js.Any]).asInstanceOf[typings.jest.anon.Typeofjest]
  
  /**
    * Instructs Jest to use the real versions of the standard timer functions.
    */
  @scala.inline
  def useRealTimers(): typings.jest.anon.Typeofjest = typings.jest.mod.jest.^.asInstanceOf[js.Dynamic].applyDynamic("useRealTimers")().asInstanceOf[typings.jest.anon.Typeofjest]
}
