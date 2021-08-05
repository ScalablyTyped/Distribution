package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Field List Response
  */
trait SchemaCreativeFieldsListResponse extends StObject {
  
  /**
    * Creative field collection.
    */
  var creativeFields: js.UndefOr[js.Array[SchemaCreativeField]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeFieldsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCreativeFieldsListResponse {
  
  inline def apply(): SchemaCreativeFieldsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeFieldsListResponse]
  }
  
  extension [Self <: SchemaCreativeFieldsListResponse](x: Self) {
    
    inline def setCreativeFields(value: js.Array[SchemaCreativeField]): Self = StObject.set(x, "creativeFields", value.asInstanceOf[js.Any])
    
    inline def setCreativeFieldsUndefined: Self = StObject.set(x, "creativeFields", js.undefined)
    
    inline def setCreativeFieldsVarargs(value: SchemaCreativeField*): Self = StObject.set(x, "creativeFields", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
