package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobMessage extends StObject {
  
  /** Deprecated. */
  var id: js.UndefOr[String] = js.native
  
  /** Importance level of the message. */
  var messageImportance: js.UndefOr[String] = js.native
  
  /** The text of the message. */
  var messageText: js.UndefOr[String] = js.native
  
  /** The timestamp of the message. */
  var time: js.UndefOr[String] = js.native
}
object JobMessage {
  
  @scala.inline
  def apply(): JobMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMessage]
  }
  
  @scala.inline
  implicit class JobMessageMutableBuilder[Self <: JobMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMessageImportance(value: String): Self = StObject.set(x, "messageImportance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageImportanceUndefined: Self = StObject.set(x, "messageImportance", js.undefined)
    
    @scala.inline
    def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
