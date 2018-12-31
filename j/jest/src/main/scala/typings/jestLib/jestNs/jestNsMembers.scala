package typings
package jestLib.jestNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("jest")
@js.native
object jestNsMembers extends js.Object {
  /**
    * Provides a way to add Jasmine-compatible matchers into your Jest context.
    */
  def addMatchers(matchers: jestLib.jasmineNs.CustomMatcherFactories): jestLib.Anon_UseRealTimers = js.native
  /**
    * Advances all timers by msToRun milliseconds. All pending "macro-tasks" that have been
    * queued via setTimeout() or setInterval(), and would be executed within this timeframe
    * will be executed.
    */
  def advanceTimersByTime(msToRun: scala.Double): jestLib.Anon_UseRealTimers = js.native
  /**
    * Disables automatic mocking in the module loader.
    */
  def autoMockOff(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Enables automatic mocking in the module loader.
    */
  def autoMockOn(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Clears the mock.calls and mock.instances properties of all mocks.
    * Equivalent to calling .mockClear() on every mocked function.
    */
  def clearAllMocks(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Removes any pending timers from the timer system. If any timers have
    * been scheduled, they will be cleared and will never have the opportunity
    * to execute in the future.
    */
  def clearAllTimers(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module, including all of the specificied module's dependencies.
    */
  def deepUnmock(moduleName: java.lang.String): jestLib.Anon_UseRealTimers = js.native
  /**
    * Disables automatic mocking in the module loader.
    */
  def disableAutomock(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def doMock(moduleName: java.lang.String): jestLib.Anon_UseRealTimers = js.native
  def doMock(moduleName: java.lang.String, factory: js.Any): jestLib.Anon_UseRealTimers = js.native
  def doMock(moduleName: java.lang.String, factory: js.Any, options: MockOptions): jestLib.Anon_UseRealTimers = js.native
  /**
    * Indicates that the module system should never return a mocked version
    * of the specified module from require() (e.g. that it should always return the real module).
    */
  def dontMock(moduleName: java.lang.String): jestLib.Anon_UseRealTimers = js.native
  /**
    * Enables automatic mocking in the module loader.
    */
  def enableAutomock(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  def fn[T](): Mock[T] = js.native
  def fn[T](implementation: js.Function1[/* repeated */ js.Any, _]): Mock[T] = js.native
  /**
    * Creates a mock function. Optionally takes a mock implementation.
    */
  @JSName("fn")
  def fn_TObject[T /* <: js.Object */](implementation: js.Function1[/* repeated */ js.Any, T]): Mock[T] = js.native
  /**
    * Use the automatic mocking system to generate a mocked version of the given module.
    */
  def genMockFromModule[T](moduleName: java.lang.String): T = js.native
  /**
    * Returns whether the given function is a mock function.
    */
  def isMockFunction(fn: js.Any): /* is jest.jest.Mock<any> */ scala.Boolean = js.native
  /**
    * Mocks a module with an auto-mocked version when it is being required.
    */
  def mock(moduleName: java.lang.String): jestLib.Anon_UseRealTimers = js.native
  def mock(moduleName: java.lang.String, factory: js.Any): jestLib.Anon_UseRealTimers = js.native
  def mock(moduleName: java.lang.String, factory: js.Any, options: MockOptions): jestLib.Anon_UseRealTimers = js.native
  /**
    * Clears the mock.calls and mock.instances properties of all mocks.
    * Equivalent to calling .mockClear() on every mocked function.
    */
  def resetAllMocks(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def resetModuleRegistry(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Resets the module registry - the cache of all required modules. This is
    * useful to isolate modules where local state might conflict between tests.
    */
  def resetModules(): jestLib.Anon_UseRealTimers = js.native
  /**
    * available since Jest 21.1.0
    * Restores all mocks back to their original value.
    * Equivalent to calling .mockRestore on every mocked function.
    * Beware that jest.restoreAllMocks() only works when mock was created with
    * jest.spyOn; other mocks will require you to manually restore them.
    */
  def restoreAllMocks(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Exhausts tasks queued by setImmediate().
    */
  def runAllImmediates(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Exhausts the micro-task queue (usually interfaced in node via process.nextTick).
    */
  def runAllTicks(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Exhausts the macro-task queue (i.e., all tasks queued by setTimeout() and setInterval()).
    */
  def runAllTimers(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Executes only the macro-tasks that are currently pending (i.e., only the
    * tasks that have been queued by setTimeout() or setInterval() up to this point).
    * If any of the currently pending macro-tasks schedule new macro-tasks,
    * those new tasks will not be executed by this call.
    */
  def runOnlyPendingTimers(): jestLib.Anon_UseRealTimers = js.native
  /**
    * (renamed to `advanceTimersByTime` in Jest 21.3.0+) Executes only the macro
    * task queue (i.e. all tasks queued by setTimeout() or setInterval() and setImmediate()).
    */
  def runTimersToTime(msToRun: scala.Double): jestLib.Anon_UseRealTimers = js.native
  /**
    * Explicitly supplies the mock object that the module system should return
    * for the specified module.
    */
  def setMock[T](moduleName: java.lang.String, moduleExports: T): jestLib.Anon_UseRealTimers = js.native
  /**
    * Set the default timeout interval for tests and before/after hooks in milliseconds.
    * Note: The default timeout interval is 5 seconds if this method is not called.
    */
  def setTimeout(timeout: scala.Double): jestLib.Anon_UseRealTimers = js.native
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
  def spyOn[T /* <: js.Object */, M /* <: java.lang.String */](`object`: T, method: M): SpyInstance[/* import warning: ImportType.apply Failed type conversion: T[M] */ js.Any] = js.native
  @JSName("spyOn")
  def spyOn_get[T /* <: js.Object */, M /* <: java.lang.String */](`object`: T, method: M, accessType: jestLib.jestLibStrings.get): SpyInstance[/* import warning: ImportType.apply Failed type conversion: T[M] */ js.Any] = js.native
  @JSName("spyOn")
  def spyOn_set[T /* <: js.Object */, M /* <: java.lang.String */](`object`: T, method: M, accessType: jestLib.jestLibStrings.set): SpyInstance[/* import warning: ImportType.apply Failed type conversion: T[M] */ js.Any] = js.native
  /**
    * Indicates that the module system should never return a mocked version of
    * the specified module from require() (e.g. that it should always return the real module).
    */
  def unmock(moduleName: java.lang.String): jestLib.Anon_UseRealTimers = js.native
  /**
    * Instructs Jest to use fake versions of the standard timer functions.
    */
  def useFakeTimers(): jestLib.Anon_UseRealTimers = js.native
  /**
    * Instructs Jest to use the real versions of the standard timer functions.
    */
  def useRealTimers(): jestLib.Anon_UseRealTimers = js.native
}

