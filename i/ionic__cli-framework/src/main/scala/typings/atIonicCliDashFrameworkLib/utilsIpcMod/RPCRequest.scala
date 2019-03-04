package typings
package atIonicCliDashFrameworkLib.utilsIpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCRequest[P /* <: java.lang.String */, A /* <: js.Array[_] */] extends js.Object {
  var args: A
  var id: java.lang.String
  var procedure: P
  var `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`rpc-request`
}

object RPCRequest {
  @scala.inline
  def apply[P /* <: java.lang.String */, A /* <: js.Array[_] */](
    args: A,
    id: java.lang.String,
    procedure: P,
    `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`rpc-request`
  ): RPCRequest[P, A] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id, procedure = procedure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RPCRequest[P, A]]
  }
}

