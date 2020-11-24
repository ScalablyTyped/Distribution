package typings.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationsResource extends js.Object {
  
  var gcpUserAccessBindings: GcpUserAccessBindingsResource = js.native
}
object OrganizationsResource {
  
  @scala.inline
  def apply(gcpUserAccessBindings: GcpUserAccessBindingsResource): OrganizationsResource = {
    val __obj = js.Dynamic.literal(gcpUserAccessBindings = gcpUserAccessBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsResource]
  }
  
  @scala.inline
  implicit class OrganizationsResourceOps[Self <: OrganizationsResource] (val x: Self) extends AnyVal {
    
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
    def setGcpUserAccessBindings(value: GcpUserAccessBindingsResource): Self = this.set("gcpUserAccessBindings", value.asInstanceOf[js.Any])
  }
}
