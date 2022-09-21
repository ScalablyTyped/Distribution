package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaObjectFilter extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#objectFilter".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Applicable when status is ASSIGNED. The user has access to objects with these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Status of the filter. NONE means the user has access to none of the objects. ALL means the user has access to all objects. ASSIGNED means the user has access to the objects with IDs in the objectIds list.
    */
  var status: js.UndefOr[String | Null] = js.undefined
}
object SchemaObjectFilter {
  
  inline def apply(): SchemaObjectFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectFilter]
  }
  
  extension [Self <: SchemaObjectFilter](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsNull: Self = StObject.set(x, "objectIds", null)
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
