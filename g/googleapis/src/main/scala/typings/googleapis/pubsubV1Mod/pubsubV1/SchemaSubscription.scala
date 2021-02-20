package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A subscription resource.
  */
@js.native
trait SchemaSubscription extends StObject {
  
  /**
    * The approximate amount of time (on a best-effort basis) Pub/Sub waits for
    * the subscriber to acknowledge receipt before resending the message. In
    * the interval after the message is delivered and before it is
    * acknowledged, it is considered to be &lt;i&gt;outstanding&lt;/i&gt;.
    * During that time period, the message will not be redelivered (on a
    * best-effort basis).  For pull subscriptions, this value is used as the
    * initial value for the ack deadline. To override this value for a given
    * message, call `ModifyAckDeadline` with the corresponding `ack_id` if
    * using non-streaming pull or send the `ack_id` in a
    * `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum
    * custom deadline you can specify is 10 seconds. The maximum custom
    * deadline you can specify is 600 seconds (10 minutes). If this parameter
    * is 0, a default value of 10 seconds is used.  For push delivery, this
    * value is also used to set the request timeout for the call to the push
    * endpoint.  If the subscriber never acknowledges the message, the Pub/Sub
    * system will eventually redeliver the message.
    */
  var ackDeadlineSeconds: js.UndefOr[Double] = js.native
  
  /**
    * A policy that specifies the conditions for this subscription&#39;s
    * expiration. A subscription is considered active as long as any connected
    * subscriber is successfully consuming messages from the subscription or is
    * issuing operations on the subscription. If `expiration_policy` is not
    * set, a *default policy* with `ttl` of 31 days will be used. The minimum
    * allowed value for `expiration_policy.ttl` is 1 day.
    * &lt;b&gt;BETA:&lt;/b&gt; This feature is part of a beta release. This API
    * might be changed in backward-incompatible ways and is not recommended for
    * production use. It is not subject to any SLA or deprecation policy.
    */
  var expirationPolicy: js.UndefOr[SchemaExpirationPolicy] = js.native
  
  /**
    * See &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/labels&quot;&gt; Creating
    * and managing labels&lt;/a&gt;.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * How long to retain unacknowledged messages in the subscription&#39;s
    * backlog, from the moment a message is published. If
    * `retain_acked_messages` is true, then this also configures the retention
    * of acknowledged messages, and thus configures how far back in time a
    * `Seek` can be done. Defaults to 7 days. Cannot be more than 7 days or
    * less than 10 minutes.
    */
  var messageRetentionDuration: js.UndefOr[String] = js.native
  
  /**
    * The name of the subscription. It must have the format
    * `&quot;projects/{project}/subscriptions/{subscription}&quot;`.
    * `{subscription}` must start with a letter, and contain only letters
    * (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods
    * (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be
    * between 3 and 255 characters in length, and it must not start with
    * `&quot;goog&quot;`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * If push delivery is used with this subscription, this field is used to
    * configure it. An empty `pushConfig` signifies that the subscriber will
    * pull and ack messages using API methods.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.native
  
  /**
    * Indicates whether to retain acknowledged messages. If true, then messages
    * are not expunged from the subscription&#39;s backlog, even if they are
    * acknowledged, until they fall out of the `message_retention_duration`
    * window. This must be true if you would like to &lt;a
    * href=&quot;https://cloud.google.com/pubsub/docs/replay-overview#seek_to_a_time&quot;&gt;
    * Seek to a timestamp&lt;/a&gt;.
    */
  var retainAckedMessages: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the topic from which this subscription is receiving messages.
    * Format is `projects/{project}/topics/{topic}`. The value of this field
    * will be `_deleted-topic_` if the topic has been deleted.
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
  implicit class SchemaSubscriptionMutableBuilder[Self <: SchemaSubscription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckDeadlineSeconds(value: Double): Self = StObject.set(x, "ackDeadlineSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckDeadlineSecondsUndefined: Self = StObject.set(x, "ackDeadlineSeconds", js.undefined)
    
    @scala.inline
    def setExpirationPolicy(value: SchemaExpirationPolicy): Self = StObject.set(x, "expirationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationPolicyUndefined: Self = StObject.set(x, "expirationPolicy", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setMessageRetentionDuration(value: String): Self = StObject.set(x, "messageRetentionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageRetentionDurationUndefined: Self = StObject.set(x, "messageRetentionDuration", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPushConfig(value: SchemaPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    @scala.inline
    def setRetainAckedMessages(value: Boolean): Self = StObject.set(x, "retainAckedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainAckedMessagesUndefined: Self = StObject.set(x, "retainAckedMessages", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
