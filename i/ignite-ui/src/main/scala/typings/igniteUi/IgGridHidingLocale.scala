package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridHidingLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
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
  
  inline def apply(): IgGridHidingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridHidingLocale]
  }
  
  extension [Self <: IgGridHidingLocale](x: Self) {
    
    inline def setColumnChooserButtonApplyText(value: String): Self = StObject.set(x, "columnChooserButtonApplyText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserButtonApplyTextUndefined: Self = StObject.set(x, "columnChooserButtonApplyText", js.undefined)
    
    inline def setColumnChooserButtonCancelText(value: String): Self = StObject.set(x, "columnChooserButtonCancelText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserButtonCancelTextUndefined: Self = StObject.set(x, "columnChooserButtonCancelText", js.undefined)
    
    inline def setColumnChooserCaptionLabel(value: String): Self = StObject.set(x, "columnChooserCaptionLabel", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserCaptionLabelUndefined: Self = StObject.set(x, "columnChooserCaptionLabel", js.undefined)
    
    inline def setColumnChooserCloseButtonTooltip(value: String): Self = StObject.set(x, "columnChooserCloseButtonTooltip", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserCloseButtonTooltipUndefined: Self = StObject.set(x, "columnChooserCloseButtonTooltip", js.undefined)
    
    inline def setColumnChooserDisplayText(value: String): Self = StObject.set(x, "columnChooserDisplayText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserDisplayTextUndefined: Self = StObject.set(x, "columnChooserDisplayText", js.undefined)
    
    inline def setColumnChooserHideText(value: String): Self = StObject.set(x, "columnChooserHideText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserHideTextUndefined: Self = StObject.set(x, "columnChooserHideText", js.undefined)
    
    inline def setColumnChooserResetButtonLabel(value: String): Self = StObject.set(x, "columnChooserResetButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserResetButtonLabelUndefined: Self = StObject.set(x, "columnChooserResetButtonLabel", js.undefined)
    
    inline def setColumnChooserShowText(value: String): Self = StObject.set(x, "columnChooserShowText", value.asInstanceOf[js.Any])
    
    inline def setColumnChooserShowTextUndefined: Self = StObject.set(x, "columnChooserShowText", js.undefined)
    
    inline def setColumnHideText(value: String): Self = StObject.set(x, "columnHideText", value.asInstanceOf[js.Any])
    
    inline def setColumnHideTextUndefined: Self = StObject.set(x, "columnHideText", js.undefined)
    
    inline def setHiddenColumnIndicatorTooltipText(value: String): Self = StObject.set(x, "hiddenColumnIndicatorTooltipText", value.asInstanceOf[js.Any])
    
    inline def setHiddenColumnIndicatorTooltipTextUndefined: Self = StObject.set(x, "hiddenColumnIndicatorTooltipText", js.undefined)
    
    inline def setHideColumnIconTooltip(value: String): Self = StObject.set(x, "hideColumnIconTooltip", value.asInstanceOf[js.Any])
    
    inline def setHideColumnIconTooltipUndefined: Self = StObject.set(x, "hideColumnIconTooltip", js.undefined)
  }
}
