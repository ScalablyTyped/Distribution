package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotificationConfig extends StObject {
  
  /**
    * Notification config for Pub/Sub.
    */
  var pubsub: js.UndefOr[SchemaPubSub] = js.undefined
}
object SchemaNotificationConfig {
  
  inline def apply(): SchemaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationConfig]
  }
  
  extension [Self <: SchemaNotificationConfig](x: Self) {
    
    inline def setPubsub(value: SchemaPubSub): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
    
    inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
  }
}
