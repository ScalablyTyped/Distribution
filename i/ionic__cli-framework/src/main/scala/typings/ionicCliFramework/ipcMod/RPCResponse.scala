package typings.ionicCliFramework.ipcMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCResponse[R /* <: RPCRequest[_, _] */, D /* <: js.Object */] extends js.Object {
  var data: D
  var err: js.UndefOr[js.Any] = js.undefined
  var id: String
  var procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any
  var request: R
  var `type`: `rpc-response`
}

object RPCResponse {
  @scala.inline
  def apply[/* <: typings.ionicCliFramework.ipcMod.RPCRequest[_, _] */ R, /* <: js.Object */ D](
    data: D,
    id: String,
    procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
    request: R,
    `type`: `rpc-response`,
    err: js.Any = null
  ): RPCResponse[R, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCResponse[R, D]]
  }
}

