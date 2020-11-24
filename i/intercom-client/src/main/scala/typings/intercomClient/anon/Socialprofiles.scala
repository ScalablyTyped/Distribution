package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.social_profileDotlist
import typings.intercomClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socialprofiles extends js.Object {
  
  var social_profiles: js.Array[SocialProfile] = js.native
  
  var `type`: social_profileDotlist = js.native
}
object Socialprofiles {
  
  @scala.inline
  def apply(social_profiles: js.Array[SocialProfile], `type`: social_profileDotlist): Socialprofiles = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socialprofiles]
  }
  
  @scala.inline
  implicit class SocialprofilesOps[Self <: Socialprofiles] (val x: Self) extends AnyVal {
    
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
    def setSocial_profilesVarargs(value: SocialProfile*): Self = this.set("social_profiles", js.Array(value :_*))
    
    @scala.inline
    def setSocial_profiles(value: js.Array[SocialProfile]): Self = this.set("social_profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: social_profileDotlist): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
