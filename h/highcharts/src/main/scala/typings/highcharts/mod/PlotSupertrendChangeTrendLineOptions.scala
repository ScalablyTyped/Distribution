package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSupertrendChangeTrendLineOptions extends StObject {
  
  var styles: js.UndefOr[PlotSupertrendChangeTrendLineStylesOptions] = js.undefined
}
object PlotSupertrendChangeTrendLineOptions {
  
  @scala.inline
  def apply(): PlotSupertrendChangeTrendLineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSupertrendChangeTrendLineOptions]
  }
  
  @scala.inline
  implicit class PlotSupertrendChangeTrendLineOptionsMutableBuilder[Self <: PlotSupertrendChangeTrendLineOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyles(value: PlotSupertrendChangeTrendLineStylesOptions): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
  }
}
