package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStructuredMessage extends StObject {
  
  /**
    * Identifier for this message type. Used by external systems to internationalize or personalize message.
    */
  var messageKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Human-readable version of message.
    */
  var messageText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The structured data associated with this message.
    */
  var parameters: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
}
object SchemaStructuredMessage {
  
  inline def apply(): SchemaStructuredMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStructuredMessage]
  }
  
  extension [Self <: SchemaStructuredMessage](x: Self) {
    
    inline def setMessageKey(value: String): Self = StObject.set(x, "messageKey", value.asInstanceOf[js.Any])
    
    inline def setMessageKeyNull: Self = StObject.set(x, "messageKey", null)
    
    inline def setMessageKeyUndefined: Self = StObject.set(x, "messageKey", js.undefined)
    
    inline def setMessageText(value: String): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
    
    inline def setMessageTextNull: Self = StObject.set(x, "messageText", null)
    
    inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
    
    inline def setParameters(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
