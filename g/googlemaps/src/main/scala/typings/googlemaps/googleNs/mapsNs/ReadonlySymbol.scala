package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link Symbol} */
trait ReadonlySymbol extends js.Object {
  /** @see {@link Symbol#anchor} */
  val anchor: js.UndefOr[Point] = js.undefined
  /** @see {@link Symbol#fillColor} */
  val fillColor: js.UndefOr[String] = js.undefined
  /** @see {@link Symbol#fillOpacity} */
  val fillOpacity: js.UndefOr[Double] = js.undefined
  /** @see {@link Symbol#labelOrigin} */
  val labelOrigin: js.UndefOr[Point] = js.undefined
  /** @see {@link Symbol#path} */
  val path: SymbolPath | String
  /** @see {@link Symbol#rotation} */
  val rotation: js.UndefOr[Double] = js.undefined
  /** @see {@link Symbol#scale} */
  val scale: js.UndefOr[Double] = js.undefined
  /** @see {@link Symbol#strokeColor} */
  val strokeColor: js.UndefOr[String] = js.undefined
  /** @see {@link Symbol#strokeOpacity} */
  val strokeOpacity: js.UndefOr[Double] = js.undefined
  /** @see {@link Symbol#strokeWeight} */
  val strokeWeight: js.UndefOr[Double] = js.undefined
}

object ReadonlySymbol {
  @scala.inline
  def apply(
    path: SymbolPath | String,
    anchor: Point = null,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    labelOrigin: Point = null,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null
  ): ReadonlySymbol = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (labelOrigin != null) __obj.updateDynamic("labelOrigin")(labelOrigin)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySymbol]
  }
}

