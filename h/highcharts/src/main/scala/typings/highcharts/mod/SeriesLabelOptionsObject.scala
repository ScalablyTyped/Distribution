package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesLabelOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) An array of boxes to avoid when laying out
    * the labels. Each item has a `left`, `right`, `top` and `bottom` property.
    */
  var boxesToAvoid: js.UndefOr[js.Array[LabelIntersectBoxObject]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Allow labels to be placed distant to the
    * graph if necessary, and draw a connector line to the graph. Setting this
    * option to true may decrease the performance significantly, since the
    * algorithm with systematically search for open spaces in the whole plot
    * area. Visually, it may also result in a more cluttered chart, though more
    * of the series will be labeled.
    */
  var connectorAllowed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) If the label is closer than this to a
    * neighbour graph, draw a connector.
    */
  var connectorNeighbourDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Enable the series label per series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) A format string for the label, with
    * support for a subset of HTML. Variables are enclosed by curly brackets.
    * Available variables are `name`, `options.xxx`, `color` and other members
    * from the `series` object. Use this option also to set a static text for
    * the label.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Callback function to format each of the
    * series' labels. The `this` keyword refers to the series object. By
    * default the `formatter` is undefined and the `series.name` is rendered.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[Series]] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var maxFontSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) For area-like series, allow the font size
    * to vary so that small areas get a smaller font size. The default applies
    * this effect to area-like series but not line-like series.
    */
  var minFontSize: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Draw the label on the area of an area
    * series. By default it is drawn on the area. Set it to `false` to draw it
    * next to the graph instead.
    */
  var onArea: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Styles for the series label. The color
    * defaults to the series color, or a contrast color if `onArea`.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}
object SeriesLabelOptionsObject {
  
  inline def apply(): SeriesLabelOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesLabelOptionsObject]
  }
  
  extension [Self <: SeriesLabelOptionsObject](x: Self) {
    
    inline def setBoxesToAvoid(value: js.Array[LabelIntersectBoxObject]): Self = StObject.set(x, "boxesToAvoid", value.asInstanceOf[js.Any])
    
    inline def setBoxesToAvoidUndefined: Self = StObject.set(x, "boxesToAvoid", js.undefined)
    
    inline def setBoxesToAvoidVarargs(value: LabelIntersectBoxObject*): Self = StObject.set(x, "boxesToAvoid", js.Array(value :_*))
    
    inline def setConnectorAllowed(value: Boolean): Self = StObject.set(x, "connectorAllowed", value.asInstanceOf[js.Any])
    
    inline def setConnectorAllowedUndefined: Self = StObject.set(x, "connectorAllowed", js.undefined)
    
    inline def setConnectorNeighbourDistance(value: Double): Self = StObject.set(x, "connectorNeighbourDistance", value.asInstanceOf[js.Any])
    
    inline def setConnectorNeighbourDistanceUndefined: Self = StObject.set(x, "connectorNeighbourDistance", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: FormatterCallbackFunction[Series]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setMaxFontSize(value: Double): Self = StObject.set(x, "maxFontSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeNull: Self = StObject.set(x, "maxFontSize", null)
    
    inline def setMaxFontSizeUndefined: Self = StObject.set(x, "maxFontSize", js.undefined)
    
    inline def setMinFontSize(value: Double): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
    
    inline def setMinFontSizeNull: Self = StObject.set(x, "minFontSize", null)
    
    inline def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
    
    inline def setOnArea(value: Boolean): Self = StObject.set(x, "onArea", value.asInstanceOf[js.Any])
    
    inline def setOnAreaNull: Self = StObject.set(x, "onArea", null)
    
    inline def setOnAreaUndefined: Self = StObject.set(x, "onArea", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
