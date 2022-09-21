package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPullResponse extends StObject {
  
  /**
    * This ID must be used to acknowledge the received event or message.
    */
  var ackId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A pubsub message or truncation event.
    */
  var pubsubEvent: js.UndefOr[SchemaPubsubEvent] = js.undefined
}
object SchemaPullResponse {
  
  inline def apply(): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullResponse]
  }
  
  extension [Self <: SchemaPullResponse](x: Self) {
    
    inline def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    inline def setAckIdNull: Self = StObject.set(x, "ackId", null)
    
    inline def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    inline def setPubsubEvent(value: SchemaPubsubEvent): Self = StObject.set(x, "pubsubEvent", value.asInstanceOf[js.Any])
    
    inline def setPubsubEventUndefined: Self = StObject.set(x, "pubsubEvent", js.undefined)
  }
}
