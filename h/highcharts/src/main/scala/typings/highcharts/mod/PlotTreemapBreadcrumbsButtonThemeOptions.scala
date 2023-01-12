package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapBreadcrumbsButtonThemeOptions extends StObject {
  
  var style: js.UndefOr[PlotTreemapBreadcrumbsButtonThemeStyleOptions] = js.undefined
}
object PlotTreemapBreadcrumbsButtonThemeOptions {
  
  inline def apply(): PlotTreemapBreadcrumbsButtonThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapBreadcrumbsButtonThemeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreemapBreadcrumbsButtonThemeOptions] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: PlotTreemapBreadcrumbsButtonThemeStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
