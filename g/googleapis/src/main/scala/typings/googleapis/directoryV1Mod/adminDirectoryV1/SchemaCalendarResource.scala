package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    buildingId: String = null,
    capacity: Int | Double = null,
    etags: String = null,
    featureInstances: js.Any = null,
    floorName: String = null,
    floorSection: String = null,
    generatedResourceName: String = null,
    kind: String = null,
    resourceCategory: String = null,
    resourceDescription: String = null,
    resourceEmail: String = null,
    resourceId: String = null,
    resourceName: String = null,
    resourceType: String = null,
    userVisibleDescription: String = null
  ): SchemaCalendarResource = {
    val __obj = js.Dynamic.literal()
    if (buildingId != null) __obj.updateDynamic("buildingId")(buildingId.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (etags != null) __obj.updateDynamic("etags")(etags.asInstanceOf[js.Any])
    if (featureInstances != null) __obj.updateDynamic("featureInstances")(featureInstances.asInstanceOf[js.Any])
    if (floorName != null) __obj.updateDynamic("floorName")(floorName.asInstanceOf[js.Any])
    if (floorSection != null) __obj.updateDynamic("floorSection")(floorSection.asInstanceOf[js.Any])
    if (generatedResourceName != null) __obj.updateDynamic("generatedResourceName")(generatedResourceName.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (resourceCategory != null) __obj.updateDynamic("resourceCategory")(resourceCategory.asInstanceOf[js.Any])
    if (resourceDescription != null) __obj.updateDynamic("resourceDescription")(resourceDescription.asInstanceOf[js.Any])
    if (resourceEmail != null) __obj.updateDynamic("resourceEmail")(resourceEmail.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (userVisibleDescription != null) __obj.updateDynamic("userVisibleDescription")(userVisibleDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCalendarResource]
  }
}

