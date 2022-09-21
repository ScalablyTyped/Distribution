package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAttributeMetadataResponse extends StObject {
  
  /**
    * A collection of attribute metadata for the available attributes.
    */
  var attributeMetadata: js.UndefOr[js.Array[SchemaAttributeMetadata]] = js.undefined
  
  /**
    * If the number of attributes exceeded the requested page size, this field will be populated with a token to fetch the next page of attributes on a subsequent call to `attributes.list`. If there are no more attributes, this field will not be present in the response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAttributeMetadataResponse {
  
  inline def apply(): SchemaListAttributeMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAttributeMetadataResponse]
  }
  
  extension [Self <: SchemaListAttributeMetadataResponse](x: Self) {
    
    inline def setAttributeMetadata(value: js.Array[SchemaAttributeMetadata]): Self = StObject.set(x, "attributeMetadata", value.asInstanceOf[js.Any])
    
    inline def setAttributeMetadataUndefined: Self = StObject.set(x, "attributeMetadata", js.undefined)
    
    inline def setAttributeMetadataVarargs(value: SchemaAttributeMetadata*): Self = StObject.set(x, "attributeMetadata", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
