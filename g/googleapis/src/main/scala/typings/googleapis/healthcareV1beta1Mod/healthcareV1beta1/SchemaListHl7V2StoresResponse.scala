package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListHl7V2StoresResponse extends StObject {
  
  /**
    * The returned HL7v2 stores. Won't be more HL7v2 stores than the value of page_size in the request.
    */
  var hl7V2Stores: js.UndefOr[js.Array[SchemaHl7V2Store]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListHl7V2StoresResponse {
  
  inline def apply(): SchemaListHl7V2StoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListHl7V2StoresResponse]
  }
  
  extension [Self <: SchemaListHl7V2StoresResponse](x: Self) {
    
    inline def setHl7V2Stores(value: js.Array[SchemaHl7V2Store]): Self = StObject.set(x, "hl7V2Stores", value.asInstanceOf[js.Any])
    
    inline def setHl7V2StoresUndefined: Self = StObject.set(x, "hl7V2Stores", js.undefined)
    
    inline def setHl7V2StoresVarargs(value: SchemaHl7V2Store*): Self = StObject.set(x, "hl7V2Stores", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
