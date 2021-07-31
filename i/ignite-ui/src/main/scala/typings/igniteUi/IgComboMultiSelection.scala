package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgComboMultiSelection
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Set addWithKeyModifier to true to disable the additive selection, then additive selection can be done by ctrl + mouse click / enter.
    *
    */
  var addWithKeyModifier: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set enabled to true to turn multi selection on. Set to true by default when target element for the combo is a select with the multiple attribute set.
    *
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use itemSeparator to set what string to be rendered between items in field.
    *
    */
  var itemSeparator: js.UndefOr[String] = js.undefined
  
  /**
    * Set showCheckboxes to true to render check boxes in front of each drop down item.
    *
    */
  var showCheckboxes: js.UndefOr[Boolean] = js.undefined
}
object IgComboMultiSelection {
  
  @scala.inline
  def apply(): IgComboMultiSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgComboMultiSelection]
  }
  
  @scala.inline
  implicit class IgComboMultiSelectionMutableBuilder[Self <: IgComboMultiSelection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddWithKeyModifier(value: Boolean): Self = StObject.set(x, "addWithKeyModifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddWithKeyModifierUndefined: Self = StObject.set(x, "addWithKeyModifier", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setItemSeparator(value: String): Self = StObject.set(x, "itemSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemSeparatorUndefined: Self = StObject.set(x, "itemSeparator", js.undefined)
    
    @scala.inline
    def setShowCheckboxes(value: Boolean): Self = StObject.set(x, "showCheckboxes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCheckboxesUndefined: Self = StObject.set(x, "showCheckboxes", js.undefined)
  }
}
