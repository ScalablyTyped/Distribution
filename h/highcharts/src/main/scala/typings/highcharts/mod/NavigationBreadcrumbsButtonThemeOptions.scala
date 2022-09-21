package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationBreadcrumbsButtonThemeOptions extends StObject {
  
  var style: js.UndefOr[NavigationBreadcrumbsButtonThemeStyleOptions] = js.undefined
}
object NavigationBreadcrumbsButtonThemeOptions {
  
  inline def apply(): NavigationBreadcrumbsButtonThemeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationBreadcrumbsButtonThemeOptions]
  }
  
  extension [Self <: NavigationBreadcrumbsButtonThemeOptions](x: Self) {
    
    inline def setStyle(value: NavigationBreadcrumbsButtonThemeStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
