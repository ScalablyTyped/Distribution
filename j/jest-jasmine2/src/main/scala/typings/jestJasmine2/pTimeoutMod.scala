package typings.jestJasmine2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-jasmine2/build/pTimeout", JSImport.Namespace)
@js.native
object pTimeoutMod extends js.Object {
  def default(
    promise: js.Promise[_],
    ms: Double,
    clearTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/types.<global>.NodeJS.Global['clearTimeout'] */ js.Any,
    setTimeout: /* import warning: importer.ImportType#apply Failed type conversion: jest-jasmine2.jest-jasmine2/build/types.<global>.NodeJS.Global['setTimeout'] */ js.Any,
    onTimeout: js.Function0[_]
  ): js.Promise[_] = js.native
}

