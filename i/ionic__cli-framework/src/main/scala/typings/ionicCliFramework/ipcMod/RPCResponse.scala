package typings.ionicCliFramework.ipcMod

import typings.ionicCliFramework.ionicCliFrameworkStrings.`rpc-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RPCResponse[R /* <: RPCRequest[_, _] */, D /* <: js.Object */] extends js.Object {
  
  var data: D = js.native
  
  var err: js.UndefOr[js.Any] = js.native
  
  var id: String = js.native
  
  var procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any = js.native
  
  var request: R = js.native
  
  var `type`: `rpc-response` = js.native
}
object RPCResponse {
  
  @scala.inline
  def apply[R /* <: RPCRequest[_, _] */, D /* <: js.Object */](
    data: D,
    id: String,
    procedure: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any,
    request: R,
    `type`: `rpc-response`
  ): RPCResponse[R, D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RPCResponse[R, D]]
  }
  
  @scala.inline
  implicit class RPCResponseOps[Self <: RPCResponse[_, _], R /* <: RPCRequest[_, _] */, D /* <: js.Object */] (val x: Self with (RPCResponse[R, D])) extends AnyVal {
    
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
    def setData(value: D): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcedure(
      value: /* import warning: importer.ImportType#apply Failed type conversion: R['procedure'] */ js.Any
    ): Self = this.set("procedure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: R): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `rpc-response`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErr(value: js.Any): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
  }
}
