package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridUpdatingLocale
  extends /**
	 * Option for IgGridUpdatingLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies the label for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowLabel is used.
  	 *
  	 */
  var addRowLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the title for the button starting edit mode for row adding. If not set, $.ig.GridUpdating.locale.addRowTooltip is used.
  	 *
  	 */
  var addRowTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the label for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelLabel is used.
  	 *
  	 */
  var cancelLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the title for the Cancel editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.cancelTooltip is used.
  	 *
  	 */
  var cancelTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the label for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowLabel is used.
  	 *
  	 */
  var deleteRowLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the title for the delete button. If not set, $.ig.GridUpdating.locale.deleteRowTooltip is used.
  	 *
  	 */
  var deleteRowTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the label for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneLabel is used.
  	 *
  	 */
  var doneLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the title for the Done editing button (only applicable when the [showDoneCancelButtons](ui.iggridupdating#options:showDoneCancelButtons) option is enabled). If not set, $.ig.GridUpdating.locale.doneTooltip is used.
  	 *
  	 */
  var doneTooltip: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridUpdatingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridUpdatingLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    addRowLabel: java.lang.String = null,
    addRowTooltip: java.lang.String = null,
    cancelLabel: java.lang.String = null,
    cancelTooltip: java.lang.String = null,
    deleteRowLabel: java.lang.String = null,
    deleteRowTooltip: java.lang.String = null,
    doneLabel: java.lang.String = null,
    doneTooltip: java.lang.String = null
  ): IgGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (addRowLabel != null) __obj.updateDynamic("addRowLabel")(addRowLabel)
    if (addRowTooltip != null) __obj.updateDynamic("addRowTooltip")(addRowTooltip)
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (cancelTooltip != null) __obj.updateDynamic("cancelTooltip")(cancelTooltip)
    if (deleteRowLabel != null) __obj.updateDynamic("deleteRowLabel")(deleteRowLabel)
    if (deleteRowTooltip != null) __obj.updateDynamic("deleteRowTooltip")(deleteRowTooltip)
    if (doneLabel != null) __obj.updateDynamic("doneLabel")(doneLabel)
    if (doneTooltip != null) __obj.updateDynamic("doneTooltip")(doneTooltip)
    __obj.asInstanceOf[IgGridUpdatingLocale]
  }
}

