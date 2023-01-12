package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesEventsOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Fires after the series has finished its
    * initial animation, or in case animation is disabled, immediately as the
    * series is displayed.
    */
  var afterAnimate: js.UndefOr[SeriesAfterAnimateCallbackFunction] = js.undefined
  
  /**
    * (Highstock) Fires when the checkbox next to the series' name in the
    * legend is clicked. One parameter, `event`, is passed to the function. The
    * state of the checkbox is found by `event.checked`. The checked item is
    * found by `event.item`. Return `false` to prevent the default action which
    * is to toggle the select state of the series.
    */
  var checkboxClick: js.UndefOr[js.Function | SeriesCheckboxClickCallbackFunction] = js.undefined
  
  /**
    * (Highstock) Fires when the series is clicked. One parameter, `event`, is
    * passed to the function, containing common event information.
    * Additionally, `event.point` holds a pointer to the nearest point on the
    * graph.
    */
  var click: js.UndefOr[SeriesClickCallbackFunction] = js.undefined
  
  /**
    * (Highstock) Fires when the series is hidden after chart generation time,
    * either by clicking the legend item or by calling `.hide()`.
    */
  var hide: js.UndefOr[SeriesHideCallbackFunction] = js.undefined
  
  /**
    * (Highstock) Fires when the legend item belonging to the series is
    * clicked. One parameter, `event`, is passed to the function. The default
    * action is to toggle the visibility of the series. This can be prevented
    * by returning `false` or calling `event.preventDefault()`.
    */
  var legendItemClick: js.UndefOr[SeriesLegendItemClickCallbackFunction] = js.undefined
  
  /**
    * (Highstock) Fires when the mouse leaves the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    * If the stickyTracking option is true, `mouseOut` doesn't happen before
    * the mouse enters another graph or leaves the plot area.
    */
  var mouseOut: js.UndefOr[SeriesMouseOutCallbackFunction] = js.undefined
  
  /**
    * (Highstock) Fires when the mouse enters the graph. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var mouseOver: js.UndefOr[SeriesMouseOverCallbackFunction] = js.undefined
  
  /**
    * (Highcharts) Fires on a request for change of root node for the tree,
    * before the update is made. An event object is passed to the function,
    * containing additional properties `newRootId`, `previousRootId`, `redraw`
    * and `trigger`.
    */
  var setRootNode: js.UndefOr[js.Function] = js.undefined
  
  /**
    * (Highstock) Fires when the series is shown after chart generation time,
    * either by clicking the legend item or by calling `.show()`.
    */
  var show: js.UndefOr[SeriesShowCallbackFunction] = js.undefined
}
object SeriesEventsOptionsObject {
  
  inline def apply(): SeriesEventsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesEventsOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesEventsOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setAfterAnimate(value: SeriesAfterAnimateCallbackFunction): Self = StObject.set(x, "afterAnimate", value.asInstanceOf[js.Any])
    
    inline def setAfterAnimateUndefined: Self = StObject.set(x, "afterAnimate", js.undefined)
    
    inline def setCheckboxClick(value: js.Function | SeriesCheckboxClickCallbackFunction): Self = StObject.set(x, "checkboxClick", value.asInstanceOf[js.Any])
    
    inline def setCheckboxClickUndefined: Self = StObject.set(x, "checkboxClick", js.undefined)
    
    inline def setClick(value: SeriesClickCallbackFunction): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setHide(value: SeriesHideCallbackFunction): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setLegendItemClick(value: SeriesLegendItemClickCallbackFunction): Self = StObject.set(x, "legendItemClick", value.asInstanceOf[js.Any])
    
    inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    inline def setMouseOut(value: SeriesMouseOutCallbackFunction): Self = StObject.set(x, "mouseOut", value.asInstanceOf[js.Any])
    
    inline def setMouseOutUndefined: Self = StObject.set(x, "mouseOut", js.undefined)
    
    inline def setMouseOver(value: SeriesMouseOverCallbackFunction): Self = StObject.set(x, "mouseOver", value.asInstanceOf[js.Any])
    
    inline def setMouseOverUndefined: Self = StObject.set(x, "mouseOver", js.undefined)
    
    inline def setSetRootNode(value: js.Function): Self = StObject.set(x, "setRootNode", value.asInstanceOf[js.Any])
    
    inline def setSetRootNodeUndefined: Self = StObject.set(x, "setRootNode", js.undefined)
    
    inline def setShow(value: SeriesShowCallbackFunction): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
