package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgGridRowSelectorsLocale
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[Any] {
  
  /**
    * Deselect all text for the select/deselect all overlay.
    *
    */
  var deselectAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Deselected records text for the select/deselect all overlay.
    *
    */
  var deselectedRecordsText: js.UndefOr[String] = js.undefined
  
  /**
    * Select all text for the select/deselect all overlay.
    *
    */
  var selectAllText: js.UndefOr[String] = js.undefined
  
  /**
    * Selected records text for the select/deselect all overlay.
    *
    */
  var selectedRecordsText: js.UndefOr[String] = js.undefined
}
object IgGridRowSelectorsLocale {
  
  inline def apply(): IgGridRowSelectorsLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridRowSelectorsLocale]
  }
  
  extension [Self <: IgGridRowSelectorsLocale](x: Self) {
    
    inline def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    inline def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
    
    inline def setDeselectedRecordsText(value: String): Self = StObject.set(x, "deselectedRecordsText", value.asInstanceOf[js.Any])
    
    inline def setDeselectedRecordsTextUndefined: Self = StObject.set(x, "deselectedRecordsText", js.undefined)
    
    inline def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    inline def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    inline def setSelectedRecordsText(value: String): Self = StObject.set(x, "selectedRecordsText", value.asInstanceOf[js.Any])
    
    inline def setSelectedRecordsTextUndefined: Self = StObject.set(x, "selectedRecordsText", js.undefined)
  }
}
