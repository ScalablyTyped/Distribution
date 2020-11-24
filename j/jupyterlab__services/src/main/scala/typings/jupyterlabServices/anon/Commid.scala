package typings.jupyterlabServices.anon

import typings.luminoCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commid extends js.Object {
  
  var comm_id: String = js.native
  
  var data: JSONObject = js.native
}
object Commid {
  
  @scala.inline
  def apply(comm_id: String, data: JSONObject): Commid = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commid]
  }
  
  @scala.inline
  implicit class CommidOps[Self <: Commid] (val x: Self) extends AnyVal {
    
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
  }
}
