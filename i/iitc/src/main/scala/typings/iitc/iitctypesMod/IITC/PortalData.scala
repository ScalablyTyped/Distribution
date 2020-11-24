package typings.iitc.iitctypesMod.IITC

import typings.iitc.anon.Fragment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalData extends PortalDataCore {
  
  var artifactBrief: Fragment | Null = js.native
  
  var health: Double = js.native
  
  var image: String = js.native
  
   // url
  var level: Double = js.native
  
  var mission: Boolean = js.native
  
  var mission50plus: Boolean = js.native
  
  var ornaments: js.Array[String] = js.native
  
  var resCount: Double = js.native
  
  var timestamp: Double = js.native
  
  var title: String = js.native
}
object PortalData {
  
  @scala.inline
  def apply(
    health: Double,
    image: String,
    latE6: Double,
    level: Double,
    lngE6: Double,
    mission: Boolean,
    mission50plus: Boolean,
    ornaments: js.Array[String],
    resCount: Double,
    team: String,
    timestamp: Double,
    title: String
  ): PortalData = {
    val __obj = js.Dynamic.literal(health = health.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], mission = mission.asInstanceOf[js.Any], mission50plus = mission50plus.asInstanceOf[js.Any], ornaments = ornaments.asInstanceOf[js.Any], resCount = resCount.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalData]
  }
  
  @scala.inline
  implicit class PortalDataOps[Self <: PortalData] (val x: Self) extends AnyVal {
    
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
    def setHealth(value: Double): Self = this.set("health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMission(value: Boolean): Self = this.set("mission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMission50plus(value: Boolean): Self = this.set("mission50plus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrnamentsVarargs(value: String*): Self = this.set("ornaments", js.Array(value :_*))
    
    @scala.inline
    def setOrnaments(value: js.Array[String]): Self = this.set("ornaments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResCount(value: Double): Self = this.set("resCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactBrief(value: Fragment): Self = this.set("artifactBrief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactBriefNull: Self = this.set("artifactBrief", null)
  }
}
