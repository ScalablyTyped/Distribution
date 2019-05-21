package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyMarkerOptions extends js.Object {
  /** @see {@link MarkerOptions#anchorPoint} */
  val anchorPoint: js.UndefOr[Point] = js.undefined
  /** @see {@link MarkerOptions#animation} */
  val animation: js.UndefOr[Animation] = js.undefined
  /** @see {@link MarkerOptions#clickable} */
  val clickable: js.UndefOr[scala.Boolean] = js.undefined
  /** @see {@link MarkerOptions#crossOnDrag} */
  val crossOnDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** @see {@link MarkerOptions#cursor} */
  val cursor: js.UndefOr[java.lang.String] = js.undefined
  /** @see {@link MarkerOptions#draggable} */
  val draggable: js.UndefOr[scala.Boolean] = js.undefined
  /** @see {@link MarkerOptions#icon} */
  val icon: js.UndefOr[java.lang.String | ReadonlyIcon | ReadonlySymbol] = js.undefined
  /** @see {@link MarkerOptions#label} */
  val label: js.UndefOr[java.lang.String | ReadonlyMarkerLabel] = js.undefined
  /** @see {@link MarkerOptions#map} */
  val map: js.UndefOr[Map | StreetViewPanorama] = js.undefined
  /** @see {@link MarkerOptions#opacity} */
  val opacity: js.UndefOr[scala.Double] = js.undefined
  /** @see {@link MarkerOptions#optimized} */
  val optimized: js.UndefOr[scala.Boolean] = js.undefined
  /** @see {@link MarkerOptions#place} */
  val place: js.UndefOr[Place] = js.undefined
  /** @see {@link MarkerOptions#position} */
  val position: js.UndefOr[LatLng | ReadonlyLatLngLiteral] = js.undefined
  /** @see {@link MarkerOptions#shape} */
  val shape: js.UndefOr[MarkerShape] = js.undefined
  /** @see {@link MarkerOptions#title} */
  val title: js.UndefOr[java.lang.String] = js.undefined
  /** @see {@link MarkerOptions#visible} */
  val visible: js.UndefOr[scala.Boolean] = js.undefined
  /** @see {@link MarkerOptions#zIndex} */
  val zIndex: js.UndefOr[scala.Double] = js.undefined
}

object ReadonlyMarkerOptions {
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animation: Animation = null,
    clickable: js.UndefOr[scala.Boolean] = js.undefined,
    crossOnDrag: js.UndefOr[scala.Boolean] = js.undefined,
    cursor: java.lang.String = null,
    draggable: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String | ReadonlyIcon | ReadonlySymbol = null,
    label: java.lang.String | ReadonlyMarkerLabel = null,
    map: Map | StreetViewPanorama = null,
    opacity: scala.Int | scala.Double = null,
    optimized: js.UndefOr[scala.Boolean] = js.undefined,
    place: Place = null,
    position: LatLng | ReadonlyLatLngLiteral = null,
    shape: MarkerShape = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    zIndex: scala.Int | scala.Double = null
  ): ReadonlyMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(crossOnDrag)) __obj.updateDynamic("crossOnDrag")(crossOnDrag)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized)
    if (place != null) __obj.updateDynamic("place")(place)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMarkerOptions]
  }
}

