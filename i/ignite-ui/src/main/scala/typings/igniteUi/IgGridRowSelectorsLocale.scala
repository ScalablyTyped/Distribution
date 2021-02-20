package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgGridRowSelectorsLocale
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Deselect all text for the select/deselect all overlay.
    *
    */
  var deselectAllText: js.UndefOr[String] = js.native
  
  /**
    * Deselected records text for the select/deselect all overlay.
    *
    */
  var deselectedRecordsText: js.UndefOr[String] = js.native
  
  /**
    * Select all text for the select/deselect all overlay.
    *
    */
  var selectAllText: js.UndefOr[String] = js.native
  
  /**
    * Selected records text for the select/deselect all overlay.
    *
    */
  var selectedRecordsText: js.UndefOr[String] = js.native
}
object IgGridRowSelectorsLocale {
  
  @scala.inline
  def apply(): IgGridRowSelectorsLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridRowSelectorsLocale]
  }
  
  @scala.inline
  implicit class IgGridRowSelectorsLocaleMutableBuilder[Self <: IgGridRowSelectorsLocale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeselectAllText(value: String): Self = StObject.set(x, "deselectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectAllTextUndefined: Self = StObject.set(x, "deselectAllText", js.undefined)
    
    @scala.inline
    def setDeselectedRecordsText(value: String): Self = StObject.set(x, "deselectedRecordsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectedRecordsTextUndefined: Self = StObject.set(x, "deselectedRecordsText", js.undefined)
    
    @scala.inline
    def setSelectAllText(value: String): Self = StObject.set(x, "selectAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectAllTextUndefined: Self = StObject.set(x, "selectAllText", js.undefined)
    
    @scala.inline
    def setSelectedRecordsText(value: String): Self = StObject.set(x, "selectedRecordsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRecordsTextUndefined: Self = StObject.set(x, "selectedRecordsText", js.undefined)
  }
}
