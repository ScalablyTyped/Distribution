package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateNotificationConfig extends StObject {
  
  /** A Cloud Pub/Sub topic name. For example, `projects/myProject/topics/deviceEvents`. */
  var pubsubTopicName: js.UndefOr[String] = js.undefined
}
object StateNotificationConfig {
  
  inline def apply(): StateNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateNotificationConfig]
  }
  
  extension [Self <: StateNotificationConfig](x: Self) {
    
    inline def setPubsubTopicName(value: String): Self = StObject.set(x, "pubsubTopicName", value.asInstanceOf[js.Any])
    
    inline def setPubsubTopicNameUndefined: Self = StObject.set(x, "pubsubTopicName", js.undefined)
  }
}
