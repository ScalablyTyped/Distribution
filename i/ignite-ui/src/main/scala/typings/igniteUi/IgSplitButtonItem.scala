package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSplitButtonItem
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Css class to represent the iconClass of the item
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Item display label
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * Item name
    */
  var name: js.UndefOr[String] = js.native
}
object IgSplitButtonItem {
  
  @scala.inline
  def apply(): IgSplitButtonItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitButtonItem]
  }
  
  @scala.inline
  implicit class IgSplitButtonItemMutableBuilder[Self <: IgSplitButtonItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
