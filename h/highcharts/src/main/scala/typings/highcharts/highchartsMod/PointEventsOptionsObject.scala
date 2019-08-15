package typings.highcharts.highchartsMod

import typings.std.Event
import typings.std.PointerEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointEventsOptionsObject extends js.Object {
  /**
    * Fires when a point is clicked. One parameter, event, is passed to the
    * function, containing common event information.
    *
    * If the `series.allowPointSelect` option is true, the default action for
    * the point's click event is to toggle the point's select state. Returning
    * `false` cancels this action.
    */
  var click: js.UndefOr[PointClickCallbackFunction] = js.native
  /**
    * Fires when the mouse leaves the area close to the point. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  @JSName("mouseOut")
  var mouseOut_Original: PointMouseOutCallbackFunction = js.native
  /**
    * Fires when the mouse enters the area close to the point. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  @JSName("mouseOver")
  var mouseOver_Original: PointMouseOverCallbackFunction = js.native
  /**
    * Fires when the point is removed using the `.remove()` method. One
    * parameter, `event`, is passed to the function. Returning `false` cancels
    * the operation.
    */
  @JSName("remove")
  var remove_Original: PointRemoveCallbackFunction = js.native
  /**
    * Fires when the point is selected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  @JSName("select")
  var select_Original: PointSelectCallbackFunction = js.native
  /**
    * Fires when the point is unselected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  @JSName("unselect")
  var unselect_Original: PointUnselectCallbackFunction = js.native
  /**
    * Fires when the point is updated programmatically through the `.update()``
    * method. One parameter, `event`, is passed to the function. The new point
    * options can be accessed through event.options. Returning `false` cancels
    * the operation.
    */
  @JSName("update")
  var update_Original: PointUpdateCallbackFunction = js.native
  /**
    * Fires when the mouse leaves the area close to the point. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  def mouseOut(`this`: Point, event: PointerEvent): Unit = js.native
  /**
    * Fires when the mouse enters the area close to the point. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  def mouseOver(`this`: Point, event: Event): Unit = js.native
  /**
    * Fires when the point is removed using the `.remove()` method. One
    * parameter, `event`, is passed to the function. Returning `false` cancels
    * the operation.
    */
  def remove(`this`: Point, event: Event): Unit = js.native
  /**
    * Fires when the point is selected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  def select(`this`: Point, event: PointInteractionEventObject): Unit = js.native
  /**
    * Fires when the point is unselected either programmatically or following a
    * click on the point. One parameter, `event`, is passed to the function.
    * Returning `false` cancels the operation.
    */
  def unselect(`this`: Point, event: PointInteractionEventObject): Unit = js.native
  /**
    * Fires when the point is updated programmatically through the `.update()``
    * method. One parameter, `event`, is passed to the function. The new point
    * options can be accessed through event.options. Returning `false` cancels
    * the operation.
    */
  def update(`this`: Point, event: PointUpdateEventObject): Unit = js.native
}

