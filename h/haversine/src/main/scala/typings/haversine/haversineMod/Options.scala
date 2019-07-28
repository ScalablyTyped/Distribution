package typings.haversine.haversineMod

import typings.haversine.haversineStrings.`[lat,lon]`
import typings.haversine.haversineStrings.`[lon,lat]`
import typings.haversine.haversineStrings.`{lat,lng}`
import typings.haversine.haversineStrings.`{lon,lat}`
import typings.haversine.haversineStrings.geojson
import typings.haversine.haversineStrings.km
import typings.haversine.haversineStrings.meter
import typings.haversine.haversineStrings.mile
import typings.haversine.haversineStrings.nmi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Format of coordinate arguments. */
  var format: js.UndefOr[`[lat,lon]` | `[lon,lat]` | `{lon,lat}` | `{lat,lng}` | geojson] = js.undefined
  /**
    * If passed, will result in library returning boolean value of whether or not the start and end points are within that supplied threshold.
    */
  var threshold: js.UndefOr[Double | Null] = js.undefined
  /** Unit of measurement applied to result. Default: "km". */
  var unit: js.UndefOr[km | mile | meter | nmi] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    format: `[lat,lon]` | `[lon,lat]` | `{lon,lat}` | `{lat,lng}` | geojson = null,
    threshold: Int | Double = null,
    unit: km | mile | meter | nmi = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

