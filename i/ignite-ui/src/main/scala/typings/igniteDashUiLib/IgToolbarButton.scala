package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgToolbarButton
  extends /**
	 * Option for igToolbarButton
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Event fired after the toolbar button is activated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var activated: js.UndefOr[ActivatedEvent] = js.undefined
  /**
  	 * Event fired before the toolbar button is activated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var activating: js.UndefOr[ActivatingEvent] = js.undefined
  /**
  	 * Enable/Disable the "Toggling" of a button.
  	 *
  	 */
  var allowToggling: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Event fired after the toolbar button is deactivated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var deactivated: js.UndefOr[DeactivatedEvent] = js.undefined
  /**
  	 * Event fired before the toolbar button is deactivated.
  	 *                 Function takes arguments evt and ui.
  	 *                 Use ui.owner to get reference to this igToolbarButton.
  	 */
  var deactivating: js.UndefOr[DeactivatingEvent] = js.undefined
  /**
  	 * Get/Set whether the toolbar button is selected.
  	 *
  	 */
  var isSelected: js.UndefOr[scala.Boolean] = js.undefined
}

