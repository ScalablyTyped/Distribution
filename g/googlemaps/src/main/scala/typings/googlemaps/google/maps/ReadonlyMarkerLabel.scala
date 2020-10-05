package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @see {@link MarkerLabel} */
@js.native
trait ReadonlyMarkerLabel extends js.Object {
  /** @see {@link MarkerLabel#color} */
  var color: js.UndefOr[String] = js.native
  /** @see {@link MarkerLabel#fontFamily} */
  var fontFamily: js.UndefOr[String] = js.native
  /** @see {@link MarkerLabel#fontSize} */
  var fontSize: js.UndefOr[String] = js.native
  /** @see {@link MarkerLabel#fontWeight} */
  var fontWeight: js.UndefOr[String] = js.native
  /** @see {@link MarkerLabel#text} */
  var text: String = js.native
}

object ReadonlyMarkerLabel {
  @scala.inline
  def apply(text: String): ReadonlyMarkerLabel = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMarkerLabel]
  }
  @scala.inline
  implicit class ReadonlyMarkerLabelOps[Self <: ReadonlyMarkerLabel] (val x: Self) extends AnyVal {
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

