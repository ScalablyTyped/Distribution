package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSunburstBreadcrumbsButtonThemeOptions extends StObject {
  
  var style: js.UndefOr[PlotSunburstBreadcrumbsButtonThemeStyleOptions] = js.undefined
}
object PlotSunburstBreadcrumbsButtonThemeOptions {
  
  inline def apply(): PlotSunburstBreadcrumbsButtonThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstBreadcrumbsButtonThemeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotSunburstBreadcrumbsButtonThemeOptions] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: PlotSunburstBreadcrumbsButtonThemeStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
