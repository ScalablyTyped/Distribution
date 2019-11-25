package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointEventsOptionsObject extends js.Object {
  /**
    * Fires when a point is clicked. One parameter, event, is passed to the
    * function, containing common event information.
    *
    * If the `series.allowPointSelect` option is true, the default action for
    * the point's click event is to toggle the point's select state. Returning
    * `false` cancels this action.
    */
  var click: js.UndefOr[PointClickCallbackFunction] = js.undefined
  /**
    * Fires when the mouse leaves the area close to the point. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var mouseOut: js.UndefOr[PointMouseOutCallbackFunction] = js.undefined
  /**
    * Fires when the mouse enters the area close to the point. One parameter,
    * `event`, is passed to the function, containing common event information.
    */
  var mouseOver: js.UndefOr[PointMouseOverCallbackFunction] = js.undefined
  /**
    * Fires when the point is removed using the `.remove()` method. One
    * parameter, `event`, is passed to the function. Returning `false` cancels
    * the operation.
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
    * Fires when the point is updated programmatically through the `.update()``
    * method. One parameter, `event`, is passed to the function. The new point
    * options can be accessed through event.options. Returning `false` cancels
    * the operation.
    */
  var update: js.UndefOr[PointUpdateCallbackFunction] = js.undefined
}

object PointEventsOptionsObject {
  @scala.inline
  def apply(
    click: PointClickCallbackFunction = null,
    mouseOut: PointMouseOutCallbackFunction = null,
    mouseOver: PointMouseOverCallbackFunction = null,
    remove: PointRemoveCallbackFunction = null,
    select: PointSelectCallbackFunction = null,
    unselect: PointUnselectCallbackFunction = null,
    update: PointUpdateCallbackFunction = null
  ): PointEventsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (click != null) __obj.updateDynamic("click")(click.asInstanceOf[js.Any])
    if (mouseOut != null) __obj.updateDynamic("mouseOut")(mouseOut.asInstanceOf[js.Any])
    if (mouseOver != null) __obj.updateDynamic("mouseOver")(mouseOver.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(remove.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (unselect != null) __obj.updateDynamic("unselect")(unselect.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointEventsOptionsObject]
  }
}

