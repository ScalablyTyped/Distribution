package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var click: js.UndefOr[PointClickCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires while dragging a
    * point. The mouse event is passed in as parameter. The original data can
    * be accessed from `e.origin`, and the new point values can be accessed
    * from `e.newPoints`. If there is only a single point being updated, it can
    * be accessed from `e.newPoint` for simplicity, and its ID can be accessed
    * from `e.newPointId`. The `this` context is the point being dragged. To
    * stop the default drag action, return false. See drag and drop options.
    */
  var drag: js.UndefOr[PointDragCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires when starting to drag
    * a point. The mouse event object is passed in as an argument. If a drag
    * handle is used, `e.updateProp` is set to the data property being dragged.
    * The `this` context is the point. See drag and drop options.
    */
  var dragStart: js.UndefOr[PointDragStartCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Callback that fires when the point is
    * dropped. The parameters passed are the same as for drag. To stop the
    * default drop action, return false. See drag and drop options.
    */
  var drop: js.UndefOr[PointDropCallbackFunction] = js.native
  
  /**
    * (Highcharts) Fires when the legend item belonging to the pie point
    * (slice) is clicked. The `this` keyword refers to the point itself. One
    * parameter, `event`, is passed to the function, containing common event
    * information. The default action is to toggle the visibility of the point.
    * This can be prevented by calling `event.preventDefault()`.
    */
  var legendItemClick: js.UndefOr[PointLegendItemClickCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the mouse leaves the area close
    * to the point. One parameter, `event`, is passed to the function,
    * containing common event information.
    */
  var mouseOut: js.UndefOr[PointMouseOutCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the mouse enters the area close
    * to the point. One parameter, `event`, is passed to the function,
    * containing common event information.
    */
  var mouseOver: js.UndefOr[PointMouseOverCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is removed using the
    * `.remove()` method. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  var remove: js.UndefOr[PointRemoveCallbackFunction] = js.native
  
  /**
    * Fires when the point is selected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  var select: js.UndefOr[PointSelectCallbackFunction] = js.native
  
  /**
    * Fires when the point is unselected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  var unselect: js.UndefOr[PointUnselectCallbackFunction] = js.native
  
  /**
    * (Highcharts, Highstock, Gantt) Fires when the point is updated
    * programmatically through the `.update()` method. One parameter, `event`,
    * is passed to the function. The new point options can be accessed through
    * `event.options`. Returning `false` cancels the operation.
    */
  var update: js.UndefOr[PointUpdateCallbackFunction] = js.native
}
object PointEventsOptionsObject {
  
  @scala.inline
  def apply(): PointEventsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointEventsOptionsObject]
  }
  
  @scala.inline
  implicit class PointEventsOptionsObjectMutableBuilder[Self <: PointEventsOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClick(value: PointClickCallbackFunction): Self = StObject.set(x, "click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
    
    @scala.inline
    def setDrag(value: PointDragCallbackFunction): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragStart(value: PointDragStartCallbackFunction): Self = StObject.set(x, "dragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
    
    @scala.inline
    def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    @scala.inline
    def setDrop(value: PointDropCallbackFunction): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    @scala.inline
    def setLegendItemClick(value: PointLegendItemClickCallbackFunction): Self = StObject.set(x, "legendItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendItemClickUndefined: Self = StObject.set(x, "legendItemClick", js.undefined)
    
    @scala.inline
    def setMouseOut(value: PointMouseOutCallbackFunction): Self = StObject.set(x, "mouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseOutUndefined: Self = StObject.set(x, "mouseOut", js.undefined)
    
    @scala.inline
    def setMouseOver(value: PointMouseOverCallbackFunction): Self = StObject.set(x, "mouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMouseOverUndefined: Self = StObject.set(x, "mouseOver", js.undefined)
    
    @scala.inline
    def setRemove(value: PointRemoveCallbackFunction): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    @scala.inline
    def setSelect(value: PointSelectCallbackFunction): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setUnselect(value: PointUnselectCallbackFunction): Self = StObject.set(x, "unselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnselectUndefined: Self = StObject.set(x, "unselect", js.undefined)
    
    @scala.inline
    def setUpdate(value: PointUpdateCallbackFunction): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
