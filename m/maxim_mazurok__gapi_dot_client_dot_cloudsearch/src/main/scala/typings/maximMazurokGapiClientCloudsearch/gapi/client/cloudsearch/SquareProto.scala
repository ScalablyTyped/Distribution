package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SquareProto extends StObject {
  
  /**
    * The type of Square members to consider, e.g. "all members" vs. "owners" vs. "admins". These are defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType
    * enum options in social/graph/storage/proto/id.proto. See square.pb (defined in production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types
    * associated with square. Currently required.
    */
  var memberType: js.UndefOr[Double] = js.undefined
  
  /** Currently required. */
  var squareId: js.UndefOr[String] = js.undefined
}
object SquareProto {
  
  inline def apply(): SquareProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SquareProto]
  }
  
  extension [Self <: SquareProto](x: Self) {
    
    inline def setMemberType(value: Double): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
    
    inline def setSquareId(value: String): Self = StObject.set(x, "squareId", value.asInstanceOf[js.Any])
    
    inline def setSquareIdUndefined: Self = StObject.set(x, "squareId", js.undefined)
  }
}
