package typings.leafletRoutingMachine.mod.Routing_

import typings.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeocoderElementOptions extends js.Object {
  var autocompleteOptions: js.UndefOr[js.Object] = js.native
  var createGeocoder: js.UndefOr[js.Function3[/* i */ Double, /* nWps */ Double, /* options */ this.type, _]] = js.native
  var geocoderClass: js.UndefOr[js.Function0[String]] = js.native
  var geocoderPlaceholder: js.UndefOr[
    js.Function3[
      /* i */ Double, 
      /* numberWaypoints */ Double, 
      /* geocoderElement */ GeocoderElement_, 
      String
    ]
  ] = js.native
  var language: js.UndefOr[String] = js.native
  var maxGeocoderTolerance: js.UndefOr[Double] = js.native
  var waypointNameFallback: js.UndefOr[js.Function1[/* latLng */ LatLng_, String]] = js.native
}

object GeocoderElementOptions {
  @scala.inline
  def apply(): GeocoderElementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderElementOptions]
  }
  @scala.inline
  implicit class GeocoderElementOptionsOps[Self <: GeocoderElementOptions] (val x: Self) extends AnyVal {
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
    def setAutocompleteOptions(value: js.Object): Self = this.set("autocompleteOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocompleteOptions: Self = this.set("autocompleteOptions", js.undefined)
    @scala.inline
    def setCreateGeocoder(value: (/* i */ Double, /* nWps */ Double, GeocoderElementOptions) => _): Self = this.set("createGeocoder", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCreateGeocoder: Self = this.set("createGeocoder", js.undefined)
    @scala.inline
    def setGeocoderClass(value: () => String): Self = this.set("geocoderClass", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGeocoderClass: Self = this.set("geocoderClass", js.undefined)
    @scala.inline
    def setGeocoderPlaceholder(
      value: (/* i */ Double, /* numberWaypoints */ Double, /* geocoderElement */ GeocoderElement_) => String
    ): Self = this.set("geocoderPlaceholder", js.Any.fromFunction3(value))
    @scala.inline
    def deleteGeocoderPlaceholder: Self = this.set("geocoderPlaceholder", js.undefined)
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    @scala.inline
    def setMaxGeocoderTolerance(value: Double): Self = this.set("maxGeocoderTolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxGeocoderTolerance: Self = this.set("maxGeocoderTolerance", js.undefined)
    @scala.inline
    def setWaypointNameFallback(value: /* latLng */ LatLng_ => String): Self = this.set("waypointNameFallback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteWaypointNameFallback: Self = this.set("waypointNameFallback", js.undefined)
  }
  
}

