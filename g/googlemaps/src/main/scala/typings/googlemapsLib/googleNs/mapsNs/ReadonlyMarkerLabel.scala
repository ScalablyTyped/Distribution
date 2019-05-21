package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyMarkerLabel extends js.Object {
  /** @see {@link MarkerLabel#color} */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** @see {@link MarkerLabel#fontFamily} */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /** @see {@link MarkerLabel#fontSize} */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /** @see {@link MarkerLabel#fontWeight} */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /** @see {@link MarkerLabel#text} */
  var text: java.lang.String
}

object ReadonlyMarkerLabel {
  @scala.inline
  def apply(
    text: java.lang.String,
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontWeight: java.lang.String = null
  ): ReadonlyMarkerLabel = {
    val __obj = js.Dynamic.literal(text = text)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.asInstanceOf[ReadonlyMarkerLabel]
  }
}

