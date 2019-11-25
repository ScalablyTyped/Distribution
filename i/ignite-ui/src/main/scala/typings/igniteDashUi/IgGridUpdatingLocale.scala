package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridUpdatingLocale
  extends /**
	 * Option for IgGridUpdatingLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the label for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowLabel is used.
  	 *
  	 */
  var addRowLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the title for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowTooltip is used.
  	 *
  	 */
  var addRowTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the label for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelLabel is used.
  	 *
  	 */
  var cancelLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the title for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelTooltip is used.
  	 *
  	 */
  var cancelTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the label for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowLabel is used.
  	 *
  	 */
  var deleteRowLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the title for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowTooltip is used.
  	 *
  	 */
  var deleteRowTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the label for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneLabel is used.
  	 *
  	 */
  var doneLabel: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the title for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneTooltip is used.
  	 *
  	 */
  var doneTooltip: js.UndefOr[String] = js.undefined
}

object IgGridUpdatingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridUpdatingLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    addRowLabel: String = null,
    addRowTooltip: String = null,
    cancelLabel: String = null,
    cancelTooltip: String = null,
    deleteRowLabel: String = null,
    deleteRowTooltip: String = null,
    doneLabel: String = null,
    doneTooltip: String = null
  ): IgGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addRowLabel != null) __obj.updateDynamic("addRowLabel")(addRowLabel.asInstanceOf[js.Any])
    if (addRowTooltip != null) __obj.updateDynamic("addRowTooltip")(addRowTooltip.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (cancelTooltip != null) __obj.updateDynamic("cancelTooltip")(cancelTooltip.asInstanceOf[js.Any])
    if (deleteRowLabel != null) __obj.updateDynamic("deleteRowLabel")(deleteRowLabel.asInstanceOf[js.Any])
    if (deleteRowTooltip != null) __obj.updateDynamic("deleteRowTooltip")(deleteRowTooltip.asInstanceOf[js.Any])
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel.asInstanceOf[js.Any])
    if (doneTooltip != null) __obj.updateDynamic("doneTooltip")(doneTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridUpdatingLocale]
  }
}

