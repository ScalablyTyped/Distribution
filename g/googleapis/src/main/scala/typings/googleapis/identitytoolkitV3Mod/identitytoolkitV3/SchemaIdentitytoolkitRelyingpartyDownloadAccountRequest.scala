package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to download user account in batch.
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest extends StObject {
  
  /**
    * GCP project number of the requesting delegated app. Currently only
    * intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String] = js.native
  
  /**
    * The max number of results to return in the response.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The token for the next page. This should be taken from the previous
    * response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Specify which project (field value is actually project id) to operate.
    * Only used when provided credential.
    */
  var targetProjectId: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartyDownloadAccountRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTargetProjectId(value: String): Self = StObject.set(x, "targetProjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetProjectIdUndefined: Self = StObject.set(x, "targetProjectId", js.undefined)
  }
}
