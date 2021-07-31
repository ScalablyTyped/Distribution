package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridSummariesLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Text of the button Cancel in the summaries dropdown
    *
    */
  var dialogButtonCancelText: js.UndefOr[String] = js.undefined
  
  /**
    * Text of the button OK in the summaries dropdown
    *
    */
  var dialogButtonOKText: js.UndefOr[String] = js.undefined
  
  /**
    * Empty text template to be shown for empty cells
    *
    */
  var emptyCellText: js.UndefOr[String] = js.undefined
  
  /**
    * Get or set text that is shown in the feature chooser dropdown when summaries are hidden
    *
    */
  var featureChooserText: js.UndefOr[String] = js.undefined
  
  /**
    * Get or set text that is shown in the feauture chooser dropdown when summaries are shown
    *
    */
  var featureChooserTextHide: js.UndefOr[String] = js.undefined
  
  /**
    * Tooltip text for header cell button
    *
    */
  var summariesHeaderButtonTooltip: js.UndefOr[String] = js.undefined
}
object IgGridSummariesLocale {
  
  @scala.inline
  def apply(): IgGridSummariesLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesLocale]
  }
  
  @scala.inline
  implicit class IgGridSummariesLocaleMutableBuilder[Self <: IgGridSummariesLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDialogButtonCancelText(value: String): Self = StObject.set(x, "dialogButtonCancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogButtonCancelTextUndefined: Self = StObject.set(x, "dialogButtonCancelText", js.undefined)
    
    @scala.inline
    def setDialogButtonOKText(value: String): Self = StObject.set(x, "dialogButtonOKText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialogButtonOKTextUndefined: Self = StObject.set(x, "dialogButtonOKText", js.undefined)
    
    @scala.inline
    def setEmptyCellText(value: String): Self = StObject.set(x, "emptyCellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCellTextUndefined: Self = StObject.set(x, "emptyCellText", js.undefined)
    
    @scala.inline
    def setFeatureChooserText(value: String): Self = StObject.set(x, "featureChooserText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextHide(value: String): Self = StObject.set(x, "featureChooserTextHide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureChooserTextHideUndefined: Self = StObject.set(x, "featureChooserTextHide", js.undefined)
    
    @scala.inline
    def setFeatureChooserTextUndefined: Self = StObject.set(x, "featureChooserText", js.undefined)
    
    @scala.inline
    def setSummariesHeaderButtonTooltip(value: String): Self = StObject.set(x, "summariesHeaderButtonTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesHeaderButtonTooltipUndefined: Self = StObject.set(x, "summariesHeaderButtonTooltip", js.undefined)
  }
}
