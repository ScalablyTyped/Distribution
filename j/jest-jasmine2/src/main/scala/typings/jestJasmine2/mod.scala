package typings.jestJasmine2

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.expect.AnonExpected
import typings.expect.typesMod.AsymmetricMatcher
import typings.expect.typesMod.Expect
import typings.expect.typesMod.MatcherState
import typings.expect.typesMod.Matchers
import typings.jestEnvironment.mod.JestEnvironment
import typings.jestJasmine2.createSpyMod.Fn
import typings.jestJasmine2.jestJasmine2Strings.jasmineDone
import typings.jestJasmine2.jestJasmine2Strings.jasmineStarted
import typings.jestJasmine2.jestJasmine2Strings.specDone
import typings.jestJasmine2.jestJasmine2Strings.specStarted
import typings.jestJasmine2.jestJasmine2Strings.suiteDone
import typings.jestJasmine2.jestJasmine2Strings.suiteStarted
import typings.jestJasmine2.jsApiReporterMod.default
import typings.jestJasmine2.suiteMod.Attributes
import typings.jestJasmine2.typesMod.Spy
import typings.jestRuntime.mod.RuntimeType
import typings.jestTestResult.typesMod.TestResult
import typings.jestTypes.configMod.GlobalConfig
import typings.jestTypes.configMod.Path
import typings.jestTypes.configMod.ProjectConfig
import typings.std.Record
import typings.std.RegExp
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2", JSImport.Namespace)
@js.native
object mod extends js.Object {
  /* Inlined jest-jasmine2.jest-jasmine2/build/types.Jasmine */
  @js.native
  trait Jasmine extends /* id */ StringDictionary[AsymmetricMatcher] {
    var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
    var Env: ReturnType[js.Function1[/* j$ */ this.type, AnonInstantiable]] = js.native
    var JsApiReporter: Instantiable1[/* options */ AnonTimer, default] = js.native
    var ReportDispatcher: Instantiable1[
        /* methods */ js.Array[jasmineDone | jasmineStarted | specDone | specStarted | suiteDone | suiteStarted], 
        typings.jestJasmine2.reportDispatcherMod.default
      ] = js.native
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
  
  def apply(
    globalConfig: GlobalConfig,
    config: ProjectConfig,
    environment: JestEnvironment,
    runtime: RuntimeType,
    testPath: String
  ): js.Promise[TestResult] = js.native
}

