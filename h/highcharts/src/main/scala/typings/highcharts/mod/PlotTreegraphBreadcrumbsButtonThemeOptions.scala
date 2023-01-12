package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphBreadcrumbsButtonThemeOptions extends StObject {
  
  var style: js.UndefOr[PlotTreegraphBreadcrumbsButtonThemeStyleOptions] = js.undefined
}
object PlotTreegraphBreadcrumbsButtonThemeOptions {
  
  inline def apply(): PlotTreegraphBreadcrumbsButtonThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphBreadcrumbsButtonThemeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotTreegraphBreadcrumbsButtonThemeOptions] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: PlotTreegraphBreadcrumbsButtonThemeStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
