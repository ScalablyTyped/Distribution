package typings.iitc.coreIitctypesMod.IITC

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalDataDetail
  extends StObject
     with PortalData {
  
  var artifactDetail: ArtifactDetail
  
  var mods: js.Tuple4[Mod | Null, Mod | Null, Mod | Null, Mod | Null]
  
  var owner: String
  
  var resonators: js.Array[Resonator]
}
object PortalDataDetail {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(artifactDetail = artifactDetail.asInstanceOf[js.Any], health = health.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], mission = mission.asInstanceOf[js.Any], mission50plus = mission50plus.asInstanceOf[js.Any], mods = mods.asInstanceOf[js.Any], ornaments = ornaments.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], resCount = resCount.asInstanceOf[js.Any], resonators = resonators.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], artifactBrief = null)
    __obj.asInstanceOf[PortalDataDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalDataDetail] (val x: Self) extends AnyVal {
    
    inline def setArtifactDetail(value: ArtifactDetail): Self = StObject.set(x, "artifactDetail", value.asInstanceOf[js.Any])
    
    inline def setMods(value: js.Tuple4[Mod | Null, Mod | Null, Mod | Null, Mod | Null]): Self = StObject.set(x, "mods", value.asInstanceOf[js.Any])
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setResonators(value: js.Array[Resonator]): Self = StObject.set(x, "resonators", value.asInstanceOf[js.Any])
    
    inline def setResonatorsVarargs(value: Resonator*): Self = StObject.set(x, "resonators", js.Array(value*))
  }
}
