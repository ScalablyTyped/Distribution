package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrilldownBreadcrumbsButtonThemeOptions extends StObject {
  
  var style: js.UndefOr[DrilldownBreadcrumbsButtonThemeStyleOptions] = js.undefined
}
object DrilldownBreadcrumbsButtonThemeOptions {
  
  inline def apply(): DrilldownBreadcrumbsButtonThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownBreadcrumbsButtonThemeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrilldownBreadcrumbsButtonThemeOptions] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: DrilldownBreadcrumbsButtonThemeStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
