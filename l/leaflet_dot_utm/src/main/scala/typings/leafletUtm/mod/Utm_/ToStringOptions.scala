package typings.leafletUtm.mod.Utm_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToStringOptions extends js.Object {
  /** Number of decimals for x and y. Default 1. */
  var decimals: js.UndefOr[Double] = js.undefined
  /**
    * String defining the format to use.
    * Default `{x}{sep} {y}{sep} {zone}{band}{sep} {datum}`, where:
    * `{x}: easting`
    * `{y}: northing`
    * `{zone}: UTM zone, value between 1 and 60`
    * `{band}: Band letter, between C and X`
    * `{datum}: WGS84`
    * `{hemi}: Hemisphere, north or south`
    * `{sep}: separator`
    */
  var format: js.UndefOr[String] = js.undefined
  /** String used in the format for field {hemi} in the north hemisphere. Default 'North'. */
  var north: js.UndefOr[String] = js.undefined
  /** Separator used in the format. Default ','. */
  var sep: js.UndefOr[String] = js.undefined
  /** String used in the format for field {hemi} in the south hemisphere. Default 'South'. */
  var south: js.UndefOr[String] = js.undefined
}

object ToStringOptions {
  @scala.inline
  def apply(
    decimals: js.UndefOr[Double] = js.undefined,
    format: String = null,
    north: String = null,
    sep: String = null,
    south: String = null
  ): ToStringOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decimals)) __obj.updateDynamic("decimals")(decimals.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (north != null) __obj.updateDynamic("north")(north.asInstanceOf[js.Any])
    if (sep != null) __obj.updateDynamic("sep")(sep.asInstanceOf[js.Any])
    if (south != null) __obj.updateDynamic("south")(south.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToStringOptions]
  }
}

