package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BreadcrumbsAlignOptions extends StObject {
  
  /**
    * Align of a Breadcrumb group.
    */
  var align: AlignValue
  
  /**
    * Vertical align of a Breadcrumb group.
    */
  var verticalAlign: VerticalAlignValue
  
  /**
    * X offset of a Breadcrumbs group.
    */
  var x: Double
  
  /**
    * Y offset of a Breadcrumbs group.
    */
  var y: Double
}
object BreadcrumbsAlignOptions {
  
  inline def apply(align: AlignValue, verticalAlign: VerticalAlignValue, x: Double, y: Double): BreadcrumbsAlignOptions = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], verticalAlign = verticalAlign.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbsAlignOptions]
  }
  
  extension [Self <: BreadcrumbsAlignOptions](x: Self) {
    
    inline def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
