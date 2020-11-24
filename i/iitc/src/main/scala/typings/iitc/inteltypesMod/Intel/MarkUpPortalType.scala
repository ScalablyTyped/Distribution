package typings.iitc.inteltypesMod.Intel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkUpPortalType extends js.Object {
  
  var address: String = js.native
  
  var latE6: Double = js.native
  
  var lngE6: Double = js.native
  
  var name: String = js.native
  
  var plain: String = js.native
  
  var team: String = js.native
}
object MarkUpPortalType {
  
  @scala.inline
  def apply(address: String, latE6: Double, lngE6: Double, name: String, plain: String, team: String): MarkUpPortalType = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], latE6 = latE6.asInstanceOf[js.Any], lngE6 = lngE6.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plain = plain.asInstanceOf[js.Any], team = team.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkUpPortalType]
  }
  
  @scala.inline
  implicit class MarkUpPortalTypeOps[Self <: MarkUpPortalType] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatE6(value: Double): Self = this.set("latE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLngE6(value: Double): Self = this.set("lngE6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlain(value: String): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeam(value: String): Self = this.set("team", value.asInstanceOf[js.Any])
  }
}
