package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreemapBreadcrumbsSeparatorStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object PlotTreemapBreadcrumbsSeparatorStyleOptions {
  
  inline def apply(): PlotTreemapBreadcrumbsSeparatorStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreemapBreadcrumbsSeparatorStyleOptions]
  }
  
  extension [Self <: PlotTreemapBreadcrumbsSeparatorStyleOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
