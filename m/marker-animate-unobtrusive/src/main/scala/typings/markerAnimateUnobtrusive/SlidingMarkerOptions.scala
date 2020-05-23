package typings.markerAnimateUnobtrusive

import typings.googlemaps.google.maps.Animation
import typings.googlemaps.google.maps.Icon
import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngLiteral
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.googlemaps.google.maps.MarkerLabel
import typings.googlemaps.google.maps.MarkerOptions
import typings.googlemaps.google.maps.MarkerShape
import typings.googlemaps.google.maps.Point
import typings.googlemaps.google.maps.StreetViewPanorama
import typings.googlemaps.google.maps.Symbol
import typings.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import typings.markerAnimateUnobtrusive.markerAnimateUnobtrusiveStrings.linear
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlidingMarkerOptions extends MarkerOptions {
  var animateFunctionAdapter: js.UndefOr[
    js.Function4[
      /* marker */ Marker, 
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
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animateFunctionAdapter: (/* marker */ Marker, /* destPoint */ LatLng, /* easing */ linear | IEasingType, /* duration */ Double) => Unit = null,
    animation: Animation = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    crossOnDrag: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easing: IEasingType = null,
    icon: String | Icon | Symbol = null,
    label: String | MarkerLabel = null,
    map: Map[Element] | StreetViewPanorama = null,
    opacity: js.UndefOr[Double] = js.undefined,
    optimized: js.UndefOr[Boolean] = js.undefined,
    position: LatLng | LatLngLiteral = null,
    shape: MarkerShape = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): SlidingMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (animateFunctionAdapter != null) __obj.updateDynamic("animateFunctionAdapter")(js.Any.fromFunction4(animateFunctionAdapter))
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(crossOnDrag)) __obj.updateDynamic("crossOnDrag")(crossOnDrag.get.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlidingMarkerOptions]
  }
}

