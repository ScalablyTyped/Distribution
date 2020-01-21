package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridHidingLocale
  extends /**
	 * Option for IgGridHidingLocale
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Specifies the text of the button which applies changes in the modal dialog.
  	 *
  	 */
  var columnChooserButtonApplyText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the text of the button which cancels changes in the modal dialog.
  	 *
  	 */
  var columnChooserButtonCancelText: js.UndefOr[String] = js.undefined
  /**
  	 * The caption of the column chooser dialog.
  	 *
  	 */
  var columnChooserCaptionLabel: js.UndefOr[String] = js.undefined
  /**
  	 * The close button tooltip of the column chooser dialog.
  	 *
  	 */
  var columnChooserCloseButtonTooltip: js.UndefOr[String] = js.undefined
  /**
  	 * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog.
  	 *
  	 */
  var columnChooserDisplayText: js.UndefOr[String] = js.undefined
  /**
  	 * The text used in the column chooser to hide column.
  	 *
  	 */
  var columnChooserHideText: js.UndefOr[String] = js.undefined
  /**
  	 * Text label for reset button.
  	 *
  	 */
  var columnChooserResetButtonLabel: js.UndefOr[String] = js.undefined
  /**
  	 * The text used in the column chooser to show column.
  	 *
  	 */
  var columnChooserShowText: js.UndefOr[String] = js.undefined
  /**
  	 * The text used in the drop down tools menu(Feature Chooser) to hide a column.
  	 *
  	 */
  var columnHideText: js.UndefOr[String] = js.undefined
  /**
  	 * The text displayed in the tooltip of the hidden column indicator.
  	 *
  	 */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[String] = js.undefined
  /**
  	 * Specifies the hiding column icon tooltip.
  	 *
  	 */
  var hideColumnIconTooltip: js.UndefOr[String] = js.undefined
}

object IgGridHidingLocale {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridHidingLocale
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    columnChooserButtonApplyText: String = null,
    columnChooserButtonCancelText: String = null,
    columnChooserCaptionLabel: String = null,
    columnChooserCloseButtonTooltip: String = null,
    columnChooserDisplayText: String = null,
    columnChooserHideText: String = null,
    columnChooserResetButtonLabel: String = null,
    columnChooserShowText: String = null,
    columnHideText: String = null,
    hiddenColumnIndicatorTooltipText: String = null,
    hideColumnIconTooltip: String = null
  ): IgGridHidingLocale = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (columnChooserButtonApplyText != null) __obj.updateDynamic("columnChooserButtonApplyText")(columnChooserButtonApplyText.asInstanceOf[js.Any])
    if (columnChooserButtonCancelText != null) __obj.updateDynamic("columnChooserButtonCancelText")(columnChooserButtonCancelText.asInstanceOf[js.Any])
    if (columnChooserCaptionLabel != null) __obj.updateDynamic("columnChooserCaptionLabel")(columnChooserCaptionLabel.asInstanceOf[js.Any])
    if (columnChooserCloseButtonTooltip != null) __obj.updateDynamic("columnChooserCloseButtonTooltip")(columnChooserCloseButtonTooltip.asInstanceOf[js.Any])
    if (columnChooserDisplayText != null) __obj.updateDynamic("columnChooserDisplayText")(columnChooserDisplayText.asInstanceOf[js.Any])
    if (columnChooserHideText != null) __obj.updateDynamic("columnChooserHideText")(columnChooserHideText.asInstanceOf[js.Any])
    if (columnChooserResetButtonLabel != null) __obj.updateDynamic("columnChooserResetButtonLabel")(columnChooserResetButtonLabel.asInstanceOf[js.Any])
    if (columnChooserShowText != null) __obj.updateDynamic("columnChooserShowText")(columnChooserShowText.asInstanceOf[js.Any])
    if (columnHideText != null) __obj.updateDynamic("columnHideText")(columnHideText.asInstanceOf[js.Any])
    if (hiddenColumnIndicatorTooltipText != null) __obj.updateDynamic("hiddenColumnIndicatorTooltipText")(hiddenColumnIndicatorTooltipText.asInstanceOf[js.Any])
    if (hideColumnIconTooltip != null) __obj.updateDynamic("hideColumnIconTooltip")(hideColumnIconTooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridHidingLocale]
  }
}

