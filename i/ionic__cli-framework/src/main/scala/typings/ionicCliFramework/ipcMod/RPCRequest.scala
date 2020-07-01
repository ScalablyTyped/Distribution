package typings.ionicCliFramework.ipcMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-request`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCRequest[P /* <: String */, A /* <: js.Array[_] */] extends js.Object {
  var args: A
  var id: String
  var procedure: P
  var `type`: `rpc-request`
}

object RPCRequest {
  @scala.inline
  def apply[/* <: java.lang.String */ P, /* <: js.Array[_] */ A](args: A, id: String, procedure: P, `type`: `rpc-request`): RPCRequest[P, A] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCRequest[P, A]]
  }
}

