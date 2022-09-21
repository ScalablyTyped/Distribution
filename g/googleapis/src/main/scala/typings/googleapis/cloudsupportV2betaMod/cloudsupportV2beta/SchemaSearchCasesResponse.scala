package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchCasesResponse extends StObject {
  
  /**
    * The list of Case associated with the cloud resource, after any filters have been applied.
    */
  var cases: js.UndefOr[js.Array[SchemaCase]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. This should be set in the `page_token` field of subsequent `SearchCaseRequest` message that is issued. If unspecified, there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchCasesResponse {
  
  inline def apply(): SchemaSearchCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchCasesResponse]
  }
  
  extension [Self <: SchemaSearchCasesResponse](x: Self) {
    
    inline def setCases(value: js.Array[SchemaCase]): Self = StObject.set(x, "cases", value.asInstanceOf[js.Any])
    
    inline def setCasesUndefined: Self = StObject.set(x, "cases", js.undefined)
    
    inline def setCasesVarargs(value: SchemaCase*): Self = StObject.set(x, "cases", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
