package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative List Response
  */
trait SchemaCreativesListResponse extends StObject {
  
  /**
    * Creative collection.
    */
  var creatives: js.UndefOr[js.Array[SchemaCreative]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCreativesListResponse {
  
  inline def apply(): SchemaCreativesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativesListResponse]
  }
  
  extension [Self <: SchemaCreativesListResponse](x: Self) {
    
    inline def setCreatives(value: js.Array[SchemaCreative]): Self = StObject.set(x, "creatives", value.asInstanceOf[js.Any])
    
    inline def setCreativesUndefined: Self = StObject.set(x, "creatives", js.undefined)
    
    inline def setCreativesVarargs(value: SchemaCreative*): Self = StObject.set(x, "creatives", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
