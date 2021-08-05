package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportingButtonsOptions extends StObject {
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Options for the export button.
    *
    * In styled mode, export button styles can be applied with the
    * `.highcharts-contextbutton` class.
    */
  var contextButton: js.UndefOr[ExportingButtonsOptionsObject] = js.undefined
}
object ExportingButtonsOptions {
  
  inline def apply(): ExportingButtonsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingButtonsOptions]
  }
  
  extension [Self <: ExportingButtonsOptions](x: Self) {
    
    inline def setContextButton(value: ExportingButtonsOptionsObject): Self = StObject.set(x, "contextButton", value.asInstanceOf[js.Any])
    
    inline def setContextButtonUndefined: Self = StObject.set(x, "contextButton", js.undefined)
  }
}
