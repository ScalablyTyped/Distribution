package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LangExportDataOptions extends js.Object {
  
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
  implicit class LangExportDataOptionsOps[Self <: LangExportDataOptions] (val x: Self) extends AnyVal {
    
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
    def setAnnotationHeader(value: String): Self = this.set("annotationHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationHeader: Self = this.set("annotationHeader", js.undefined)
    
    @scala.inline
    def setCategoryDatetimeHeader(value: String): Self = this.set("categoryDatetimeHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryDatetimeHeader: Self = this.set("categoryDatetimeHeader", js.undefined)
    
    @scala.inline
    def setCategoryHeader(value: String): Self = this.set("categoryHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryHeader: Self = this.set("categoryHeader", js.undefined)
  }
}
