package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridHidingLocale
  extends /**
	 * Option for IgGridHidingLocale
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies the text of the button which applies changes in the modal dialog.
  	 *
  	 */
  var columnChooserButtonApplyText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the text of the button which cancels changes in the modal dialog.
  	 *
  	 */
  var columnChooserButtonCancelText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The caption of the column chooser dialog.
  	 *
  	 */
  var columnChooserCaptionLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The close button tooltip of the column chooser dialog.
  	 *
  	 */
  var columnChooserCloseButtonTooltip: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog.
  	 *
  	 */
  var columnChooserDisplayText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The text used in the column chooser to hide column.
  	 *
  	 */
  var columnChooserHideText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Text label for reset button.
  	 *
  	 */
  var columnChooserResetButtonLabel: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The text used in the column chooser to show column.
  	 *
  	 */
  var columnChooserShowText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The text used in the drop down tools menu(Feature Chooser) to hide a column.
  	 *
  	 */
  var columnHideText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The text displayed in the tooltip of the hidden column indicator.
  	 *
  	 */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the hiding column icon tooltip.
  	 *
  	 */
  var hideColumnIconTooltip: js.UndefOr[java.lang.String] = js.undefined
}

object IgGridHidingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridHidingLocale
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    columnChooserButtonApplyText: java.lang.String = null,
    columnChooserButtonCancelText: java.lang.String = null,
    columnChooserCaptionLabel: java.lang.String = null,
    columnChooserCloseButtonTooltip: java.lang.String = null,
    columnChooserDisplayText: java.lang.String = null,
    columnChooserHideText: java.lang.String = null,
    columnChooserResetButtonLabel: java.lang.String = null,
    columnChooserShowText: java.lang.String = null,
    columnHideText: java.lang.String = null,
    hiddenColumnIndicatorTooltipText: java.lang.String = null,
    hideColumnIconTooltip: java.lang.String = null
  ): IgGridHidingLocale = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnChooserButtonApplyText != null) __obj.updateDynamic("columnChooserButtonApplyText")(columnChooserButtonApplyText)
    if (columnChooserButtonCancelText != null) __obj.updateDynamic("columnChooserButtonCancelText")(columnChooserButtonCancelText)
    if (columnChooserCaptionLabel != null) __obj.updateDynamic("columnChooserCaptionLabel")(columnChooserCaptionLabel)
    if (columnChooserCloseButtonTooltip != null) __obj.updateDynamic("columnChooserCloseButtonTooltip")(columnChooserCloseButtonTooltip)
    if (columnChooserDisplayText != null) __obj.updateDynamic("columnChooserDisplayText")(columnChooserDisplayText)
    if (columnChooserHideText != null) __obj.updateDynamic("columnChooserHideText")(columnChooserHideText)
    if (columnChooserResetButtonLabel != null) __obj.updateDynamic("columnChooserResetButtonLabel")(columnChooserResetButtonLabel)
    if (columnChooserShowText != null) __obj.updateDynamic("columnChooserShowText")(columnChooserShowText)
    if (columnHideText != null) __obj.updateDynamic("columnHideText")(columnHideText)
    if (hiddenColumnIndicatorTooltipText != null) __obj.updateDynamic("hiddenColumnIndicatorTooltipText")(hiddenColumnIndicatorTooltipText)
    if (hideColumnIconTooltip != null) __obj.updateDynamic("hideColumnIconTooltip")(hideColumnIconTooltip)
    __obj.asInstanceOf[IgGridHidingLocale]
  }
}

