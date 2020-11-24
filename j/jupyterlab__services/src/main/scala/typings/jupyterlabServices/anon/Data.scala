package typings.jupyterlabServices.anon

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  var comm_id: String = js.native
  
  var data: JSONObject = js.native
  
  var target_module: js.UndefOr[String] = js.native
  
  var target_name: String = js.native
}
object Data {
  
  @scala.inline
  def apply(comm_id: String, data: JSONObject, target_name: String): Data = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], target_name = target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
    
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
    def setComm_id(value: String): Self = this.set("comm_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: JSONObject): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_name(value: String): Self = this.set("target_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_module(value: String): Self = this.set("target_module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget_module: Self = this.set("target_module", js.undefined)
  }
}
