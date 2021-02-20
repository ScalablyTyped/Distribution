package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output only.  The List companies response object.
  */
@js.native
trait SchemaListCompaniesResponse extends StObject {
  
  /**
    * Companies for the current client.
    */
  var companies: js.UndefOr[js.Array[SchemaCompany]] = js.native
  
  /**
    * Additional information for the API invocation, such as the request
    * tracking id.
    */
  var metadata: js.UndefOr[SchemaResponseMetadata] = js.native
  
  /**
    * A token to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListCompaniesResponse {
  
  @scala.inline
  def apply(): SchemaListCompaniesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCompaniesResponse]
  }
  
  @scala.inline
  implicit class SchemaListCompaniesResponseMutableBuilder[Self <: SchemaListCompaniesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanies(value: js.Array[SchemaCompany]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompaniesUndefined: Self = StObject.set(x, "companies", js.undefined)
    
    @scala.inline
    def setCompaniesVarargs(value: SchemaCompany*): Self = StObject.set(x, "companies", js.Array(value :_*))
    
    @scala.inline
    def setMetadata(value: SchemaResponseMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
