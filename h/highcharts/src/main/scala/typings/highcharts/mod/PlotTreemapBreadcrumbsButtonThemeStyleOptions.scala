package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapBreadcrumbsButtonThemeStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object PlotTreemapBreadcrumbsButtonThemeStyleOptions {
  
  inline def apply(): PlotTreemapBreadcrumbsButtonThemeStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapBreadcrumbsButtonThemeStyleOptions]
  }
  
  extension [Self <: PlotTreemapBreadcrumbsButtonThemeStyleOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
