package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These options specify the appearance of a marker label. A marker label is a
  * single character of text which will appear inside the marker. If you are
  * using it with a custom marker, you can reposition it with the
  * {@link Icon#labelOrigin labelOrigin} property in the {@link Icon} class.
  * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel Maps JavaScript API}
  */
trait MarkerLabel extends StObject {
  
  /**
    * The color of the label text.
    * @default 'black'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.color Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#color}
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * The font family of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontFamily Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontFamily}
    */
  var fontFamily: js.UndefOr[String] = js.undefined
  
  /**
    * The font size of the label text.
    * @default '14px'
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontSize Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontSize}
    */
  var fontSize: js.UndefOr[String] = js.undefined
  
  /**
    * The font weight of the label text.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.fontWeight Maps JavaScript API}
    * @see {@link CSSStyleDeclaration#fontWeight}
    */
  var fontWeight: js.UndefOr[String] = js.undefined
  
  /**
    * The text to be displayed in the label.
    * @see {@link https://developers.google.com/maps/documentation/javascript/reference/marker#MarkerLabel.text Maps JavaScript API}
    */
  var text: String
}
object MarkerLabel {
  
  @scala.inline
  def apply(text: String): MarkerLabel = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerLabel]
  }
  
  @scala.inline
  implicit class MarkerLabelMutableBuilder[Self <: MarkerLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
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
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
