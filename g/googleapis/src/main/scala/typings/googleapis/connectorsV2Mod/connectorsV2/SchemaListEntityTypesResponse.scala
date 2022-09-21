package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListEntityTypesResponse extends StObject {
  
  /**
    * Next page token if more entity types available.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of metadata related to all entity types.
    */
  var types: js.UndefOr[js.Array[SchemaEntityType]] = js.undefined
  
  /**
    * List of entity type names which contain unsupported Datatypes. Check datatype.proto for more information.
    */
  var unsupportedTypeNames: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListEntityTypesResponse {
  
  inline def apply(): SchemaListEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEntityTypesResponse]
  }
  
  extension [Self <: SchemaListEntityTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTypes(value: js.Array[SchemaEntityType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
    
    inline def setTypesVarargs(value: SchemaEntityType*): Self = StObject.set(x, "types", js.Array(value*))
    
    inline def setUnsupportedTypeNames(value: js.Array[String]): Self = StObject.set(x, "unsupportedTypeNames", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedTypeNamesNull: Self = StObject.set(x, "unsupportedTypeNames", null)
    
    inline def setUnsupportedTypeNamesUndefined: Self = StObject.set(x, "unsupportedTypeNames", js.undefined)
    
    inline def setUnsupportedTypeNamesVarargs(value: String*): Self = StObject.set(x, "unsupportedTypeNames", js.Array(value*))
  }
}
