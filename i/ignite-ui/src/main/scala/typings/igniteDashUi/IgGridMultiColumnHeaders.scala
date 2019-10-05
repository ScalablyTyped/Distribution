package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridMultiColumnHeaders
  extends /**
	 * Option for igGridMultiColumnHeaders
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event fired after the group collapsing has been executed and results are rendered.
  	 */
  var groupCollapsed: js.UndefOr[GroupCollapsedEvent] = js.undefined
  /**
  	 * Event fired before a group collapsing operation is executed.
  	 */
  var groupCollapsing: js.UndefOr[GroupCollapsingEvent] = js.undefined
  /**
  	 * Event fired after the group expanding has been executed and results are rendered.
  	 */
  var groupExpanded: js.UndefOr[GroupExpandedEvent] = js.undefined
  /**
  	 * Event fired before a group expanding operation is executed.
  	 */
  var groupExpanding: js.UndefOr[GroupExpandingEvent] = js.undefined
  /**
  	 * Enables/disables feature inheritance for the child layouts. NOTE: It only applies for igHierarchicalGrid.
  	 */
  var inherit: js.UndefOr[Boolean] = js.undefined
}

object IgGridMultiColumnHeaders {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igGridMultiColumnHeaders
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    groupCollapsed: (/* event */ Event, /* ui */ GroupCollapsedEventUIParam) => Unit = null,
    groupCollapsing: (/* event */ Event, /* ui */ GroupCollapsingEventUIParam) => Unit = null,
    groupExpanded: (/* event */ Event, /* ui */ GroupExpandedEventUIParam) => Unit = null,
    groupExpanding: (/* event */ Event, /* ui */ GroupExpandingEventUIParam) => Unit = null,
    inherit: js.UndefOr[Boolean] = js.undefined
  ): IgGridMultiColumnHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (groupCollapsed != null) __obj.updateDynamic("groupCollapsed")(js.Any.fromFunction2(groupCollapsed))
    if (groupCollapsing != null) __obj.updateDynamic("groupCollapsing")(js.Any.fromFunction2(groupCollapsing))
    if (groupExpanded != null) __obj.updateDynamic("groupExpanded")(js.Any.fromFunction2(groupExpanded))
    if (groupExpanding != null) __obj.updateDynamic("groupExpanding")(js.Any.fromFunction2(groupExpanding))
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    __obj.asInstanceOf[IgGridMultiColumnHeaders]
  }
}

