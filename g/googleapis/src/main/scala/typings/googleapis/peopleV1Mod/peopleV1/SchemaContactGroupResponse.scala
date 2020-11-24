package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for a specific contact group.
  */
@js.native
trait SchemaContactGroupResponse extends js.Object {
  
  /**
    * The contact group.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
  
  /**
    * The original requested resource name.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  
  /**
    * The status of the response.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}
object SchemaContactGroupResponse {
  
  @scala.inline
  def apply(): SchemaContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupResponse]
  }
  
  @scala.inline
  implicit class SchemaContactGroupResponseOps[Self <: SchemaContactGroupResponse] (val x: Self) extends AnyVal {
    
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
    def setContactGroup(value: SchemaContactGroup): Self = this.set("contactGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactGroup: Self = this.set("contactGroup", js.undefined)
    
    @scala.inline
    def setRequestedResourceName(value: String): Self = this.set("requestedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedResourceName: Self = this.set("requestedResourceName", js.undefined)
    
    @scala.inline
    def setStatus(value: SchemaStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
