package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangExportDataOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The annotation column title.
    */
  var annotationHeader: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The category column title when
    * axis type set to "datetime".
    */
  var categoryDatetimeHeader: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The category column title.
    */
  var categoryHeader: js.UndefOr[String] = js.undefined
}
object LangExportDataOptions {
  
  inline def apply(): LangExportDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangExportDataOptions]
  }
  
  extension [Self <: LangExportDataOptions](x: Self) {
    
    inline def setAnnotationHeader(value: String): Self = StObject.set(x, "annotationHeader", value.asInstanceOf[js.Any])
    
    inline def setAnnotationHeaderUndefined: Self = StObject.set(x, "annotationHeader", js.undefined)
    
    inline def setCategoryDatetimeHeader(value: String): Self = StObject.set(x, "categoryDatetimeHeader", value.asInstanceOf[js.Any])
    
    inline def setCategoryDatetimeHeaderUndefined: Self = StObject.set(x, "categoryDatetimeHeader", js.undefined)
    
    inline def setCategoryHeader(value: String): Self = StObject.set(x, "categoryHeader", value.asInstanceOf[js.Any])
    
    inline def setCategoryHeaderUndefined: Self = StObject.set(x, "categoryHeader", js.undefined)
  }
}
