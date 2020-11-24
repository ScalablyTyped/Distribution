package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subscription resource.
  */
@js.native
trait SchemaSubscription extends js.Object {
  
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
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  
  /**
    * Name of the subscription.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If push delivery is used with this subscription, this field is used to
    * configure it.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.native
  
  /**
    * The name of the topic from which this subscription is receiving messages.
    */
  var topic: js.UndefOr[String] = js.native
}
object SchemaSubscription {
  
  @scala.inline
  def apply(): SchemaSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscription]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionOps[Self <: SchemaSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAckDeadlineSeconds(value: Double): Self = this.set("ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckDeadlineSeconds: Self = this.set("ackDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPushConfig(value: SchemaPushConfig): Self = this.set("pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushConfig: Self = this.set("pushConfig", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
}
