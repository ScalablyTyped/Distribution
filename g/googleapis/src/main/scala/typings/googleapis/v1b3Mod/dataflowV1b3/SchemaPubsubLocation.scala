package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Identifies a pubsub location to use for transferring data into or out of a
  * streaming Dataflow job.
  */
trait SchemaPubsubLocation extends StObject {
  
  /**
    * Indicates whether the pipeline allows late-arriving data.
    */
  var dropLateData: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set, contains a pubsub label from which to extract record ids. If left
    * empty, record deduplication will be strictly best effort.
    */
  var idLabel: js.UndefOr[String] = js.undefined
  
  /**
    * A pubsub subscription, in the form of
    * &quot;pubsub.googleapis.com/subscriptions/&lt;project-id&gt;/&lt;subscription-name&gt;&quot;
    */
  var subscription: js.UndefOr[String] = js.undefined
  
  /**
    * If set, contains a pubsub label from which to extract record timestamps.
    * If left empty, record timestamps will be generated upon arrival.
    */
  var timestampLabel: js.UndefOr[String] = js.undefined
  
  /**
    * A pubsub topic, in the form of
    * &quot;pubsub.googleapis.com/topics/&lt;project-id&gt;/&lt;topic-name&gt;&quot;
    */
  var topic: js.UndefOr[String] = js.undefined
  
  /**
    * If set, specifies the pubsub subscription that will be used for tracking
    * custom time timestamps for watermark estimation.
    */
  var trackingSubscription: js.UndefOr[String] = js.undefined
  
  /**
    * If true, then the client has requested to get pubsub attributes.
    */
  var withAttributes: js.UndefOr[Boolean] = js.undefined
}
object SchemaPubsubLocation {
  
  @scala.inline
  def apply(): SchemaPubsubLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubLocation]
  }
  
  @scala.inline
  implicit class SchemaPubsubLocationMutableBuilder[Self <: SchemaPubsubLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropLateData(value: Boolean): Self = StObject.set(x, "dropLateData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropLateDataUndefined: Self = StObject.set(x, "dropLateData", js.undefined)
    
    @scala.inline
    def setIdLabel(value: String): Self = StObject.set(x, "idLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdLabelUndefined: Self = StObject.set(x, "idLabel", js.undefined)
    
    @scala.inline
    def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    @scala.inline
    def setTimestampLabel(value: String): Self = StObject.set(x, "timestampLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampLabelUndefined: Self = StObject.set(x, "timestampLabel", js.undefined)
    
    @scala.inline
    def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    @scala.inline
    def setTrackingSubscription(value: String): Self = StObject.set(x, "trackingSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingSubscriptionUndefined: Self = StObject.set(x, "trackingSubscription", js.undefined)
    
    @scala.inline
    def setWithAttributes(value: Boolean): Self = StObject.set(x, "withAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithAttributesUndefined: Self = StObject.set(x, "withAttributes", js.undefined)
  }
}
