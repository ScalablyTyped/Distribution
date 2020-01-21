package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A resource that represents Google Cloud Platform location.
  */
@js.native
trait SchemaLocation extends js.Object {
  /**
    * The friendly name for this location, typically a nearby city name. For
    * example, &quot;Tokyo&quot;.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Cross-service attributes for the location. For example
    * {&quot;cloud.googleapis.com/region&quot;: &quot;us-east1&quot;}
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Resource ID for the region. For example: &quot;us-east1&quot;.
    */
  var locationId: js.UndefOr[String] = js.native
  /**
    * Output only. The set of available zones in the location. The map is keyed
    * by the lowercase ID of each zone, as defined by Compute Engine. These
    * keys can be specified in `location_id` or `alternative_location_id`
    * fields when creating a Redis instance.
    */
  var metadata: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Full resource name for the region. For example:
    * &quot;projects/example-project/locations/us-east1&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaLocation {
  @scala.inline
  def apply(
    displayName: String = null,
    labels: StringDictionary[String] = null,
    locationId: String = null,
    metadata: StringDictionary[js.Any] = null,
    name: String = null
  ): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocation]
  }
}

