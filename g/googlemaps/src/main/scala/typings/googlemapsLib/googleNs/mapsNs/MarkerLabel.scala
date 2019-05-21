package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerLabel extends js.Object {
  /**
    * The color of the label text.
    * @default 'black'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.color Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#color}
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font family of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontFamily Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontFamily}
    */
  var fontFamily: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font size of the label text.
    * @default '14px'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontSize Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontSize}
    */
  var fontSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The font weight of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontWeight Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontWeight}
    */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text to be displayed in the label.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.text Maps JavaScript API}
    */
  var text: java.lang.String
}

object MarkerLabel {
  @scala.inline
  def apply(
    text: java.lang.String,
    color: java.lang.String = null,
    fontFamily: java.lang.String = null,
    fontSize: java.lang.String = null,
    fontWeight: java.lang.String = null
  ): MarkerLabel = {
    val __obj = js.Dynamic.literal(text = text)
    if (color != null) __obj.updateDynamic("color")(color)
    if (fontFamily != null) __obj.updateDynamic("fontFamily")(fontFamily)
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    __obj.asInstanceOf[MarkerLabel]
  }
}

