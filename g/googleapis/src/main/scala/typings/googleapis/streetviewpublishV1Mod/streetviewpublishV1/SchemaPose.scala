package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Raw pose measurement for an entity.
  */
@js.native
trait SchemaPose extends js.Object {
  /**
    * The estimated horizontal accuracy of this pose in meters with 68%
    * confidence (one standard deviation). For example, on Android, this value
    * is available from this method:
    * https://developer.android.com/reference/android/location/Location#getAccuracy().
    * Other platforms have different methods of obtaining similar accuracy
    * estimations.
    */
  var accuracyMeters: js.UndefOr[Double] = js.native
  /**
    * Altitude of the pose in meters above WGS84 ellipsoid. NaN indicates an
    * unmeasured quantity.
    */
  var altitude: js.UndefOr[Double] = js.native
  /**
    * Compass heading, measured at the center of the photo in degrees clockwise
    * from North. Value must be &gt;=0 and &lt;360. NaN indicates an unmeasured
    * quantity.
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * Latitude and longitude pair of the pose, as explained here:
    * https://cloud.google.com/datastore/docs/reference/rest/Shared.Types/LatLng
    * When creating a Photo, if the latitude and longitude pair are not
    * provided, the geolocation from the exif header is used. A latitude and
    * longitude pair not provided in the photo or exif header causes the photo
    * process to fail.
    */
  var latLngPair: js.UndefOr[SchemaLatLng] = js.native
  /**
    * Level (the floor in a building) used to configure vertical navigation.
    */
  var level: js.UndefOr[SchemaLevel] = js.native
  /**
    * Pitch, measured at the center of the photo in degrees. Value must be
    * &gt;=-90 and &lt;= 90. A value of -90 means looking directly down, and a
    * value of 90 means looking directly up. NaN indicates an unmeasured
    * quantity.
    */
  var pitch: js.UndefOr[Double] = js.native
  /**
    * Roll, measured in degrees. Value must be &gt;= 0 and &lt;360. A value of
    * 0 means level with the horizon. NaN indicates an unmeasured quantity.
    */
  var roll: js.UndefOr[Double] = js.native
}

object SchemaPose {
  @scala.inline
  def apply(
    accuracyMeters: Int | Double = null,
    altitude: Int | Double = null,
    heading: Int | Double = null,
    latLngPair: SchemaLatLng = null,
    level: SchemaLevel = null,
    pitch: Int | Double = null,
    roll: Int | Double = null
  ): SchemaPose = {
    val __obj = js.Dynamic.literal()
    if (accuracyMeters != null) __obj.updateDynamic("accuracyMeters")(accuracyMeters.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (latLngPair != null) __obj.updateDynamic("latLngPair")(latLngPair.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (pitch != null) __obj.updateDynamic("pitch")(pitch.asInstanceOf[js.Any])
    if (roll != null) __obj.updateDynamic("roll")(roll.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPose]
  }
}

