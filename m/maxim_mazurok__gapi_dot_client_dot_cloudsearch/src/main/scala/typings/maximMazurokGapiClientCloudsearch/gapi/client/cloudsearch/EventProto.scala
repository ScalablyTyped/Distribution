package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventProto extends StObject {
  
  /** Event IDs consist of alphanumeric characters and colons. Currently required. */
  var eventId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Event members to consider, e.g. "all members" vs. "owners" vs. "admins". These are defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType
    * enum options in social/graph/storage/proto/id.proto. See event.pb (defined in production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types
    * associated with event. Currently required.
    */
  var memberType: js.UndefOr[Double] = js.undefined
}
object EventProto {
  
  inline def apply(): EventProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventProto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventProto] (val x: Self) extends AnyVal {
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setMemberType(value: Double): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
  }
}
