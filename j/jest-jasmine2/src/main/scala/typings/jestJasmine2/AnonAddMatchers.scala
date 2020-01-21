package typings.jestJasmine2

import org.scalablytyped.runtime.Instantiable1
import typings.jestJasmine2.createSpyMod.Fn
import typings.jestJasmine2.jsApiReporterMod.default
import typings.jestJasmine2.suiteMod.Attributes
import typings.jestJasmine2.typesMod.Spy
import typings.jestTypes.configMod.Path
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddMatchers extends js.Object {
  var DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var Env: ReturnType[
    js.Function1[
      /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine */ /* j$ */ js.Object, 
      AnonOptions
    ]
  ] = js.native
  var JsApiReporter: Instantiable1[/* options */ AnonTimer, default] = js.native
  var ReportDispatcher: Instantiable1[/* methods */ js.Array[String], typings.jestJasmine2.reportDispatcherMod.default] = js.native
  var Spec: TypeofClassSpec = js.native
  var SpyRegistry: Instantiable1[
    js.UndefOr[/* hasCurrentSpies */ AnonCurrentSpies], 
    typings.jestJasmine2.spyRegistryMod.default
  ] = js.native
  var Suite: Instantiable1[/* attrs */ Attributes, typings.jestJasmine2.suiteMod.default] = js.native
  var Timer: Instantiable1[js.UndefOr[/* options */ AnonNow], typings.jestJasmine2.timerMod.default] = js.native
  var _DEFAULT_TIMEOUT_INTERVAL: Double = js.native
  var addMatchers: js.Function = js.native
  var createSpy: js.Function2[/* name */ String, /* originalFn */ Fn, Spy] = js.native
  var currentEnv_ : /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine * / object): jest-jasmine2.Anon_Options>['prototype'] */ js.Any = js.native
  var testPath: Path = js.native
  var version: String = js.native
  def getEnv(): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine * / object): jest-jasmine2.Anon_Options>['prototype'] */ js.Any = js.native
  def getEnv(options: js.Object): /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(j$ : / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias jest-jasmine2.jest-jasmine2/build/types.Jasmine * / object): jest-jasmine2.Anon_Options>['prototype'] */ js.Any = js.native
}

