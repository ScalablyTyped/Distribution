package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSquareProto extends StObject {
  
  /**
    * The type of Square members to consider, e.g. "all members" vs. "owners" vs. "admins". These are defined by legacy_relation_id values in social.graph.storage.EdgeTypeEnum.EdgeType enum options in social/graph/storage/proto/id.proto. See square.pb (defined in production/config/cdd/socialgraph/mixer_config/prod/node_type_config) for all valid edge types associated with square. Currently required.
    */
  var memberType: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Currently required.
    */
  var squareId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSquareProto {
  
  inline def apply(): SchemaSquareProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSquareProto]
  }
  
  extension [Self <: SchemaSquareProto](x: Self) {
    
    inline def setMemberType(value: Double): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    inline def setMemberTypeNull: Self = StObject.set(x, "memberType", null)
    
    inline def setMemberTypeUndefined: Self = StObject.set(x, "memberType", js.undefined)
    
    inline def setSquareId(value: String): Self = StObject.set(x, "squareId", value.asInstanceOf[js.Any])
    
    inline def setSquareIdNull: Self = StObject.set(x, "squareId", null)
    
    inline def setSquareIdUndefined: Self = StObject.set(x, "squareId", js.undefined)
  }
}
