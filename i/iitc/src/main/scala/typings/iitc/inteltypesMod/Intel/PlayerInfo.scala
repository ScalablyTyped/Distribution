package typings.iitc.inteltypesMod.Intel

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// PLAYER
@js.native
trait PlayerInfo extends js.Object {
  
  var ap: String = js.native
  
  var available_invites: Double = js.native
  
  var energy: Double = js.native
  
  var level: Double = js.native
  
  var min_ap_for_current_level: String = js.native
  
  var min_ap_for_next_level: String = js.native
  
  var nickMatcher: RegExp = js.native
  
  var nickname: String = js.native
  
  var team: String = js.native
  
  var verified_level: Double = js.native
  
  var xm_capacity: String = js.native
}
object PlayerInfo {
  
  @scala.inline
  def apply(
    ap: String,
    available_invites: Double,
    energy: Double,
    level: Double,
    min_ap_for_current_level: String,
    min_ap_for_next_level: String,
    nickMatcher: RegExp,
    nickname: String,
    team: String,
    verified_level: Double,
    xm_capacity: String
  ): PlayerInfo = {
    val __obj = js.Dynamic.literal(ap = ap.asInstanceOf[js.Any], available_invites = available_invites.asInstanceOf[js.Any], energy = energy.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], min_ap_for_current_level = min_ap_for_current_level.asInstanceOf[js.Any], min_ap_for_next_level = min_ap_for_next_level.asInstanceOf[js.Any], nickMatcher = nickMatcher.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], verified_level = verified_level.asInstanceOf[js.Any], xm_capacity = xm_capacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayerInfo]
  }
  
  @scala.inline
  implicit class PlayerInfoOps[Self <: PlayerInfo] (val x: Self) extends AnyVal {
    
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
    def setAp(value: String): Self = this.set("ap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_invites(value: Double): Self = this.set("available_invites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnergy(value: Double): Self = this.set("energy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_ap_for_current_level(value: String): Self = this.set("min_ap_for_current_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_ap_for_next_level(value: String): Self = this.set("min_ap_for_next_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickMatcher(value: RegExp): Self = this.set("nickMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerified_level(value: Double): Self = this.set("verified_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXm_capacity(value: String): Self = this.set("xm_capacity", value.asInstanceOf[js.Any])
  }
}
