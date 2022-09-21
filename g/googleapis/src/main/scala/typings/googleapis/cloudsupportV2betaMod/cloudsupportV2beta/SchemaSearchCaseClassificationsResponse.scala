package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchCaseClassificationsResponse extends StObject {
  
  /**
    * The classifications retrieved.
    */
  var caseClassifications: js.UndefOr[js.Array[SchemaCaseClassification]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. This should be set in the `page_token` field of subsequent `SearchCaseClassificationsRequest` message that is issued. If unspecified, there are no more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchCaseClassificationsResponse {
  
  inline def apply(): SchemaSearchCaseClassificationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchCaseClassificationsResponse]
  }
  
  extension [Self <: SchemaSearchCaseClassificationsResponse](x: Self) {
    
    inline def setCaseClassifications(value: js.Array[SchemaCaseClassification]): Self = StObject.set(x, "caseClassifications", value.asInstanceOf[js.Any])
    
    inline def setCaseClassificationsUndefined: Self = StObject.set(x, "caseClassifications", js.undefined)
    
    inline def setCaseClassificationsVarargs(value: SchemaCaseClassification*): Self = StObject.set(x, "caseClassifications", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
