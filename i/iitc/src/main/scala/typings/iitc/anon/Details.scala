package typings.iitc.anon

import typings.iitc.hooksMod.global.EventPortalDetailLoaded
import typings.iitc.hooksMod.global.PortalDetailEnt
import typings.iitc.iitcBooleans.`true`
import typings.iitc.iitctypesMod.IITC.PortalDataDetail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Details extends EventPortalDetailLoaded {
  
  var details: PortalDataDetail = js.native
  
  var ent: PortalDetailEnt = js.native
  
  var guid: String = js.native
  
  var success: `true` = js.native
}
object Details {
  
  @scala.inline
  def apply(details: PortalDataDetail, ent: PortalDetailEnt, guid: String, success: `true`): Details = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], ent = ent.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Details]
  }
  
  @scala.inline
  implicit class DetailsOps[Self <: Details] (val x: Self) extends AnyVal {
    
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
    def setDetails(value: PortalDataDetail): Self = this.set("details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnt(value: PortalDetailEnt): Self = this.set("ent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: `true`): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
