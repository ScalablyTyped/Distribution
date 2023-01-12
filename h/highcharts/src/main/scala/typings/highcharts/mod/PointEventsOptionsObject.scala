package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointEventsOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when a point is clicked. One
    * parameter, `event`, is passed to the function, containing common event
    * information.
    *
    * If the `series.allowPointSelect` option is true, the default action for
    * the point's click event is to toggle the point's select state. Returning
    * `false` cancels this action.
    */
  var click: js.UndefOr[PointClickCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires while dragging a
    * point. The mouse event is passed in as parameter. The original data can
    * be accessed from `e.origin`, and the new point values can be accessed
    * from `e.newPoints`. If there is only a single point being updated, it can
    * be accessed from `e.newPoint` for simplicity, and its ID can be accessed
    * from `e.newPointId`. The `this` context is the point being dragged. To
    * stop the default drag action, return false. See drag and drop options.
    */
  var drag: js.UndefOr[PointDragCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires when starting to drag
    * a point. The mouse event object is passed in as an argument. If a drag
    * handle is used, `e.updateProp` is set to the data property being dragged.
    * The `this` context is the point. See drag and drop options.
    */
  var dragStart: js.UndefOr[PointDragStartCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires when the point is
    * dropped. The parameters passed are the same as for drag. To stop the
    * default drop action, return false. See drag and drop options.
    */
  var drop: js.UndefOr[PointDropCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Fires when the legend item belonging to the pie
    * point (slice) is clicked. The `this` keyword refers to the point itself.
    * One parameter, `event`, is passed to the function, containing common
    * event information. The default action is to toggle the visibility of the
    * point. This can be prevented by calling `event.preventDefault()`.
    */
  var legendItemClick: js.UndefOr[PointLegendItemClickCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the mouse leaves the area close
    * to the point. One parameter, `event`, is passed to the function,
    * containing common event information.
    */
  var mouseOut: js.UndefOr[PointMouseOutCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the mouse enters the area close
    * to the point. One parameter, `event`, is passed to the function,
    * containing common event information.
    *
    * Returning `false` cancels the default behavior, which is to show a
    * tooltip for the point.
    */
  var mouseOver: js.UndefOr[PointMouseOverCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is removed using the
    * `.remove()` method. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  var remove: js.UndefOr[PointRemoveCallbackFunction] = js.undefined
  
  /**
    * Fires when the point is selected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  var select: js.UndefOr[PointSelectCallbackFunction] = js.undefined
  
  /**
    * Fires when the point is unselected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  var unselect: js.UndefOr[PointUnselectCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is updated
    * programmatically through the `.update()` method. One parameter, `event`,
    * is passed to the function. The new point options can be accessed through
    * `event.options`. Returning `false` cancels the operation.
    */
  var update: js.UndefOr[PointUpdateCallbackFunction] = js.undefined
}
object PointEventsOptionsObject {
  
  inline def apply(): PointEventsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointEventsOptionsObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointEventsOptionsObject] (val x: Self) extends AnyVal {
    
    inline def setClick(value: PointClickCallbackFunction): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    inline def setDrag(value: PointDragCallbackFunction): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragStart(value: PointDragStartCallbackFunction): Self = StObject.set(x, "dragStart", value.asInstanceOf[js.Any])
    
    inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setDrop(value: PointDropCallbackFunction): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setLegendItemClick(value: PointLegendItemClickCallbackFunction): Self = StObject.set(x, "legendItemClick", value.asInstanceOf[js.Any])
    
    inline def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    inline def setMouseOut(value: PointMouseOutCallbackFunction): Self = StObject.set(x, "mouseOut", value.asInstanceOf[js.Any])
    
    inline def setMouseOutUndefined: Self = StObject.set(x, "mouseOut", js.undefined)
    
    inline def setMouseOver(value: PointMouseOverCallbackFunction): Self = StObject.set(x, "mouseOver", value.asInstanceOf[js.Any])
    
    inline def setMouseOverUndefined: Self = StObject.set(x, "mouseOver", js.undefined)
    
    inline def setRemove(value: PointRemoveCallbackFunction): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSelect(value: PointSelectCallbackFunction): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setUnselect(value: PointUnselectCallbackFunction): Self = StObject.set(x, "unselect", value.asInstanceOf[js.Any])
    
    inline def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
    
    inline def setUpdate(value: PointUpdateCallbackFunction): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
