package typings
package intercomDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Socialprofilelist extends js.Object {
  var social_profiles: js.Array[intercomDashClientLib.userMod.SocialProfile]
  var `type`: intercomDashClientLib.intercomDashClientLibStrings.social_profileDOTlist
}

object Anon_Socialprofilelist {
  @scala.inline
  def apply(
    social_profiles: js.Array[intercomDashClientLib.userMod.SocialProfile],
    `type`: intercomDashClientLib.intercomDashClientLibStrings.social_profileDOTlist
  ): Anon_Socialprofilelist = {
    val __obj = js.Dynamic.literal(social_profiles = social_profiles)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Socialprofilelist]
  }
}

