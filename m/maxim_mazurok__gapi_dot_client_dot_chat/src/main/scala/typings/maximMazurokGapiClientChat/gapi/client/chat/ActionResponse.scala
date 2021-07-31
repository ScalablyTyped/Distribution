package typings.maximMazurokGapiClientChat.gapi.client.chat

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionResponse extends StObject {
  
  /** The type of bot response. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** URL for users to auth or config. (Only for REQUEST_CONFIG response types.) */
  var url: js.UndefOr[String] = js.undefined
}
object ActionResponse {
  
  @scala.inline
  def apply(): ActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionResponse]
  }
  
  @scala.inline
  implicit class ActionResponseMutableBuilder[Self <: ActionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
