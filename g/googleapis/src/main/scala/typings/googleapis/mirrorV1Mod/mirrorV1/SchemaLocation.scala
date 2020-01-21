package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A geographic location that can be associated with a timeline item.
  */
@js.native
trait SchemaLocation extends js.Object {
  /**
    * The accuracy of the location fix in meters.
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * The full address of the location.
    */
  var address: js.UndefOr[String] = js.native
  /**
    * The name to be displayed. This may be a business name or a user-defined
    * place, such as &quot;Home&quot;.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The ID of the location.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The type of resource. This is always mirror#location.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The latitude, in degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * The longitude, in degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
  /**
    * The time at which this location was captured, formatted according to RFC
    * 3339.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaLocation {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    address: String = null,
    displayName: String = null,
    id: String = null,
    kind: String = null,
    latitude: Int | Double = null,
    longitude: Int | Double = null,
    timestamp: String = null
  ): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLocation]
  }
}

