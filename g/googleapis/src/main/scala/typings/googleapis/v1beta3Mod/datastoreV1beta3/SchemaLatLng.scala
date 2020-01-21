package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object representing a latitude/longitude pair. This is expressed as a
  * pair of doubles representing degrees latitude and degrees longitude. Unless
  * specified otherwise, this must conform to the &lt;a
  * href=&quot;http://www.unoosa.org/pdf/icg/2012/template/WGS_84.pdf&quot;&gt;WGS84
  * standard&lt;/a&gt;. Values must be within normalized ranges.
  */
@js.native
trait SchemaLatLng extends js.Object {
  /**
    * The latitude in degrees. It must be in the range [-90.0, +90.0].
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * The longitude in degrees. It must be in the range [-180.0, +180.0].
    */
  var longitude: js.UndefOr[Double] = js.native
}

object SchemaLatLng {
  @scala.inline
  def apply(latitude: Int | Double = null, longitude: Int | Double = null): SchemaLatLng = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLatLng]
  }
}

