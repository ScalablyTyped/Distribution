package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRuntimeConfig extends StObject {
  
  /**
    * Output only. Pub/Sub subscription for connd to receive message. E.g. projects/{project-id\}/subscriptions/{topic-id\}
    */
  var conndSubscription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Pub/Sub topic for connd to send message. E.g. projects/{project-id\}/topics/{topic-id\}
    */
  var conndTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Pub/Sub subscription for control plane to receive message. E.g. projects/{project-id\}/subscriptions/{topic-id\}
    */
  var controlPlaneSubscription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Pub/Sub topic for control plne to send message. communication. E.g. projects/{project-id\}/topics/{topic-id\}
    */
  var controlPlaneTopic: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. location_id of the runtime location. E.g. "us-west1".
    */
  var locationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Name of the runtimeConfig resource. Format: projects/{project\}/locations/{location\}/runtimeConfig
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The endpoint of the connectors runtime ingress.
    */
  var runtimeEndpoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Cloud Storage bucket that stores connector's schema reports.
    */
  var schemaGcsBucket: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the Service Directory service name.
    */
  var serviceDirectory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The state of the location.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaRuntimeConfig {
  
  inline def apply(): SchemaRuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRuntimeConfig]
  }
  
  extension [Self <: SchemaRuntimeConfig](x: Self) {
    
    inline def setConndSubscription(value: String): Self = StObject.set(x, "conndSubscription", value.asInstanceOf[js.Any])
    
    inline def setConndSubscriptionNull: Self = StObject.set(x, "conndSubscription", null)
    
    inline def setConndSubscriptionUndefined: Self = StObject.set(x, "conndSubscription", js.undefined)
    
    inline def setConndTopic(value: String): Self = StObject.set(x, "conndTopic", value.asInstanceOf[js.Any])
    
    inline def setConndTopicNull: Self = StObject.set(x, "conndTopic", null)
    
    inline def setConndTopicUndefined: Self = StObject.set(x, "conndTopic", js.undefined)
    
    inline def setControlPlaneSubscription(value: String): Self = StObject.set(x, "controlPlaneSubscription", value.asInstanceOf[js.Any])
    
    inline def setControlPlaneSubscriptionNull: Self = StObject.set(x, "controlPlaneSubscription", null)
    
    inline def setControlPlaneSubscriptionUndefined: Self = StObject.set(x, "controlPlaneSubscription", js.undefined)
    
    inline def setControlPlaneTopic(value: String): Self = StObject.set(x, "controlPlaneTopic", value.asInstanceOf[js.Any])
    
    inline def setControlPlaneTopicNull: Self = StObject.set(x, "controlPlaneTopic", null)
    
    inline def setControlPlaneTopicUndefined: Self = StObject.set(x, "controlPlaneTopic", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdNull: Self = StObject.set(x, "locationId", null)
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRuntimeEndpoint(value: String): Self = StObject.set(x, "runtimeEndpoint", value.asInstanceOf[js.Any])
    
    inline def setRuntimeEndpointNull: Self = StObject.set(x, "runtimeEndpoint", null)
    
    inline def setRuntimeEndpointUndefined: Self = StObject.set(x, "runtimeEndpoint", js.undefined)
    
    inline def setSchemaGcsBucket(value: String): Self = StObject.set(x, "schemaGcsBucket", value.asInstanceOf[js.Any])
    
    inline def setSchemaGcsBucketNull: Self = StObject.set(x, "schemaGcsBucket", null)
    
    inline def setSchemaGcsBucketUndefined: Self = StObject.set(x, "schemaGcsBucket", js.undefined)
    
    inline def setServiceDirectory(value: String): Self = StObject.set(x, "serviceDirectory", value.asInstanceOf[js.Any])
    
    inline def setServiceDirectoryNull: Self = StObject.set(x, "serviceDirectory", null)
    
    inline def setServiceDirectoryUndefined: Self = StObject.set(x, "serviceDirectory", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
