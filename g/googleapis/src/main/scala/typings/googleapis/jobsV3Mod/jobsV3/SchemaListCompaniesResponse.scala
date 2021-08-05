package typings.googleapis.jobsV3Mod.jobsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  The List companies response object.
  */
trait SchemaListCompaniesResponse extends StObject {
  
  /**
    * Companies for the current client.
    */
  var companies: js.UndefOr[js.Array[SchemaCompany]] = js.undefined
  
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.undefined
  
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListCompaniesResponse {
  
  inline def apply(): SchemaListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCompaniesResponse]
  }
  
  extension [Self <: SchemaListCompaniesResponse](x: Self) {
    
    inline def setCompanies(value: js.Array[SchemaCompany]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    inline def setCompaniesUndefined: Self = StObject.set(x, "companies", js.undefined)
    
    inline def setCompaniesVarargs(value: SchemaCompany*): Self = StObject.set(x, "companies", js.Array(value :_*))
    
    inline def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
