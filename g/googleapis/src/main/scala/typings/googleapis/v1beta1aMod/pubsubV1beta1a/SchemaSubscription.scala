package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subscription resource.
  */
trait SchemaSubscription extends StObject {
  
  /**
    * For either push or pull delivery, the value is the maximum time after a
    * subscriber receives a message before the subscriber should acknowledge or
    * Nack the message. If the Ack deadline for a message passes without an Ack
    * or a Nack, the Pub/Sub system will eventually redeliver the message. If a
    * subscriber acknowledges after the deadline, the Pub/Sub system may accept
    * the Ack, but it is possible that the message has been already delivered
    * again. Multiple Acks to the message are allowed and will succeed.  For
    * push delivery, this value is used to set the request timeout for the call
    * to the push endpoint.  For pull delivery, this value is used as the
    * initial value for the Ack deadline. It may be overridden for each message
    * using its corresponding ack_id with
    * &lt;code&gt;ModifyAckDeadline&lt;/code&gt;. While a message is
    * outstanding (i.e. it has been delivered to a pull subscriber and the
    * subscriber has not yet Acked or Nacked), the Pub/Sub system will not
    * deliver that message to another pull subscriber (on a best-effort basis).
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.undefined
  
  /**
    * Name of the subscription.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * If push delivery is used with this subscription, this field is used to
    * configure it.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.undefined
  
  /**
    * The name of the topic from which this subscription is receiving messages.
    */
  var topic: js.UndefOr[String] = js.undefined
}
object SchemaSubscription {
  
  inline def apply(): SchemaSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscription]
  }
  
  extension [Self <: SchemaSubscription](x: Self) {
    
    inline def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    inline def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPushConfig(value: SchemaPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    inline def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
