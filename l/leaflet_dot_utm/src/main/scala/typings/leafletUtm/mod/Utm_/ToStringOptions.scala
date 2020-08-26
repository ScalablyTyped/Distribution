package typings.leafletUtm.mod.Utm_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToStringOptions extends js.Object {
  /** Number of decimals for x and y. Default 1. */
  var decimals: js.UndefOr[Double] = js.native
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
  var format: js.UndefOr[String] = js.native
  /** String used in the format for field {hemi} in the north hemisphere. Default 'North'. */
  var north: js.UndefOr[String] = js.native
  /** Separator used in the format. Default ','. */
  var sep: js.UndefOr[String] = js.native
  /** String used in the format for field {hemi} in the south hemisphere. Default 'South'. */
  var south: js.UndefOr[String] = js.native
}

object ToStringOptions {
  @scala.inline
  def apply(): ToStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToStringOptions]
  }
  @scala.inline
  implicit class ToStringOptionsOps[Self <: ToStringOptions] (val x: Self) extends AnyVal {
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
    def setDecimals(value: Double): Self = this.set("decimals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimals: Self = this.set("decimals", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setNorth(value: String): Self = this.set("north", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNorth: Self = this.set("north", js.undefined)
    @scala.inline
    def setSep(value: String): Self = this.set("sep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSep: Self = this.set("sep", js.undefined)
    @scala.inline
    def setSouth(value: String): Self = this.set("south", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSouth: Self = this.set("south", js.undefined)
  }
  
}

