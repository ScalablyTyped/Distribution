package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobMessage extends StObject {
  
  /** Deprecated. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Importance level of the message. */
  var messageImportance: js.UndefOr[String] = js.undefined
  
  /** The text of the message. */
  var messageText: js.UndefOr[String] = js.undefined
  
  /** The timestamp of the message. */
  var time: js.UndefOr[String] = js.undefined
}
object JobMessage {
  
  inline def apply(): JobMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobMessage] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMessageImportance(value: String): Self = StObject.set(x, "messageImportance", value.asInstanceOf[js.Any])
    
    inline def setMessageImportanceUndefined: Self = StObject.set(x, "messageImportance", js.undefined)
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
