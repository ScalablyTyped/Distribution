package typings.jsbarcode

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The Browser version of the library's functionality, which makes use of an HTMLCanvasElement, HTMLImageElement or SVGElement
    * for rendering.
    * @param svg ID string or HTML element of the target to render within.
    * @param barcodeText Text to be rendered.
    * @param barcodeOptions Options used for rendering.
    */
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: String, barcodeText: String): Unit = js.native
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: String, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: HTMLCanvasElement, barcodeText: String): Unit = js.native
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: HTMLCanvasElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: HTMLImageElement, barcodeText: String): Unit = js.native
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: HTMLImageElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: SVGElement, barcodeText: String): Unit = js.native
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  def apply(svg: SVGElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = js.native
  
  @JSImport("jsbarcode", "getModule")
  @js.native
  def getModule(name: String): js.Function0[Unit] = js.native
  
  @js.native
  trait JsBarcodeOptions extends StObject {
    
    var background: js.UndefOr[String] = js.native
    
    var displayValue: js.UndefOr[Boolean] = js.native
    
    var flat: js.UndefOr[Boolean] = js.native
    
    var font: js.UndefOr[String] = js.native
    
    var fontOptions: js.UndefOr[String] = js.native
    
    var fontSize: js.UndefOr[Double] = js.native
    
    var format: String = js.native
    
    var height: js.UndefOr[Double] = js.native
    
    var lineColor: js.UndefOr[String] = js.native
    
    var margin: js.UndefOr[Double] = js.native
    
    var marginBottom: js.UndefOr[Double] = js.native
    
    var marginLeft: js.UndefOr[Double] = js.native
    
    var marginRight: js.UndefOr[Double] = js.native
    
    var marginTop: js.UndefOr[Double] = js.native
    
    var text: js.UndefOr[String] = js.native
    
    var textAlign: js.UndefOr[String] = js.native
    
    var textMargin: js.UndefOr[Double] = js.native
    
    var textPosition: js.UndefOr[String] = js.native
    
    var valid: js.UndefOr[js.Function1[/* valid */ Boolean, Unit]] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object JsBarcodeOptions {
    
    @scala.inline
    def apply(format: String): JsBarcodeOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsBarcodeOptions]
    }
    
    @scala.inline
    implicit class JsBarcodeOptionsMutableBuilder[Self <: JsBarcodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setDisplayValue(value: Boolean): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      @scala.inline
      def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontOptions(value: String): Self = StObject.set(x, "fontOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontOptionsUndefined: Self = StObject.set(x, "fontOptions", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      @scala.inline
      def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      @scala.inline
      def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      @scala.inline
      def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      @scala.inline
      def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextMargin(value: Double): Self = StObject.set(x, "textMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextMarginUndefined: Self = StObject.set(x, "textMargin", js.undefined)
      
      @scala.inline
      def setTextPosition(value: String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setValid(value: /* valid */ Boolean => Unit): Self = StObject.set(x, "valid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
