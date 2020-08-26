package typings.ionicCliFramework.ipcMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-request`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RPCRequest[P /* <: String */, A /* <: js.Array[_] */] extends js.Object {
  var args: A = js.native
  var id: String = js.native
  var procedure: P = js.native
  var `type`: `rpc-request` = js.native
}

object RPCRequest {
  @scala.inline
  def apply[/* <: java.lang.String */ P, /* <: js.Array[_] */ A](args: A, id: String, procedure: P, `type`: `rpc-request`): RPCRequest[P, A] = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCRequest[P, A]]
  }
  @scala.inline
  implicit class RPCRequestOps[Self <: RPCRequest[_, _], /* <: java.lang.String */ P, /* <: js.Array[_] */ A] (val x: Self with (RPCRequest[P, A])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgs(value: A): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcedure(value: P): Self = this.set("procedure", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `rpc-request`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

