package typings.iitc.iitctypesMod.IITC

import typings.iitc.anon.Fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalData
  extends StObject
     with PortalDataCore {
  
  var artifactBrief: Fragment | Null
  
  var health: Double
  
  var image: String
  
  // url
  var level: Double
  
  var mission: Boolean
  
  var mission50plus: Boolean
  
  var ornaments: js.Array[String]
  
  var resCount: Double
  
  var timestamp: Double
  
  var title: String
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
    val __obj = js.Dynamic.literal(health = health.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], mission = mission.asInstanceOf[js.Any], mission50plus = mission50plus.asInstanceOf[js.Any], ornaments = ornaments.asInstanceOf[js.Any], resCount = resCount.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], artifactBrief = null)
    __obj.asInstanceOf[PortalData]
  }
  
  @scala.inline
  implicit class PortalDataMutableBuilder[Self <: PortalData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactBrief(value: Fragment): Self = StObject.set(x, "artifactBrief", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactBriefNull: Self = StObject.set(x, "artifactBrief", null)
    
    @scala.inline
    def setHealth(value: Double): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMission(value: Boolean): Self = StObject.set(x, "mission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMission50plus(value: Boolean): Self = StObject.set(x, "mission50plus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrnaments(value: js.Array[String]): Self = StObject.set(x, "ornaments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrnamentsVarargs(value: String*): Self = StObject.set(x, "ornaments", js.Array(value :_*))
    
    @scala.inline
    def setResCount(value: Double): Self = StObject.set(x, "resCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
