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

object IgToolbarButton {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igToolbarButton
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    activated: ActivatedEvent = null,
    activating: ActivatingEvent = null,
    allowToggling: js.UndefOr[scala.Boolean] = js.undefined,
    deactivated: DeactivatedEvent = null,
    deactivating: DeactivatingEvent = null,
    isSelected: js.UndefOr[scala.Boolean] = js.undefined
  ): IgToolbarButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activated != null) __obj.updateDynamic("activated")(activated)
    if (activating != null) __obj.updateDynamic("activating")(activating)
    if (!js.isUndefined(allowToggling)) __obj.updateDynamic("allowToggling")(allowToggling)
    if (deactivated != null) __obj.updateDynamic("deactivated")(deactivated)
    if (deactivating != null) __obj.updateDynamic("deactivating")(deactivating)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[IgToolbarButton]
  }
}

