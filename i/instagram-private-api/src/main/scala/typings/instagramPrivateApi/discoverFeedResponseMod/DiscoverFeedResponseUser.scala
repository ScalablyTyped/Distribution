package typings.instagramPrivateApi.discoverFeedResponseMod

import typings.instagramPrivateApi.profileEntityMod.ProfileEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instagram-private-api/dist/responses/discover.feed.response", "DiscoverFeedResponseUser")
@js.native
class DiscoverFeedResponseUser () extends ProfileEntity {
  
  var full_name: String = js.native
  
  var has_anonymous_profile_picture: Boolean = js.native
  
  var is_private: Boolean = js.native
  
  var is_verified: Boolean = js.native
  
  @JSName("pk")
  var pk_DiscoverFeedResponseUser: String = js.native
  
  var profile_pic_id: String = js.native
  
  var profile_pic_url: String = js.native
  
  var username: String = js.native
}
