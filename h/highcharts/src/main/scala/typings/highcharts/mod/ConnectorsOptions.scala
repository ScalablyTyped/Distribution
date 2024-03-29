package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorsOptions extends StObject {
  
  /**
    * (Gantt) Set the default pathfinder margin to use, in pixels. Some
    * Pathfinder algorithms attempt to avoid obstacles, such as other points in
    * the chart. These algorithms use this margin to determine how close lines
    * can be to an obstacle. The default is to compute this automatically from
    * the size of the obstacles in the chart.
    *
    * To draw connecting lines close to existing points, set this to a low
    * number. For more space around existing points, set this number higher.
    */
  var algorithmMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Set the default dash style for this chart's connecting lines.
    */
  var dashStyle: js.UndefOr[String] = js.undefined
  
  /**
    * (Gantt) Enable connectors for this chart. Requires Highcharts Gantt.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Gantt) Marker options specific to the end markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var endMarker: js.UndefOr[ConnectorsEndMarkerOptions] = js.undefined
  
  /**
    * (Gantt) Set the default color for this chart's Pathfinder connecting
    * lines. Defaults to the color of the point being connected.
    */
  var lineColor: js.UndefOr[ColorString] = js.undefined
  
  /**
    * (Gantt) Set the default pixel width for this chart's Pathfinder
    * connecting lines.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Gantt) Marker options for this chart's Pathfinder connectors. Note that
    * this option is overridden by the `startMarker` and `endMarker` options.
    */
  var marker: js.UndefOr[ConnectorsMarkerOptions] = js.undefined
  
  /**
    * (Gantt) Marker options specific to the start markers for this chart's
    * Pathfinder connectors. Overrides the generic marker options.
    */
  var startMarker: js.UndefOr[ConnectorsStartMarkerOptions] = js.undefined
  
  /**
    * (Gantt) Set the default pathfinder algorithm to use for this chart. It is
    * possible to define your own algorithms by adding them to the
    * Highcharts.Pathfinder.prototype.algorithms object before the chart has
    * been created.
    *
    * The default algorithms are as follows:
    *
    * `straight`: Draws a straight line between the connecting points. Does not
    * avoid other points when drawing.
    *
    * `simpleConnect`: Finds a path between the points using right angles only.
    * Takes only starting/ending points into account, and will not avoid other
    * points.
    *
    * `fastAvoid`: Finds a path between the points using right angles only.
    * Will attempt to avoid other points, but its focus is performance over
    * accuracy. Works well with less dense datasets.
    *
    * Default value: `straight` is used as default for most series types, while
    * `simpleConnect` is used as default for Gantt series, to show dependencies
    * between points.
    */
  var `type`: js.UndefOr[PathfinderTypeValue] = js.undefined
}
object ConnectorsOptions {
  
  inline def apply(): ConnectorsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectorsOptions] (val x: Self) extends AnyVal {
    
    inline def setAlgorithmMargin(value: Double): Self = StObject.set(x, "algorithmMargin", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmMarginUndefined: Self = StObject.set(x, "algorithmMargin", js.undefined)
    
    inline def setDashStyle(value: String): Self = StObject.set(x, "dashStyle", value.asInstanceOf[js.Any])
    
    inline def setDashStyleUndefined: Self = StObject.set(x, "dashStyle", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setEndMarker(value: ConnectorsEndMarkerOptions): Self = StObject.set(x, "endMarker", value.asInstanceOf[js.Any])
    
    inline def setEndMarkerUndefined: Self = StObject.set(x, "endMarker", js.undefined)
    
    inline def setLineColor(value: ColorString): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMarker(value: ConnectorsMarkerOptions): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    inline def setStartMarker(value: ConnectorsStartMarkerOptions): Self = StObject.set(x, "startMarker", value.asInstanceOf[js.Any])
    
    inline def setStartMarkerUndefined: Self = StObject.set(x, "startMarker", js.undefined)
    
    inline def setType(value: PathfinderTypeValue): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
