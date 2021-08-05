package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Size List Response
  */
trait SchemaSizesListResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#sizesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Size collection.
    */
  var sizes: js.UndefOr[js.Array[SchemaSize]] = js.undefined
}
object SchemaSizesListResponse {
  
  inline def apply(): SchemaSizesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSizesListResponse]
  }
  
  extension [Self <: SchemaSizesListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSizes(value: js.Array[SchemaSize]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
    
    inline def setSizesVarargs(value: SchemaSize*): Self = StObject.set(x, "sizes", js.Array(value :_*))
  }
}
