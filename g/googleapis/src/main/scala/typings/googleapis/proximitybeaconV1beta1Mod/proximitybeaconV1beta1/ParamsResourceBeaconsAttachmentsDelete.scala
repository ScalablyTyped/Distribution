package typings.googleapis.proximitybeaconV1beta1Mod.proximitybeaconV1beta1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceBeaconsAttachmentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The attachment name (`attachmentName`) of the attachment to remove. For
    * example:
    * `beacons/3!893737abc9/attachments/c5e937-af0-494-959-ec49d12738`. For
    * Eddystone-EID beacons, the beacon ID portion (`3!893737abc9`) may be the
    * beacon's current EID, or its "stable" Eddystone-UID. Required.
    */
  var attachmentName: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The project id of the attachment to delete. If not provided, the project
    * that is making the request is used. Optional.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceBeaconsAttachmentsDelete {
  
  inline def apply(): ParamsResourceBeaconsAttachmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBeaconsAttachmentsDelete]
  }
  
  extension [Self <: ParamsResourceBeaconsAttachmentsDelete](x: Self) {
    
    inline def setAttachmentName(value: String): Self = StObject.set(x, "attachmentName", value.asInstanceOf[js.Any])
    
    inline def setAttachmentNameUndefined: Self = StObject.set(x, "attachmentName", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
