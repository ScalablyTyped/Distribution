package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeGridMultiColumnHeaders
  extends /**
	 * Option for igTreeGridMultiColumnHeaders
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  	 * This option is inherited from a parent widget and it's not applicable for the igTreeGrid.
  	 */
  var inherit: js.UndefOr[scala.Boolean] = js.undefined
}

object IgTreeGridMultiColumnHeaders {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igTreeGridMultiColumnHeaders
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    groupCollapsed: GroupCollapsedEvent = null,
    groupCollapsing: GroupCollapsingEvent = null,
    groupExpanded: GroupExpandedEvent = null,
    groupExpanding: GroupExpandingEvent = null,
    inherit: js.UndefOr[scala.Boolean] = js.undefined
  ): IgTreeGridMultiColumnHeaders = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (groupCollapsed != null) __obj.updateDynamic("groupCollapsed")(groupCollapsed)
    if (groupCollapsing != null) __obj.updateDynamic("groupCollapsing")(groupCollapsing)
    if (groupExpanded != null) __obj.updateDynamic("groupExpanded")(groupExpanded)
    if (groupExpanding != null) __obj.updateDynamic("groupExpanding")(groupExpanding)
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit)
    __obj.asInstanceOf[IgTreeGridMultiColumnHeaders]
  }
}

