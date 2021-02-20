package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resource submessage for group checks. It can be used instead of a
  * monitored resource, when multiple resources are being monitored.
  */
@js.native
trait SchemaResourceGroup extends StObject {
  
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
  implicit class SchemaResourceGroupMutableBuilder[Self <: SchemaResourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
