package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Notification extends StObject {
  
  /** A Google Cloud Pub/sub topic destination. */
  var cloudPubsubTopic: js.UndefOr[CloudPubsubTopic] = js.undefined
}
object Notification {
  
  inline def apply(): Notification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notification]
  }
  
  extension [Self <: Notification](x: Self) {
    
    inline def setCloudPubsubTopic(value: CloudPubsubTopic): Self = StObject.set(x, "cloudPubsubTopic", value.asInstanceOf[js.Any])
    
    inline def setCloudPubsubTopicUndefined: Self = StObject.set(x, "cloudPubsubTopic", js.undefined)
  }
}
