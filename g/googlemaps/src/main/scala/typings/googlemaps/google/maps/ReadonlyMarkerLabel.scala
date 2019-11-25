package typings.googlemaps.google.maps

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
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMarkerLabel]
  }
}

