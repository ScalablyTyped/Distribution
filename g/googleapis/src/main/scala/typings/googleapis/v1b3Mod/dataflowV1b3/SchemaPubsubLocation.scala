package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubsubLocation extends StObject {
  
  /**
    * Indicates whether the pipeline allows late-arriving data.
    */
  var dropLateData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set, contains a pubsub label from which to extract record ids. If left empty, record deduplication will be strictly best effort.
    */
  var idLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A pubsub subscription, in the form of "pubsub.googleapis.com/subscriptions//"
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, contains a pubsub label from which to extract record timestamps. If left empty, record timestamps will be generated upon arrival.
    */
  var timestampLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A pubsub topic, in the form of "pubsub.googleapis.com/topics//"
    */
  var topic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If set, specifies the pubsub subscription that will be used for tracking custom time timestamps for watermark estimation.
    */
  var trackingSubscription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If true, then the client has requested to get pubsub attributes.
    */
  var withAttributes: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaPubsubLocation {
  
  inline def apply(): SchemaPubsubLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubsubLocation]
  }
  
  extension [Self <: SchemaPubsubLocation](x: Self) {
    
    inline def setDropLateData(value: Boolean): Self = StObject.set(x, "dropLateData", value.asInstanceOf[js.Any])
    
    inline def setDropLateDataNull: Self = StObject.set(x, "dropLateData", null)
    
    inline def setDropLateDataUndefined: Self = StObject.set(x, "dropLateData", js.undefined)
    
    inline def setIdLabel(value: String): Self = StObject.set(x, "idLabel", value.asInstanceOf[js.Any])
    
    inline def setIdLabelNull: Self = StObject.set(x, "idLabel", null)
    
    inline def setIdLabelUndefined: Self = StObject.set(x, "idLabel", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
    
    inline def setTimestampLabel(value: String): Self = StObject.set(x, "timestampLabel", value.asInstanceOf[js.Any])
    
    inline def setTimestampLabelNull: Self = StObject.set(x, "timestampLabel", null)
    
    inline def setTimestampLabelUndefined: Self = StObject.set(x, "timestampLabel", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    
    inline def setTrackingSubscription(value: String): Self = StObject.set(x, "trackingSubscription", value.asInstanceOf[js.Any])
    
    inline def setTrackingSubscriptionNull: Self = StObject.set(x, "trackingSubscription", null)
    
    inline def setTrackingSubscriptionUndefined: Self = StObject.set(x, "trackingSubscription", js.undefined)
    
    inline def setWithAttributes(value: Boolean): Self = StObject.set(x, "withAttributes", value.asInstanceOf[js.Any])
    
    inline def setWithAttributesNull: Self = StObject.set(x, "withAttributes", null)
    
    inline def setWithAttributesUndefined: Self = StObject.set(x, "withAttributes", js.undefined)
  }
}
