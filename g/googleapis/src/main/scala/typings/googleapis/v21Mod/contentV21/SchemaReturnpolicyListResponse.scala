package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnpolicyListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#returnpolicyListResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaReturnPolicy]] = js.undefined
}
object SchemaReturnpolicyListResponse {
  
  inline def apply(): SchemaReturnpolicyListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnpolicyListResponse]
  }
  
  extension [Self <: SchemaReturnpolicyListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResources(value: js.Array[SchemaReturnPolicy]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaReturnPolicy*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
