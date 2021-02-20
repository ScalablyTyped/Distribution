package typings.iitc.iitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalDataDetail extends PortalData {
  
  var artifactDetail: ArtifactDetail = js.native
  
  var mods: js.Tuple4[Mod | Null, Mod | Null, Mod | Null, Mod | Null] = js.native
  
  var owner: String = js.native
  
  var resonators: js.Array[Resonator] = js.native
}
object PortalDataDetail {
  
  @scala.inline
  def apply(
    artifactDetail: ArtifactDetail,
    health: Double,
    image: String,
    latE6: Double,
    level: Double,
    lngE6: Double,
    mission: Boolean,
    mission50plus: Boolean,
    mods: js.Tuple4[Mod | Null, Mod | Null, Mod | Null, Mod | Null],
    ornaments: js.Array[String],
    owner: String,
    resCount: Double,
    resonators: js.Array[Resonator],
    team: String,
    timestamp: Double,
    title: String
  ): PortalDataDetail = {
    val __obj = js.Dynamic.literal(artifactDetail = artifactDetail.asInstanceOf[js.Any], health = health.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], mission = mission.asInstanceOf[js.Any], mission50plus = mission50plus.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], ornaments = ornaments.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resCount = resCount.asInstanceOf[js.Any], resonators = resonators.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalDataDetail]
  }
  
  @scala.inline
  implicit class PortalDataDetailMutableBuilder[Self <: PortalDataDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactDetail(value: ArtifactDetail): Self = StObject.set(x, "artifactDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMods(value: js.Tuple4[Mod | Null, Mod | Null, Mod | Null, Mod | Null]): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResonators(value: js.Array[Resonator]): Self = StObject.set(x, "resonators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResonatorsVarargs(value: Resonator*): Self = StObject.set(x, "resonators", js.Array(value :_*))
  }
}
