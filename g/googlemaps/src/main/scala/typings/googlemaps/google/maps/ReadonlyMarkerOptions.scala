package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link MarkerOptions} */
trait ReadonlyMarkerOptions extends js.Object {
  /** @see {@link MarkerOptions#anchorPoint} */
  val anchorPoint: js.UndefOr[Point] = js.undefined
  /** @see {@link MarkerOptions#animation} */
  val animation: js.UndefOr[Animation] = js.undefined
  /** @see {@link MarkerOptions#clickable} */
  val clickable: js.UndefOr[Boolean] = js.undefined
  /** @see {@link MarkerOptions#crossOnDrag} */
  val crossOnDrag: js.UndefOr[Boolean] = js.undefined
  /** @see {@link MarkerOptions#cursor} */
  val cursor: js.UndefOr[String] = js.undefined
  /** @see {@link MarkerOptions#draggable} */
  val draggable: js.UndefOr[Boolean] = js.undefined
  /** @see {@link MarkerOptions#icon} */
  val icon: js.UndefOr[String | ReadonlyIcon | ReadonlySymbol] = js.undefined
  /** @see {@link MarkerOptions#label} */
  val label: js.UndefOr[String | ReadonlyMarkerLabel] = js.undefined
  /** @see {@link MarkerOptions#map} */
  val map: js.UndefOr[Map | StreetViewPanorama] = js.undefined
  /** @see {@link MarkerOptions#opacity} */
  val opacity: js.UndefOr[Double] = js.undefined
  /** @see {@link MarkerOptions#optimized} */
  val optimized: js.UndefOr[Boolean] = js.undefined
  /** @see {@link MarkerOptions#place} */
  val place: js.UndefOr[Place] = js.undefined
  /** @see {@link MarkerOptions#position} */
  val position: js.UndefOr[LatLng | ReadonlyLatLngLiteral] = js.undefined
  /** @see {@link MarkerOptions#shape} */
  val shape: js.UndefOr[MarkerShape] = js.undefined
  /** @see {@link MarkerOptions#title} */
  val title: js.UndefOr[String] = js.undefined
  /** @see {@link MarkerOptions#visible} */
  val visible: js.UndefOr[Boolean] = js.undefined
  /** @see {@link MarkerOptions#zIndex} */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object ReadonlyMarkerOptions {
  @scala.inline
  def apply(
    anchorPoint: Point = null,
    animation: Animation = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    crossOnDrag: js.UndefOr[Boolean] = js.undefined,
    cursor: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    icon: String | ReadonlyIcon | ReadonlySymbol = null,
    label: String | ReadonlyMarkerLabel = null,
    map: Map | StreetViewPanorama = null,
    opacity: Int | Double = null,
    optimized: js.UndefOr[Boolean] = js.undefined,
    place: Place = null,
    position: LatLng | ReadonlyLatLngLiteral = null,
    shape: MarkerShape = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): ReadonlyMarkerOptions = {
    val __obj = js.Dynamic.literal()
    if (anchorPoint != null) __obj.updateDynamic("anchorPoint")(anchorPoint.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (!js.isUndefined(crossOnDrag)) __obj.updateDynamic("crossOnDrag")(crossOnDrag.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (!js.isUndefined(optimized)) __obj.updateDynamic("optimized")(optimized.asInstanceOf[js.Any])
    if (place != null) __obj.updateDynamic("place")(place.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMarkerOptions]
  }
}

