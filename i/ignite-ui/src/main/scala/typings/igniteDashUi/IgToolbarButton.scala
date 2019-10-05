package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarButton
  extends /**
	 * Option for igToolbarButton
	 */
/* optionName */ StringDictionary[js.Any] {
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
  var allowToggling: js.UndefOr[Boolean] = js.undefined
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
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object IgToolbarButton {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igToolbarButton
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    activated: (/* event */ Event, /* ui */ ActivatedEventUIParam) => Unit = null,
    activating: (/* event */ Event, /* ui */ ActivatingEventUIParam) => Unit = null,
    allowToggling: js.UndefOr[Boolean] = js.undefined,
    deactivated: (/* event */ Event, /* ui */ DeactivatedEventUIParam) => Unit = null,
    deactivating: (/* event */ Event, /* ui */ DeactivatingEventUIParam) => Unit = null,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): IgToolbarButton = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activated != null) __obj.updateDynamic("activated")(js.Any.fromFunction2(activated))
    if (activating != null) __obj.updateDynamic("activating")(js.Any.fromFunction2(activating))
    if (!js.isUndefined(allowToggling)) __obj.updateDynamic("allowToggling")(allowToggling)
    if (deactivated != null) __obj.updateDynamic("deactivated")(js.Any.fromFunction2(deactivated))
    if (deactivating != null) __obj.updateDynamic("deactivating")(js.Any.fromFunction2(deactivating))
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    __obj.asInstanceOf[IgToolbarButton]
  }
}

