package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphBreadcrumbsSeparatorStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object PlotTreegraphBreadcrumbsSeparatorStyleOptions {
  
  inline def apply(): PlotTreegraphBreadcrumbsSeparatorStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphBreadcrumbsSeparatorStyleOptions]
  }
  
  extension [Self <: PlotTreegraphBreadcrumbsSeparatorStyleOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
