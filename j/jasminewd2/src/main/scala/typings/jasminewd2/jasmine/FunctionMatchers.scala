package typings.jasminewd2.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Add definition to be compatible with latest jasmine v3 types.
// Even though library is not compatible with jasmine v3, there is no suitable way to configure that now here.
// See for more detail: https://github.com/microsoft/dtslint/issues/253
@js.native
trait FunctionMatchers[Fn /* <: js.Function1[/* repeated */ js.Any, _] */]
  extends Matchers[js.Any] {
  
  @JSName("toHaveBeenCalledWith")
  def toHaveBeenCalledWith_Promise(params: js.Any*): js.Promise[Unit] = js.native
}
