package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointEventsOptionsObject extends js.Object {
  
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
  implicit class PointEventsOptionsObjectOps[Self <: PointEventsOptionsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClick(value: PointClickCallbackFunction): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setDrag(value: PointDragCallbackFunction): Self = this.set("drag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragStart(value: PointDragStartCallbackFunction): Self = this.set("dragStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDrop(value: PointDropCallbackFunction): Self = this.set("drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setLegendItemClick(value: PointLegendItemClickCallbackFunction): Self = this.set("legendItemClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLegendItemClick: Self = this.set("legendItemClick", js.undefined)
    
    @scala.inline
    def setMouseOut(value: PointMouseOutCallbackFunction): Self = this.set("mouseOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseOut: Self = this.set("mouseOut", js.undefined)
    
    @scala.inline
    def setMouseOver(value: PointMouseOverCallbackFunction): Self = this.set("mouseOver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMouseOver: Self = this.set("mouseOver", js.undefined)
    
    @scala.inline
    def setRemove(value: PointRemoveCallbackFunction): Self = this.set("remove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setSelect(value: PointSelectCallbackFunction): Self = this.set("select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelect: Self = this.set("select", js.undefined)
    
    @scala.inline
    def setUnselect(value: PointUnselectCallbackFunction): Self = this.set("unselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnselect: Self = this.set("unselect", js.undefined)
    
    @scala.inline
    def setUpdate(value: PointUpdateCallbackFunction): Self = this.set("update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
  }
}
