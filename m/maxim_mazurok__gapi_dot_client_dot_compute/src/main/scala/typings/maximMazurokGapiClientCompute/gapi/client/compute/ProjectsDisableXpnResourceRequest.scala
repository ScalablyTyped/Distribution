package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsDisableXpnResourceRequest extends js.Object {
  
  /** Service resource (a.k.a service project) ID. */
  var xpnResource: js.UndefOr[XpnResourceId] = js.native
}
object ProjectsDisableXpnResourceRequest {
  
  @scala.inline
  def apply(): ProjectsDisableXpnResourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectsDisableXpnResourceRequest]
  }
  
  @scala.inline
  implicit class ProjectsDisableXpnResourceRequestOps[Self <: ProjectsDisableXpnResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setXpnResource(value: XpnResourceId): Self = this.set("xpnResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXpnResource: Self = this.set("xpnResource", js.undefined)
  }
}
