package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.offline
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.online
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.unavailable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currentlyactive extends StObject {
  
  var avatar_url: js.UndefOr[String] = js.native
  
  var currently_active: js.UndefOr[Boolean] = js.native
  
  var last_active_ago: js.UndefOr[Double] = js.native
  
  var presence: online | offline | unavailable = js.native
  
  var status_msg: js.UndefOr[String] = js.native
}
object Currentlyactive {
  
  @scala.inline
  def apply(presence: online | offline | unavailable): Currentlyactive = {
    val __obj = js.Dynamic.literal(presence = presence.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentlyactive]
  }
  
  @scala.inline
  implicit class CurrentlyactiveMutableBuilder[Self <: Currentlyactive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar_url(value: String): Self = StObject.set(x, "avatar_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar_urlUndefined: Self = StObject.set(x, "avatar_url", js.undefined)
    
    @scala.inline
    def setCurrently_active(value: Boolean): Self = StObject.set(x, "currently_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrently_activeUndefined: Self = StObject.set(x, "currently_active", js.undefined)
    
    @scala.inline
    def setLast_active_ago(value: Double): Self = StObject.set(x, "last_active_ago", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_active_agoUndefined: Self = StObject.set(x, "last_active_ago", js.undefined)
    
    @scala.inline
    def setPresence(value: online | offline | unavailable): Self = StObject.set(x, "presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_msg(value: String): Self = StObject.set(x, "status_msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus_msgUndefined: Self = StObject.set(x, "status_msg", js.undefined)
  }
}
