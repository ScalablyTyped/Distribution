package typings.jestDashJasmine2

import org.scalablytyped.runtime.Instantiable1
import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashJasmine2.buildJasmineCreateSpyMod.Fn
import typings.jestDashJasmine2.buildJasmineJsApiReporterMod.default
import typings.jestDashJasmine2.buildJasmineSuiteMod.Attributes
import typings.jestDashJasmine2.buildTypesMod.Spy
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddMatchers extends js.Object {
  var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var Env: ReturnType[
    js.Function1[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine */ /* j$ */ js.Object, 
      Anon_Options
    ]
  ] = js.native
  var JsApiReporter: Instantiable1[/* options */ Anon_Timer, default] = js.native
  var ReportDispatcher: Instantiable1[
    /* methods */ js.Array[String], 
    typings.jestDashJasmine2.buildJasmineReportDispatcherMod.default
  ] = js.native
  var Spec: TypeofClassSpec = js.native
  var SpyRegistry: Instantiable1[
    js.UndefOr[/* hasCurrentSpies */ Anon_CurrentSpies], 
    typings.jestDashJasmine2.buildJasmineSpyRegistryMod.default
  ] = js.native
  var Suite: Instantiable1[/* attrs */ Attributes, typings.jestDashJasmine2.buildJasmineSuiteMod.default] = js.native
  var Timer: Instantiable1[
    js.UndefOr[/* options */ Anon_Now], 
    typings.jestDashJasmine2.buildJasmineTimerMod.default
  ] = js.native
  var _DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var addMatchers: js.Function = js.native
  var createSpy: js.Function2[/* name */ String, /* originalFn */ Fn, Spy] = js.native
  var currentEnv_ : /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine * / object): jest-jasmine2.Anon_Options>['prototype'] */ js.Any = js.native
  var testPath: Path = js.native
  var version: String = js.native
  def getEnv(): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine * / object): jest-jasmine2.Anon_Options>['prototype'] */ js.Any = js.native
  def getEnv(options: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine * / object): jest-jasmine2.Anon_Options>['prototype'] */ js.Any = js.native
}

