package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotSunburstBreadcrumbsButtonThemeStyleOptions extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
}
object PlotSunburstBreadcrumbsButtonThemeStyleOptions {
  
  inline def apply(): PlotSunburstBreadcrumbsButtonThemeStyleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotSunburstBreadcrumbsButtonThemeStyleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlotSunburstBreadcrumbsButtonThemeStyleOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
