package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A restriction that can be applied to the Map. The map's viewport will not
  * exceed these restrictions.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapRestriction Maps JavaScript API}
  */
@js.native
trait MapRestriction extends js.Object {
  /**
    * When set, a user can only pan and zoom inside the given bounds.
    * Bounds can restrict both longitude and latitude, or can restrict
    * latitude only. For latitude-only bounds use west and east longitudes
    * of -180 and 180, respectively.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapRestriction.latLngBounds Maps JavaScript API}
    */
  var latLngBounds: LatLngBounds | LatLngBoundsLiteral = js.native
  /**
    * By default bounds are relaxed, meaning that a user can zoom out
    * until the entire bounded area is in view. Bounds can be made more
    * restrictive by setting the strictBounds flag to true. This reduces
    * how far a user can zoom out, ensuring that everything outside of the
    * restricted bounds stays hidden.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/map#MapRestriction.strictBounds Maps JavaScript API}
    */
  var strictBounds: js.UndefOr[Boolean] = js.native
}

object MapRestriction {
  @scala.inline
  def apply(latLngBounds: LatLngBounds | LatLngBoundsLiteral): MapRestriction = {
    val __obj = js.Dynamic.literal(latLngBounds = latLngBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapRestriction]
  }
  @scala.inline
  implicit class MapRestrictionOps[Self <: MapRestriction] (val x: Self) extends AnyVal {
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
    def setLatLngBounds(value: LatLngBounds | LatLngBoundsLiteral): Self = this.set("latLngBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrictBounds(value: Boolean): Self = this.set("strictBounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrictBounds: Self = this.set("strictBounds", js.undefined)
  }
  
}

