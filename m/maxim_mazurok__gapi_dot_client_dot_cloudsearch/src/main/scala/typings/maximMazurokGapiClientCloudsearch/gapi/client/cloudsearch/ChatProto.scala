package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatProto extends StObject {
  
  /** Chat IDs consist of alphanumeric characters and colons. Currently required. */
  var chatId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of Chat members to consider, e.g. "all members" vs. "invitee" These are defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType enum options in
    * social/graph/storage/proto/id.proto. See chat.pb (defined in production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types associated with chat.
    * Currently required.
    */
  var memberType: js.UndefOr[Double] = js.undefined
}
object ChatProto {
  
  inline def apply(): ChatProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatProto]
  }
  
  extension [Self <: ChatProto](x: Self) {
    
    inline def setChatId(value: String): Self = StObject.set(x, "chatId", value.asInstanceOf[js.Any])
    
    inline def setChatIdUndefined: Self = StObject.set(x, "chatId", js.undefined)
    
    inline def setMemberType(value: Double): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
  }
}
