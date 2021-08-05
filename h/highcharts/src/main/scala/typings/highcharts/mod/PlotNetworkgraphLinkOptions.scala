package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlotNetworkgraphLinkOptions extends StObject {
  
  /**
    * (Highcharts) Color of the link between two nodes.
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) A name for the dash style to use for links.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts) Width (px) of the link between two nodes.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PlotNetworkgraphLinkOptions {
  
  inline def apply(): PlotNetworkgraphLinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotNetworkgraphLinkOptions]
  }
  
  extension [Self <: PlotNetworkgraphLinkOptions](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
