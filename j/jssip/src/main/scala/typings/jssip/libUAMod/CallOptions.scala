package typings.jssip.libUAMod

import typings.jssip.anon.PartialRTCSessionEventMap
import typings.jssip.libRtcsessionMod.AnswerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallOptions
  extends StObject
     with AnswerOptions {
  
  var anonymous: js.UndefOr[Boolean] = js.undefined
  
  var eventHandlers: js.UndefOr[PartialRTCSessionEventMap] = js.undefined
  
  var fromDisplayName: js.UndefOr[String] = js.undefined
  
  var fromUserName: js.UndefOr[String] = js.undefined
}
object CallOptions {
  
  inline def apply(): CallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallOptions] (val x: Self) extends AnyVal {
    
    inline def setAnonymous(value: Boolean): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setEventHandlers(value: PartialRTCSessionEventMap): Self = StObject.set(x, "eventHandlers", value.asInstanceOf[js.Any])
    
    inline def setEventHandlersUndefined: Self = StObject.set(x, "eventHandlers", js.undefined)
    
    inline def setFromDisplayName(value: String): Self = StObject.set(x, "fromDisplayName", value.asInstanceOf[js.Any])
    
    inline def setFromDisplayNameUndefined: Self = StObject.set(x, "fromDisplayName", js.undefined)
    
    inline def setFromUserName(value: String): Self = StObject.set(x, "fromUserName", value.asInstanceOf[js.Any])
    
    inline def setFromUserNameUndefined: Self = StObject.set(x, "fromUserName", js.undefined)
  }
}
