package typings.googlemaps.google.maps

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
    fillOpacity: js.UndefOr[Double] = js.undefined,
    labelOrigin: Point = null,
    rotation: js.UndefOr[Double] = js.undefined,
    scale: js.UndefOr[Double] = js.undefined,
    strokeColor: String = null,
    strokeOpacity: js.UndefOr[Double] = js.undefined,
    strokeWeight: js.UndefOr[Double] = js.undefined
  ): ReadonlySymbol = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor.asInstanceOf[js.Any])
    if (!js.isUndefined(fillOpacity)) __obj.updateDynamic("fillOpacity")(fillOpacity.get.asInstanceOf[js.Any])
    if (labelOrigin != null) __obj.updateDynamic("labelOrigin")(labelOrigin.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeOpacity)) __obj.updateDynamic("strokeOpacity")(strokeOpacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWeight)) __obj.updateDynamic("strokeWeight")(strokeWeight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlySymbol]
  }
}

