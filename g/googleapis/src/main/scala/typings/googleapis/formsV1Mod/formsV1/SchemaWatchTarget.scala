package typings.googleapis.formsV1Mod.formsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWatchTarget extends StObject {
  
  /**
    * A Pub/Sub topic. To receive notifications, the topic must grant publish privileges to the Forms service account `serviceAccount:forms-notifications@system.gserviceaccount.com`. Only the project that owns a topic may create a watch with it. Pub/Sub delivery guarantees should be considered.
    */
  var topic: js.UndefOr[SchemaCloudPubsubTopic] = js.undefined
}
object SchemaWatchTarget {
  
  inline def apply(): SchemaWatchTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWatchTarget]
  }
  
  extension [Self <: SchemaWatchTarget](x: Self) {
    
    inline def setTopic(value: SchemaCloudPubsubTopic): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
