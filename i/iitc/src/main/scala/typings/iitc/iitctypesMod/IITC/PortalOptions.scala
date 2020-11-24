package typings.iitc.iitctypesMod.IITC

import typings.iitc.iitctypesMod.PortalGUID
import typings.leaflet.mod.PathOptions
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
  implicit class PortalOptionsOps[Self <: PortalOptions] (val x: Self) extends AnyVal {
    
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
    def setData(value: PortalData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnt(value: js.Any): Self = this.set("ent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: PortalGUID): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: Double): Self = this.set("team", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
