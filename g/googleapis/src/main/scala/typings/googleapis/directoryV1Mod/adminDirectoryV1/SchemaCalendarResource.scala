package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Calendar Resource object in Directory API.
  */
trait SchemaCalendarResource extends StObject {
  
  /**
    * Unique ID for the building a resource is located in.
    */
  var buildingId: js.UndefOr[String] = js.undefined
  
  /**
    * Capacity of a resource, number of seats in a room.
    */
  var capacity: js.UndefOr[Double] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etags: js.UndefOr[String] = js.undefined
  
  var featureInstances: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Name of the floor a resource is located on.
    */
  var floorName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the section within a floor a resource is located in.
    */
  var floorSection: js.UndefOr[String] = js.undefined
  
  /**
    * The read-only auto-generated name of the calendar resource which includes
    * metadata about the resource such as building name, floor, capacity, etc.
    * For example, &quot;NYC-2-Training Room 1A (16)&quot;.
    */
  var generatedResourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource. For calendar resources, the value is
    * admin#directory#resources#calendars#CalendarResource.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The category of the calendar resource. Either CONFERENCE_ROOM or OTHER.
    * Legacy data is set to CATEGORY_UNKNOWN.
    */
  var resourceCategory: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the resource, visible only to admins.
    */
  var resourceDescription: js.UndefOr[String] = js.undefined
  
  /**
    * The read-only email for the calendar resource. Generated as part of
    * creating a new calendar resource.
    */
  var resourceEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the calendar resource.
    */
  var resourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the calendar resource. For example, &quot;Training Room
    * 1A&quot;.
    */
  var resourceName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the calendar resource, intended for non-room resources.
    */
  var resourceType: js.UndefOr[String] = js.undefined
  
  /**
    * Description of the resource, visible to users and admins.
    */
  var userVisibleDescription: js.UndefOr[String] = js.undefined
}
object SchemaCalendarResource {
  
  inline def apply(): SchemaCalendarResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCalendarResource]
  }
  
  extension [Self <: SchemaCalendarResource](x: Self) {
    
    inline def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    inline def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
    
    inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
    
    inline def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
    
    inline def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
    
    inline def setFeatureInstances(value: js.Any): Self = StObject.set(x, "featureInstances", value.asInstanceOf[js.Any])
    
    inline def setFeatureInstancesUndefined: Self = StObject.set(x, "featureInstances", js.undefined)
    
    inline def setFloorName(value: String): Self = StObject.set(x, "floorName", value.asInstanceOf[js.Any])
    
    inline def setFloorNameUndefined: Self = StObject.set(x, "floorName", js.undefined)
    
    inline def setFloorSection(value: String): Self = StObject.set(x, "floorSection", value.asInstanceOf[js.Any])
    
    inline def setFloorSectionUndefined: Self = StObject.set(x, "floorSection", js.undefined)
    
    inline def setGeneratedResourceName(value: String): Self = StObject.set(x, "generatedResourceName", value.asInstanceOf[js.Any])
    
    inline def setGeneratedResourceNameUndefined: Self = StObject.set(x, "generatedResourceName", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setResourceCategory(value: String): Self = StObject.set(x, "resourceCategory", value.asInstanceOf[js.Any])
    
    inline def setResourceCategoryUndefined: Self = StObject.set(x, "resourceCategory", js.undefined)
    
    inline def setResourceDescription(value: String): Self = StObject.set(x, "resourceDescription", value.asInstanceOf[js.Any])
    
    inline def setResourceDescriptionUndefined: Self = StObject.set(x, "resourceDescription", js.undefined)
    
    inline def setResourceEmail(value: String): Self = StObject.set(x, "resourceEmail", value.asInstanceOf[js.Any])
    
    inline def setResourceEmailUndefined: Self = StObject.set(x, "resourceEmail", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
    
    inline def setResourceName(value: String): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setUserVisibleDescription(value: String): Self = StObject.set(x, "userVisibleDescription", value.asInstanceOf[js.Any])
    
    inline def setUserVisibleDescriptionUndefined: Self = StObject.set(x, "userVisibleDescription", js.undefined)
  }
}
