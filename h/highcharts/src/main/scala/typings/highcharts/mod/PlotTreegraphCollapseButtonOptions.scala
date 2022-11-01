package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotTreegraphCollapseButtonOptions extends StObject {
  
  /**
    * (Highcharts) Whether the button should be visible.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) Height of the button.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Whether the button should be visible only when the node is
    * hovered. When set to true, the button is hidden for nodes, which are not
    * collapsed, and shown for the collapsed ones.
    */
  var onlyOnHover: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts) The symbol of the collapse button.
    */
  var shape: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Width of the button.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Offset of the button in the x direction.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts) Offset of the button in the y direction.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PlotTreegraphCollapseButtonOptions {
  
  inline def apply(): PlotTreegraphCollapseButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotTreegraphCollapseButtonOptions]
  }
  
  extension [Self <: PlotTreegraphCollapseButtonOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setOnlyOnHover(value: Boolean): Self = StObject.set(x, "onlyOnHover", value.asInstanceOf[js.Any])
    
    inline def setOnlyOnHoverUndefined: Self = StObject.set(x, "onlyOnHover", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
