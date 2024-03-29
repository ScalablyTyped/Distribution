package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest extends StObject {
  
  /**
    * GCP project number of the requesting delegated app. Currently only intended for Firebase V1 migration.
    */
  var delegatedProjectNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The max number of results to return in the response.
    */
  var maxResults: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The token for the next page. This should be taken from the previous response.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specify which project (field value is actually project id) to operate. Only used when provided credential.
    */
  var targetProjectId: js.UndefOr[String | Null] = js.undefined
}
object SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest {
  
  inline def apply(): SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest]
  }
  
  extension [Self <: SchemaIdentitytoolkitRelyingpartyDownloadAccountRequest](x: Self) {
    
    inline def setDelegatedProjectNumber(value: String): Self = StObject.set(x, "delegatedProjectNumber", value.asInstanceOf[js.Any])
    
    inline def setDelegatedProjectNumberNull: Self = StObject.set(x, "delegatedProjectNumber", null)
    
    inline def setDelegatedProjectNumberUndefined: Self = StObject.set(x, "delegatedProjectNumber", js.undefined)
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsNull: Self = StObject.set(x, "maxResults", null)
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTargetProjectId(value: String): Self = StObject.set(x, "targetProjectId", value.asInstanceOf[js.Any])
    
    inline def setTargetProjectIdNull: Self = StObject.set(x, "targetProjectId", null)
    
    inline def setTargetProjectIdUndefined: Self = StObject.set(x, "targetProjectId", js.undefined)
  }
}
