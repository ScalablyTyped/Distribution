package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A message data and its labels.
  */
trait SchemaPubsubMessage extends StObject {
  
  /**
    * The message payload.
    */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * Optional list of labels for this message. Keys in this collection must be
    * unique.
    */
  var label: js.UndefOr[js.Array[SchemaLabel]] = js.undefined
  
  /**
    * ID of this message assigned by the server at publication time. Guaranteed
    * to be unique within the topic. This value may be read by a subscriber
    * that receives a PubsubMessage via a Pull call or a push delivery. It must
    * not be populated by a publisher in a Publish call.
    */
  var messageId: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the message was published. The time is milliseconds
    * since the UNIX epoch.
    */
  var publishTime: js.UndefOr[String] = js.undefined
}
object SchemaPubsubMessage {
  
  inline def apply(): SchemaPubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubMessage]
  }
  
  extension [Self <: SchemaPubsubMessage](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setLabel(value: js.Array[SchemaLabel]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLabelVarargs(value: SchemaLabel*): Self = StObject.set(x, "label", js.Array(value :_*))
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
