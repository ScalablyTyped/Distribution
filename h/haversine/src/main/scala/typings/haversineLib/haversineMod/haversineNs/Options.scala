package typings
package haversineLib.haversineMod.haversineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Format of coordinate arguments.
    */
  var format: js.UndefOr[
    haversineLib.haversineLibStrings.`[lat,lon]` | haversineLib.haversineLibStrings.`[lon,lat]` | haversineLib.haversineLibStrings.`{lon,lat}` | haversineLib.haversineLibStrings.geojson
  ] = js.undefined
  /**
    * If passed, will result in library returning boolean value of whether or not the start and end points are within that supplied threshold. Default: null.
    */
  var threshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * Unit of measurement applied to result. Default: "km".
    */
  var unit: js.UndefOr[
    haversineLib.haversineLibStrings.km | haversineLib.haversineLibStrings.mile | haversineLib.haversineLibStrings.meter | haversineLib.haversineLibStrings.nmi
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    format: haversineLib.haversineLibStrings.`[lat,lon]` | haversineLib.haversineLibStrings.`[lon,lat]` | haversineLib.haversineLibStrings.`{lon,lat}` | haversineLib.haversineLibStrings.geojson = null,
    threshold: scala.Int | scala.Double = null,
    unit: haversineLib.haversineLibStrings.km | haversineLib.haversineLibStrings.mile | haversineLib.haversineLibStrings.meter | haversineLib.haversineLibStrings.nmi = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

