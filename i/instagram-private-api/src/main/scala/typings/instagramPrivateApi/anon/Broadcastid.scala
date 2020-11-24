package typings.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broadcastid extends js.Object {
  
  var broadcast_id: String = js.native
  
  var upload_url: String = js.native
}
object Broadcastid {
  
  @scala.inline
  def apply(broadcast_id: String, upload_url: String): Broadcastid = {
    val __obj = js.Dynamic.literal(broadcast_id = broadcast_id.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcastid]
  }
  
  @scala.inline
  implicit class BroadcastidOps[Self <: Broadcastid] (val x: Self) extends AnyVal {
    
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
    def setBroadcast_id(value: String): Self = this.set("broadcast_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_url(value: String): Self = this.set("upload_url", value.asInstanceOf[js.Any])
  }
}
