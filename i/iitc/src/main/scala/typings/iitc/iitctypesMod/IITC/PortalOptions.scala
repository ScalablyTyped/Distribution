package typings.iitc.iitctypesMod.IITC

import typings.iitc.iitctypesMod.PortalGUID
import typings.leaflet.mod.PathOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalOptions extends PathOptions {
  
  var data: PortalData = js.native
  
  var ent: js.Any = js.native
  
  var guid: PortalGUID = js.native
  
  var level: Double = js.native
  
  var team: Double = js.native
  
  var timestamp: Double = js.native
}
object PortalOptions {
  
  @scala.inline
  def apply(data: PortalData, ent: js.Any, guid: PortalGUID, level: Double, team: Double, timestamp: Double): PortalOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalOptions]
  }
  
  @scala.inline
  implicit class PortalOptionsMutableBuilder[Self <: PortalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: PortalData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnt(value: js.Any): Self = StObject.set(x, "ent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: PortalGUID): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: Double): Self = StObject.set(x, "team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
