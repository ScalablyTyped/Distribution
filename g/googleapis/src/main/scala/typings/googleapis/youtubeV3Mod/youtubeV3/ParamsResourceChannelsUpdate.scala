package typings.googleapis.youtubeV3Mod.youtubeV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceChannelsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated
    * user is acting on behalf of the content owner specified in the parameter
    * value. This parameter is intended for YouTube content partners that own
    * and manage many different YouTube channels. It allows content owners to
    * authenticate once and get access to all their video and channel data,
    * without having to provide authentication credentials for each individual
    * channel. The actual CMS account that the user authenticates with needs to
    * be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: js.UndefOr[String] = js.undefined
  
  /**
    * The part parameter serves two purposes in this operation. It identifies
    * the properties that the write operation will set as well as the
    * properties that the API response will include.  The API currently only
    * allows the parameter value to be set to either brandingSettings or
    * invideoPromotion. (You cannot update both of those parts with a single
    * request.)  Note that this method overrides the existing values for all of
    * the mutable properties that are contained in any parts that the parameter
    * value specifies.
    */
  var part: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaChannel] = js.undefined
}
object ParamsResourceChannelsUpdate {
  
  @scala.inline
  def apply(): ParamsResourceChannelsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceChannelsUpdate]
  }
  
  @scala.inline
  implicit class ParamsResourceChannelsUpdateMutableBuilder[Self <: ParamsResourceChannelsUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setOnBehalfOfContentOwner(value: String): Self = StObject.set(x, "onBehalfOfContentOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnBehalfOfContentOwnerUndefined: Self = StObject.set(x, "onBehalfOfContentOwner", js.undefined)
    
    @scala.inline
    def setPart(value: String): Self = StObject.set(x, "part", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartUndefined: Self = StObject.set(x, "part", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaChannel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
