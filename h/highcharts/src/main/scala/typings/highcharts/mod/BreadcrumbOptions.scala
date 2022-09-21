package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbOptions extends StObject {
  
  /**
    * Level connected to a specific breadcrumb.
    */
  var level: Double
  
  /**
    * Options for series or point connected to a specific breadcrumb.
    */
  var levelOptions: PointOptionsObject | SeriesOptions
}
object BreadcrumbOptions {
  
  inline def apply(level: Double, levelOptions: PointOptionsObject | SeriesOptions): BreadcrumbOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], levelOptions = levelOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbOptions]
  }
  
  extension [Self <: BreadcrumbOptions](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelOptions(value: PointOptionsObject | SeriesOptions): Self = StObject.set(x, "levelOptions", value.asInstanceOf[js.Any])
  }
}
