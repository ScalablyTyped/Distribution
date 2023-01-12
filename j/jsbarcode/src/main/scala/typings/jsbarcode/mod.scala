package typings.jsbarcode

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The Browser version of the library's functionality, which makes use of an HTMLCanvasElement, HTMLImageElement or SVGElement
    * for rendering.
    * @param svg ID string or HTML element of the target to render within.
    * @param barcodeText Text to be rendered.
    * @param barcodeOptions Options used for rendering.
    */
  inline def apply(svg: String, barcodeText: String): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(svg: String, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any], barcodeOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(svg: HTMLCanvasElement, barcodeText: String): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(svg: HTMLCanvasElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any], barcodeOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(svg: HTMLImageElement, barcodeText: String): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(svg: HTMLImageElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any], barcodeOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(svg: SVGElement, barcodeText: String): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(svg: SVGElement, barcodeText: String, barcodeOptions: JsBarcodeOptions): Unit = (^.asInstanceOf[js.Dynamic].apply(svg.asInstanceOf[js.Any], barcodeText.asInstanceOf[js.Any], barcodeOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("jsbarcode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getModule(name: String): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getModule")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  trait JsBarcodeOptions extends StObject {
    
    var background: js.UndefOr[String] = js.undefined
    
    var displayValue: js.UndefOr[Boolean] = js.undefined
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontOptions: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var format: String
    
    var height: js.UndefOr[Double] = js.undefined
    
    var lineColor: js.UndefOr[String] = js.undefined
    
    var margin: js.UndefOr[Double] = js.undefined
    
    var marginBottom: js.UndefOr[Double] = js.undefined
    
    var marginLeft: js.UndefOr[Double] = js.undefined
    
    var marginRight: js.UndefOr[Double] = js.undefined
    
    var marginTop: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var textMargin: js.UndefOr[Double] = js.undefined
    
    var textPosition: js.UndefOr[String] = js.undefined
    
    var valid: js.UndefOr[js.Function1[/* valid */ Boolean, Unit]] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object JsBarcodeOptions {
    
    inline def apply(format: String): JsBarcodeOptions = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsBarcodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JsBarcodeOptions] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setDisplayValue(value: Boolean): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontOptions(value: String): Self = StObject.set(x, "fontOptions", value.asInstanceOf[js.Any])
      
      inline def setFontOptionsUndefined: Self = StObject.set(x, "fontOptions", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
      
      inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextMargin(value: Double): Self = StObject.set(x, "textMargin", value.asInstanceOf[js.Any])
      
      inline def setTextMarginUndefined: Self = StObject.set(x, "textMargin", js.undefined)
      
      inline def setTextPosition(value: String): Self = StObject.set(x, "textPosition", value.asInstanceOf[js.Any])
      
      inline def setTextPositionUndefined: Self = StObject.set(x, "textPosition", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setValid(value: /* valid */ Boolean => Unit): Self = StObject.set(x, "valid", js.Any.fromFunction1(value))
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
