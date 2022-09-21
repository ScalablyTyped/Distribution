package typings.googleapis.containerV1Mod.containerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPubSub extends StObject {
  
  /**
    * Enable notifications for Pub/Sub.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allows filtering to one or more specific event types. If no filter is specified, or if a filter is specified with no event types, all event types will be sent
    */
  var filter: js.UndefOr[SchemaFilter] = js.undefined
  
  /**
    * The desired Pub/Sub topic to which notifications will be sent by GKE. Format is `projects/{project\}/topics/{topic\}`.
    */
  var topic: js.UndefOr[String | Null] = js.undefined
}
object SchemaPubSub {
  
  inline def apply(): SchemaPubSub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPubSub]
  }
  
  extension [Self <: SchemaPubSub](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilter(value: SchemaFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicNull: Self = StObject.set(x, "topic", null)
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
