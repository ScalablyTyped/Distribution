package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockedUser extends StObject {
  
  var blocked_id: Double
  
  var blocked_url: String
}
object BlockedUser {
  
  inline def apply(blocked_id: Double, blocked_url: String): BlockedUser = {
    val __obj = js.Dynamic.literal(blocked_id = blocked_id.asInstanceOf[js.Any], blocked_url = blocked_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockedUser]
  }
  
  extension [Self <: BlockedUser](x: Self) {
    
    inline def setBlocked_id(value: Double): Self = StObject.set(x, "blocked_id", value.asInstanceOf[js.Any])
    
    inline def setBlocked_url(value: String): Self = StObject.set(x, "blocked_url", value.asInstanceOf[js.Any])
  }
}
