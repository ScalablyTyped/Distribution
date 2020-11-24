package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.highchartsStrings.contrast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSObject
  extends /* key */ StringDictionary[js.UndefOr[Boolean | Double | String]] {
  
  /**
    * Background style for the element.
    */
  var background: js.UndefOr[String] = js.native
  
  /**
    * Background color of the element.
    */
  var backgroundColor: js.UndefOr[ColorString] = js.native
  
  /**
    * Border style for the element.
    */
  var border: js.UndefOr[String] = js.native
  
  /**
    * Radius of the element border.
    */
  var borderRadius: js.UndefOr[Double] = js.native
  
  /**
    * Color used in the element. The 'contrast' option is a Highcharts custom
    * property that results in black or white, depending on the background of
    * the element.
    */
  var color: js.UndefOr[contrast | ColorString] = js.native
  
  /**
    * Style of the mouse cursor when resting over the element.
    */
  var cursor: js.UndefOr[CursorValue] = js.native
  
  /**
    * Font family of the element text. Multiple values have to be in decreasing
    * preference order and separated by comma.
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * Font size of the element text.
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * Font weight of the element text.
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /**
    * Height of the element.
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Width of the element border.
    */
  var lineWidth: js.UndefOr[Double] = js.native
  
  /**
    * Opacity of the element.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * Space around the element content.
    */
  var padding: js.UndefOr[String] = js.native
  
  /**
    * Behaviour of the element when the mouse cursor rests over it.
    */
  var pointerEvents: js.UndefOr[String] = js.native
  
  /**
    * Positioning of the element.
    */
  var position: js.UndefOr[String] = js.native
  
  /**
    * Alignment of the element text.
    */
  var textAlign: js.UndefOr[String] = js.native
  
  /**
    * Additional decoration of the element text.
    */
  var textDecoration: js.UndefOr[String] = js.native
  
  /**
    * Outline style of the element text.
    */
  var textOutline: js.UndefOr[String] = js.native
  
  /**
    * Line break style of the element text. Highcharts SVG elements support
    * `ellipsis` when a `width` is set.
    */
  var textOverflow: js.UndefOr[String] = js.native
  
  /**
    * Top spacing of the element relative to the parent element.
    */
  var top: js.UndefOr[String] = js.native
  
  /**
    * Animated transition of selected element properties.
    */
  var transition: js.UndefOr[String] = js.native
  
  /**
    * Line break style of the element text.
    */
  var whiteSpace: js.UndefOr[String] = js.native
  
  /**
    * Width of the element.
    */
  var width: js.UndefOr[Double] = js.native
}
object CSSObject {
  
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
  
  @scala.inline
  implicit class CSSObjectOps[Self <: CSSObject] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: ColorString): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorder(value: String): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setBorderRadius(value: Double): Self = this.set("borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderRadius: Self = this.set("borderRadius", js.undefined)
    
    @scala.inline
    def setColor(value: contrast | ColorString): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setCursor(value: CursorValue): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
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
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = this.set("lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWidth: Self = this.set("lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: String): Self = this.set("pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointerEvents: Self = this.set("pointerEvents", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextOutline(value: String): Self = this.set("textOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOutline: Self = this.set("textOutline", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: String): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setWhiteSpace(value: String): Self = this.set("whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhiteSpace: Self = this.set("whiteSpace", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
