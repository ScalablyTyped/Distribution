package typings.googleapis.datafusionV1beta1Mod.datafusionV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaEventPublishConfig extends StObject {
  
  /**
    * Required. Option to enable Event Publishing.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The resource name of the Pub/Sub topic. Format: projects/{project_id\}/topics/{topic_id\}
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaEventPublishConfig {
  
  inline def apply(): SchemaEventPublishConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEventPublishConfig]
  }
  
  extension [Self <: SchemaEventPublishConfig](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
