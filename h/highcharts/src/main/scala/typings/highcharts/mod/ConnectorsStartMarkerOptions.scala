package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorsStartMarkerOptions extends StObject {
  
  /**
    * (Gantt) Horizontal alignment of the markers relative to the points.
    */
  var align: js.UndefOr[String | AlignValue] = js.undefined
  
  /**
    * (Gantt) Set the color of the connector markers. By default this is the
    * same as the connector color.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Gantt) Enable markers for the connectors.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) Set the height of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Whether or not to draw the markers inside the points.
    */
  var inside: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Gantt) Set the line/border color of the connector markers. By default
    * this is the same as the marker color.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Gantt) Set the line/border width of the pathfinder markers.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Set the radius of the connector markers. The default is
    * automatically computed based on the algorithmMargin setting.
    *
    * Setting marker.width and marker.height will override this setting.
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Set the symbol of the connector start markers.
    */
  var symbol: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) Vertical alignment of the markers relative to the points.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  
  /**
    * (Gantt) Set the width of the connector markers. If not supplied, this is
    * inferred from the marker radius.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ConnectorsStartMarkerOptions {
  
  inline def apply(): ConnectorsStartMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsStartMarkerOptions]
  }
  
  extension [Self <: ConnectorsStartMarkerOptions](x: Self) {
    
    inline def setAlign(value: String | AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setInside(value: Boolean): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
    
    inline def setInsideUndefined: Self = StObject.set(x, "inside", js.undefined)
    
    inline def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
