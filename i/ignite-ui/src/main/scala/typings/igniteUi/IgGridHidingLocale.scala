package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridHidingLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Specifies the text of the button which applies changes in the modal dialog.
    *
    */
  var columnChooserButtonApplyText: js.UndefOr[String] = js.native
  /**
    * Specifies the text of the button which cancels changes in the modal dialog.
    *
    */
  var columnChooserButtonCancelText: js.UndefOr[String] = js.native
  /**
    * The caption of the column chooser dialog.
    *
    */
  var columnChooserCaptionLabel: js.UndefOr[String] = js.native
  /**
    * The close button tooltip of the column chooser dialog.
    *
    */
  var columnChooserCloseButtonTooltip: js.UndefOr[String] = js.native
  /**
    * The text used in the drop down tools menu(Feature Chooser) to launch the column chooser dialog.
    *
    */
  var columnChooserDisplayText: js.UndefOr[String] = js.native
  /**
    * The text used in the column chooser to hide column.
    *
    */
  var columnChooserHideText: js.UndefOr[String] = js.native
  /**
    * Text label for reset button.
    *
    */
  var columnChooserResetButtonLabel: js.UndefOr[String] = js.native
  /**
    * The text used in the column chooser to show column.
    *
    */
  var columnChooserShowText: js.UndefOr[String] = js.native
  /**
    * The text used in the drop down tools menu(Feature Chooser) to hide a column.
    *
    */
  var columnHideText: js.UndefOr[String] = js.native
  /**
    * The text displayed in the tooltip of the hidden column indicator.
    *
    */
  var hiddenColumnIndicatorTooltipText: js.UndefOr[String] = js.native
  /**
    * Specifies the hiding column icon tooltip.
    *
    */
  var hideColumnIconTooltip: js.UndefOr[String] = js.native
}

object IgGridHidingLocale {
  @scala.inline
  def apply(): IgGridHidingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridHidingLocale]
  }
  @scala.inline
  implicit class IgGridHidingLocaleOps[Self <: IgGridHidingLocale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumnChooserButtonApplyText(value: String): Self = this.set("columnChooserButtonApplyText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserButtonApplyText: Self = this.set("columnChooserButtonApplyText", js.undefined)
    @scala.inline
    def setColumnChooserButtonCancelText(value: String): Self = this.set("columnChooserButtonCancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserButtonCancelText: Self = this.set("columnChooserButtonCancelText", js.undefined)
    @scala.inline
    def setColumnChooserCaptionLabel(value: String): Self = this.set("columnChooserCaptionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserCaptionLabel: Self = this.set("columnChooserCaptionLabel", js.undefined)
    @scala.inline
    def setColumnChooserCloseButtonTooltip(value: String): Self = this.set("columnChooserCloseButtonTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserCloseButtonTooltip: Self = this.set("columnChooserCloseButtonTooltip", js.undefined)
    @scala.inline
    def setColumnChooserDisplayText(value: String): Self = this.set("columnChooserDisplayText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserDisplayText: Self = this.set("columnChooserDisplayText", js.undefined)
    @scala.inline
    def setColumnChooserHideText(value: String): Self = this.set("columnChooserHideText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserHideText: Self = this.set("columnChooserHideText", js.undefined)
    @scala.inline
    def setColumnChooserResetButtonLabel(value: String): Self = this.set("columnChooserResetButtonLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserResetButtonLabel: Self = this.set("columnChooserResetButtonLabel", js.undefined)
    @scala.inline
    def setColumnChooserShowText(value: String): Self = this.set("columnChooserShowText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnChooserShowText: Self = this.set("columnChooserShowText", js.undefined)
    @scala.inline
    def setColumnHideText(value: String): Self = this.set("columnHideText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnHideText: Self = this.set("columnHideText", js.undefined)
    @scala.inline
    def setHiddenColumnIndicatorTooltipText(value: String): Self = this.set("hiddenColumnIndicatorTooltipText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenColumnIndicatorTooltipText: Self = this.set("hiddenColumnIndicatorTooltipText", js.undefined)
    @scala.inline
    def setHideColumnIconTooltip(value: String): Self = this.set("hideColumnIconTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideColumnIconTooltip: Self = this.set("hideColumnIconTooltip", js.undefined)
  }
  
}

