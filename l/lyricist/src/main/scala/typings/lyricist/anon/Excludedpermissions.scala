package typings.lyricist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Excludedpermissions extends StObject {
  
  var excluded_permissions: js.Array[String]
  
  var interactions: Following
  
  var iq_by_action: js.Any
  
  var permissions: js.Array[String]
  
  var relationships: js.Any
}
object Excludedpermissions {
  
  inline def apply(
    excluded_permissions: js.Array[String],
    interactions: Following,
    iq_by_action: js.Any,
    permissions: js.Array[String],
    relationships: js.Any
  ): Excludedpermissions = {
    val __obj = js.Dynamic.literal(excluded_permissions = excluded_permissions.asInstanceOf[js.Any], interactions = interactions.asInstanceOf[js.Any], iq_by_action = iq_by_action.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
    __obj.asInstanceOf[Excludedpermissions]
  }
  
  extension [Self <: Excludedpermissions](x: Self) {
    
    inline def setExcluded_permissions(value: js.Array[String]): Self = StObject.set(x, "excluded_permissions", value.asInstanceOf[js.Any])
    
    inline def setExcluded_permissionsVarargs(value: String*): Self = StObject.set(x, "excluded_permissions", js.Array(value :_*))
    
    inline def setInteractions(value: Following): Self = StObject.set(x, "interactions", value.asInstanceOf[js.Any])
    
    inline def setIq_by_action(value: js.Any): Self = StObject.set(x, "iq_by_action", value.asInstanceOf[js.Any])
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
    
    inline def setRelationships(value: js.Any): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
  }
}
