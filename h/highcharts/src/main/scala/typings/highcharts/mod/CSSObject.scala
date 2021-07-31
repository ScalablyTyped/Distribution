package typings.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import typings.highcharts.highchartsStrings.contrast
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSObject
  extends StObject
     with /* key */ StringDictionary[js.UndefOr[Boolean | Double | String]] {
  
  /**
    * Background style for the element.
    */
  var background: js.UndefOr[String] = js.undefined
  
  /**
    * Background color of the element.
    */
  var backgroundColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * Border style for the element.
    */
  var border: js.UndefOr[String] = js.undefined
  
  /**
    * Radius of the element border.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * Color used in the element. The 'contrast' option is a Highcharts custom
    * property that results in black or white, depending on the background of
    * the element.
    */
  var color: js.UndefOr[contrast | ColorString] = js.undefined
  
  /**
    * Style of the mouse cursor when resting over the element.
    */
  var cursor: js.UndefOr[CursorValue] = js.undefined
  
  /**
    * Font family of the element text. Multiple values have to be in decreasing
    * preference order and separated by comma.
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Font size of the element text.
    */
  var fontSize: js.UndefOr[String] = js.undefined
  
  /**
    * Font weight of the element text.
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * Height of the element.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Width of the element border.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Opacity of the element.
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Space around the element content.
    */
  var padding: js.UndefOr[String] = js.undefined
  
  /**
    * Behaviour of the element when the mouse cursor rests over it.
    */
  var pointerEvents: js.UndefOr[String] = js.undefined
  
  /**
    * Positioning of the element.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * Alignment of the element text.
    */
  var textAlign: js.UndefOr[String] = js.undefined
  
  /**
    * Additional decoration of the element text.
    */
  var textDecoration: js.UndefOr[String] = js.undefined
  
  /**
    * Outline style of the element text.
    */
  var textOutline: js.UndefOr[String] = js.undefined
  
  /**
    * Line break style of the element text. Highcharts SVG elements support
    * `ellipsis` when a `width` is set.
    */
  var textOverflow: js.UndefOr[String] = js.undefined
  
  /**
    * Top spacing of the element relative to the parent element.
    */
  var top: js.UndefOr[String] = js.undefined
  
  /**
    * Animated transition of selected element properties.
    */
  var transition: js.UndefOr[String] = js.undefined
  
  /**
    * Line break style of the element text.
    */
  var whiteSpace: js.UndefOr[String] = js.undefined
  
  /**
    * Width of the element.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object CSSObject {
  
  @scala.inline
  def apply(): CSSObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSObject]
  }
  
  @scala.inline
  implicit class CSSObjectMutableBuilder[Self <: CSSObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: ColorString): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: contrast | ColorString): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCursor(value: CursorValue): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPointerEvents(value: String): Self = StObject.set(x, "pointerEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointerEventsUndefined: Self = StObject.set(x, "pointerEvents", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setTextOutline(value: String): Self = StObject.set(x, "textOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOutlineUndefined: Self = StObject.set(x, "textOutline", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    
    @scala.inline
    def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
    
    @scala.inline
    def setWhiteSpace(value: String): Self = StObject.set(x, "whiteSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteSpaceUndefined: Self = StObject.set(x, "whiteSpace", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
