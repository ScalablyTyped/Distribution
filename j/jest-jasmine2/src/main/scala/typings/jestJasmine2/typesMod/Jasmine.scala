package typings.jestJasmine2.typesMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.expect.AnonExpected
import typings.expect.typesMod.AsymmetricMatcher
import typings.expect.typesMod.Expect
import typings.expect.typesMod.MatcherState
import typings.expect.typesMod.Matchers
import typings.jestJasmine2.AnonCurrentSpies
import typings.jestJasmine2.AnonInstantiable
import typings.jestJasmine2.AnonNow
import typings.jestJasmine2.AnonTimer
import typings.jestJasmine2.TypeofSpec
import typings.jestJasmine2.createSpyMod.Fn
import typings.jestJasmine2.jsApiReporterMod.default
import typings.jestJasmine2.suiteMod.Attributes
import typings.jestTypes.configMod.Path
import typings.std.Record
import typings.std.RegExp
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  _DEFAULT_TIMEOUT_INTERVAL  :number,   DEFAULT_TIMEOUT_INTERVAL  :number,   currentEnv_  :std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): {new (_options ? : object | undefined): {specFilter (spec : jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default): boolean, catchExceptions (value : unknown): boolean, throwOnExpectationFailure (value : unknown): void, catchingExceptions (): boolean, topSuite (): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, fail (error : std.Error | jest-jasmine2.jest-jasmine2/build/types.AssertionErrorWithStack): void, pending (message : string): void, afterAll (afterAllFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, fit (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, throwingExpectationFailures (): boolean, randomizeTests (value : unknown): void, randomTests (): boolean, seed (value : unknown): unknown, execute (runnablesToRun ? : std.Array<string> | undefined, suiteTree ? : jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default | undefined): std.Promise<void>, fdescribe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, spyOn (obj : std.Record<string, any>, methodName : string, accessType ? : 'get' | 'set' | 'writable' | 'configurable' | 'enumerable' | 'value' | undefined): jest-jasmine2.jest-jasmine2/build/types.Spy, beforeEach (beforeEachFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, afterEach (afterEachFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, clearReporters (): void, addReporter (reporterToAdd : jest-jasmine2.jest-jasmine2/build/types.Reporter): void, it (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, xdescribe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, xit (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, beforeAll (beforeAllFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, todo (): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, provideFallbackReporter (reporterToAdd : jest-jasmine2.jest-jasmine2/build/types.Reporter): void, allowRespy (allow : boolean): void, describe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default}}>['prototype'], getEnv (options ? : object): std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): {new (_options ? : object | undefined): {specFilter (spec : jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default): boolean, catchExceptions (value : unknown): boolean, throwOnExpectationFailure (value : unknown): void, catchingExceptions (): boolean, topSuite (): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, fail (error : std.Error | jest-jasmine2.jest-jasmine2/build/types.AssertionErrorWithStack): void, pending (message : string): void, afterAll (afterAllFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, fit (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, throwingExpectationFailures (): boolean, randomizeTests (value : unknown): void, randomTests (): boolean, seed (value : unknown): unknown, execute (runnablesToRun ? : std.Array<string> | undefined, suiteTree ? : jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default | undefined): std.Promise<void>, fdescribe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, spyOn (obj : std.Record<string, any>, methodName : string, accessType ? : 'get' | 'set' | 'writable' | 'configurable' | 'enumerable' | 'value' | undefined): jest-jasmine2.jest-jasmine2/build/types.Spy, beforeEach (beforeEachFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, afterEach (afterEachFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, clearReporters (): void, addReporter (reporterToAdd : jest-jasmine2.jest-jasmine2/build/types.Reporter): void, it (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, xdescribe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, xit (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, beforeAll (beforeAllFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, todo (): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, provideFallbackReporter (reporterToAdd : jest-jasmine2.jest-jasmine2/build/types.Reporter): void, allowRespy (allow : boolean): void, describe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default}}>['prototype'],   createSpy  :(name : string, originalFn : jest-jasmine2.jest-jasmine2/build/jasmine/createSpy.Fn): jest-jasmine2.jest-jasmine2/build/types.Spy,   Env  :std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): {new (_options ? : object | undefined): {specFilter (spec : jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default): boolean, catchExceptions (value : unknown): boolean, throwOnExpectationFailure (value : unknown): void, catchingExceptions (): boolean, topSuite (): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, fail (error : std.Error | jest-jasmine2.jest-jasmine2/build/types.AssertionErrorWithStack): void, pending (message : string): void, afterAll (afterAllFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, fit (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, throwingExpectationFailures (): boolean, randomizeTests (value : unknown): void, randomTests (): boolean, seed (value : unknown): unknown, execute (runnablesToRun ? : std.Array<string> | undefined, suiteTree ? : jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default | undefined): std.Promise<void>, fdescribe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, spyOn (obj : std.Record<string, any>, methodName : string, accessType ? : 'get' | 'set' | 'writable' | 'configurable' | 'enumerable' | 'value' | undefined): jest-jasmine2.jest-jasmine2/build/types.Spy, beforeEach (beforeEachFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, afterEach (afterEachFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, clearReporters (): void, addReporter (reporterToAdd : jest-jasmine2.jest-jasmine2/build/types.Reporter): void, it (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, xdescribe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default, xit (description : string, fn : (done : (error ? : any): void): void, timeout ? : number | undefined): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, beforeAll (beforeAllFunction : (done : (error ? : any): void): void, timeout ? : number | undefined): void, todo (): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default, provideFallbackReporter (reporterToAdd : jest-jasmine2.jest-jasmine2/build/types.Reporter): void, allowRespy (allow : boolean): void, describe (description : string, specDefinitions : std.Function): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default}}>,   JsApiReporter  :new (options : {  timer ? :jest-jasmine2.jest-jasmine2/build/jasmine/Timer.default}): jest-jasmine2.jest-jasmine2/build/jasmine/JsApiReporter.default,   ReportDispatcher  :new (methods : std.Array<keyof jest-jasmine2.jest-jasmine2/build/types.Reporter>): jest-jasmine2.jest-jasmine2/build/jasmine/ReportDispatcher.default,   Spec  :{  pendingSpecExceptionMessage  :string, isPendingSpecException (e : std.Error): boolean, new (attrs : jest-jasmine2.jest-jasmine2/build/jasmine/Spec.Attributes): jest-jasmine2.jest-jasmine2/build/jasmine/Spec.default},   SpyRegistry  :new (hasCurrentSpies ? : {currentSpies ? (): std.Array<jest-jasmine2.jest-jasmine2/build/types.Spy>}): jest-jasmine2.jest-jasmine2/build/jasmine/spyRegistry.default,   Suite  :new (attrs : jest-jasmine2.jest-jasmine2/build/jasmine/Suite.Attributes): jest-jasmine2.jest-jasmine2/build/jasmine/Suite.default,   Timer  :new (options ? : {now ? (): number}): jest-jasmine2.jest-jasmine2/build/jasmine/Timer.default,   version  :string,   testPath  :@jest/types.@jest/types.Config.Path,   addMatchers  :std.Function} & expect.expect/build/types.Expect & jest-jasmine2.jest-jasmine2/build/types._Global_.NodeJS.Global */
@js.native
trait Jasmine extends /* id */ StringDictionary[AsymmetricMatcher] {
  var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var Env: ReturnType[js.Function1[/* j$ */ this.type, AnonInstantiable]] = js.native
  var JsApiReporter: Instantiable1[/* options */ AnonTimer, default] = js.native
  var ReportDispatcher: Instantiable1[/* methods */ js.Array[String], typings.jestJasmine2.reportDispatcherMod.default] = js.native
  var Spec: TypeofSpec = js.native
  var SpyRegistry: Instantiable1[
    js.UndefOr[/* hasCurrentSpies */ AnonCurrentSpies], 
    typings.jestJasmine2.spyRegistryMod.default
  ] = js.native
  var Suite: Instantiable1[/* attrs */ Attributes, typings.jestJasmine2.suiteMod.default] = js.native
  var Timer: Instantiable1[js.UndefOr[/* options */ AnonNow], typings.jestJasmine2.timerMod.default] = js.native
  var _DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var addMatchers: js.Function = js.native
  var createSpy: js.Function2[/* name */ String, /* originalFn */ Fn, Spy] = js.native
  var currentEnv_ : /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): jest-jasmine2.AnonInstantiable>['prototype'] */ js.Any = js.native
  var expect: Expect = js.native
  var not: StringDictionary[AsymmetricMatcher] = js.native
  var testPath: Path = js.native
  var version: String = js.native
  def apply[T](actual: T): Matchers[T] = js.native
  def addSnapshotSerializer(arg0: js.Any): Unit = js.native
  def any(expectedObject: js.Any): AsymmetricMatcher = js.native
  def anything(): AsymmetricMatcher = js.native
  def arrayContaining(sample: js.Array[_]): AsymmetricMatcher = js.native
  def assertions(arg0: Double): Unit = js.native
  def extend(arg0: js.Any): Unit = js.native
  def extractExpectedAssertionsErrors(): js.Array[AnonExpected] = js.native
  def getEnv(): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): jest-jasmine2.AnonInstantiable>['prototype'] */ js.Any = js.native
  def getEnv(options: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : jest-jasmine2.jest-jasmine2/build/types.Jasmine): jest-jasmine2.AnonInstantiable>['prototype'] */ js.Any = js.native
  def getState(): MatcherState = js.native
  def hasAssertions(): Unit = js.native
  def objectContaining(sample: Record[String, _]): AsymmetricMatcher = js.native
  def setState(arg0: js.Any): Unit = js.native
  def stringContaining(expected: String): AsymmetricMatcher = js.native
  def stringMatching(expected: String): AsymmetricMatcher = js.native
  def stringMatching(expected: RegExp): AsymmetricMatcher = js.native
}

