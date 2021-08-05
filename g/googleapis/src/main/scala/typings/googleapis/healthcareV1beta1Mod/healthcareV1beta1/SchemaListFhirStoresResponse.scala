package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lists the FHIR stores in the given dataset.
  */
trait SchemaListFhirStoresResponse extends StObject {
  
  /**
    * The returned FHIR stores. Won&#39;t be more FHIR stores than the value of
    * page_size in the request.
    */
  var fhirStores: js.UndefOr[js.Array[SchemaFhirStore]] = js.undefined
  
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListFhirStoresResponse {
  
  inline def apply(): SchemaListFhirStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFhirStoresResponse]
  }
  
  extension [Self <: SchemaListFhirStoresResponse](x: Self) {
    
    inline def setFhirStores(value: js.Array[SchemaFhirStore]): Self = StObject.set(x, "fhirStores", value.asInstanceOf[js.Any])
    
    inline def setFhirStoresUndefined: Self = StObject.set(x, "fhirStores", js.undefined)
    
    inline def setFhirStoresVarargs(value: SchemaFhirStore*): Self = StObject.set(x, "fhirStores", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
