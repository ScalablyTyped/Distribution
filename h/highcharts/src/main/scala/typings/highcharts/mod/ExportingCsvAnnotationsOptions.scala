package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingCsvAnnotationsOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The way to mark the separator
    * for annotations combined in one export-data table cell.
    */
  var itemDelimiter: js.UndefOr[String] = js.native
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When several labels are assigned
    * to a specific point, they will be displayed in one field in the table.
    */
  var join: js.UndefOr[Boolean] = js.native
}
object ExportingCsvAnnotationsOptions {
  
  @scala.inline
  def apply(): ExportingCsvAnnotationsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingCsvAnnotationsOptions]
  }
  
  @scala.inline
  implicit class ExportingCsvAnnotationsOptionsOps[Self <: ExportingCsvAnnotationsOptions] (val x: Self) extends AnyVal {
    
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
    def setItemDelimiter(value: String): Self = this.set("itemDelimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemDelimiter: Self = this.set("itemDelimiter", js.undefined)
    
    @scala.inline
    def setJoin(value: Boolean): Self = this.set("join", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJoin: Self = this.set("join", js.undefined)
  }
}
