package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object Filter.
  */
trait SchemaObjectFilter extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#objectFilter&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Applicable when status is ASSIGNED. The user has access to objects with
    * these object IDs.
    */
  var objectIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Status of the filter. NONE means the user has access to none of the
    * objects. ALL means the user has access to all objects. ASSIGNED means the
    * user has access to the objects with IDs in the objectIds list.
    */
  var status: js.UndefOr[String] = js.undefined
}
object SchemaObjectFilter {
  
  inline def apply(): SchemaObjectFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaObjectFilter]
  }
  
  extension [Self <: SchemaObjectFilter](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setObjectIds(value: js.Array[String]): Self = StObject.set(x, "objectIds", value.asInstanceOf[js.Any])
    
    inline def setObjectIdsUndefined: Self = StObject.set(x, "objectIds", js.undefined)
    
    inline def setObjectIdsVarargs(value: String*): Self = StObject.set(x, "objectIds", js.Array(value :_*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
