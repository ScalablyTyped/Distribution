package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBindingsOptionsObject extends js.Object {
  /**
    * ClassName of the element for a binding.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Last event to be fired after last step event.
    */
  var end: js.UndefOr[js.Function] = js.undefined
  /**
    * Initial event, fired on a button click.
    */
  var init: js.UndefOr[js.Function] = js.undefined
  /**
    * Event fired on first click on a chart.
    */
  var start: js.UndefOr[js.Function] = js.undefined
  /**
    * Last event to be fired after last step event. Array of step events to be
    * called sequentially after each user click.
    */
  var steps: js.UndefOr[js.Array[js.Function]] = js.undefined
}

object NavigationBindingsOptionsObject {
  @scala.inline
  def apply(
    className: String = null,
    end: js.Function = null,
    init: js.Function = null,
    start: js.Function = null,
    steps: js.Array[js.Function] = null
  ): NavigationBindingsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (steps != null) __obj.updateDynamic("steps")(steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationBindingsOptionsObject]
  }
}

