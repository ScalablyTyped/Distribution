package typings.jspdf.mod

import typings.jspdf.anon.Fontsize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableConfig extends StObject {
  
  var autoSize: js.UndefOr[Boolean] = js.undefined
  
  var cellStart: js.UndefOr[js.Function2[/* e */ TableCellData, /* doc */ jsPDF, Unit]] = js.undefined
  
  var css: js.UndefOr[Fontsize] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var headerBackgroundColor: js.UndefOr[String] = js.undefined
  
  var headerTextColor: js.UndefOr[String] = js.undefined
  
  var margins: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var printHeaders: js.UndefOr[Boolean] = js.undefined
  
  var rowStart: js.UndefOr[js.Function2[/* e */ TableRowData, /* doc */ jsPDF, Unit]] = js.undefined
}
object TableConfig {
  
  inline def apply(): TableConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableConfig] (val x: Self) extends AnyVal {
    
    inline def setAutoSize(value: Boolean): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
    
    inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
    
    inline def setCellStart(value: (/* e */ TableCellData, /* doc */ jsPDF) => Unit): Self = StObject.set(x, "cellStart", js.Any.fromFunction2(value))
    
    inline def setCellStartUndefined: Self = StObject.set(x, "cellStart", js.undefined)
    
    inline def setCss(value: Fontsize): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setHeaderBackgroundColor(value: String): Self = StObject.set(x, "headerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderBackgroundColorUndefined: Self = StObject.set(x, "headerBackgroundColor", js.undefined)
    
    inline def setHeaderTextColor(value: String): Self = StObject.set(x, "headerTextColor", value.asInstanceOf[js.Any])
    
    inline def setHeaderTextColorUndefined: Self = StObject.set(x, "headerTextColor", js.undefined)
    
    inline def setMargins(value: Double): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPrintHeaders(value: Boolean): Self = StObject.set(x, "printHeaders", value.asInstanceOf[js.Any])
    
    inline def setPrintHeadersUndefined: Self = StObject.set(x, "printHeaders", js.undefined)
    
    inline def setRowStart(value: (/* e */ TableRowData, /* doc */ jsPDF) => Unit): Self = StObject.set(x, "rowStart", js.Any.fromFunction2(value))
    
    inline def setRowStartUndefined: Self = StObject.set(x, "rowStart", js.undefined)
  }
}
