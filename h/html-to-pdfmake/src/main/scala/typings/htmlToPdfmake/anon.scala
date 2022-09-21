package typings.htmlToPdfmake

import typings.jsdom.mod.DOMWindow
import typings.pdfmake.interfacesMod.StyleDictionary
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<{  defaultStyles :pdfmake.pdfmake/interfaces.StyleDictionary,   fontSizes :[number, number, number, number, number, number, number], replaceText (text : string, nodes : std.Array<std.HTMLElement>): string,   tableAutoSize :boolean,   window :jsdom.jsdom.DOMWindow}> */
  trait PartialdefaultStylesStyle extends StObject {
    
    var defaultStyles: js.UndefOr[StyleDictionary] = js.undefined
    
    var fontSizes: js.UndefOr[js.Tuple7[Double, Double, Double, Double, Double, Double, Double]] = js.undefined
    
    var replaceText: js.UndefOr[js.Function2[/* text */ String, /* nodes */ js.Array[HTMLElement], String]] = js.undefined
    
    var tableAutoSize: js.UndefOr[Boolean] = js.undefined
    
    var window: js.UndefOr[DOMWindow] = js.undefined
  }
  object PartialdefaultStylesStyle {
    
    inline def apply(): PartialdefaultStylesStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialdefaultStylesStyle]
    }
    
    extension [Self <: PartialdefaultStylesStyle](x: Self) {
      
      inline def setDefaultStyles(value: StyleDictionary): Self = StObject.set(x, "defaultStyles", value.asInstanceOf[js.Any])
      
      inline def setDefaultStylesUndefined: Self = StObject.set(x, "defaultStyles", js.undefined)
      
      inline def setFontSizes(value: js.Tuple7[Double, Double, Double, Double, Double, Double, Double]): Self = StObject.set(x, "fontSizes", value.asInstanceOf[js.Any])
      
      inline def setFontSizesUndefined: Self = StObject.set(x, "fontSizes", js.undefined)
      
      inline def setReplaceText(value: (/* text */ String, /* nodes */ js.Array[HTMLElement]) => String): Self = StObject.set(x, "replaceText", js.Any.fromFunction2(value))
      
      inline def setReplaceTextUndefined: Self = StObject.set(x, "replaceText", js.undefined)
      
      inline def setTableAutoSize(value: Boolean): Self = StObject.set(x, "tableAutoSize", value.asInstanceOf[js.Any])
      
      inline def setTableAutoSizeUndefined: Self = StObject.set(x, "tableAutoSize", js.undefined)
      
      inline def setWindow(value: DOMWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
