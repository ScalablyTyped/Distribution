package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusMessage extends StObject {
  
  /** Status message text. */
  var description: js.UndefOr[FormatMessage] = js.undefined
  
  /** Distinguishes errors from informational messages. */
  var isError: js.UndefOr[Boolean] = js.undefined
  
  /** Reference to which the message applies. */
  var refersTo: js.UndefOr[String] = js.undefined
}
object StatusMessage {
  
  @scala.inline
  def apply(): StatusMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusMessage]
  }
  
  @scala.inline
  implicit class StatusMessageMutableBuilder[Self <: StatusMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: FormatMessage): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIsError(value: Boolean): Self = StObject.set(x, "isError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsErrorUndefined: Self = StObject.set(x, "isError", js.undefined)
    
    @scala.inline
    def setRefersTo(value: String): Self = StObject.set(x, "refersTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefersToUndefined: Self = StObject.set(x, "refersTo", js.undefined)
  }
}
