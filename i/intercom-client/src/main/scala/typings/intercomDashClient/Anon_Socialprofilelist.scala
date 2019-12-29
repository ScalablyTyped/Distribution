package typings.intercomDashClient

import typings.intercomDashClient.intercomDashClientStrings.social_profileDotlist
import typings.intercomDashClient.userMod.SocialProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Socialprofilelist extends js.Object {
  var social_profiles: js.Array[SocialProfile]
  var `type`: social_profileDotlist
}

object Anon_Socialprofilelist {
  @scala.inline
  def apply(social_profiles: js.Array[SocialProfile], `type`: social_profileDotlist): Anon_Socialprofilelist = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Socialprofilelist]
  }
}

