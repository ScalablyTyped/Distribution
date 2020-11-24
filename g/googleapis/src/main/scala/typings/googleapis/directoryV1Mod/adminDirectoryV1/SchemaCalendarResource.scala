package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Calendar Resource object in Directory API.
  */
@js.native
trait SchemaCalendarResource extends js.Object {
  
  /**
    * Unique ID for the building a resource is located in.
    */
  var buildingId: js.UndefOr[String] = js.native
  
  /**
    * Capacity of a resource, number of seats in a room.
    */
  var capacity: js.UndefOr[Double] = js.native
  
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.native
  
  var featureInstances: js.UndefOr[js.Any] = js.native
  
  /**
    * Name of the floor a resource is located on.
    */
  var floorName: js.UndefOr[String] = js.native
  
  /**
    * Name of the section within a floor a resource is located in.
    */
  var floorSection: js.UndefOr[String] = js.native
  
  /**
    * The read-only auto-generated name of the calendar resource which includes
    * metadata about the resource such as building name, floor, capacity, etc.
    * For example, &quot;NYC-2-Training Room 1A (16)&quot;.
    */
  var generatedResourceName: js.UndefOr[String] = js.native
  
  /**
    * The type of the resource. For calendar resources, the value is
    * admin#directory#resources#calendars#CalendarResource.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The category of the calendar resource. Either CONFERENCE_ROOM or OTHER.
    * Legacy data is set to CATEGORY_UNKNOWN.
    */
  var resourceCategory: js.UndefOr[String] = js.native
  
  /**
    * Description of the resource, visible only to admins.
    */
  var resourceDescription: js.UndefOr[String] = js.native
  
  /**
    * The read-only email for the calendar resource. Generated as part of
    * creating a new calendar resource.
    */
  var resourceEmail: js.UndefOr[String] = js.native
  
  /**
    * The unique ID for the calendar resource.
    */
  var resourceId: js.UndefOr[String] = js.native
  
  /**
    * The name of the calendar resource. For example, &quot;Training Room
    * 1A&quot;.
    */
  var resourceName: js.UndefOr[String] = js.native
  
  /**
    * The type of the calendar resource, intended for non-room resources.
    */
  var resourceType: js.UndefOr[String] = js.native
  
  /**
    * Description of the resource, visible to users and admins.
    */
  var userVisibleDescription: js.UndefOr[String] = js.native
}
object SchemaCalendarResource {
  
  @scala.inline
  def apply(): SchemaCalendarResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarResource]
  }
  
  @scala.inline
  implicit class SchemaCalendarResourceOps[Self <: SchemaCalendarResource] (val x: Self) extends AnyVal {
    
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
    def setBuildingId(value: String): Self = this.set("buildingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildingId: Self = this.set("buildingId", js.undefined)
    
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setEtags(value: String): Self = this.set("etags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtags: Self = this.set("etags", js.undefined)
    
    @scala.inline
    def setFeatureInstances(value: js.Any): Self = this.set("featureInstances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureInstances: Self = this.set("featureInstances", js.undefined)
    
    @scala.inline
    def setFloorName(value: String): Self = this.set("floorName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorName: Self = this.set("floorName", js.undefined)
    
    @scala.inline
    def setFloorSection(value: String): Self = this.set("floorSection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorSection: Self = this.set("floorSection", js.undefined)
    
    @scala.inline
    def setGeneratedResourceName(value: String): Self = this.set("generatedResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeneratedResourceName: Self = this.set("generatedResourceName", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setResourceCategory(value: String): Self = this.set("resourceCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceCategory: Self = this.set("resourceCategory", js.undefined)
    
    @scala.inline
    def setResourceDescription(value: String): Self = this.set("resourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceDescription: Self = this.set("resourceDescription", js.undefined)
    
    @scala.inline
    def setResourceEmail(value: String): Self = this.set("resourceEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceEmail: Self = this.set("resourceEmail", js.undefined)
    
    @scala.inline
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    
    @scala.inline
    def setResourceName(value: String): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    
    @scala.inline
    def setUserVisibleDescription(value: String): Self = this.set("userVisibleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserVisibleDescription: Self = this.set("userVisibleDescription", js.undefined)
  }
}
