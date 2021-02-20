package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Broadcastid extends StObject {
  
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
  implicit class BroadcastidMutableBuilder[Self <: Broadcastid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcast_id(value: String): Self = StObject.set(x, "broadcast_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpload_url(value: String): Self = StObject.set(x, "upload_url", value.asInstanceOf[js.Any])
  }
}
