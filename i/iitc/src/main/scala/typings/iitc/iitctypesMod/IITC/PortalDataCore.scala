package typings.iitc.iitctypesMod.IITC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortalDataCore extends js.Object {
  
  var latE6: Double = js.native
  
  var lngE6: Double = js.native
  
  var team: String = js.native
}
object PortalDataCore {
  
  @scala.inline
  def apply(latE6: Double, lngE6: Double, team: String): PortalDataCore = {
    val __obj = js.Dynamic.literal(latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalDataCore]
  }
  
  @scala.inline
  implicit class PortalDataCoreOps[Self <: PortalDataCore] (val x: Self) extends AnyVal {
    
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
    def setLatE6(value: Double): Self = this.set("latE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngE6(value: Double): Self = this.set("lngE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
  }
}
