package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgSplitButtonItem
  extends StObject
     with /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Css class to represent the iconClass of the item
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * Item display label
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * Item name
    */
  var name: js.UndefOr[String] = js.undefined
}
object IgSplitButtonItem {
  
  inline def apply(): IgSplitButtonItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgSplitButtonItem]
  }
  
  extension [Self <: IgSplitButtonItem](x: Self) {
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
