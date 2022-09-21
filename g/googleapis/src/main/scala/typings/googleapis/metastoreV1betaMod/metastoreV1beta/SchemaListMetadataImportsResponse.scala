package typings.googleapis.metastoreV1betaMod.metastoreV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListMetadataImportsResponse extends StObject {
  
  /**
    * The imports in the specified service.
    */
  var metadataImports: js.UndefOr[js.Array[SchemaMetadataImport]] = js.undefined
  
  /**
    * A token that can be sent as page_token to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaListMetadataImportsResponse {
  
  inline def apply(): SchemaListMetadataImportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListMetadataImportsResponse]
  }
  
  extension [Self <: SchemaListMetadataImportsResponse](x: Self) {
    
    inline def setMetadataImports(value: js.Array[SchemaMetadataImport]): Self = StObject.set(x, "metadataImports", value.asInstanceOf[js.Any])
    
    inline def setMetadataImportsUndefined: Self = StObject.set(x, "metadataImports", js.undefined)
    
    inline def setMetadataImportsVarargs(value: SchemaMetadataImport*): Self = StObject.set(x, "metadataImports", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableNull: Self = StObject.set(x, "unreachable", null)
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
