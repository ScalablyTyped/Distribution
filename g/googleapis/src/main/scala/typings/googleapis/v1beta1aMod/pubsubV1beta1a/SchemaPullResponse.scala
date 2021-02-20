package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Either a &lt;code&gt;PubsubMessage&lt;/code&gt; or a truncation event. One
  * of these two must be populated.
  */
@js.native
trait SchemaPullResponse extends StObject {
  
  /**
    * This ID must be used to acknowledge the received event or message.
    */
  var ackId: js.UndefOr[String] = js.native
  
  /**
    * A pubsub message or truncation event.
    */
  var pubsubEvent: js.UndefOr[SchemaPubsubEvent] = js.native
}
object SchemaPullResponse {
  
  @scala.inline
  def apply(): SchemaPullResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPullResponse]
  }
  
  @scala.inline
  implicit class SchemaPullResponseMutableBuilder[Self <: SchemaPullResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    @scala.inline
    def setPubsubEvent(value: SchemaPubsubEvent): Self = StObject.set(x, "pubsubEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubEventUndefined: Self = StObject.set(x, "pubsubEvent", js.undefined)
  }
}
