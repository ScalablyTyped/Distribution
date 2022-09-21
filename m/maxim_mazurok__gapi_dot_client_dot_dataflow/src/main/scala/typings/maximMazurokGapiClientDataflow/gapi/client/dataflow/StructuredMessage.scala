package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructuredMessage extends StObject {
  
  /** Identifier for this message type. Used by external systems to internationalize or personalize message. */
  var messageKey: js.UndefOr[String] = js.undefined
  
  /** Human-readable version of message. */
  var messageText: js.UndefOr[String] = js.undefined
  
  /** The structured data associated with this message. */
  var parameters: js.UndefOr[js.Array[Parameter]] = js.undefined
}
object StructuredMessage {
  
  inline def apply(): StructuredMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructuredMessage]
  }
  
  extension [Self <: StructuredMessage](x: Self) {
    
    inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    inline def setParameters(value: js.Array[Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
