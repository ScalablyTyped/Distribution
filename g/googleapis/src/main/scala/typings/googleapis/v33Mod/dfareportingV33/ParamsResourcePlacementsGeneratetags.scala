package typings.googleapis.v33Mod.dfareportingV33

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourcePlacementsGeneratetags extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Generate placements belonging to this campaign. This is a required field.
    */
  var campaignId: js.UndefOr[String] = js.native
  
  /**
    * Generate tags for these placements.
    */
  var placementIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * User profile ID associated with this request.
    */
  var profileId: js.UndefOr[String] = js.native
  
  /**
    * Tag formats to generate for these placements.  Note:
    * PLACEMENT_TAG_STANDARD can only be generated for 1x1 placements.
    */
  var tagFormats: js.UndefOr[js.Array[String]] = js.native
}
object ParamsResourcePlacementsGeneratetags {
  
  @scala.inline
  def apply(): ParamsResourcePlacementsGeneratetags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlacementsGeneratetags]
  }
  
  @scala.inline
  implicit class ParamsResourcePlacementsGeneratetagsMutableBuilder[Self <: ParamsResourcePlacementsGeneratetags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCampaignId(value: String): Self = StObject.set(x, "campaignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaignIdUndefined: Self = StObject.set(x, "campaignId", js.undefined)
    
    @scala.inline
    def setPlacementIds(value: js.Array[String]): Self = StObject.set(x, "placementIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementIdsUndefined: Self = StObject.set(x, "placementIds", js.undefined)
    
    @scala.inline
    def setPlacementIdsVarargs(value: String*): Self = StObject.set(x, "placementIds", js.Array(value :_*))
    
    @scala.inline
    def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    @scala.inline
    def setTagFormats(value: js.Array[String]): Self = StObject.set(x, "tagFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagFormatsUndefined: Self = StObject.set(x, "tagFormats", js.undefined)
    
    @scala.inline
    def setTagFormatsVarargs(value: String*): Self = StObject.set(x, "tagFormats", js.Array(value :_*))
  }
}
