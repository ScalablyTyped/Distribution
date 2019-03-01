package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerLabel extends js.Object {
  /** The color of the label text. Default color is black. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font family of the label text (equivalent to the CSS font-family
    * property).
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font size of the label text (equivalent to the CSS font-size
    * property). Default size is 14px.
    */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font weight of the label text (equivalent to the CSS font-weight
    * property).
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to be displayed in the label. Only the first character of this
    * string will be shown.
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object MarkerLabel {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontWeight: java.lang.String = null,
    text: java.lang.String = null
  ): MarkerLabel = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MarkerLabel]
  }
}

