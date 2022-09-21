package typings.googleapis.storageV1Mod.storageV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHmackeysList
  extends StObject
     with StandardParameters {
  
  /**
    * Maximum number of items to return in a single page of responses. The service uses this parameter or 250 items, whichever is smaller. The max number of items per page will also be limited by the number of distinct service accounts in the response. If the number of service accounts in a single response is too high, the page will truncated and a next page token will be returned.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * A previously-returned page token representing part of the larger set of results to view.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the project in which to look for HMAC keys.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * If present, only keys for the given service account are returned.
    */
  var serviceAccountEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Whether or not to show keys in the DELETED state.
    */
  var showDeletedKeys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The project to be billed for this request.
    */
  var userProject: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHmackeysList {
  
  inline def apply(): ParamsResourceProjectsHmackeysList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHmackeysList]
  }
  
  extension [Self <: ParamsResourceProjectsHmackeysList](x: Self) {
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setServiceAccountEmail(value: String): Self = StObject.set(x, "serviceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountEmailUndefined: Self = StObject.set(x, "serviceAccountEmail", js.undefined)
    
    inline def setShowDeletedKeys(value: Boolean): Self = StObject.set(x, "showDeletedKeys", value.asInstanceOf[js.Any])
    
    inline def setShowDeletedKeysUndefined: Self = StObject.set(x, "showDeletedKeys", js.undefined)
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
