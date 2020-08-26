package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummariesLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Text of the button Cancel in the summaries dropdown
    *
    */
  var dialogButtonCancelText: js.UndefOr[String] = js.native
  /**
    * Text of the button OK in the summaries dropdown
    *
    */
  var dialogButtonOKText: js.UndefOr[String] = js.native
  /**
    * Empty text template to be shown for empty cells
    *
    */
  var emptyCellText: js.UndefOr[String] = js.native
  /**
    * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
    *
    */
  var featureChooserText: js.UndefOr[String] = js.native
  /**
    * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
    *
    */
  var featureChooserTextHide: js.UndefOr[String] = js.native
  /**
    * Tooltip text for header cell button
    *
    */
  var summariesHeaderButtonTooltip: js.UndefOr[String] = js.native
}

object IgGridSummariesLocale {
  @scala.inline
  def apply(): IgGridSummariesLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesLocale]
  }
  @scala.inline
  implicit class IgGridSummariesLocaleOps[Self <: IgGridSummariesLocale] (val x: Self) extends AnyVal {
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
    def setDialogButtonCancelText(value: String): Self = this.set("dialogButtonCancelText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogButtonCancelText: Self = this.set("dialogButtonCancelText", js.undefined)
    @scala.inline
    def setDialogButtonOKText(value: String): Self = this.set("dialogButtonOKText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialogButtonOKText: Self = this.set("dialogButtonOKText", js.undefined)
    @scala.inline
    def setEmptyCellText(value: String): Self = this.set("emptyCellText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyCellText: Self = this.set("emptyCellText", js.undefined)
    @scala.inline
    def setFeatureChooserText(value: String): Self = this.set("featureChooserText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserText: Self = this.set("featureChooserText", js.undefined)
    @scala.inline
    def setFeatureChooserTextHide(value: String): Self = this.set("featureChooserTextHide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureChooserTextHide: Self = this.set("featureChooserTextHide", js.undefined)
    @scala.inline
    def setSummariesHeaderButtonTooltip(value: String): Self = this.set("summariesHeaderButtonTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummariesHeaderButtonTooltip: Self = this.set("summariesHeaderButtonTooltip", js.undefined)
  }
  
}

