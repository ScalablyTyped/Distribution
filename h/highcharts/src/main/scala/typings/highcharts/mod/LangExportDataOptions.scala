package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangExportDataOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The annotation column title.
    */
  var annotationHeader: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The category column title when
    * axis type set to "datetime".
    */
  var categoryDatetimeHeader: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The category column title.
    */
  var categoryHeader: js.UndefOr[String] = js.native
}
object LangExportDataOptions {
  
  @scala.inline
  def apply(): LangExportDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangExportDataOptions]
  }
  
  @scala.inline
  implicit class LangExportDataOptionsMutableBuilder[Self <: LangExportDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotationHeader(value: String): Self = StObject.set(x, "annotationHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationHeaderUndefined: Self = StObject.set(x, "annotationHeader", js.undefined)
    
    @scala.inline
    def setCategoryDatetimeHeader(value: String): Self = StObject.set(x, "categoryDatetimeHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryDatetimeHeaderUndefined: Self = StObject.set(x, "categoryDatetimeHeader", js.undefined)
    
    @scala.inline
    def setCategoryHeader(value: String): Self = StObject.set(x, "categoryHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryHeaderUndefined: Self = StObject.set(x, "categoryHeader", js.undefined)
  }
}
