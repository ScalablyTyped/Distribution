package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * These options specify the appearance of a marker label. A marker label is a
  * single character of text which will appear inside the marker. If you are
  * using it with a custom marker, you can reposition it with the
  * {@link Icon#labelOrigin labelOrigin} property in the {@link Icon} class.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel Maps JavaScript API}
  */
@js.native
trait MarkerLabel extends js.Object {
  /**
    * The color of the label text.
    * @default 'black'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.color Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#color}
    */
  var color: js.UndefOr[String] = js.native
  /**
    * The font family of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontFamily Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontFamily}
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The font size of the label text.
    * @default '14px'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontSize Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontSize}
    */
  var fontSize: js.UndefOr[String] = js.native
  /**
    * The font weight of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontWeight Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontWeight}
    */
  var fontWeight: js.UndefOr[String] = js.native
  /**
    * The text to be displayed in the label.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.text Maps JavaScript API}
    */
  var text: String = js.native
}

object MarkerLabel {
  @scala.inline
  def apply(text: String): MarkerLabel = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLabel]
  }
  @scala.inline
  implicit class MarkerLabelOps[Self <: MarkerLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
  }
  
}

