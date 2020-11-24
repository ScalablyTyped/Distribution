package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resource submessage for group checks. It can be used instead of a
  * monitored resource, when multiple resources are being monitored.
  */
@js.native
trait SchemaResourceGroup extends js.Object {
  
  /**
    * The group of resources being monitored. Should be only the group_id, not
    * projects/&lt;project_id&gt;/groups/&lt;group_id&gt;.
    */
  var groupId: js.UndefOr[String] = js.native
  
  /**
    * The resource type of the group members.
    */
  var resourceType: js.UndefOr[String] = js.native
}
object SchemaResourceGroup {
  
  @scala.inline
  def apply(): SchemaResourceGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceGroup]
  }
  
  @scala.inline
  implicit class SchemaResourceGroupOps[Self <: SchemaResourceGroup] (val x: Self) extends AnyVal {
    
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupId: Self = this.set("groupId", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
