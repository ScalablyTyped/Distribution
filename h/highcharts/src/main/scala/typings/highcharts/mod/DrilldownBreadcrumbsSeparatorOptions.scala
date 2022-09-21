package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrilldownBreadcrumbsSeparatorOptions extends StObject {
  
  /**
    * (Highcharts) CSS styles for the breadcrumbs separator.
    *
    * In styled mode, the breadcrumbs separators are styled by the
    * `.highcharts-separator` rule with its different states.
    */
  var style: js.UndefOr[CSSObject | DrilldownBreadcrumbsSeparatorStyleOptions] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object DrilldownBreadcrumbsSeparatorOptions {
  
  inline def apply(): DrilldownBreadcrumbsSeparatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrilldownBreadcrumbsSeparatorOptions]
  }
  
  extension [Self <: DrilldownBreadcrumbsSeparatorOptions](x: Self) {
    
    inline def setStyle(value: CSSObject | DrilldownBreadcrumbsSeparatorStyleOptions): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
