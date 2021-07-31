package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from searching fact-checked claims.
  */
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse extends StObject {
  
  /**
    * The list of claims and all of their associated information.
    */
  var claims: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]] = js.undefined
  
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponseMutableBuilder[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaims(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]): Self = StObject.set(x, "claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsUndefined: Self = StObject.set(x, "claims", js.undefined)
    
    @scala.inline
    def setClaimsVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim*): Self = StObject.set(x, "claims", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
