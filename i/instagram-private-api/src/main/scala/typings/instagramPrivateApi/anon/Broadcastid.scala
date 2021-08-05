package typings.instagramPrivateApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broadcastid extends StObject {
  
  var broadcast_id: String
  
  var upload_url: String
}
object Broadcastid {
  
  inline def apply(broadcast_id: String, upload_url: String): Broadcastid = {
    val __obj = js.Dynamic.literal(broadcast_id = broadcast_id.asInstanceOf[js.Any], upload_url = upload_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcastid]
  }
  
  extension [Self <: Broadcastid](x: Self) {
    
    inline def setBroadcast_id(value: String): Self = StObject.set(x, "broadcast_id", value.asInstanceOf[js.Any])
    
    inline def setUpload_url(value: String): Self = StObject.set(x, "upload_url", value.asInstanceOf[js.Any])
  }
}
