package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Region List Response
  */
trait SchemaRegionsListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#regionsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Region collection.
    */
  var regions: js.UndefOr[js.Array[SchemaRegion]] = js.undefined
}
object SchemaRegionsListResponse {
  
  inline def apply(): SchemaRegionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionsListResponse]
  }
  
  extension [Self <: SchemaRegionsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setRegions(value: js.Array[SchemaRegion]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
    
    inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
    
    inline def setRegionsVarargs(value: SchemaRegion*): Self = StObject.set(x, "regions", js.Array(value :_*))
  }
}
