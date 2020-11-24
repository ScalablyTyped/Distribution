package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaInstanceGroupManagersSetInstanceTemplateRequest extends js.Object {
  
  /**
    * The URL of the instance template that is specified for this managed
    * instance group. The group uses this template to create all new instances
    * in the managed instance group.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
}
object SchemaInstanceGroupManagersSetInstanceTemplateRequest {
  
  @scala.inline
  def apply(): SchemaInstanceGroupManagersSetInstanceTemplateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagersSetInstanceTemplateRequest]
  }
  
  @scala.inline
  implicit class SchemaInstanceGroupManagersSetInstanceTemplateRequestOps[Self <: SchemaInstanceGroupManagersSetInstanceTemplateRequest] (val x: Self) extends AnyVal {
    
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
    def setInstanceTemplate(value: String): Self = this.set("instanceTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceTemplate: Self = this.set("instanceTemplate", js.undefined)
  }
}
