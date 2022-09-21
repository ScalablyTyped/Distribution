package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAttributeDefinitionsResponse extends StObject {
  
  /**
    * The returned Attribute definitions. The maximum number of attributes returned is determined by the value of page_size in the ListAttributeDefinitionsRequest.
    */
  var attributeDefinitions: js.UndefOr[js.Array[SchemaAttributeDefinition]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAttributeDefinitionsResponse {
  
  inline def apply(): SchemaListAttributeDefinitionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAttributeDefinitionsResponse]
  }
  
  extension [Self <: SchemaListAttributeDefinitionsResponse](x: Self) {
    
    inline def setAttributeDefinitions(value: js.Array[SchemaAttributeDefinition]): Self = StObject.set(x, "attributeDefinitions", value.asInstanceOf[js.Any])
    
    inline def setAttributeDefinitionsUndefined: Self = StObject.set(x, "attributeDefinitions", js.undefined)
    
    inline def setAttributeDefinitionsVarargs(value: SchemaAttributeDefinition*): Self = StObject.set(x, "attributeDefinitions", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
