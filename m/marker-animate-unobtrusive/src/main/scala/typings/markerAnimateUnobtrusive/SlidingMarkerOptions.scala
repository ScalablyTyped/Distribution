package typings.markerAnimateUnobtrusive

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.Marker
import typings.googlemaps.google.maps.MarkerOptions
import typings.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import typings.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlidingMarkerOptions extends MarkerOptions {
  var animateFunctionAdapter: js.UndefOr[
    js.Function4[
      /* marker */ Marker, 
      /* destPoint */ LatLng, 
      /* easing */ linear | IEasingType, 
      /* duration */ Double, 
      Unit
    ]
  ] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[IEasingType] = js.native
}

object SlidingMarkerOptions {
  @scala.inline
  def apply(): SlidingMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlidingMarkerOptions]
  }
  @scala.inline
  implicit class SlidingMarkerOptionsOps[Self <: SlidingMarkerOptions] (val x: Self) extends AnyVal {
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
    def setAnimateFunctionAdapter(
      value: (/* marker */ Marker, /* destPoint */ LatLng, /* easing */ linear | IEasingType, /* duration */ Double) => Unit
    ): Self = this.set("animateFunctionAdapter", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAnimateFunctionAdapter: Self = this.set("animateFunctionAdapter", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setEasing(value: IEasingType): Self = this.set("easing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
  
}

