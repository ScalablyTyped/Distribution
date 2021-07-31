package typings.jsCaptcha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FillStyle extends StObject {
    
    var fillStyle: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textBaseline: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object FillStyle {
    
    @scala.inline
    def apply(): FillStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillStyle]
    }
    
    @scala.inline
    implicit class FillStyleMutableBuilder[Self <: FillStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillStyle(value: String): Self = StObject.set(x, "fillStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillStyleUndefined: Self = StObject.set(x, "fillStyle", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextBaseline(value: String): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
