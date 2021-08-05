package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#posListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchemaPosStore]] = js.undefined
}
object SchemaPosListResponse {
  
  inline def apply(): SchemaPosListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosListResponse]
  }
  
  extension [Self <: SchemaPosListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResources(value: js.Array[SchemaPosStore]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchemaPosStore*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
