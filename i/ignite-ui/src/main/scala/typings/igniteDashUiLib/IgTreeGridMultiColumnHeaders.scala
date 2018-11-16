package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgTreeGridMultiColumnHeaders
  extends /**
	 * Option for igTreeGridMultiColumnHeaders
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
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

