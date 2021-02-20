package typings.markerAnimateUnobtrusive

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.Marker
import typings.googlemaps.google.maps.MarkerOptions
import typings.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import typings.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class SlidingMarkerOptionsMutableBuilder[Self <: SlidingMarkerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimateFunctionAdapter(
      value: (/* marker */ Marker, /* destPoint */ LatLng, /* easing */ linear | IEasingType, /* duration */ Double) => Unit
    ): Self = StObject.set(x, "animateFunctionAdapter", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAnimateFunctionAdapterUndefined: Self = StObject.set(x, "animateFunctionAdapter", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setEasing(value: IEasingType): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
