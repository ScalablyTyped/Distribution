package typings
package atIonicCliDashFrameworkLib.utilsIpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RPCResponse[R /* <: RPCRequest[_, _] */, D /* <: js.Object */] extends js.Object {
  var data: D
  var err: js.UndefOr[js.Any] = js.undefined
  var id: java.lang.String
  var procedure: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(R))),List()),Left(TsIdentSimple(procedure))) */js.Any
  var request: R
  var `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`rpc-response`
}

