package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link MarkerLabel} */
trait ReadonlyMarkerLabel extends js.Object {
  /** @see {@link MarkerLabel#color} */
  var color: js.UndefOr[String] = js.undefined
  /** @see {@link MarkerLabel#fontFamily} */
  var fontFamily: js.UndefOr[String] = js.undefined
  /** @see {@link MarkerLabel#fontSize} */
  var fontSize: js.UndefOr[String] = js.undefined
  /** @see {@link MarkerLabel#fontWeight} */
  var fontWeight: js.UndefOr[String] = js.undefined
  /** @see {@link MarkerLabel#text} */
  var text: String
}

object ReadonlyMarkerLabel {
  @scala.inline
  def apply(
    text: String,
    color: String = null,
    fontFamily: String = null,
    fontSize: String = null,
    fontWeight: String = null
  ): ReadonlyMarkerLabel = {
    val __obj = js.Dynamic.literal(text = text)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.asInstanceOf[ReadonlyMarkerLabel]
  }
}

