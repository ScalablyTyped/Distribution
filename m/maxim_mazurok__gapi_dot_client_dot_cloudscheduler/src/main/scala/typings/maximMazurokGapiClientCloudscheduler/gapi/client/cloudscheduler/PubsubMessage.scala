package typings.maximMazurokGapiClientCloudscheduler.gapi.client.cloudscheduler

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubsubMessage extends StObject {
  
  /** Attributes for this message. If this field is empty, the message must contain non-empty data. This can be used to filter messages on the subscription. */
  var attributes: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.PubsubMessage & TopLevel[Any]
  ] = js.undefined
  
  /** The message data field. If this field is empty, the message must contain at least one attribute. */
  var data: js.UndefOr[String] = js.undefined
  
  /**
    * ID of this message, assigned by the server when the message is published. Guaranteed to be unique within the topic. This value may be read by a subscriber that receives a
    * `PubsubMessage` via a `Pull` call or a push delivery. It must not be populated by the publisher in a `Publish` call.
    */
  var messageId: js.UndefOr[String] = js.undefined
  
  /**
    * If non-empty, identifies related messages for which publish order should be respected. If a `Subscription` has `enable_message_ordering` set to `true`, messages published with the
    * same non-empty `ordering_key` value will be delivered to subscribers in the order in which they are received by the Pub/Sub system. All `PubsubMessage`s published in a given
    * `PublishRequest` must specify the same `ordering_key` value. For more information, see [ordering messages](https://cloud.google.com/pubsub/docs/ordering).
    */
  var orderingKey: js.UndefOr[String] = js.undefined
  
  /** The time at which the message was published, populated by the server when it receives the `Publish` call. It must not be populated by the publisher in a `Publish` call. */
  var publishTime: js.UndefOr[String] = js.undefined
}
object PubsubMessage {
  
  inline def apply(): PubsubMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubsubMessage]
  }
  
  extension [Self <: PubsubMessage](x: Self) {
    
    inline def setAttributes(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientCloudscheduler.maximMazurokGapiClientCloudschedulerStrings.PubsubMessage & TopLevel[Any]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setOrderingKey(value: String): Self = StObject.set(x, "orderingKey", value.asInstanceOf[js.Any])
    
    inline def setOrderingKeyUndefined: Self = StObject.set(x, "orderingKey", js.undefined)
    
    inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
  }
}
