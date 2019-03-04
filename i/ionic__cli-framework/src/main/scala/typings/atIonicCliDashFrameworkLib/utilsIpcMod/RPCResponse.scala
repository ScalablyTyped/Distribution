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

object RPCResponse {
  @scala.inline
  def apply[R /* <: RPCRequest[_, _] */, D /* <: js.Object */](
    data: D,
    id: java.lang.String,
    procedure: /* import warning: ImportType.apply Failed type conversion: R['procedure'] */ js.Any,
    request: R,
    `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`rpc-response`,
    err: js.Any = null
  ): RPCResponse[R, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id, procedure = procedure, request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (err != null) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[RPCResponse[R, D]]
  }
}

