package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridUpdatingLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
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
  
  inline def apply(): IgGridUpdatingLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridUpdatingLocale]
  }
  
  extension [Self <: IgGridUpdatingLocale](x: Self) {
    
    inline def setAddRowLabel(value: String): Self = StObject.set(x, "addRowLabel", value.asInstanceOf[js.Any])
    
    inline def setAddRowLabelUndefined: Self = StObject.set(x, "addRowLabel", js.undefined)
    
    inline def setAddRowTooltip(value: String): Self = StObject.set(x, "addRowTooltip", value.asInstanceOf[js.Any])
    
    inline def setAddRowTooltipUndefined: Self = StObject.set(x, "addRowTooltip", js.undefined)
    
    inline def setCancelLabel(value: String): Self = StObject.set(x, "cancelLabel", value.asInstanceOf[js.Any])
    
    inline def setCancelLabelUndefined: Self = StObject.set(x, "cancelLabel", js.undefined)
    
    inline def setCancelTooltip(value: String): Self = StObject.set(x, "cancelTooltip", value.asInstanceOf[js.Any])
    
    inline def setCancelTooltipUndefined: Self = StObject.set(x, "cancelTooltip", js.undefined)
    
    inline def setDeleteRowLabel(value: String): Self = StObject.set(x, "deleteRowLabel", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowLabelUndefined: Self = StObject.set(x, "deleteRowLabel", js.undefined)
    
    inline def setDeleteRowTooltip(value: String): Self = StObject.set(x, "deleteRowTooltip", value.asInstanceOf[js.Any])
    
    inline def setDeleteRowTooltipUndefined: Self = StObject.set(x, "deleteRowTooltip", js.undefined)
    
    inline def setDoneLabel(value: String): Self = StObject.set(x, "doneLabel", value.asInstanceOf[js.Any])
    
    inline def setDoneLabelUndefined: Self = StObject.set(x, "doneLabel", js.undefined)
    
    inline def setDoneTooltip(value: String): Self = StObject.set(x, "doneTooltip", value.asInstanceOf[js.Any])
    
    inline def setDoneTooltipUndefined: Self = StObject.set(x, "doneTooltip", js.undefined)
  }
}
