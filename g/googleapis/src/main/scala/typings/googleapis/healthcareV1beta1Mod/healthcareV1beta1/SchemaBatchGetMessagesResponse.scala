package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchGetMessagesResponse extends StObject {
  
  /**
    * The returned Messages. See `MessageView` for populated fields.
    */
  var messages: js.UndefOr[js.Array[SchemaMessage]] = js.undefined
}
object SchemaBatchGetMessagesResponse {
  
  inline def apply(): SchemaBatchGetMessagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchGetMessagesResponse]
  }
  
  extension [Self <: SchemaBatchGetMessagesResponse](x: Self) {
    
    inline def setMessages(value: js.Array[SchemaMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaMessage*): Self = StObject.set(x, "messages", js.Array(value*))
  }
}
