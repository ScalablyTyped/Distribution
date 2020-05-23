package typings.intercomClient.anon

import typings.intercomClient.intercomClientStrings.social_profileDotlist
import typings.intercomClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Socialprofiles extends js.Object {
  var social_profiles: js.Array[SocialProfile]
  var `type`: social_profileDotlist
}

object Socialprofiles {
  @scala.inline
  def apply(social_profiles: js.Array[SocialProfile], `type`: social_profileDotlist): Socialprofiles = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Socialprofiles]
  }
}

