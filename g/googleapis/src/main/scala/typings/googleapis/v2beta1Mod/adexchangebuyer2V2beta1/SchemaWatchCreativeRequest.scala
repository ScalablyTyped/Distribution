package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWatchCreativeRequest extends StObject {
  
  /**
    * The Pub/Sub topic to publish notifications to. This topic must already exist and must give permission to ad-exchange-buyside-reports@google.com to write to the topic. This should be the full resource name in "projects/{project_id\}/topics/{topic_id\}" format.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaWatchCreativeRequest {
  
  inline def apply(): SchemaWatchCreativeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchCreativeRequest]
  }
  
  extension [Self <: SchemaWatchCreativeRequest](x: Self) {
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
