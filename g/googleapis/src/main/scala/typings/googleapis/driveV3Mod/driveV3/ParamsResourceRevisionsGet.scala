package typings.googleapis.driveV3Mod.driveV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRevisionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Whether the user is acknowledging the risk of downloading known malware
    * or other abusive files. This is only applicable when alt=media.
    */
  var acknowledgeAbuse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the file.
    */
  var fileId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the revision.
    */
  var revisionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRevisionsGet {
  
  inline def apply(): ParamsResourceRevisionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRevisionsGet]
  }
  
  extension [Self <: ParamsResourceRevisionsGet](x: Self) {
    
    inline def setAcknowledgeAbuse(value: Boolean): Self = StObject.set(x, "acknowledgeAbuse", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeAbuseUndefined: Self = StObject.set(x, "acknowledgeAbuse", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFileId(value: String): Self = StObject.set(x, "fileId", value.asInstanceOf[js.Any])
    
    inline def setFileIdUndefined: Self = StObject.set(x, "fileId", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
  }
}
