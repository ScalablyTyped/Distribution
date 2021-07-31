package typings.googleapis.driveV2Mod.driveV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTeamdrivesInsert
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTeamDrive] = js.undefined
  
  /**
    * An ID, such as a random UUID, which uniquely identifies this user's
    * request for idempotent creation of a Team Drive. A repeated request by
    * the same user and with the same request ID will avoid creating duplicates
    * by attempting to create the same Team Drive. If the Team Drive already
    * exists a 409 error will be returned.
    */
  var requestId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTeamdrivesInsert {
  
  @scala.inline
  def apply(): ParamsResourceTeamdrivesInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTeamdrivesInsert]
  }
  
  @scala.inline
  implicit class ParamsResourceTeamdrivesInsertMutableBuilder[Self <: ParamsResourceTeamdrivesInsert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaTeamDrive): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
