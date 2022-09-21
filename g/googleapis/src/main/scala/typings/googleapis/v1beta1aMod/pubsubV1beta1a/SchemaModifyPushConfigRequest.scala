package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModifyPushConfigRequest extends StObject {
  
  /**
    * An empty push_config indicates that the Pub/Sub system should pause pushing messages from the given subscription.
    */
  var pushConfig: js.UndefOr[SchemaPushConfig] = js.undefined
  
  /**
    * The name of the subscription.
    */
  var subscription: js.UndefOr[String | Null] = js.undefined
}
object SchemaModifyPushConfigRequest {
  
  inline def apply(): SchemaModifyPushConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyPushConfigRequest]
  }
  
  extension [Self <: SchemaModifyPushConfigRequest](x: Self) {
    
    inline def setPushConfig(value: SchemaPushConfig): Self = StObject.set(x, "pushConfig", value.asInstanceOf[js.Any])
    
    inline def setPushConfigUndefined: Self = StObject.set(x, "pushConfig", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNull: Self = StObject.set(x, "subscription", null)
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
