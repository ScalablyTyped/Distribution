package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestErrorEventUIParam extends StObject {
  
  /**
    * Gets the processed error message sent by the server
    */
  var message: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets a reference to the whole response object
    */
  var response: js.UndefOr[js.Any] = js.undefined
}
object RequestErrorEventUIParam {
  
  @scala.inline
  def apply(): RequestErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestErrorEventUIParam]
  }
  
  @scala.inline
  implicit class RequestErrorEventUIParamMutableBuilder[Self <: RequestErrorEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setResponse(value: js.Any): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
