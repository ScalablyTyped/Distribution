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

object SlidingMarkerOptions {
  @scala.inline
  def apply(
    position: googlemapsLib.googleNs.mapsNs.LatLng | googlemapsLib.googleNs.mapsNs.LatLngLiteral,
    anchorPoint: googlemapsLib.googleNs.mapsNs.Point = null,
    animateFunctionAdapter: js.Function4[
      /* marker */ googlemapsLib.googleNs.mapsNs.Marker, 
      /* destPoint */ googlemapsLib.googleNs.mapsNs.LatLng, 
      /* easing */ markerDashAnimateDashUnobtrusiveLib.markerDashAnimateDashUnobtrusiveLibStrings.linear | markerDashAnimateDashUnobtrusiveLib.jQueryNs.easingNs.IEasingType, 
      /* duration */ scala.Double, 
      scala.Unit
    ] = null,
    animation: googlemapsLib.googleNs.mapsNs.Animation = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    cursor: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easing: markerDashAnimateDashUnobtrusiveLib.jQueryNs.easingNs.IEasingType = null,
    icon: java.lang.String | googlemapsLib.googleNs.mapsNs.Icon | googlemapsLib.googleNs.mapsNs.Symbol = null,
    label: java.lang.String | googlemapsLib.googleNs.mapsNs.MarkerLabel = null,
    map: googlemapsLib.googleNs.mapsNs.Map | googlemapsLib.googleNs.mapsNs.StreetViewPanorama = null,
    opacity: scala.Int | scala.Double = null,
    optimized: js.UndefOr[scala.Boolean] = js.undefined,
    place: googlemapsLib.googleNs.mapsNs.Place = null,
    shape: googlemapsLib.googleNs.mapsNs.MarkerShape = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): SlidingMarkerOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint)
    if (animateFunctionAdapter != null) __obj.updateDynamic("animateFunctionAdapter")(animateFunctionAdapter)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized)
    if (place != null) __obj.updateDynamic("place")(place)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingMarkerOptions]
  }
}

