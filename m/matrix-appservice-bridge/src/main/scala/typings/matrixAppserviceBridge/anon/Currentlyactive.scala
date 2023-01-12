package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.offline
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.online
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentlyactive extends StObject {
  
  var avatar_url: js.UndefOr[String] = js.undefined
  
  var currently_active: js.UndefOr[Boolean] = js.undefined
  
  var last_active_ago: js.UndefOr[Double] = js.undefined
  
  var presence: online | offline | unavailable
  
  var status_msg: js.UndefOr[String] = js.undefined
}
object Currentlyactive {
  
  inline def apply(presence: online | offline | unavailable): Currentlyactive = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentlyactive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Currentlyactive] (val x: Self) extends AnyVal {
    
    inline def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    inline def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    inline def setCurrently_active(value: Boolean): Self = StObject.set(x, "currently_active", value.asInstanceOf[js.Any])
    
    inline def setCurrently_activeUndefined: Self = StObject.set(x, "currently_active", js.undefined)
    
    inline def setLast_active_ago(value: Double): Self = StObject.set(x, "last_active_ago", value.asInstanceOf[js.Any])
    
    inline def setLast_active_agoUndefined: Self = StObject.set(x, "last_active_ago", js.undefined)
    
    inline def setPresence(value: online | offline | unavailable): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    inline def setStatus_msg(value: String): Self = StObject.set(x, "status_msg", value.asInstanceOf[js.Any])
    
    inline def setStatus_msgUndefined: Self = StObject.set(x, "status_msg", js.undefined)
  }
}
