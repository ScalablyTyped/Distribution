package typings
package markerDashAnimateDashUnobtrusiveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidingMarkerOptions
  extends googlemapsLib.googleNs.mapsNs.MarkerOptions {
  var animateFunctionAdapter: js.UndefOr[
    js.Function4[
      /* marker */ googlemapsLib.googleNs.mapsNs.Marker, 
      /* destPoint */ googlemapsLib.googleNs.mapsNs.LatLng, 
      /* easing */ markerDashAnimateDashUnobtrusiveLib.markerDashAnimateDashUnobtrusiveLibStrings.linear | markerDashAnimateDashUnobtrusiveLib.jQueryNs.easingNs.IEasingType, 
      /* duration */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easing: js.UndefOr[markerDashAnimateDashUnobtrusiveLib.jQueryNs.easingNs.IEasingType] = js.undefined
}

