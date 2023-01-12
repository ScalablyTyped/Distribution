package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPublishConfig extends StObject {
  
  /** Required. Option to enable Event Publishing. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Required. The resource name of the Pub/Sub topic. Format: projects/{project_id}/topics/{topic_id} */
  var topic: js.UndefOr[String] = js.undefined
}
object EventPublishConfig {
  
  inline def apply(): EventPublishConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPublishConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventPublishConfig] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
