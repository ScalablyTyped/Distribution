package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingButtonsOptions extends js.Object {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
    *
    * In styled mode, export button styles can be applied with the
    * `.highcharts-contextbutton` class.
    */
  var contextButton: js.UndefOr[ExportingButtonsOptionsObject] = js.native
}
object ExportingButtonsOptions {
  
  @scala.inline
  def apply(): ExportingButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingButtonsOptions]
  }
  
  @scala.inline
  implicit class ExportingButtonsOptionsOps[Self <: ExportingButtonsOptions] (val x: Self) extends AnyVal {
    
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
    def setContextButton(value: ExportingButtonsOptionsObject): Self = this.set("contextButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextButton: Self = this.set("contextButton", js.undefined)
  }
}
