package typings.markerAnimateUnobtrusive

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.MarkerOptions
import typings.googleMaps.google.maps.Marker_
import typings.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import typings.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlidingMarkerOptions
  extends StObject
     with MarkerOptions {
  
  var animateFunctionAdapter: js.UndefOr[
    js.Function4[
      /* marker */ Marker_, 
      /* destPoint */ LatLng, 
      /* easing */ linear | IEasingType, 
      /* duration */ Double, 
      Unit
    ]
  ] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var easing: js.UndefOr[IEasingType] = js.undefined
}
object SlidingMarkerOptions {
  
  inline def apply(): SlidingMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlidingMarkerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlidingMarkerOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimateFunctionAdapter(
      value: (/* marker */ Marker_, /* destPoint */ LatLng, /* easing */ linear | IEasingType, /* duration */ Double) => Unit
    ): Self = StObject.set(x, "animateFunctionAdapter", js.Any.fromFunction4(value))
    
    inline def setAnimateFunctionAdapterUndefined: Self = StObject.set(x, "animateFunctionAdapter", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setEasing(value: IEasingType): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
    
    inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
  }
}
