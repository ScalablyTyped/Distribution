package typings
package atIonicCliDashFrameworkLib.utilsIpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCResponse[R /* <: RPCRequest[_, _] */, D /* <: js.Object */] extends js.Object {
  var data: D
  var err: js.UndefOr[js.Any] = js.undefined
  var id: java.lang.String
  var procedure: /* import warning: ImportType.apply Failed type conversion: R['procedure'] */ js.Any
  var request: R
  var `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`rpc-response`
}

