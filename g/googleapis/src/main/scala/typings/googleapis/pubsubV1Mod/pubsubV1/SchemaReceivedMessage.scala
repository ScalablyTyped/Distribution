package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message and its corresponding acknowledgment ID.
  */
@js.native
trait SchemaReceivedMessage extends StObject {
  
  /**
    * This ID can be used to acknowledge the received message.
    */
  var ackId: js.UndefOr[String] = js.native
  
  /**
    * The message.
    */
  var message: js.UndefOr[SchemaPubsubMessage] = js.native
}
object SchemaReceivedMessage {
  
  @scala.inline
  def apply(): SchemaReceivedMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReceivedMessage]
  }
  
  @scala.inline
  implicit class SchemaReceivedMessageMutableBuilder[Self <: SchemaReceivedMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckId(value: String): Self = StObject.set(x, "ackId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckIdUndefined: Self = StObject.set(x, "ackId", js.undefined)
    
    @scala.inline
    def setMessage(value: SchemaPubsubMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
