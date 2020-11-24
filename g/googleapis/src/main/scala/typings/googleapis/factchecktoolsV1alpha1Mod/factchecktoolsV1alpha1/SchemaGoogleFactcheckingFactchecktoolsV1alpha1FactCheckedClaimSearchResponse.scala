package typings.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from searching fact-checked claims.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse extends js.Object {
  
  /**
    * The list of claims and all of their associated information.
    */
  var claims: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]] = js.native
  
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse {
  
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponseOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClaimsVarargs(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim*): Self = this.set("claims", js.Array(value :_*))
    
    @scala.inline
    def setClaims(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]): Self = this.set("claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClaims: Self = this.set("claims", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
